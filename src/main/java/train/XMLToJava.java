package train;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class XMLToJava {
    public static void main(String[] args) {
        try {
            // Создание контекста JAXB
//            JAXBContext context = JAXBContext.newInstance(HebrewWord.class);
            JAXBContext context = JAXBContext.newInstance(WordData.class);

            // Создание объекта Unmarshaller для десериализации
            Unmarshaller unmarshaller = context.createUnmarshaller();

            // Чтение XML-файла и преобразование в объект HebrewWord
//            File xmlFile = new File("E:/Docs/xmlwords.xml");
            File xmlFile = new File("E:/Docs/sample3.xml");

//            Object unmarshal = unmarshaller.unmarshal(xmlFile);

            WordData word = (WordData) unmarshaller.unmarshal(xmlFile);
//            HebrewWord word = (HebrewWord) unmarshaller.unmarshal(xmlFile);

            // Вывод данных
            System.out.println(word.toString());
//            System.out.println(unmarshaller.unmarshal(xmlFile).toString());
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}

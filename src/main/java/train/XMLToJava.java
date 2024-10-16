package train;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.List;

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
            List<WordEntry> entries = word.getEntries();

            // Вывод данных
            for (WordEntry entry : entries) {
                System.out.println("============"+"\n"+entry.toString());
//                System.out.println(entry.getWord()+"\t "+entry.getTranslation());
            }

//            System.out.println(word.toString());
//            System.out.println(unmarshaller.unmarshal(xmlFile).toString());
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}

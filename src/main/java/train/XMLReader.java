package train;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class XMLReader {
    public static void main(String[] args) {
        try {
            // Создаем фабрику и парсер для чтения XML
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();

            // Чтение XML файла
            File xmlFile = new File("E:/Docs/sample3.xml");
            Document document = builder.parse(xmlFile);
            ////////////////
            Element documentElement = document.getDocumentElement();//.normalize();
            NodeList childNodes = documentElement.getChildNodes();
            for (int i=0; i<childNodes.getLength(); i++) {
                Node item = childNodes.item(i);
                if(item.getNodeType() == Node.ELEMENT_NODE){}
                System.out.println("===Item "+ i + " ===\n"+ item.getNodeName() + " "+item.getTextContent());
            }

// ============================ //
            // Получаем элементы по имени тега
//            NodeList nodeList = document.getElementsByTagName("WordEntry");  // Предполагается, что строки Excel будут в тегах <WordEntry>
//
//            // Проход по каждому элементу
//            for (int i = 0; i < nodeList.getLength(); i++) {
//                Element rowElement = (Element) nodeList.item(i);
//
//                // Пример: получаем данные из конкретных столбцов
//                String word = rowElement.getElementsByTagName("Word").item(0).getTextContent();
//                String translation = rowElement.getElementsByTagName("Niqqud").item(0).getTextContent();
//
//
//                System.out.println(i);
//                System.out.println("Word: " + word);
//                System.out.println("Translation: " + translation);
//                System.out.println("==============");
//            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


package testdome.folder;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;

public class Folders {
    public static Collection<String> folderNames(String xml, char startingLetter) throws Exception {
        Document document = buildDocument(xml);

        NodeList folderList = document.getElementsByTagName("folder");
        int folderListLength = folderList.getLength();

        Collection<String> names = new ArrayList<>();
        for (int i = 0; i < folderListLength; i++) {
            String name = folderList.item(i).getAttributes().getNamedItem("name").getNodeValue();
            if (name.startsWith("" + startingLetter)) {
                names.add(name);
            }
        }

        return names;
    }

    private static Document buildDocument(String xml) throws ParserConfigurationException, SAXException, IOException {
        InputStream inputStream = new ByteArrayInputStream(xml.getBytes());
        DocumentBuilder documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
        return documentBuilder.parse(inputStream);
    }

    public static void main(String[] args) throws Exception {
        String xml =
                "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
                        "<folder name=\"c\">" +
                        "<folder name=\"program files\">" +
                        "<folder name=\"uninstall information\" />" +
                        "</folder>" +
                        "<folder name=\"users\" />" +
                        "</folder>";

        Collection<String> names = folderNames(xml, 'u');
        for(String name: names)
            System.out.println(name);
    }
}

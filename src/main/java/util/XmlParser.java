package util;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
//import javax.xml.soap.Node;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Element;
import pojo.StartupConfig;

import java.io.File;

public class XmlParser {

    public XmlParser() {

    }

    public StartupConfig readConfig() throws Exception {
        try {
            File configInput = new File("config"+File.separator+"settings.xml");
            StartupConfig config = null;
            //check if file has content
            if (configInput.length() != 0) {

                DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
                DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
                Document document = documentBuilder.parse(configInput);
                document.getDocumentElement().normalize();

                NodeList nodeList = document.getElementsByTagName("configuration");
//                System.out.println(nodeList.getLength());
                for (int i = 0; i < nodeList.getLength(); i++) {
                    Node node = nodeList.item(i);
                    Element element = (Element) node;

                    config = new StartupConfig(
                            element.getElementsByTagName("database").item(0).getTextContent(),
                            Boolean.parseBoolean(element.getElementsByTagName("models").item(0).getTextContent()),
                            Boolean.parseBoolean(element.getElementsByTagName("controllers").item(0).getTextContent()),
                            Boolean.parseBoolean(element.getElementsByTagName("useLombok").item(0).getTextContent()),
                            Boolean.parseBoolean(element.getElementsByTagName("configs").item(0).getTextContent()),
                            element.getElementsByTagName("projectPackage").item(0).getTextContent(),
                            element.getElementsByTagName("input").item(0).getTextContent()
                    );
                }
                return config;
            } else {
                throw new Exception("File cannot be of length zero");
            }

        } catch (Exception e) {
            System.out.println(e.toString());
            throw e;
        }
    }
}

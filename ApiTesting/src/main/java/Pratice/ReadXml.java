package Pratice;

import javax.xml.bind.JAXBException;

public class ReadXml {

	public static void main(String[] args) throws JAXBException {

		String filename = "employee.xml";
		XmlToJavaLib parser = new XmlToJavaLib();
		parser.unmarshalling(filename);

	}

}

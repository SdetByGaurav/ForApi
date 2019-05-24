package Pratice;

import javax.xml.bind.JAXBException;

public class TestXml {

	public static void main(String[] args) throws JAXBException {
		Employee emp = new Employee("Suraj", "OAR Road", "male", 01, 10000);
		
		XmlParserLib parser = new XmlParserLib();
		parser.marshalling(emp);

	}

}

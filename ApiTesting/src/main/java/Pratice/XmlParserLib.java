package Pratice;

import java.io.File;

import javax.xml.bind.JAXB;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class XmlParserLib {

	public void marshalling(Employee empObj) throws JAXBException
	{
		 Marshaller ms = JAXBContext.newInstance(Employee.class).createMarshaller();
		 
		 ms.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		 ms.marshal(empObj, System.out);
		 ms.marshal(empObj, new File("./employee.xml"));
	}
}

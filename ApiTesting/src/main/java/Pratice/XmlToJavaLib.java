package Pratice;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class XmlToJavaLib {

	public void unmarshalling(String Filename) throws JAXBException
	{
		File xmlFile = new File(Filename);
		Unmarshaller ums = JAXBContext.newInstance(Employee.class).createUnmarshaller();
		 Employee emp = (Employee)ums.unmarshal(xmlFile);
		System.out.println(emp);
	}
}

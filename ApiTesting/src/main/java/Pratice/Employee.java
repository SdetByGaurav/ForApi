package Pratice;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Employee")
public class Employee {
String name,add,gender;
int id,sal;
Employee()
{
	
}
public Employee(String name, String add, String gender, int id, int sal) {
	super();
	this.name = name;
	this.add = add;
	this.gender = gender;
	this.id = id;
	this.sal = sal;
}
@XmlElement
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@XmlElement
public String getAdd() {
	return add;
}
public void setAdd(String add) {
	this.add = add;
}
@XmlAttribute
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
@XmlAttribute
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
@XmlElement
public int getSal() {
	return sal;
}
public void setSal(int sal) {
	this.sal = sal;
}
@Override
public String toString() {
	return "Employee [name=" + name + ", add=" + add + ", gender=" + gender + ", id=" + id + ", sal=" + sal + "]";
}


}

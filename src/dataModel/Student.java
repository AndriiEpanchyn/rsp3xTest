package dataModel;

public class Student {
	GroupClass parent;
	public String name;
	public String group;
	public String address;
	public String city;
	public int result;

	Student(String name, String group, String address, String city, int result) {
		if(name == null){
			this.name = "";
		} else {
		this.name = name;
		}
		if(group == null) {
			this.group = "";
		} else {
		this.group = group;
		}
		if(address == null) {
			this.address = "";
		} else {
		this.address = address;
		}
		if(city == null) {
			this.city = "";
		} else {
		this.city = city;
		}
		this.result = result;
	}
    public void setParent(GroupClass parent) {
    	this.parent = parent;
    }
    
}

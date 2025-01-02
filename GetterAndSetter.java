//simple program using getter and setter
import javapackages.pack1;
class Demo{
	private int age;
	private String name;
	Demo(int age,String name){
		this.age=age;
		this.name=name;
	}
	public String getName(){ 
	return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public int getAge(){ 
	return age;
	}
	public void setAge(int age){
		this.age=age;
	}
	public void display(){
		System.out.println("name is :"+name+"\n"+"Age is :"+age);
	}
}
public class GetterAndSetter{
	public static void main(String[] args) {
		Demo d=new Demo(20,"arzu");
		d.display();
		System.out.println("After one year");
		d.setAge(21);
		d.display();
		// pack1 p=new pack1();
		// p.add(5,10);
	}
}

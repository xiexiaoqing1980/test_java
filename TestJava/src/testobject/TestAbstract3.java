package testobject;


public class TestAbstract3 {
	public static void main(String[] args) {
		programmer p1=new programmer("aaa", "400", 88.44);
		p1.name();
		
	}
	
}
abstract class employee{
	
	private String name;
	private String id;
	private double salary;
	public employee(String name, String id, double salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	public employee() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	 public abstract void name();
	 
}

class programmer extends employee{
	public programmer(){}
	public programmer(String name, String id, double salary){
		super(name,id,salary);
	}
	@Override
	public void name() {
		// TODO Auto-generated method stub
		System.out.println(this.getId()+this.getName());
	}
	
}
	

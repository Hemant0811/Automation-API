package javaProgram;

public class ConstructerUses {
	String companyName;
	String name;
	int salary;
	int emp_id;
	
 public ConstructerUses(String companyName,String name,int salary,int emp_id) {
	 this.companyName = companyName;
	 this.name = name;
	 this.salary = salary;
	 this.emp_id = emp_id;
	 }
 public void Display() {
	 System.out.println(companyName);
	 System.out.println(name);
	 System.out.println(salary);
	 System.out.println(emp_id);
 }
 
public static void main(String[] args) {
	ConstructerUses rahul = new ConstructerUses("hp","rahul",50000,9008989);
	rahul.Display();
	ConstructerUses aman = new ConstructerUses("hcl","aman",70000,11008989);
	aman.Display();
	
}
}

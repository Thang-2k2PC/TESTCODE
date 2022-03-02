package sinhvien1;

/**
 *
 * @author DELL
 */
class person{
    private String name;
    private String gender;
    
    public person(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getGender() {
        return gender;
    }
    
    public void setGender(String gender) {
        this.gender = gender;
    }
    
    public void display() {
        System.out.println("Name: " + getName());
        System.out.println("Gender: " + getGender());
    }
}
class student extends person {
    private int salary;
    
    public student(String name, String gender, int salary) {
        super(name, gender);
        this.salary = salary;
    }
    
    public int getSalary() {
        return salary;
    }
    
    public void setSalary(int salary) {
        this.salary = salary;
    }
    
    @Override
    public void display(){
        super.display();
        System.out.println("Salary: " + getSalary());
    }
}
public class CodeLearn32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        student sc = new student("Pham Minh Thang", "man", 25000000);
        sc.display();
    }
    
}

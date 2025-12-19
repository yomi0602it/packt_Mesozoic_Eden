package mesozoiceden.employees;

public class employee {
//Instance Block executes after static block and executes before constructor
    //Static block 
        static {
            //Static block
        }

    //Instance Variables
        public String name;
        private final int age; 
        private final float salary;
        public String department;

        private String employeeId; //String concatenation to employee ID


    //Constructor
    public employee(String name, int age, String id, float salary, String department) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }

    //Methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public float getSalary() {
        return salary;
    }

    public String employeeId() {
        return employeeId;
    }

    
}

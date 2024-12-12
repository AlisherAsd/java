public class Main {
    public static void main(String[] args) {

        Person p = new Person("Test", 3);
        System.out.println(p);
        p.setAge(5);
        p.setName("Oleg");
        System.out.println(p);
        System.out.println(p.work());

        Employee e = new Employee("1", 2, "3");
        System.out.println(e);
        System.out.println(e.work());
    }
}




class Person {
    private String name;
    private int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }    
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }    
    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + " " + age;
    }

    public String work() {
        return "None";
    }
}



class Employee extends Person {
    
    private String company;

    Employee(String name, int age, String company) {
        super(name, age);
        this.company = company;
    }

    public void setCompany(String company) {
        this.company = company;
    }    

    public String getCompany() {
        return company;
    }    

    @Override
    public String toString() {
        return getName() + " " + getAge() + " " + company;
    }

    @Override
    public String work() {
        return "Manager";
    }
}


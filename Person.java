package inheretance;

public abstract class Person {
    protected int age;
    protected String name, address;
    protected Occupation o;
    protected Student s;
    protected Teacher t;
    
    public enum Occupation {
        STUDENT,
        INSTRUCTOR
    }
    
    public Person(String name, int age, String address, Occupation o) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.o = o;
    }
    
    public String getName() {
        return name;
    }

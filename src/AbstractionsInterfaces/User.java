package AbstractionsInterfaces;

public abstract class User {
    protected String name;
    protected String worker;
    protected int age;

    public User(String name, String worker, int age) {
        this.name = name;
        this.worker = worker;
        this.age = age;
    }
    public String toString(){
        return name;
    }
}
package Single_Inheritance;
public class Animal {  // Inherit by dog
    private String name;
    private int age;

    // Setter Method
    public  void eat(){
        System.out.println("This animal eats food.");
    }

    public void sayHello(){
        System.out.println("Bhau Bhau.");
    }

    public void setName(String name){
        this.name=name;
    }

    public void setAge(int age){
        this.age = age;
    }

    // Getter Method
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}

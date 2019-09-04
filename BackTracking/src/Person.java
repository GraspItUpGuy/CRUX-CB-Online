public class Person {
     private String name;
    private int age;

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name ;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

// private       => visible inside same class
// public        => visible everywhere
// protected     => will study later
// default       => visible inside same package

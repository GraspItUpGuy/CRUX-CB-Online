public class Person {
     private String name;
    private int age;

    // constructor
    // initialise the instance of particular object
    // Person p = new Person();
    // have no return type, not even void
    // have same name as the class
    // look like a function
    Person(){
        System.out.println("I am the default constructor");
    }
    public Person(int age){
        this.age = age;
        System.out.println(age);
    }
    public Person(String name){
        this.name = name;
        System.out.println(name);
    }
    public Person(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println(name + age);
    }


//    public String getName(){
//        return this.name;
//    }
//    public void setName(String name){
//        this.name = name ;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
}

// private       => visible inside same class
// public        => visible everywhere
// protected     => will study later
// default       => visible inside same package


// static means => it belongs to my class
//  if Student.no_student is changed and  no_student is static variable
// then no_student is changed for the entire class
// if it is not static it gets changed just for that particular object

// static function can only access static data-members
// non-static function can access static as well as non-static data members
import java.security.spec.ECField;

public class Teacher {
   private String name;
   private int age;
   public void setAge(int age) throws Exception{
       if(age < 0) {throw new Exception("age can't be -ve");}
       this.age = age;
   }
    public int getAge(){
       return this.age ;
    }
}


// noun => class
// adjective => data members
// verb => function
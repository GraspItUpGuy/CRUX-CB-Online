public class TeacherClient {
    public static void main(String[] args){
        Teacher t1 = new Teacher();
        try {
            //t1.setAge(-10);
            t1.setAge(10);
            System.out.println("try");
        }catch (Exception e){
            System.out.println("catch");
        }
    }
}

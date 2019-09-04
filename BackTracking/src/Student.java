public class Student {
    private String name;


    public String getName() {
        return this.name;
    }

    public void setName(String name) throws Exception{
        if(name.equals("") || name == null){
            throw new Exception("Name field needs a value");
        }
        this.name = name;
    }
    // final means value can be set only once. Can be public.
    //public final int rollNo;

}

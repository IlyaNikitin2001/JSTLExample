/**
 * Created by USER on 23.04.2017.
 */
public class Student {
    String  name;
    String family;
    public Student(){

    }
    public Student (String name, String family){
        this.name= name;
        this.family= family;
    }
    public String getName(){return name;}
    public void setName(String name){this.name=name;}
    public String getFamily(){return family;}
    public void setFamily(String family){this.family=family;}

}



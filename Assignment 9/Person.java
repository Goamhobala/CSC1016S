public class Person{
    private int age;
    private String name, gender;

    Person(Person p) {
        this(p.name, p.age, p.gender);
    }

    Person(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public int getAge(){
        return age;
    }
    public String getGender(){
        return gender;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }
    public void setGender(String gender){
        this.gender = gender;
    }
    public void setName(String name){
        this.name = name;
    }


}
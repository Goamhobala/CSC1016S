public class Student extends Person{
    private int yearOfStudy;
    private String hobbies;
    private String nameOfInstitution;
    private String programOfStudy;
    public Student(Student s){
        this(s.getName(), s.getAge(), s.getGender(), s.nameOfInstitution, s.programOfStudy, s.yearOfStudy, s.hobbies);
    }

    Student(String name, int age, String gender, String nameOfInstitution, String programOfStudy, int yearOfStudy, String hobbies){
        super(name, age, gender);
        this.nameOfInstitution = nameOfInstitution;
        this.programOfStudy = programOfStudy;
        this.yearOfStudy = yearOfStudy;
        this.hobbies = hobbies;
    }

    public int getYearOfStudy(){
        return yearOfStudy;
    }

    public String getHobbies(){
        return hobbies;
    }

    public String getNameOfInstitution(){
        return nameOfInstitution;
    }
    public String getProgramOfStudy(){
        return programOfStudy;
    }
    public void setHobbies(String hobbies){
        this.hobbies = hobbies;
    }
    public void setNameOfInstitution(String nameOfInstitution){
        this.nameOfInstitution = nameOfInstitution;
    }
    public void setProgramOfStudy(String programOfStudy){
        this.programOfStudy = programOfStudy;
    }
    public void setYearOfStudy(int yearOfStudy){
        this.yearOfStudy = yearOfStudy;
    }
}
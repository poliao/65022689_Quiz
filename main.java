class main{

    public static void main(String[] args) {
        student stud = new student(50, "pa", 2000, 0.02);
        stud.showDetails();
        stud.setid(500);
        stud.setname("paaa");
        stud.setadmissionYerar(2022);
        stud.setgpa(4.00);
        stud.showDetails();
    }
}


class student{
      
    public int ID;
    public String name;
    public int admissionYear;
    public double GPA;


    public student(int ID, String name, int admissionYear, double GPA) {
        this.ID = ID;
        this.name = name;
        this.admissionYear = admissionYear;
        this.GPA = GPA;
    }

    public int setid(int ID){
        this.ID = ID;
        return ID;

    }

    public String setname(String name){
        this.name = name;
        return name;

    }
    public int setadmissionYerar(int admissionYear){
        this.admissionYear = admissionYear;
        return admissionYear;

    }

    public double setgpa(double GPA){
        this.GPA = GPA;
        return GPA;

    }
    
    public void showDetails() {
        System.out.println("Student ID: " + ID);
        System.out.println("Name: " + name);
        System.out.println("Admission Year: " + admissionYear);
        System.out.println("GPA: " + GPA);
    }


}
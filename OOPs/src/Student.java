public class Student{
    private String name;
    private int roll_no;
    private int pendingFee;
    Student(String name, int roll_no, int pendingFee){
        this.name= name;
        this.roll_no= roll_no;
        this.pendingFee=pendingFee;
    }
    void display(){
        System.out.println(name+" whose roll number is "+roll_no+" has pending fees of "+pendingFee+" months.");
    }
}

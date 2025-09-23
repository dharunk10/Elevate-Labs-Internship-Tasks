import java.util.ArrayList;
import java.util.List;

public class Student {
    private int id;
    private String name;
    private int marks;
    List<Student> studentList = new ArrayList<>();

    public Student() {
    }

    public Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public void addStudent(Student student){
        studentList.add(student);
    }

    public void viewStudents() {
        if (studentList.isEmpty()) {
            System.out.println("Add Student Data First");
            System.out.println();
        }
        else {
//            for(int i = 0; i < studentList.size(); i++){
//                System.out.println("Student " + (i+1) + " " +
//                        "id :- " + studentList.get(i).getId() + ", " +
//                        "name :- " + studentList.get(i).getName() + ", " +
//                        "Mark :- " + studentList.get(i).getMarks());
//            }
            for (Student x : studentList){
                System.out.println(x);
            }
        }
    }


    public void setStudentName(int id, String name) {
        if(studentList.isEmpty()){
            System.out.println("Add Student Data First");
            System.out.println();
        }
        else {
            int count = 0;
            for(int i = 0; i < studentList.size(); i++){
                if(studentList.get(i).getId() == id){
                    studentList.get(i).setName(name);
                    count = 1;
                }
                if(count == 1){
                    System.out.println("Student Data updated Successfully");
                    System.out.println();
                    break;
                }
            }
            if(count == 0){
                System.out.println("Id is invalid!!!");
                System.out.println();
            }
        }
    }

    public void setStudentMark(int id, int mark) {
        if(studentList.isEmpty()){
            System.out.println("Add Student Data First");
            System.out.println();
        }
        else {
            int count = 0;
            for(int i = 0; i < studentList.size(); i++){
                if(studentList.get(i).getId() == id){
                    studentList.get(i).setMarks(mark);
                    count = 1;
                }
                if(count == 1){
                    System.out.println("Student Data updated Successfully");
                    System.out.println();
                    break;
                }
            }
            if(count == 0){
                System.out.println("Id is invalid!!!");
                System.out.println();
            }
        }

    }
    public void deleteStudent(int id){
        if(studentList.isEmpty()){
            System.out.println("Add Student Data First");
            System.out.println();
        }
        else {
            int count = 0;
            for(int i = 0; i < studentList.size(); i++){
                if(studentList.get(i).getId() == id){
                    studentList.remove(studentList.get(i));
                    count = 1;
                }
                if(count == 1){
                    System.out.println("Student Data Deleted Successfully");
                    System.out.println();
                    break;
                }
            }
            if(count == 0){
                System.out.println("Id is invalid!!!");
                System.out.println();
            }
        }
    }
}

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        int count = 0;
        Student student = new Student();
        while(flag){
            System.out.println("Select the operation");
            System.out.println("----------------------");
            System.out.println("ADD-1, VIEW-2, UPDATE-3, DELETE-4");
            int op = sc.nextInt();
            if(op < 1 || op > 4 ){
                System.out.println("Enter the valid Input between 1 and 4");
            }
            else {
                switch (op) {
                    case 1:
                        boolean flag1 = true;
                        while (flag1) {
                            if (count == 0) {
                                System.out.println("Enter the Student Details As Follows..");
                                System.out.println("----------------------------------------");
                            }
                            System.out.println("Enter the Student ID");
                            int id = sc.nextInt();
                            sc.nextLine();
                            System.out.println("Enter the Student Name");
                            String name = sc.nextLine();
                            System.out.println("Enter the Student Mark");
                            int mark = sc.nextInt();
                            student.addStudent(new Student(id, name, mark));
                            System.out.println("Successfully Added!!");
                            System.out.println("Do you want to add more data? Y ? N");
                            char ch = sc.next().charAt(0);
                            if (ch == 'n' || ch == 'N') {
                                flag1 = false;
                            }
                        }
                        break;

                    case 2:
                        student.viewStudents();
                        break;

                    case 3:
                        boolean flag2 = true;
                        int num;
                        while(flag2){
                            System.out.println("Want to Update NAME-1 ? MARK-2");
                            num = sc.nextInt();
                            if (num < 1 || num > 2) {
                                System.out.println("Please enter Valid input");
                            }
                            else if (num == 1) {
                                System.out.println("Enter the Id of the student");
                                int name_id = sc.nextInt();
                                sc.nextLine();

                                System.out.println("Enter the Name to be Updated");
                                String name_change = sc.nextLine();
                                student.setStudentName(name_id, name_change);
                                break;
                            } else {
                                System.out.println("Enter the Id of the student");
                                int name_id = sc.nextInt();
                                System.out.println("Enter the Mark to be Updated");
                                int mark_change = sc.nextInt();
                                student.setStudentMark(name_id, mark_change);
                                break;
                            }
                        }
                        break;

                    case 4:
                        System.out.println("Enter the Id of the student");
                        int name_id = sc.nextInt();
                        student.deleteStudent(name_id);
                        break;
                }
                System.out.println("Do you want to do other Operation? Y ? N");
                char ch = sc.next().charAt(0);
                if(ch == 'n' || ch == 'N'){
                    flag = false;
                }
            }
        }
    }
}
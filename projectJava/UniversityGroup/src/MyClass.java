import java.util.Scanner;

public class MyClass {
        public static void main(String[] args){
                UniversityGroup group = new UniversityGroup("Math123", 2009);
                String[] students = new String[] {"std1","std2","std3","std4","std5","std6"};
                UniversityGroup groupSecond = new UniversityGroup("Math321", 2007, students);
                group.addStudents(students);
                groupSecond.addStudents(students);
                System.out.println("--------------------------------------------------------------------");
                group.getGroupDescription();
                System.out.println("--------------------------------------------------------------------");
                groupSecond.getGroupDescription();
        }
}


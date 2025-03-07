enum ProjectType {
    THEORETICAL, PRACTICAL;
}

public class lab2{
    public static void main(String[]args){


        String[] s1Projects = {"P1", "P2"};
        String[] s2Projects = {"P1", "P3"};
        String[] s3Projects = {"P3", "P4"};
        String[] s4Projects = {"P1", "P4"};

        Student student1 = new Student("S1", s1Projects);
        Student student2 = new Student("S2", s2Projects);
        Student student3 = new Student("S3", s3Projects);
        Student student4 = new Student("S4", s4Projects);

        // Create projects
        Project project1 = new Project("P1", ProjectType.THEORETICAL);
        Project project2 = new Project("P2", ProjectType.PRACTICAL);
        Project project3 = new Project("P3", ProjectType.THEORETICAL);
        Project project4 = new Project("P4", ProjectType.PRACTICAL);

        assignStudentToProject(student1, project1);
        assignStudentToProject(student2, project3);
        assignStudentToProject(student3, project4);
    

        System.out.println("Students:");
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        System.out.println(student4);

        System.out.println("\nProjects:");
        System.out.println(project1);
        System.out.println(project2);
        System.out.println(project3);
        System.out.println(project4);
    }
}
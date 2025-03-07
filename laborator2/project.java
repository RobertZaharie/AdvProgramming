class Project {
    private String projectName;
    private Student assignedStudent;
    private ProjectType projectType;

    public Project(String projectName, ProjectType projectType){

        this.projectName = projectName;
        this.projectType = projectType;
        this.assignedStudent = NULL ; // initially does not have a student assigned 
    }

    public String getProjectName(){
        return projectName;
    }

    public void setProjectName(String projectName){
        this.projectName = projectName;
    }

    public ProjectType getProjectType(){
        return projectType;
    }

    public void setProjectType (ProjectType projectType){
        this.projectType = projectType;
    }

    public Student getAssignedStudent(){
        return assignedStudent;
    }

    public void setAssignedStudent(Student assignedStudent){
        this.assignedStudent = assignedStudent;
    }

    @Override
    public String toString() {
        return "Project{" +
                "projectName='" + projectName + '\'' +
                ", projectType=" + projectType +
                ", assignedStudent=" + (assignedStudent.getStudentName()) +
                '}';
    }

    public static void assignStudentToProject(Student student, Project project) {
        // Check if the student can accept the project and if the project isn't already assigned
        for (String projectName : student.getPreferredProject()) {
            if (project.getProjectName().equals(projectName) && project.getAssignedStudent() == null) {
                project.setAssignedStudent(student);  // Assign the student to the project
                System.out.println(student.getStudentName() + " successfully assigned to project " + project.getProjectName());
                return; // Stop after assigning
            }
        }
        System.out.println(student.getStudentName() + " cannot be assigned to project " + project.getProjectName());
    }


}
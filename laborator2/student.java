// Students Class
class Student {
    private String studentName;
    private String[] preferredProject;

    public Student(String studentName, String[] preferredProject) {
            this.studentName = studentName;
            this.preferredProject = preferredProject;
    }

    public String getStudentName(){
        return studentName;
    }

    public void setStudentName(String studentName){
        this.studentName=studentName;
    }

    public String [] getPreferredProject(){
        return preferredProject;
    }
    public void setPreferredProject(String [] preferredProject){
        this.preferredProject = preferredProject;
    }

    @Override
    public String toString() {
        StringBuilder projects = new StringBuilder();
        for (String project : preferredProject) {
            projects.append(project).append(" ");
        }
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", preferredProject=" + projects.toString() +
                '}';
    }



}
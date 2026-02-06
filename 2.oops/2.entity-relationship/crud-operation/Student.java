public class Student {

    private int id;
    private String name;
    private String mailId;
    private long contactNumber;

    // Student Has-a Project
    private Project project;

    public Student() {
    }

    public Student(int id, String name, String mailId, long contactNumber) {
        this.id = id;
        this.name = name;
        this.mailId = mailId;
        this.contactNumber = contactNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMailId() {
        return mailId;
    }

    public void setMailId(String mailId) {
        this.mailId = mailId;
    }

    public long getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(long contactNumber) {
        this.contactNumber = contactNumber;
    }

    public void displayStudentInfo() {
        System.out.println("Student Info : ");
        System.out.println("---------------");
        System.out.println("Student Id : " + getId());
        System.out.println("Student Name : " + getName());
        System.out.println("Student Mail Id : " + getMailId());
        System.out.println("Student Contact Number : " + getContactNumber());
        System.out.println();
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public void createProject(Project project) {
        if (this.project == null && project != null) {
            this.project = project;
            System.out.println("Project Created Successfully");
        } else {
            System.out.println("Project Not Created");
        }
    }

    public void readProject() {
        if (this.project != null) {
            this.project.displayProjectInfo();
            System.out.println("Project Displayed");
        } else {
            System.out.println("Project Not Displayed");
        }
    }

    public void updateProject(int id, String name, String description) {
        if (id > 0 && name != null && description != null) {
            if (this.project != null && this.project.getId() == id) {
                this.project.setName(name);
                this.project.setDescription(description);
                System.out.println("Project Updated");
            } else {
                System.out.println("Project Not Updated");
            }
        } else {
            System.out.println("Invalid Data");
        }
    }

    public void deleteProject(int id) {
        if (id > 0) {
            if (this.project != null && this.project.getId() == id) {
                this.project = null;
                System.out.println("Project Deleted Successfully");
            } else {
                System.out.println("Project Not Deleted");
            }
        } else {
            System.out.println("Invalid Data");
        }
    }
}
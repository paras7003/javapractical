import java.util.Scanner;

class Employee {
    private String name;
    private String address;
    private double salary;
    private String jobTitle;

    public Employee(String name, String address, double salary, String jobTitle) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public double getSalary() {
        return salary;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public double calculateBonus() {
        return 0.05 * salary;
    }

    public String generatePerformanceReport() {
        return "Performance report for " + name + ": Excellent";
    }
}

class Manager extends Employee {
    private String department;

    public Manager(String name, String address, double salary, String jobTitle, String department) {
        super(name, address, salary, jobTitle);
        this.department = department;
    }
    public String getDepartment() {
        return department;
    }
    public double calculateBonus() {
        return 0.1 * getSalary();
    }
    public String generatePerformanceReport() {
        return "Performance report for Manager " + getName() + ": Outstanding";
    }

    public void manageProjects() {
        System.out.println("Manager " + getName() + " is managing projects.");
    }
}

class Developer extends Employee {
    private String programmingLanguage;

    public Developer(String name, String address, double salary, String jobTitle, String programmingLanguage) {
        super(name, address, salary, jobTitle);
        this.programmingLanguage = programmingLanguage;
    }
    public String getProgrammingLanguage() {
        return programmingLanguage;
    }
    public double calculateBonus() {
        return 0.08 * getSalary();
    }

    public void writeCode() {
        System.out.println("Developer " + getName() + " is writing code in " + programmingLanguage + ".");
    }
}

class Programmer extends Developer {
    public Programmer(String name, String address, double salary, String programmingLanguage) {
        super(name, address, salary, "Programmer", programmingLanguage);
    }
    public void debugCode() {
        System.out.println("Programmer " + getName() + " is debugging code.");
    }
}

class hierarchy {
    public static void main(String[] a) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Manager details:");
        System.out.print("Name: ");
        String managerName = s.nextLine();
        System.out.print("Address: ");
        String managerAddress = s.nextLine();
        System.out.print("Salary: ");
        double managerSalary = s.nextDouble();
        s.nextLine();
        System.out.print("Department: ");
        String managerDepartment = s.nextLine();

        Manager manager = new Manager(managerName, managerAddress, managerSalary, "Manager", managerDepartment);

        System.out.println("\nEnter Developer details:");
        System.out.print("Name: ");
        String developerName = s.nextLine();
        System.out.print("Address: ");
        String developerAddress = s.nextLine();
        System.out.print("Salary: ");
        double developerSalary = s.nextDouble();
        s.nextLine(); 
        System.out.print("Programming Language: ");
        String programmingLanguage = s.nextLine();

        Developer developer = new Developer(developerName, developerAddress, developerSalary, "Developer", programmingLanguage);

        System.out.println("\nEnter Programmer details:");
        System.out.print("Name: ");
        String programmerName = s.nextLine();
        System.out.print("Address: ");
        String programmerAddress = s.nextLine();
        System.out.print("Salary: ");
        double programmerSalary = s.nextDouble();
        s.nextLine();

        Programmer programmer = new Programmer(programmerName, programmerAddress, programmerSalary, "Java");

        System.out.println("\nPerformance Reports and Actions:");
        System.out.println(manager.generatePerformanceReport());
        manager.manageProjects();

        System.out.println(developer.generatePerformanceReport());
        developer.writeCode();

        System.out.println(programmer.generatePerformanceReport());
        developer.writeCode();
        programmer.debugCode();
    }
}


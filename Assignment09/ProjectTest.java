import java.util.*;

public class ProjectTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Set<Project> projectSet = new HashSet<>();
        List<Project> projectList = new ArrayList<>();

        boolean exit = false;

        while (!exit) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Dummy Data");
            System.out.println("2. Add Project");
            System.out.println("3. Display Projects (Set)");
            System.out.println("4. Delete Project by Id");
            System.out.println("5. Copy Set to List");
            System.out.println("6. Display Projects (List)");
            System.out.println("7. Sort Projects by Cost");
            System.out.println("8. Find Max Team Size Project");
            System.out.println("9. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    projectSet.add(new Project(1, "Train Reservation System", 5, 5000000, "Java"));
                    projectSet.add(new Project(2, "Airline Reservation System", 3, 6000000, ".NET"));
                    projectSet.add(new Project(4, "Online Grocery Shop", 6, 3000000, "Java"));
                    projectSet.add(new Project(5, "Online Book Shop", 2, 3000000, ".NET"));
                    projectSet.add(new Project(3, "Online Jewelry Shop", 4, 4000000, "Java"));
                    projectSet.add(new Project(2, "Bus Reservation System", 3, 3500000, "JS")); // duplicate id

                    System.out.println("Dummy data added (duplicates ignored).");
                    break;

                case 2:
                    System.out.print("Enter Id: ");
                    int id = sc.nextInt();

                    System.out.print("Enter Title: ");
                    String title = sc.next();

                    System.out.print("Enter Team Size: ");
                    int teamSize = sc.nextInt();

                    System.out.print("Enter Cost: ");
                    double cost = sc.nextDouble();

                    System.out.print("Enter Technology: ");
                    String tech = sc.next();

                    boolean added = projectSet.add(new Project(id, title, teamSize, cost, tech));
                    if (added)
                        System.out.println("Project added.");
                    else
                        System.out.println("Duplicate Project ID! Not added.");
                    break;

                case 3:
                    if (projectSet.isEmpty())
                        System.out.println("No projects found.");
                    else
                        projectSet.forEach(System.out::println);
                    break;

                case 4:
                    System.out.print("Enter Id to delete: ");
                    int delId = sc.nextInt();

                    boolean removed = projectSet.remove(new Project(delId, "", 0, 0, ""));
                    if (removed)
                        System.out.println("Project removed.");
                    else
                        System.out.println("Project not found.");
                    break;

                case 5:
                    projectList.clear();
                    projectList.addAll(projectSet);
                    System.out.println("Copied Set to List.");
                    break;

                case 6:
                    if (projectList.isEmpty())
                        System.out.println("List is empty.");
                    else
                        projectList.forEach(System.out::println);
                    break;

                case 7:
                    Collections.sort(projectList, Comparator.comparingDouble(Project::getProjectCost));
                    System.out.println("Projects sorted by cost.");
                    break;

                case 8:
                    if (projectSet.isEmpty()) {
                        System.out.println("No projects available.");
                    } else {
                        Project maxProject = Collections.max(projectSet,
                                Comparator.comparingInt(Project::getTeamSize));
                        System.out.println("Project with max team size:");
                        System.out.println(maxProject);
                    }
                    break;

                case 9:
                    exit = true;
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        }

        sc.close();
        System.out.println("Application terminated.");
    }
}


class Project {
    private int id;
    private String title;
    private int teamSize;
    private double projectCost;
    private String technology;

    public Project(int id, String title, int teamSize, double projectCost, String technology) {
        this.id = id;
        this.title = title;
        this.teamSize = teamSize;
        this.projectCost = projectCost;
        this.technology = technology;
    }

    public int getId() {
        return id;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public double getProjectCost() {
        return projectCost;
    }

    @Override
    public String toString() {
        return "Project [Id=" + id + ", Title=" + title + ", TeamSize=" + teamSize +
                ", Cost=" + projectCost + ", Tech=" + technology + "]";
    }

    // Important: Avoid duplicates by ID
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Project)) return false;
        Project p = (Project) o;
        return id == p.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
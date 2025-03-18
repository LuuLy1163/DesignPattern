package ObseverPatter;

public class Main {
    public static void main(String[] args) {
        Task task = new Task();

        TeamMember member1 = new TeamMember("Ly");
        TeamMember member2 = new TeamMember("Teo");

        task.registerObserver(member1);
        task.registerObserver(member2);

        task.setStatus("In Progress");
        task.setStatus("Completed");
    }
}

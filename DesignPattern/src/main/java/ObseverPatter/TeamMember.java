package ObseverPatter;

public class TeamMember implements Observer {
    private String name;

    public TeamMember(String name) {
        this.name = name;
    }

    @Override
    public void update(String status) {
        System.out.println("Team Member " + name + " received task status update: " + status);
    }
}

package objects;

public class Balloon implements Movable {
    private BalloonState state;
    private Coordinates position;

    public Balloon(Coordinates position) {
        this.state = BalloonState.ASCENDING;
        this.position = position;
    }

    public void setState(BalloonState state) {
        this.state = state;
    }

    public BalloonState getState() {
        return state;
    }

    public Coordinates getPosition() {
        return position;
    }

    public void setPosition(Coordinates position) {
        this.position = position;
    }

    @Override
    public void move() {
        System.out.println("Воздушный шар движется ветром!");
        setState(BalloonState.FLOATING);
    }
}

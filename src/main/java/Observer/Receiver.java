package Observer;

public class Receiver extends User {
    public Receiver() {
        this.id = counter;
        counter++;
    }

    @Override
    public void update(String status) {
        System.out.println(status + " for " + this);
    }
}

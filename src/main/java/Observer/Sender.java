package Observer;

public class Sender extends User {
    public Sender() {
        this.id = counter;
        counter++;
    }

    @Override
    public void update(String status) {
        System.out.println(status + " for " + this);
    }
}

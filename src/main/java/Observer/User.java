package Observer;

public abstract class User {
    protected static int counter = 0;
    int id;
    abstract void update(String status);
}

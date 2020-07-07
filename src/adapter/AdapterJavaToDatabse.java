package adapter;

public class AdapterJavaToDatabse extends JavaAppclication implements Database {
    @Override
    public void inser() {
        saveObject();
    }

    @Override
    public void update() {
        uodateObject();
    }

    @Override
    public void select() {
        loadObject();
    }

    @Override
    public void remove() {
        deleteObject();
    }
}

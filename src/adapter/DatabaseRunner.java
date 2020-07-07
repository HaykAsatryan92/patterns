package adapter;

public class DatabaseRunner {
    public static void main(String[] args) {
        Database database =  new AdapterJavaToDatabse();
        database.inser();
        database.remove();
        database.update();
        database.select();


    }

}

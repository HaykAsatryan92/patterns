package command;

//import adapter.Database;

public class Insert implements  Command{
    DataBase database;

    public Insert(DataBase database) {
        this.database = database;
    }



    @Override
    public void execute() {
database.insert();
    }
}

package command;

import adapter.Database;

public class Delete implements Command {
    DataBase database;

    public Delete(DataBase database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.delete();
    }
}

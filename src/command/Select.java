package command;

import adapter.Database;

public class Select implements  Command {
    DataBase database;

    public Select(DataBase database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.select();
    }
}

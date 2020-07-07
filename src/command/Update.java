package command;

import adapter.Database;

public class Update implements  Command {
    DataBase database;

    public Update(DataBase database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.update();
    }
}

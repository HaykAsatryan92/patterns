package command;

public class databaseRunner {
    public static void main(String[] args) {
        DataBase dataBase =  new DataBase();
        Developer developer =  new Developer(new Insert(dataBase),
                                             new Update(dataBase),
                                              new Select(dataBase),
                                             new Delete(dataBase) );
        developer.insertRecord();
        developer.select();
        developer.update();
        developer.delete();


    }
}

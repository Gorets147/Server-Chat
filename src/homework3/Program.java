package homework3;

public class Program {
    public static void main(String[] args) {
        DataBase db = new DataBase();

        db.init();
        db.record(1);
        db.getAllRecord();
        db.updateRecord(1, "Привет!");
        db.deleteRecord(1);
    }
}

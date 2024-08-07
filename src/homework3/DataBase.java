package homework3;

import java.util.ArrayList;
import java.util.List;

public class DataBase implements DBable{

    @Override
    public void init() {
        System.out.println("База данных инициализированна!\n");
    }

    @Override
    public void record(int id) {
        System.out.println("Запись с id: " + id + " успешно создана\n");
    }

    @Override
    public List getAllRecord() {
        List list = new ArrayList();
        System.out.println("Все записи импортированны!\n");
        return list;
    }

    @Override
    public void updateRecord(int id, String message) {
        System.out.println("В запись: " + id + " записано: " + message + "\n");
    }

    @Override
    public void deleteRecord(int id) {
        System.out.println("Запись: " + id + " удалена\n");
    }
}

package homework3;


import java.util.List;

public interface DBable {
    void init();
    void record(int id);
    <T> List<T> getAllRecord();
    void updateRecord(int id, String message);
    void deleteRecord(int id);
}

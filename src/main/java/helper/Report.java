package helper;

import org.apache.spark.sql.Dataset;

import java.util.Map;

public interface Report {
    void append(Map row);
    boolean rowCheck();
    boolean responseCheck();
    void getRemote();
    void saveToExcel();
    Dataset toDataset();
}

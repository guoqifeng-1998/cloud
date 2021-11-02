package xg.beans;

import lombok.Data;

import java.util.Date;
@Data
public class LogData {
    Integer id;
    String username;
    String operType;
    String moduleName;
    boolean result;
    Date operTime;
    String operContent;
}

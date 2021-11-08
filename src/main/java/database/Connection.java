package database;

import java.util.ArrayList;
import java.util.List;
public class Connection {
    private static Connection thisConnection;
    private List<String> ids;

    Connection() {
        this.ids  = new ArrayList<>();
    }
    public static Connection getConnection() {
        if (thisConnection == null){
            thisConnection = new Connection();
        }
        return thisConnection;
    }
}
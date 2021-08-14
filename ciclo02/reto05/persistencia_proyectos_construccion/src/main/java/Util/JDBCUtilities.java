package Util;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class JDBCUtilities {
    
    private static final String DATABASE_LOCATION = "C:\\Users\\EVA-01\\Desktop\\MINTIC2022\\GIT\\misionTic2022\\ciclo02\\reto04\\persistencia_proyectos_construccion\\ProyectosConstruccion.db";

    public static Connection getConnection() throws SQLException {

        String url = "jdbc:sqlite:"+DATABASE_LOCATION;

        return DriverManager.getConnection(url);
    }
}

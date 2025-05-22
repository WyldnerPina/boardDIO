package com.wild;

import static com.wild.persistence.config.ConnectionConfig.getConnection;

import java.sql.SQLException;

import com.wild.persistence.migration.MigrationStrategy;
import com.wild.ui.MainMenu;


public class Main {

    public static void main(String[] args) throws SQLException {
        try(var connection = getConnection()){
            new MigrationStrategy(connection).executeMigration();
        }
        new MainMenu().execute();
    }

}

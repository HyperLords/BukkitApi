package org.BukkitApi.main.example.MySQL;

import org.BukkitApi.main.BukkitUtiles.MySQL.MySQL;

public class DatabaseConnect {

    public void connectDatabase() {
        MySQL mySQL=MySQL.newBuilder()
                .withDatabase("your database")
                .withPassword("your password")
                .withUrl("your host")
                .withPort(3306/*your port*/)
                .withUser("your user").create();

        //how create table or update stats
        mySQL.update(null,null);
        mySQL.query(null,null);
    }

}

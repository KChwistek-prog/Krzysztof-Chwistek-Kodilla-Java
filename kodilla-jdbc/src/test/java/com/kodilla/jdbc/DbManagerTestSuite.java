package com.kodilla.jdbc;

import org.junit.jupiter.api.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static org.junit.jupiter.api.Assertions.*;

public class DbManagerTestSuite {
    @Test
    void testConnection() throws SQLException{
        //given
        //when
        DbManager dbManager = DbManager.getInstance();
        //then
        assertNotNull(dbManager.getConnection());
    }

    @Test
    void testSelectUsers() throws SQLException{
        //given
        DbManager dbManager = DbManager.getInstance();
        //when
        String sqlQuery = "SELECT * FROM users";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);

        //then
        int counter = 0;
        while (rs.next()) {
            System.out.println(rs.getInt("ID") + ", " +
                    rs.getString("FIRSTNAME") + ", " +
                    rs.getString("LASTNAME"));
            counter++;
        }
        rs.close();
        statement.close();
        assertEquals(5, counter);
    }

    @Test
    void testSelectUsersAndPosts() throws  SQLException{
        //given
        DbManager dbManager = DbManager.getInstance();
        //when
        String sqlQuery = "SELECT \n" +
                "    FIRSTNAME, LASTNAME, COUNT(*) AS POST_NUMBER\n" +
                "FROM\n" +
                "    users\n" +
                "        JOIN\n" +
                "    posts ON users.ID = posts.USER_ID\n" +
                "GROUP BY FIRSTNAME\n" +
                "HAVING COUNT(*) >= 2;";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);

        //then
        int counter = 0;
        while (rs.next()) {
            System.out.println(rs.getString("FIRSTNAME") + ", " +
                    rs.getString("LASTNAME") + ", " +
                    rs.getString("POST_NUMBER"));
            counter++;
        }
        rs.close();
        statement.close();
        assertEquals(2, counter);
    }
}

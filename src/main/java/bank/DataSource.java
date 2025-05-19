package bank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DataSource {

  public static Connection connect() {

    String db_file = "jdbc:sqlite:resources/bank.db";
    Connection connection = null;

    try {
      connection = DriverManager.getConnection(db_file);
      System.out.println("We are connected");
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return connection;
  }

  public static Customer getCustomer(String username) {
    String sql = "select * from customers where username = ?";
    Customer customer = null;
    try (Connection connection = connect(); PreparedStatement statement = connection.prepareStatement(sql)) {

      statement.setString(1,username);
      try(ResultSet resultSet = statement.executeQuery()){
        // need to write code here.. video 2 of 2
        customer = new Customer(0, username, username, sql, 0)

      }

    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  public static void main(String[] args) {
    connect();
  }
}

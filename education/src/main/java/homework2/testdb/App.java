package homework2.testdb;

import java.sql.*;

public class App extends InitDB {
    public static void main(String[] args) {
        InitDB init = new InitDB();
        try {
            init.connectDB();
            try {
                init.clearTable();
            } catch (SQLException e) {
                System.out.println("Таблица не существует!");
            }
            init.createTable();
            init.fillTable();
            init.printValues(5);
            init.disconnectDB();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

class InitDB {
    private Connection conn;
    private Statement stmt;
    private PreparedStatement pstmt;
    private ResultSet rs;

    void connectDB() throws SQLException, ClassNotFoundException {
        Class.forName("org.sqlite.JDBC");
        conn = DriverManager.getConnection("jdbc:sqlite:mainDB.db");
        System.out.println("Подключение к БД успешно!");
        stmt = conn.createStatement();
    }

    void createTable() throws SQLException {
        if (!stmt.execute("CREATE TABLE IF NOT EXISTS 'goods' " +
                "('id' INTEGER PRIMARY KEY AUTOINCREMENT, 'prodid' INTEGER UNIQUE, " +
                "'title' TEXT, 'cost' INTEGER)")) {
            System.out.println("Создали таблицу товаров!");
        }
    }

    void fillTable() throws SQLException {
        conn.setAutoCommit(false);
        pstmt = conn.prepareStatement("INSERT INTO 'goods' ('prodid', 'title', 'cost') VALUES (?, ?, ?)");
        for (int i = 1; i <= 10000; i++) {
            pstmt.setInt(1, i);
            pstmt.setString(2, "товар" + i);
            pstmt.setInt(3, i * 10);
            pstmt.executeUpdate();
        }
        conn.setAutoCommit(true);
        System.out.println("Заполнили таблицу товаров!");
    }

    void clearTable() throws SQLException {
        conn.setAutoCommit(false);
        if (!stmt.execute("DELETE FROM 'goods'")) {
            System.out.println("Таблица успешно очищена!");
        }
        conn.setAutoCommit(true);

        //Если нужно, чтобы id начинался с 1, то раскомментировать следующий код
//        if (!stmt.execute("DROP TABLE IF EXISTS 'goods'")) {
//            System.out.println("Таблица успешно удалена!");
//        }
    }

    void printValues(int limitLines) throws SQLException {
        int id;
        int prodid;
        String title;
        int cost;
        pstmt = conn.prepareStatement("SELECT * FROM 'goods' LIMIT ?");
        pstmt.setInt(1, limitLines);
        rs = pstmt.executeQuery();
        while (rs.next()) {
            id = rs.getInt("id");
            prodid = rs.getInt("prodid");
            title = rs.getString("title");
            cost = rs.getInt("cost");
            System.out.println("---------------------");
            System.out.print((id + ", " + prodid + ", " + title + ", " + cost + "\n"));
        }
    }

    void disconnectDB() throws SQLException, ClassNotFoundException {
        conn.close();
        stmt.close();
        pstmt.close();
    }
}

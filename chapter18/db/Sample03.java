package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

// PreparedStatementを使ってSQLインジェクションを防ぐ
public class Sample03 {
    public static void main(String[] args) throws Exception {
        // ① データベースに接続する
        Connection conn = DriverManager.getConnection("jdbc:sqlite:data/todo.db");

        // ② SELECT文を準備する
        // PreparedStatement: SQL文の形を先に決めておき、? の部分にあとから値を入れる方法
        PreparedStatement ps = conn.prepareStatement("SELECT * FROM tasks WHERE user_Id = ?");
        //Prepares an SQL query to select all columns from the tasks table where user_Id matches a placeholder (?).

        // Sample02 と同じ「SQLインジェクションの例」の値を入れてみる
        // String userId = "' OR '1'='1";
        String userId = "1";
        ps.setString(1, userId); // 1つ目の ? に userId を入れる（ただの文字列として扱われる）
        //Safely inserts the userId value into the 1st ? placeholder. if the query has multiple ?
        //e.g: ? ? ?
        // then it would be ps.setString(1, ....)
        // ps.setString(2, ....)
        //ps.setString(3, ....)

        ResultSet rs = ps.executeQuery();

        // ③ 結果を1行ずつ取り出す（次の行がなくなると false になる）
        // → id が「' OR '1'='1」という文字列のタスクは無いので、何も表示されない
        while (rs.next()) {
            int id = rs.getInt("id");
            String title = rs.getString("title");
            String deadline = rs.getString("deadline");
            System.out.println(id + " : " + title + "（期限 " + deadline + "）");
        }

        // ④ 閉じる
        rs.close();
        ps.close();
        conn.close();
    }
}

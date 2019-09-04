package com.yumtao.test;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author yangqintao
 * @date 2019-09-04
 */
public class DDLLockTest {

    public static void main(String[] args) {

        // 数据库驱动类名的字符串
        String driver = "com.mysql.jdbc.Driver";
        // 数据库连接串
        String url = "jdbc:mysql://120.79.48.63:3306/guoguo";
        // 用户名
        String username = "yumtao";
        // 密码
        String password = "Tao252525";
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            // 1、加载数据库驱动（ 成功加载后，会将Driver类的实例注册到DriverManager类中）
            Class.forName(driver);
            // 2、获取数据库连接
            conn = DriverManager.getConnection(url, username, password);
            // 3、获取数据库操作对象
            stmt = conn.createStatement();
            // 4、定义操作的SQL语句
            List<String> sqlList = new ArrayList<>();
            String sqlTemplate = "insert into guoguo_category (name, is_used) VALUES ('xibalu'%s, 0);";
            for (int i = 0; i < 1000000; i++) {
                String sql = String.format(sqlTemplate, i);
                System.out.println(sql);
                rs = stmt.executeQuery(sql);
            }


            // 5、执行数据库操作

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 7、关闭对象，回收数据库资源
            if (rs != null) { //关闭结果集对象
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (stmt != null) { // 关闭数据库操作对象
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null) { // 关闭数据库连接对象
                try {
                    if (!conn.isClosed()) {
                        conn.close();
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

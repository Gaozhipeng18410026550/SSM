package com.codemonkey.jdbc;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.*;

/**
 * Description: 数据库连接测试类
 * User: gaozhipen
 * Date: 2017-05-28
 * Time: 15:27
 */
public class JdbcTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(JdbcTest.class);

    private static final String DRIVER="com.mysql.jdbc.Driver";
    private static final String JDBC_URL="jdbc:mysql://127.0.0.1:3306/ssm";
    private static final String USERNAME="root";
    private static final String PASSWORD="root";

    @Test
    public void test() {

        String sql = "select * from user";

        /* 使用try-with-resource语法 */
        try (
            Connection connection = DriverManager.getConnection(JDBC_URL,USERNAME,PASSWORD);
            PreparedStatement preparedStatement=connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
        ){
            while (resultSet.next()){
                LOGGER.info("id="+resultSet.getString("id"));
                LOGGER.info("name="+resultSet.getString("name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}

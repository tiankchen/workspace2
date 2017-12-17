package com.chenchen;

import com.chenchen.dao.UserMapper;
import com.chenchen.models.Sex;
import com.chenchen.models.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.TransactionFactory;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;
import org.apache.log4j.Logger;
import org.apache.log4j.spi.LoggerFactory;

import javax.sql.DataSource;
import java.io.Reader;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class Main {

    private static Logger logger = Logger.getLogger(Main.class);

    private static SqlSessionFactory sqlSessionFactory;
    private static Reader reader;


    private String[] states = new String[] {
            "AK", "AL"
    };

    static {
        try {
            reader = Resources.getResourceAsReader("mybatis-config.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
            sqlSessionFactory.getConfiguration().addMapper(UserMapper.class);
        } catch (Exception e) {
            System.out.println("Catch exception");
            e.printStackTrace();
        }
    }

    public static SqlSessionFactory getSession() {
        return sqlSessionFactory;
    }

    /**
     * Building SqlSessionFactory without XML
     */
//    public static SqlSessionFactory getSqlSessionFactory() {
//        DataSource dataSource = BlogDataSourceFactory.getBlogDataSource();
//        TransactionFactory transactionFactory =
//                new JdbcTransactionFactory();
//        Environment environment =
//                new Environment("development", transactionFactory, dataSource);
//        Configuration configuration = new Configuration(environment);
//        configuration.addMapper(BlogMapper.class);
//        SqlSessionFactory sqlSessionFactory =
//                new SqlSessionFactoryBuilder().build(configuration);
//
//        RoundingMode mode = RoundingMode.CEILING;
//
//        return sqlSessionFactory;
//    }

    /**
     * @param args
     */
    public static void main(String[] args) {

        Vector<String> vec = new Vector<String>();
        vec.add("str1");
        vec.add("str2");
        vec.add("str3");

        Iterator<String> it1 = vec.iterator();
        Iterator<String> it2 = vec.iterator();
        it1.next();
        it1.remove();

        it2.next();


        String str = "str1";
        str = "chenchen";
        if(vec.contains(str))
        {
            System.out.println("Match str1");
        }


        SqlSession session = sqlSessionFactory.openSession();
        try {
            UserMapper userMapper = session.getMapper(UserMapper.class);
            User user = userMapper.getUserByID(1);
            if (user != null) {
                System.out.println(user);
            }

            User user1 = new User();
            user1.setName("new");
            user1.setSex2(Sex.Man);
            userMapper.insetUser(user1);

            session.commit();

        } catch (Exception e) {
            System.out.println("Catch exception");
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    public String[] getStates() {
        return states.clone();
    }

    public void setStates(String[] states) {
        this.states = states.clone();
    }
}

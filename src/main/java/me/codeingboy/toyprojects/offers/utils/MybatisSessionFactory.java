package me.codeingboy.toyprojects.offers.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * An utility class for acquiring Mybatis SqlSession
 *
 * @author CodeingBoy
 * @version 1
 * @see org.apache.ibatis.session.SqlSessionFactory
 */
public class MybatisSessionFactory {
    private final static String CONFIG_LOCATION = "mybatis-config.xml";
    private static SqlSessionFactory sqlSessionFactory;

    static {
        try {
            InputStream inputStream = Resources.getResourceAsStream(CONFIG_LOCATION);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public SqlSession getSession() {
        return sqlSessionFactory.openSession();
    }
}

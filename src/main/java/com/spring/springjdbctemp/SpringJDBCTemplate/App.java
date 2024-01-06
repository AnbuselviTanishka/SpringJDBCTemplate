package com.spring.springjdbctemp.SpringJDBCTemplate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("Beans.xml");
        JdbcTemplate jdbctemp=(JdbcTemplate) ctx.getBean("jdbcTemplate");
        String sql="insert into student values(?,?)";
        int result=jdbctemp.update(sql,"Gopi",new Integer(5));
        System.out.println(result);
}
}

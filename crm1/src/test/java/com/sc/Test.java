package com.sc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Test {

	public static void main(String[] args) {
		String url="jdbc:oracle:thin:@42.51.78.5:1521:orcl";
		String name="CRM1";
		String pass="scit_190506_crm1";
		//1、注册mysql数据库驱动类
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					System.out.println("注册驱动类成功");
					Connection conn1=DriverManager.getConnection(url, name, pass);
				    System.out.println("数据库连接成功");
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					System.out.println("注册驱动类失败");
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					System.out.println("数据库连接失败");
				}
			}
	}


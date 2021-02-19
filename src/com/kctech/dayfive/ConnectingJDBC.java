package com.kctech.dayfive;

import java.sql.*;
public class ConnectingJDBC {

	
		// TODO Auto-generated method stub
		static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
		static final String DB_URL = "jdbc:mysql://localhost/classicmodels";
		
		static final String USER = "root";
		static final String PASSWORD = "rootroot";
		
		public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection conn = null;
		Statement st = null;
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//open a connection
		System.out.println("COnnecting to database...");
		conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
		
		//execute a query
		System.out.println("creating a statement");
		st = conn.createStatement();
		String sql;
		sql = "select * from customers";
		ResultSet rs = st.executeQuery(sql);
		System.out.println("Customer ID\t" + " " + "Customer Name\t" + " " + "City\t" + " " + "Country");
		
		//extract data from sql
		while(rs.next()){
		//retrieve by col name
		int customerNumber = rs.getInt("customerNumber");
		String customerName = rs.getString("customerName");
		String city = rs.getString("city");
		String country = rs.getString("country");
		
		//Display values
		
		System.out.println(customerNumber + "\t" + customerName + "\t" + city + "\t" + country);
		//close the connection
		}
		rs.close();
		st.close();
		conn.close();
		
	}

}

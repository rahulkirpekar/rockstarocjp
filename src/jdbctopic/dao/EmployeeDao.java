package jdbctopic.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import jdbctopic.bean.EmployeeBean;
import jdbctopic.util.DbConnection;

public class EmployeeDao 
{
	private int insert(EmployeeBean ebean) 
	{
		String insertQuery = "INSERT INTO employee (name,salary,dsgn,orgname) VALUES ('"+ebean.getName()+"',"+ebean.getSalary()+",'"+ebean.getDsgn()+"','"+ebean.getOrgname()+"')";

		Connection conn = DbConnection.getConnection();
		
		Statement stmt = null;
		
		int rowsAffected = 0;
		
		if (conn!=null) 
		{
			try 
			{
				stmt = conn.createStatement();
				
				rowsAffected = stmt.executeUpdate(insertQuery);
				
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}
		} else 
		{
			System.out.println("EmployeeDao---insert()---Db not Connected : " + conn); 
		}
		return rowsAffected;
	}
	private void update() {
		// TODO Auto-generated method stub

	}
	private void delete() {
		// TODO Auto-generated method stub

	}
	private void getAllRecords() {
		// TODO Auto-generated method stub

	}
	public static void main(String[] args) 
	{
		EmployeeBean ebean = new EmployeeBean();
		
		ebean.setName("Rahul");
		ebean.setSalary(10000);
		ebean.setDsgn("SE");
		ebean.setOrgname("ABC");

		EmployeeDao dao = new EmployeeDao();
		
		int rowsAffcetd = dao.insert(ebean);
		
		if (rowsAffcetd > 0 ) 
		{
			System.out.println("Employee records successully inserted : " + rowsAffcetd);
		} else 
		{
			System.out.println("Employee records not inserted : " + rowsAffcetd);
		}
	}
}

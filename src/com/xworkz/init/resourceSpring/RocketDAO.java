package com.xworkz.init.resourceSpring;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RocketDAO {
	
	private String userName;
	private String password;
	private String url;
	private String driverClass;
	
	Connection connection=null;
	PreparedStatement pstmt=null;

	
	 public RocketDAO(String url, String driverClass) {
		super();
		this.url = url;
		this.driverClass = driverClass;
		System.out.println(this.getClass().getSimpleName() +"created with two constructors");
	}

			
	public void initResource() throws SQLException {
	       System.out.println("this method is used  init resource like connection,file or any other resources");
	       if(!userName.isEmpty()&& !password.isEmpty() && !url.isEmpty() && !driverClass.isEmpty())
	       {
	    	  System.out.println("write code to cnnect to db");
	    	  connection=DriverManager.getConnection(url,userName,password);

	       }else {
	    	   System.out.println("resource properies not available");
	       }

		}
	  

		
	    public void save(RocketDTO rDto) throws SQLException {
			System.out.println("save");
			   try {
				   pstmt = connection.prepareStatement("insert into jdbc_examples.rocket_table values(?,?,?,?)");
				   pstmt.setInt(1, rDto.getId());
				   pstmt.setString(2, rDto.getCountry());
				   pstmt.setString(3,  rDto.getLaunchDate());
				   //pstmt.setDate(3, new Date(rDto.getLaunchDate().getTime()));
				   pstmt.setDouble(4, rDto.getCost());
				   pstmt.execute();				

	    } catch (SQLException e) {
	    	e.printStackTrace();
	    }
	    }
	    
	    public void fetchData() {
	    	try {
				Statement stmt = connection.createStatement();
				ResultSet res = stmt.executeQuery("select * from jdbc_examples.rocket_table");
				while(res.next()) {
					int id=res.getInt(1);
					String country =res.getString(2);
					String launchDate=res.getString(3);
					double cost=res.getDouble(4);
					System.out.println(id + "	" + country + "	" + cost+"	  "+launchDate);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
	    }
	    
	    
	    public void Update(RocketDTO rDto) {
	    	 try {
				pstmt = connection.prepareStatement("update jdbc_examples.rocket_table set country=? where cost=?");
				pstmt.setString(2, rDto.getCountry());
				pstmt.setDouble(2, rDto.getCost());
				pstmt.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	    }
	    
	    public void delete(RocketDTO dto) {
	    	
	    	try {
	    	pstmt=connection.prepareStatement("delete from jdbc_examples.rocket_table where id=?");
	    	pstmt.setInt(1, dto.getId() );
			pstmt.execute();
			pstmt.close();

	    	
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    		
	    	}
	    

	    
	    public String getUserName() {
			return userName;
		}



		public void setUserName(String userName) {
			this.userName = userName;
			System.out.println(userName + " userName");
		}



		public String getPassword() {
			return password;
		}



		public void setPassword(String password) {
			this.password = password;
			System.out.println(password + "password");

		}


	
	public void closeResource() {
		System.out.println("this method used to close resources");
	}
	
}



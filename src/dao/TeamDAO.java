
package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import model.City;
import model.Team;
import utility.ConnectionManager;

public class TeamDAO{
	public void createTeam(Team team) throws Exception {
		String name=team.getName();
		String coach=team.getCoach();
		City city=team.getCity();
	    long id=city.getCityId();
	    String cityname=city.getCityName();
	    
	    ConnectionManager cm=new ConnectionManager();
	    Connection con=cm.getConnection();
	    
	    String sql="insert into myteam(name,coach)VALUES(?,?)";
	    
	    PreparedStatement st=con.prepareStatement(sql);
	    
	    
	    
	   
		st.setString(1,name);
		st.setString(2,coach);
		
	    
		String sql1="insert into MyCITY(id,cityname)VALUES(?,?)";
	    
	    PreparedStatement st1=con.prepareStatement(sql1);
	    
	    st1.setLong(1,id);
		st1.setString(2,cityname);
		st.executeQuery();
		st1.executeQuery();
	    
	}
}

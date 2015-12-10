package Persistencia;

import java.sql.*;

public class Agente_BD {
	private String url = "jdbc:mysql://localhost:3306/";
	private String dbName = "GymAndPool";
	private String driver = "com.mysql.jdbc.Driver";
	private String userName = "root";
	private String password = "root";
	private Statement statement;
	private Connection connector;
	private static Agente_BD agente_DB;
	
	private Agente_BD() throws Exception{
		Class.forName(driver).newInstance();
		connector = DriverManager.getConnection(url+dbName,userName,password);
		statement = connector.createStatement();
	}
	public static Agente_BD getAgente() throws Exception{
		if (agente_DB == null)
			agente_DB = new Agente_BD();
		return agente_DB;
	}
	
	public void desconectar() throws Exception{
		connector.close();
	}
	
	public void delete(String sentence) throws Exception{
		statement.executeUpdate(sentence);
	}
	
	public void update(String sentence) throws Exception{
		statement.executeUpdate(sentence);
	}
	
	public ResultSet read(String sentence) throws Exception{
		ResultSet result = statement.executeQuery(sentence);
		return result;
	}
	
	public void create(String sentence) throws Exception{
		statement.executeUpdate(sentence);
	}
	
}


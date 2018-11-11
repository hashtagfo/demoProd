package lu.lllc;

public class DBInfo {
	static String host = "studence-app-mysql"; // The standard name in Tomcat+ MySQL on openshift

	static String DBname = "studencedatabse";
	static int port = 3306; // This is for MySQL
	static String mySQLdbURL = "jdbc:mysql://" + host + ":" + port + "/"
			+ DBname;

	static String user = "studence";
	static String password = "redbinoutyou";
	
	static String driver = "com.mysql.jdbc.Driver";

	public DBInfo() {

	}

	static String getDBURL() {
		return mySQLdbURL;
	}

	public static String getUser() {
		return user;
	}

	public static String getPassword() {
		return password;
	}

	public static String getDriver() {
		return driver;
	}

}

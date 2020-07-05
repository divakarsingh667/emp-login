package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import beans.Emp;

public class EmpDAO {

	public static boolean isAuthenticate(String email, String password) {

		Connection connection = DBConnection.getConnection();

		String select = "SELECT * FROM emp WHERE email=? AND password=?";

		try {
			PreparedStatement ps = connection.prepareStatement(select);

			ps.setString(1, email);
			ps.setString(2, password);

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {

				return true;
			} else {
				return false;
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}

	public void saveEmp(Emp emp) {

		// Insert this emp into db.

	}

}

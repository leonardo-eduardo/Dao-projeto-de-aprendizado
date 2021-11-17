package Aplication;

import java.sql.Connection;

import db.DB;
import db.DbException;

public class Program {

	public static void main(String[] args) {

		Connection conn = null;

		try {
			conn = DB.getConnection();

		} catch (DbException e) {
			e.getMessage();
		
		} finally {
			if (conn != null) {
				DB.closeConnection();
			}
		}

	}

}

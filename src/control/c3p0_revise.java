package control;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import utils.c3p0untils_1;

public class c3p0_revise {
	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = c3p0untils_1.getConnection();
			String sql_update = "update student set grade = ? where id =?";
			Scanner sc = new Scanner(System.in);
			pstmt = conn.prepareStatement(sql_update);
			System.out.println("������Ҫ���޸ĵ�id:");
			pstmt.setInt(2, sc.nextInt());
			System.out.println("�������޸ĵ�stu_grade:");
			pstmt.setString(1, sc.next());
			int i = pstmt.executeUpdate();
			if(i != 0) {
			
			System.out.println("success");
			}else {
				
				System.out.println("fail");
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}finally {
			//close();
		}

		
	}

}

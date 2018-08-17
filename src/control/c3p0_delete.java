package control;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

import utils.c3p0untils_1;

public class c3p0_delete {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			// 从池子中获取连接
			conn = c3p0untils_1.getConnection();
			String sql_delete = "delete from student where id=?";
			pstmt = conn.prepareStatement(sql_delete);
			System.out.println("请输入删除学生的学号");
			Scanner scanner=new Scanner(System.in);
			PreparedStatement(sql_delete);
			pstmt.setInt(1, scanner.nextInt());
			

			int rows = pstmt.executeUpdate();
			if (rows != 0) {
				System.out.println("删除成功!");
			} else {
				System.out.println("删除失败!");
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		} finally {
		}

	}

	private static void PreparedStatement(String sql_delete) {
		// TODO 自动生成的方法存根
		
	}

}

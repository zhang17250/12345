package control;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

import utils.c3p0untils_1;


public class c3p0_add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("请输入学号");
		int s =scanner.nextInt();
		System.out.println("请输入姓名");
		String s1=scanner.next();
		System.out.println("请输入年龄");
		String s2=scanner.next();
		System.out.println("请输入成绩");
		String s3=scanner.next();
		//1、创建自定义连接池对象
		try {
			// 2.从池子中获取连接
			conn = c3p0untils_1.getConnection();
			String sql_add = "insert into student values(?,?,?,?)";
			pstmt = conn.prepareStatement(sql_add);
			pstmt.setInt(1, s);
			pstmt.setString(2, s1);
			pstmt.setString(3, s2);
			pstmt.setString(4, s3);
			int rows = pstmt.executeUpdate();
			if (rows > 0) {
				System.out.println("添加成功!");
			} else {
				System.out.println("添加失败!");
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		} finally {
		}
	}

}

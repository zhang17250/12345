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
			// �ӳ����л�ȡ����
			conn = c3p0untils_1.getConnection();
			String sql_delete = "delete from student where id=?";
			pstmt = conn.prepareStatement(sql_delete);
			System.out.println("������ɾ��ѧ����ѧ��");
			Scanner scanner=new Scanner(System.in);
			PreparedStatement(sql_delete);
			pstmt.setInt(1, scanner.nextInt());
			

			int rows = pstmt.executeUpdate();
			if (rows != 0) {
				System.out.println("ɾ���ɹ�!");
			} else {
				System.out.println("ɾ��ʧ��!");
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		} finally {
		}

	}

	private static void PreparedStatement(String sql_delete) {
		// TODO �Զ����ɵķ������
		
	}

}

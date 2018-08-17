package control;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import utils.c3p0untils_1;

public class c3p0_Sort {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			// �ӳ����л�ȡ����
			conn = c3p0untils_1.getConnection();
			File f = new File("src/stuInfo.txt");
			//���ַ�������ʽ����Ϣд���ļ�
			FileWriter fw = new FileWriter(f);
			BufferedWriter bw = new BufferedWriter(fw);
			String sql_sort = "select * from student order by grade desc";
			pstmt = conn.prepareStatement(sql_sort);
			ResultSet rel = pstmt.executeQuery();
			System.out.println("ѧ��\t"+"����\t"+"����\t"+"�ɼ�\t");
			bw.write("ѧ����Ϣ��");
			bw.newLine();
			bw.write("ѧ��\t"+"����\t"+"����\t"+"�ɼ�\t");
			bw.newLine();
			while(rel.next()) {
				String str1 = rel.getInt("id")+"\t"+
						rel.getString("username")+"\t"+
						rel.getString("age")+"\t"+
						rel.getString("grade");
				
				//���ַ�������ʽд��
				bw.write(str1);
				bw.newLine();
				System.out.println(str1);
						
			}
			bw.flush();
			//�ַ�д��Ĺر�
			fw.close();
			bw.close();
			rel.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}finally {
			//close();
		}
	}

	private static void PreparedStatement(String sql_delete) {
		// TODO �Զ����ɵķ������
		
	}

}

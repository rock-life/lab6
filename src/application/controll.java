package application;
import javafx.scene.control.Dialog;

import javax.swing.JOptionPane;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
public class controll {

	@FXML
	private Button btn=new Button();
	@FXML
	private TextField t=new TextField();
	@FXML
	private Label l=new Label();
	@FXML
	private Label ll=new Label();
	@FXML
	private Button bb=new Button();
	@FXML
	private TextField tt=new TextField();
	

	public void clic(ActionEvent e)
	{
		try 
		{
			double y=Math.pow(Double.valueOf(t.getText()), 3)-4*Math.pow(Double.valueOf(t.getText()),2)-5*Double.valueOf(t.getText())+9+Math.cos(Double.valueOf(t.getText()));
		l.setText("y :"+y);
		JOptionPane.showMessageDialog(null,"y :"+y );
		}
		catch(Exception ex) 
		{
			JOptionPane.showMessageDialog(null,"������ �������� ����: "+ex.getMessage());
		}
		
	}

	public void click(ActionEvent ex)
	{
		try 
		{
			int i=Integer.valueOf(tt.getText());
			switch(i) {
			case 1:ll.setText("�� - ��������");JOptionPane.showMessageDialog(null, "�� - ��������");;break;
			case 2:ll.setText("�� - ������������");JOptionPane.showMessageDialog(null,"�� - ������������"); ;break;
			case 3:ll.setText("�� - ������");JOptionPane.showMessageDialog(null,"�� - ������"); break;
			case 4:ll.setText("�� - �������");JOptionPane.showMessageDialog(null, "�� - �������");break;
			case 5: ll.setText("�� - ���������");JOptionPane.showMessageDialog(null,"�� - ���������"); break;
			case 6:ll.setText("�� - ����");JOptionPane.showMessageDialog(null,"�� - ����"); break;
			case 7:ll.setText("�� - Գ��������");JOptionPane.showMessageDialog(null,"�� - Գ��������"); break;
			default:ll.setText("������� �� ����!");JOptionPane.showMessageDialog(null, "������� �� ����!");
			}
		}
		catch(Exception e) {JOptionPane.showMessageDialog(null, "������ �������� ����: "+e);}
		
	}
}

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
			JOptionPane.showMessageDialog(null,"Невірно заповнені данні: "+ex.getMessage());
		}
		
	}

	public void click(ActionEvent ex)
	{
		try 
		{
			int i=Integer.valueOf(tt.getText());
			switch(i) {
			case 1:ll.setText("Це - Червоний");JOptionPane.showMessageDialog(null, "Це - Червоний");;break;
			case 2:ll.setText("Це - Помаранчивий");JOptionPane.showMessageDialog(null,"Це - Помаранчивий"); ;break;
			case 3:ll.setText("Це - Жовтий");JOptionPane.showMessageDialog(null,"Це - Жовтий"); break;
			case 4:ll.setText("Це - Зелений");JOptionPane.showMessageDialog(null, "Це - Зелений");break;
			case 5: ll.setText("Це - Блакитний");JOptionPane.showMessageDialog(null,"Це - Блакитний"); break;
			case 6:ll.setText("Це - Синій");JOptionPane.showMessageDialog(null,"Це - Синій"); break;
			case 7:ll.setText("Це - Фіолетовий");JOptionPane.showMessageDialog(null,"Це - Фіолетовий"); break;
			default:ll.setText("Кольору не існує!");JOptionPane.showMessageDialog(null, "Кольору не існує!");
			}
		}
		catch(Exception e) {JOptionPane.showMessageDialog(null, "Невірно заповнені данні: "+e);}
		
	}
}

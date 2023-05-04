package View;
import java.io.IOException;

import javax.swing.JOptionPane;

import Controller.ArquivosDiretorio;
import Controller.ArquivosDiretorios;

public class Principal {
public static void main(String[] args) {
	
	//String path="C:\\Program Files";
	//ArquivosDiretorios ad= new ArquivosDiretorio();
	
	//try {
	//	ad.leDiretorios(path);
	//} catch (IOException e) {
	//	JOptionPane.showMessageDialog(null, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
	//}
	
	
	// String path="C:\\out";
	//String nome="teste";
	//ArquivosDiretorios ad= new ArquivosDiretorio();
	//try {
	//	ad.criaTxt(path, nome);
	//} catch (IOException e) {
		// TODO Auto-generated catch block
	//	e.printStackTrace();
	//}
	
	
	
	//String absolutePath= "C:\\out\\teste.txt";
	//ArquivosDiretorios ad= new ArquivosDiretorio();
	//try {
		//ad.leTxt(absolutePath);
	//} catch (IOException e) {
		// TODO Auto-generated catch block
	//JOptionPane.showMessageDialog(null, e.getMessage(),"ERRO", JOptionPane.ERROR_MESSAGE);
	//}
	
	
	//String absolutePath= "C:\\out\\generic_food.csv";
	//ArquivosDiretorios ad= new ArquivosDiretorio();
	//try {
		//ad.abreArquivoApp(absolutePath);
	//} catch (IOException e) {
		// TODO Auto-generated catch block
		//JOptionPane.showMessageDialog(null, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
	//}
	String absolutePath= "C:\\out\\teste.txt";
	ArquivosDiretorios ad= new ArquivosDiretorio();
	try {
		ad.propriedades(absolutePath);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		JOptionPane.showMessageDialog(null, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
	}
	
	
}
}


package Controller;

import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

public class ArquivosDiretorio  implements ArquivosDiretorios {

	@Override
	public void leDiretorios(String path) throws IOException {
		File dir= new File (path);
		if(dir.exists() && dir.isDirectory()) {
		File[] lista=dir.listFiles();
		for(File f: lista) {
			if(f.isDirectory()) {
				System.out.println("["+
									f.getName()+"]");
			}
		}
		for (File f: lista) {
			if(f.isFile()) {
				System.out.println(f.getName());
			}
		}
		}else {
			throw new IOException("Diretório invalido");
			
		}
		
	}

	@Override
	public void criaTxt(String path, String nome) throws IOException {
		File dir= new File (path);
		File arquivo= new File(path, nome +".txt");
		if(dir.exists()) {
			Boolean arquivoExiste=false;
			if(arquivo.exists()) {
				arquivoExiste=true;
			}
			String conteudo=geraConteudoTxt();
			FileWriter fw =new FileWriter(arquivo, arquivoExiste);
			PrintWriter pw= new PrintWriter(fw);
			pw.write(conteudo);
			pw.flush();
			pw.close();
			fw.close();
		}else {
			throw new IOException("Diretorio Inválido");
		}
		
	}

	@Override
	public void leTxt(String absolutePath) throws IOException {
		File arquivo= new File(absolutePath);
		if(arquivo.exists()) {
			FileInputStream fluxo= new FileInputStream(arquivo);
			InputStreamReader leitor= new InputStreamReader(fluxo);
			BufferedReader buffer= new BufferedReader(leitor);
			String linha=buffer.readLine();
			while(linha!=null) {
				System.out.println(linha);
				linha=buffer.readLine();
			}
			buffer.close();
			leitor.close();
			fluxo.close();
		} else {
			throw new IOException("Arquivo Inválido");
		}
		
	}
	private String geraConteudoTxt() {
		StringBuffer buffer= new StringBuffer();
		
		
		String linha="";
		while (!linha.equals("fim")) {
			linha=JOptionPane.showInputDialog(null, "digite uma frase", "entrada", JOptionPane.INFORMATION_MESSAGE);
			buffer.append(linha+ "\r \n");
			
		}
		return buffer.toString();
		
	}

	@Override
	public void abreArquivoApp(String absolutePath) throws IOException {
		File arquivo = new File (absolutePath);
		if(arquivo.exists()) {
			Desktop desk=Desktop.getDesktop();
			desk.open(arquivo);
		}else {
			throw new IOException("Arquivo invalido");
		}
		
	}

	@Override
	public void propriedades(String absolutePath) throws IOException {
		File arquivo = new File (absolutePath);
		if(arquivo.exists()) {
			if(arquivo.canRead()) {
				System.out.println("Permite leitura");
			}else {
				System.out.println("não permite Leitura");
			}
			if(arquivo.canWrite()) {
				System.out.println("Permite Escrita");
			}else {
				System.out.println("Não Permite Escrita");
			}
			System.out.println(arquivo.getTotalSpace());
			if(arquivo.isHidden()) {
				System.out.println("Arquivo oculto");
			}else {
				System.out.println("Arquivo visível");	
			}
		}else {
			throw new IOException("Arquivo Inválido");
		}
		
	}
}

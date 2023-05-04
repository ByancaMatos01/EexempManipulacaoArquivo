package Controller;

import java.io.IOException;

public interface ArquivosDiretorios {
	// criação da assinatura le diretorios 
	
	// thrwos e se tiver um erro significa que vai ser tratada em outro metodo
 public void leDiretorios(String path)throws IOException;
 
 public void criaTxt(String path, String nome) throws IOException;
 
 public void leTxt(String absolutePath) throws IOException;
 
 public void abreArquivoApp(String absolutePath) throws IOException;
 
 public void propriedades (String absolutePath) throws IOException;
}

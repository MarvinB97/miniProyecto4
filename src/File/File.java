package File;

import java.io.*;
import java.util.ArrayList;

public class File {

	public File() {
		// TODO Auto-generated constructor stub
	}
	
	public String readFile(String nombreArchivo) {
		String name = "src/Memoria/"+nombreArchivo+".txt";
		String Info = "";
		
		try {
			 BufferedReader bf = new BufferedReader(new FileReader(name));
			 String sCadena;
			  
			 while ((sCadena = bf.readLine())!=null) {
				 if(Info == "") {
					 Info = sCadena;
				 }else {
					 Info = Info + "\n" + sCadena;
				 }
			 }
			 bf.close();
			} catch (FileNotFoundException fnfe){
			 fnfe.printStackTrace();
			} catch (IOException ioe){
			 ioe.printStackTrace();
			}
		return Info;
	}
	
	//Guarda solo una linea en el archivo
	public void writeFile(String nombreArchivo, String InfoGuardar) {
		String name = "src/Memoria/"+nombreArchivo+".txt";
		
		try {
			BufferedWriter escritor = new BufferedWriter(new FileWriter(name,true));
			escritor.write(InfoGuardar);
			escritor.newLine();
			escritor.close();
		}catch (IOException ioe){
			ioe.printStackTrace();
		}
	}
	
	//Actualizar todo el archivo
	public void updateFile(String nombreArchivo, ArrayList<String> InfoGuardar) {
		String name = "src/Memoria/"+nombreArchivo+".txt";
		
		try {//sobreescribimos el archivo
			BufferedWriter escritor = new BufferedWriter(new FileWriter(name,false));
			for(String ls: InfoGuardar) {
				escritor.write(ls);
				escritor.newLine();
			}
			escritor.close();
		}catch (IOException ioe){
			ioe.printStackTrace();
		}
	}
	

}

package util;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class MetodoDataToArray {

	public ArrayList<String> AString(String nombre) throws IOException{
		ArrayList<String> arreglo = new ArrayList<String>();
		FileReader fr = null;
		BufferedReader br = null;
		String data;
		try {
			fr = new FileReader(nombre);
			br = new BufferedReader(fr);
			data = br.readLine();
			while(data != null) {
				arreglo.add(data);
				data = br.readLine();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return arreglo;
	}
}

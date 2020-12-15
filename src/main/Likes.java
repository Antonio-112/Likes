package main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Likes {

	public static void main(String[] args) throws IOException {
		List<List> arreglo = new ArrayList<List>();
		List<String> fotos = Arrays.asList("Foto 1","Foto 2","Foto 3","Foto 4","Foto 5","Foto 6","Foto 7","Foto 8","Foto 9");
		ArrayList<Integer> fotosLikes = new ArrayList<Integer>(Arrays.asList(0,0,0,0,0,0,0,0,0));
		MetodoDataToArray Dat = new MetodoDataToArray();
		ArrayList<String> datos = Dat.AString("likes");
		for (int i = 0; i<datos.size();i++) {
			for(int j = 0;j<datos.get(i).length();j++) {
				if(datos.get(i).charAt(j)=='1') {
					fotosLikes.set(0,fotosLikes.get(0)+1);
				}
				else if(datos.get(i).charAt(j)=='2') {
					fotosLikes.set(1,fotosLikes.get(1)+1);;
				}
				else if(datos.get(i).charAt(j)=='3') {
					fotosLikes.set(2,fotosLikes.get(2)+1);
				}
				else if(datos.get(i).charAt(j)=='4') {
					fotosLikes.set(3,fotosLikes.get(3)+1);
				}
				else if(datos.get(i).charAt(j)=='5') {
					fotosLikes.set(4,fotosLikes.get(4)+1);
				}
				else if(datos.get(i).charAt(j)=='6') {
					fotosLikes.set(5,fotosLikes.get(5)+1);
				}
				else if(datos.get(i).charAt(j)=='7') {
					fotosLikes.set(6,fotosLikes.get(6)+1);
				}
				else if(datos.get(i).charAt(j)=='8') {
					fotosLikes.set(7,fotosLikes.get(7)+1);;
				}
				else if(datos.get(i).charAt(j)=='9') {
					fotosLikes.set(8,fotosLikes.get(8)+1);
				}
			}
		}

		arreglo.add(fotos);
		arreglo.add(fotosLikes);
		for(int i = 0;i<fotos.size();i++) {
			System.out.println(fotos.get(i)+": "+fotosLikes.get(i)+ " Likes");
		}
		//////////////////////////////////////////////////////////////////////////////
		//Minimo y maximo
		int min = 9999999;
		int max =0;
		for(int i = 0; i < fotosLikes.size(); i++){
			if(min>=fotosLikes.get(i)){
				min = fotosLikes.get(i);
			}
			else if(max<fotosLikes.get(i)){
				max=fotosLikes.get(i);
			}
		}
		/////////////////////////////////////////////////////////////////////////////
		//Popular y no Popular
		ArrayList<Integer> popular = new ArrayList<Integer>();
		ArrayList<Integer> inpopular = new ArrayList<Integer>();
		for(int i = 0;i<fotosLikes.size();i++) {
			if(fotosLikes.get(i)==max) {
				popular.add(i);
				
			}
			else if (fotosLikes.get(i)==min) {
				inpopular.add(i);
			}
		}
		if(popular.size()==1) {
			System.out.println("La foto mas popular: "+ fotos.get(popular.get(0)) + " con " + max + " likes");
		}else if(popular.size()>1){
			System.out.println("Las fotos mas populares: ");
			for (int i = 0; i < popular.size(); i++) {
				System.out.print(fotos.get(popular.get(i))+" ");
			}
			System.out.print("con " + min + " Likes");
		}
		
		if(inpopular.size()==1) {
			System.out.println("La foto menos popular: "+ fotos.get(inpopular.get(0)) + " con " + min + " likes");

		}else if(inpopular.size()>1){
			System.out.print("Las fotos menos populares: ");
			for (int i = 0; i < inpopular.size(); i++) {
				System.out.print(fotos.get(inpopular.get(i))+ " ");
			}
			System.out.println("con " + min + " Likes");
			
		
		}
		////////////////////////////////////////////////////////////////////////////////
		//
		int sum = 0;
		for (int i = 0; i < fotosLikes.size(); i++) {
			sum +=fotosLikes.get(i);
		}
		System.out.println("Promedio de likes: "+sum/fotosLikes.size());
		////////////////////////////////////////////////////////////////////////////////
	}
}

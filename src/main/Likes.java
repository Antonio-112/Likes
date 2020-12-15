package main;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import util.Count;

public class Likes {	

	public static void main(String[] args) throws IOException {
		Count cuenta = new Count();
		List<List> arreglo = cuenta.Arreglo();
		for(int i = 0;i<arreglo.get(0).size();i++) {
			System.out.println(arreglo.get(0).get(i)+": "+arreglo.get(1).get(i)+ " Likes");
		}
		//////////////////////////////////////////////////////////////////////////////
		//Minimo y maximo
		int min = 9999999;
		int max =0;
		for(int i = 0; i < arreglo.get(1).size(); i++){
			if(min>=(int)arreglo.get(1).get(i)){
				min = (int) arreglo.get(1).get(i);
			}
			else if(max<(int) arreglo.get(1).get(i)){
				max=(int) arreglo.get(1).get(i);
			}
		}
		/////////////////////////////////////////////////////////////////////////////
		//Popular y no Popular
		ArrayList<Integer> popular = new ArrayList<Integer>();
		ArrayList<Integer> inpopular = new ArrayList<Integer>();
		for(int i = 0;i<arreglo.get(1).size();i++) {
			if((int) arreglo.get(1).get(i)==max) {
				popular.add(i);
			}
			else if ((int)arreglo.get(1).get(i)==min) {
				inpopular.add(i);
			}
		}
		if(popular.size()==1) {
			System.out.println("La foto mas popular: "+ arreglo.get(0).get(popular.get(0)) + " con " + max + " likes");
		}else if(popular.size()>1){
			System.out.println("Las fotos mas populares: ");
			for (int i = 0; i < popular.size(); i++) {
				System.out.print(arreglo.get(0).get(popular.get(i))+" ");
			}
			System.out.print("con " + min + " Likes");
		}
		
		if(inpopular.size()==1) {
			System.out.println("La foto menos popular: "+ arreglo.get(0).get(inpopular.get(0)) + " con " + min + " likes");

		}else if(inpopular.size()>1){
			System.out.print("Las fotos menos populares: ");
			for (int i = 0; i < inpopular.size(); i++) {
				System.out.print(arreglo.get(0).get(inpopular.get(i))+ " ");
			}
			System.out.println("con " + min + " Likes");
		}
		////////////////////////////////////////////////////////////////////////////////
		//
		int sum = 0;
		for (int i = 0; i < arreglo.get(1).size(); i++) {
			sum += (int)arreglo.get(1).get(i);
		}
		System.out.println("Promedio de likes: "+sum/arreglo.get(1).size());
		////////////////////////////////////////////////////////////////////////////////
	}
}

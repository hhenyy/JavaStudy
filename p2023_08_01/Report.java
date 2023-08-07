package p2023_08_01;

import java.util.Arrays;
import java.util.TreeSet;

class Report {

	public static void main(String[] args) {

		TreeSet hs = new TreeSet();

			for(int i=0;; i++){ //size():원소의 갯수  //조건식생략(무한루프)
				hs.add((int)(Math.random() * 45) + 1);
				if (hs.size()==6) {
				break;
				}	
			} 
			System.out.println(hs); 
		}
	} 


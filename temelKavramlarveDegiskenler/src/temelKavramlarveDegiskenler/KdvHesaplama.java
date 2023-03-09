package temelKavramlarveDegiskenler;

import java.util.Scanner;

public class KdvHesaplama {

	public static void main(String[] args) {

		//Bu işlemi gerçekleştirebilmek için bize tutar, kdvlifiyat ve kdv oranı lazım
		
		double tutar,kdvliFiyat, kdv=0.18;
		
		Scanner x = new Scanner(System.in);
		
		System.out.println("Ürünün fiyatını giriniz : ");
		
		tutar = x.nextDouble();
		kdvliFiyat = tutar + (tutar * kdv);
		System.out.println(kdvliFiyat);
	}

}

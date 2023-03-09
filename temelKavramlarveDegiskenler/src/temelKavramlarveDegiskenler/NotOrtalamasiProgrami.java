package temelKavramlarveDegiskenler;

import java.util.Scanner;

public class NotOrtalamasiProgrami {

	public static void main(String[] args) {

		double a,b,c;
		double ilkelHesapla;
		double proHesapla;
		
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Vize notunuzu giriniz : ");
			
			a = input.nextDouble();
			
			System.out.println("Quiz notunuzu giriniz : ");
			
			b = input.nextDouble();
			
			System.out.println("Final notunuzu giriniz : ");
			
			c = input.nextDouble();
		}
		
		 ilkelHesapla = (a+b+c)/3;
		
	    proHesapla = (a * 0.2)+(b * 0.35)+(c * 0.45);
		
		System.out.println("Basit ortalama : " + (ilkelHesapla));
		
		System.out.println("Geçerli ortalamanız : " + (proHesapla));
		
		String sonuc = (proHesapla >= 50) ? "Geçtiniz" : "Kaldınız!" ;
		
		System.out.println(sonuc);
		
		
		
	}

}

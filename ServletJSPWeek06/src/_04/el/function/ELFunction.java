package _04.el.function;

public class ELFunction {
	
	public static int sum(int n1,int n2) {
		
		return n1+n2;
	}
	
	public static int substract(int n1, int n2) {
		return n1 - n2;
	}

	public static String concatMe(String str1, String str2) {
		return str1 + str2;
	}
	
}

//metodumuz PUBL�C STAT�C OLMALI.

//TLD (tag library descriptor)
//bu dodyam�z�n yeri WEB-INF lat�nda yer almas� gerekiyor.

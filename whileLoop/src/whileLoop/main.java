package whileLoop;
public class main {

	public static void main(String[] args) {
		//for
		//i=1 sayaç(başlangıç noktam)
		//çift sayılar
		for (int i = 2; i < 10; i+=2) {
		    System.out.println(i);	
		}
		System.out.println("For Döngüsü Bitti");
		
		int i = 2;
        //while
		while(i<10) {
			System.out.println(i);
			i+=2;
		}
		System.out.println("While Döngüsü Bitti");
	}

}
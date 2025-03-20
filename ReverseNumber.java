import java.util.Scanner;
public class ReverseNumber{
	int x;

	public ReverseNumber(int x) {
		// TODO Auto-generated constructor stub
		this.x=x;
	}
	public void Saisir() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Saisir votre nombre entier :");
		this.x= scanner.nextInt();
		scanner.close();
	}
	public void Inverser() {
		int inverse=0;
		while (x>0) {
			int digit= x%10;
			inverse= inverse*10 + digit;
			x /=10;	
		}
		System.out.println(inverse);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseNumber Chiffre = new ReverseNumber(0);
		Chiffre.Saisir();
		Chiffre.Inverser();
	}

}

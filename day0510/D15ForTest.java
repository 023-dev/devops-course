import java.util.Scanner;
class D15ForTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("숫자를 입력하세요. : ");
		int n = sc.nextInt();
		for(int i=1;i<n+1;i++)
			if(i%2!=0)System.out.println(i);
	}
}

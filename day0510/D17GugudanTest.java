import java.util.Scanner;
class D17GugudanTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("숫자를 입력하세요. : ");
		int n = sc.nextInt();
		System.out.printf("\t<<\t구구단\t%d단\t>>\t\n", n);
		for(int i=1;i<10;i++)
			System.out.printf("%d\t*\t%d\t=\t%d\n", n, i, n*i);
	}
}

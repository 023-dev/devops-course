/*
1) 산술연산자 : +,-,/,%,*

*/
class D21OperatorArithmeticTest
{
	public static void main(String[] args) 
	{
		int a = 13;
		int b = 48;
		int add, sub, div, multi, mode;
		add = a + b;
		sub = a - b;
		div = a / b;
		multi = a * b;
		mode = a % b;
		System.out.printf("add : %d\nsub : %d\nmul : %d\ndiv : %d\nmod : %d", add, sub, multi, div, mode);
	}
}

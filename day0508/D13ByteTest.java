/*
overflow : Data type의 maximum을 초과하면 쓰레기 값을 주는 현상.
underflow : Data type의 minimum보다 미만이면 쓰레기 값을 주는 현상.
*/
class D13ByteTest{
	public static void main(String[] args){
		byte b8;
		b8 = -128;
		b8 = (byte)(b8-1);
		System.out.println(b8);
	}
}

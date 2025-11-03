public class Main
{
    public static int abs1(int x){
        return abs3(x);
    }
    public static int abs2(int x){
        return 10;
    }
    public static int abs3(int x){
        return abs2(x);
    }
	public static void main(String[] args) {
	    int number = -101;
	    int value = abs1(number);
	   
		System.out.println("Value is :" +value);
	}
}

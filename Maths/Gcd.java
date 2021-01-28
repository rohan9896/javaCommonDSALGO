public class Gcd
{
    
    public static int gcdRec(int a, int b){
        if(b == 0){
            return a;
        }
        
        return gcdRec(b,a%b);
    }
    
    public static int gcdIterative(int a, int b){
        while(b != 0){
            int rem = a%b;
            a = b;
            b = rem;
        }
        return a;
    }
    
    
	public static void main(String[] args) {
		System.out.println(gcdRec(24, 42));
		System.out.println(gcdIterative(24, 42));
	}
}
/*
a = 24
b = 42

a = 42
b = 24%42 = 24

a = 24
b = 42%24 = 18

a = 18
b = 24%18 = 6

a = 6
b = 18%6 = 0
*/

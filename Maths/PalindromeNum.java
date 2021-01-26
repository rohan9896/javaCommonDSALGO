public class PalindromeNum
{
    
    public static boolean palindromeNum(int n){
        int revNum = 0;
        int temp = n;
        while(temp!=0){
            revNum*=10;
            int lastDig = temp%10;
            temp = temp/10;
            revNum = revNum + lastDig;
        }
        return n == revNum;
    }
    
    
	public static void main(String[] args) {
		System.out.println(palindromeNum(2456542));
	}
}

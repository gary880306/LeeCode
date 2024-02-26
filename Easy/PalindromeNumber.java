package Easy;

public class PalindromeNumber {
    public static boolean palindromeNumber(int x){
        if(x < 0 || (x % 10 == 0 && x != 0)){
            return false;
        }

        // r = reverse
        int r = 0;
        while(x > r){
            r = r * 10 + x % 10;
            x /= 10;
        }

        return x == r || x == (r / 10);
    }

    public static void main(String[] args) {
        int x = 121;
        boolean result = palindromeNumber(x);
        System.out.println(result); // true
    }
}

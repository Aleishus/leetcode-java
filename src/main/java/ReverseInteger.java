/**
 * Zhouxi O_o
 *
 * @author xi
 * @description
 */
public class ReverseInteger {

    public int reverse( int x ) {
     int result = 0;
     int dig = 0;
     int temp = 0;
     while(x != 0){
      dig = x % 10;
      temp = dig + result * 10;
      if((temp - dig)/10 != result){
       return 0;
      }
      result = temp;
      x = x / 10;
     }
     return result;
    }


    public  static void main(String... args){
     int m = 1534236469 ;
     ReverseInteger reverseInteger = new ReverseInteger();
     int y = reverseInteger.reverse(m);
    }
}

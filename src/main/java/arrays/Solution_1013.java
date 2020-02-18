package arrays;

import java.util.HashSet;
import java.util.Set;

/**
 * Zhouxi O_o
 *
 * @author xi
 * @description
 */
public class Solution_1013 {

    public boolean canThreePartsEqualSum( int[] A ) {
        int ASum = 0,aSum = 0, bSum=0, cSum = 0;

        for(int a: A){
            ASum+=a;
        }
        for (int i = 0; i + 1 < A.length; i++) {
            aSum += A[i];
            cSum = 0;
            bSum = 0;
            for (int j = A.length-1; i + 1 < j; j--) {
                cSum +=A[j];
                bSum = ASum-aSum-cSum;
                if (aSum == bSum && bSum == cSum) {
                    return true;
                }
            }
        }

        return false;

    }


/*    //todo 此方法思路不错

 public boolean canThreePartsEqualSum(int[] A) {

        int count = 0;
        int total = 0;
        for (int i = 0; i < A.length; i++) {
            int temp = A[i];
            total = total + temp;
        }

        if (total % 3 != 0)
        {
            return false;
        }

        int sum = total/3;

        total = 0;
        for (int i = 0;i<A.length;i++)
        {

            int temp = A[i];
            total = total + temp;
            if (total==sum)
            {
                count ++;
                total = 0;
            }
        }

        if (count==3)
        {
            return true;
        }
        return  false;
    }
}*/

    public static void main( String[] args ) {
        int [] A = {3,3,6,5,-2,2,5,1,-9,4};
        System.out.println(new Solution_1013().canThreePartsEqualSum(A));
    }
}

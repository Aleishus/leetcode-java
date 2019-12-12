/**
 * Zhouxi O_o
 *
 * @author xi
 * @description
 */
public class IncreasingTriplet {

    public boolean increasingTriplet( int[] nums ) {

        if (nums.length < 3) {
            return false;
        }

        int min = nums[0];
        int max = nums[0];
        int count = 1;
        int pos = 1;

        for (int i = 1; i < nums.length; i++) {



            if (nums.length - pos < 3) {
                return false;
            }
            if (nums[i] == nums[i - 1]) {
                continue;
            }
            if (nums[i] < nums[i - 1]) {

                if (nums[i] == min) {
                    continue;
                } else if (nums[i] < min) {
                    min = nums[i];
                    pos = i;
                    count = 1;
                } else {
                    count = 2;
                }
            } else {
                if(nums[i]>max){
                    max = nums[i];
                    count++;
                }else if(nums[i]==max){
                    continue;
                }

            }
            if (count == 3) {
                return true;
            }
        }
        return false;
    }

    public static void main( String[] args ) {
        IncreasingTriplet triplet = new IncreasingTriplet();
        int[] nums = {5, 1, 5, 5, 2, 5, 4};
        System.out.println(triplet.increasingTriplet(nums));
    }

}

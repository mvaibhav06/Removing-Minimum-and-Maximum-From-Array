public class RemovingElements {
    public static int minimumDeletions(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int p = 0;
        int q = 0;

        for(int i=0; i<nums.length; i++){
            if(nums[i]>max){
                max = nums[i];
                q = i;
            }
            if(nums[i]<min){
                min = nums[i];
                p = i;
            }
        }

        int a = Math.max(p,q)+1;
        int b = Math.min(p,q)+nums.length-Math.max(p,q)+1;
        int c = nums.length-Math.min(p,q);
        a = Math.min(a,b);
        return Math.min(a,c);
    }

    public static void main(String[] args) {
        int[] nums = {-14,61,29,-18,59,13,-67,-16,55,-57,7,74};
        System.out.println(minimumDeletions(nums));
    }
}

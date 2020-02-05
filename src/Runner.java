public class Runner {


    public static void main(String[] args) {
        int[] a = {1,2,2,2,2,1};
        int[] b = {0,2,4};
        int[] c= {1,2,2,1};
        int[]d = {1, 2, 4, 6};
        int[] e = {2, 3, 4};

        System.out.println(icyHot(120, -1));
        System.out.println(sumDouble(1 ,2));
        System.out.println(helloName("Maria"));
        System.out.println(sum13(c));
        System.out.println(makeBricks(3 , 1 , 8 ));
        System.out.println(noTriples(a));
        System.out.println(lucky13(b));
        System.out.println(linearIn(d,e));
        System.out.println(repeatEnd("Hello" , 3 ));
    }


//Warmup-1
    public static  boolean icyHot(int temp1, int temp2) {
        if(( temp1 < 0 && temp2 > 100) || (temp1 > 100 && temp2 < 0)){
            return true;
        }else{
            return false;
        }
    }

//Warmup-1
    public static int sumDouble(int a, int b) {
        if(a == b){
            return (a +b) * 2;
        }else{
            return a + b;
        }
    }

//string1
    public static String helloName(String name) {
        String  pop = "Hello" + " " + name + "!";
        return pop;
    }

//array 13
    public static int sum13(int[] nums) {
        int sum = 0;
        for( int i = 0; i<nums.length; i++){
            if(nums[i] != 13){
                sum += nums[i];
            }else{
                i++;
            }
        }
        return sum;
    }
    //logic2
    public static boolean makeBricks(int small, int big, int goal) {
        if (goal > small + big * 5)
            return false;
        else
            return goal % 5 <= small;
    }
//warmup 2
    public static boolean noTriples(int[] nums) {
        for( int i = 0; i<nums.length - 2; i++){
            int num = nums[i];
            if( nums[i+1] == num && nums[i+2] == num){
                return false;
            }
        }
        return true;
    }


//array2
    public static boolean lucky13(int[] nums) {
        for(int i = 0; i<nums.length; i++){
            if(nums[i] == 1 || nums[i] == 3){
                return false;
            }
        }
        return true;
    }

//Array 3
    public static boolean linearIn(int[] outer, int[] inner) {
        for(int i=0; i<outer.length;i++){
            for(int a=0; a<inner.length;a++){


                if(outer[i] != inner[a]){
                    return false;
                }
            }
        }
        return true;

    }



//String 2
public static String repeatEnd(String str, int n) {
    int length = str.length();
    String repeat = str.substring(length-n,length);
    String value = "";
    for(int i = 0; i<n; i++){
        value += repeat;
    }
    return value;
}
}

public class Test {

    static final int[] nullArr = null;
    static final int[] emptyArr = {};
    static final int[] arr1 = {1,2,0,1,3,4};
    static final int[] arr2 = {1,3,0,5,1,6,3,4};
    

    public static void main(String[] args){
        testNull();
        System.out.println("Passed!");
        testEmpty();
        testArr1();
        System.out.println("Passed!");
        testArr2();
        System.out.println("Passed!");
    }
    public static void testNull(){
        try{
            int[] resultArray = Main.decrementArray(nullArr);
            assert(resultArray == null);
        }catch(Exception e){
            e.printStackTrace();
        }
    }   
    public static void testEmpty(){
        try{
            int[] resultArray = Main.decrementArray(emptyArr);
            assert(resultArray.length == 0);
        }catch(Exception e){
            e.printStackTrace();
        }
    }   
    public static void testArr1(){
        try{
            int[] resultArray = Main.decrementArray(arr1);
            for(int i=0; i<arr1.length;i++){
                if(arr1[i]!=0){
                    assert(resultArray[i] == arr1[i] - 1);
                }
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void testArr2(){
        try{
            int[] resultArray = Main.decrementArray(arr2);
            for(int i=0; i<arr2.length;i++){
                if(arr2[i]!=0){
                    assert(resultArray[i] == arr2[i] - 1);
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
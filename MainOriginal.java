public class MainOriginal {
    public static void main(String[] args){
        int[] arr = {0,1,0,2,1,0,1,3,2,1,2,1};
       
        System.out.println("Total area : " + findWaterArray(arr)); //6
    }

    public static int findWaterArray(int[] arr){
        int water = 0;
        int start = findIndexOfLeadingZero(arr);
        int end = findIndexOfTrailingZero(arr);
        while(start != end-1){
            water = water + countZeros(start, end, arr);
            decrementArray(arr);
        }
        return water;
    }

    public static int countZeros(int start, int end, int[] arr){
        int count = 0;
        for(int i = start; i < end; i++){
            if(arr[i] == 0){
                count++;
            }
        }
        System.out.println("Count: "+count);
        return count;
    }

    public static int findIndexOfLeadingZero(int[] arr){
        int i=0;
        for(; i<arr.length; i++){
            if(arr[i]!=0){
                System.out.println("Start : "+i);
                return i;
            }
        }
        return i;
       
    }
    public static int findIndexOfTrailingZero(int[] arr){
        int i=arr.length-1;
        for(; i>0; i--){
            if(arr[i]!=0){
                System.out.println("End : "+i);
                return i;
            }
        }
        return i;
    }

    public static int[] decrementArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            if (arr[i]!=0){
                arr[i] = arr[i] - 1;
            }
        }
        System.out.println("After Decrement : "+ arr);
        return arr;
    }

   
}
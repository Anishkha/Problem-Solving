class Solution {
    static int minJumps(int[] arr) {
       int c=1;
       int cal=arr[0];
       int max=cal;
       if(arr[0]==0){
           return -1;
       }
       if(arr.length==1){
           return 0;
       }
       for(int i=1;i<arr.length;i++){
           if(i>cal){
               return -1;
           }
           max=Math.max(max,i+arr[i]);
           if(i==cal){
               c++;
               cal=max;
           }
           if(cal>=arr.length-1){
               return c;
           }
       }
       return -1;
    }
}
public class Main {
    public static void main(String[] args) {
        int[] arr = {9,10,1,2,3,4,8,0,0,0,0,0,0,0,1};   
        int result = Solution.minJumps(arr);
        if (result != -1) {
            System.out.println("Minimum number of jumps to reach the end: " + result);
        } else {
            System.out.println("It's not possible to reach the end of the array.");
        }
    }
}

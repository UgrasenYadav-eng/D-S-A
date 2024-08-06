import java.util.*;
class bubbleShort{
public static void printArray(int arr[] ) {
    for (int i = 0; i < arr.length; i++) {
System.out.print(arr[i]+" ");        
    }
}

public static void main(String[] args) {
 
    int arr[]={7,8,3,1,2};
    
    //bubble Short
for(int i=0; i<arr,length-1; i++){
    for (int j = 0; j < arr.length-i-1; j++) {
        //swapping
        int tem=arr[i];
        arr[i] = arr[j=1];
        arr[j+1]=temp;
        
    }
    printArry(arr);
}
}
}
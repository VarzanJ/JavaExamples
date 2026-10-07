public class ArraysOdd {
    public static void main(String[] args) {
        int arr[] = {10,05,12,13,15,20,17};
        System.out.println("Odd Numbers");
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                continue;
            
            }

            System.out.println(arr[i]);
            }
            
            
    }
}

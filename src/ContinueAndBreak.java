public class ContinueAndBreak {
    public static void main(String[] args) {
        int arr[] = {10,05,12,13,15,20,17};
        for(int i = 0; i < arr.length; i++){
            if (arr[i] == 12){
                continue;
            }
            System.out.println(arr[i]);
        } System.out.println("break");
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 13){
                break;
            }System.out.println(arr[i]);
        }
     } 

}

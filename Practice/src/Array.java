public class Array {
    static void min(int arr[]){
        int val=arr[0];
        for(int i=0;i<arr.length;i++) {
            if (val < arr[i]) {
                val = arr[i];
            }
            System.out.println(val);
        }

    }
    public static void main(String[] args){
        int a[]={1,2,3,4};
        min(a);
    }
}

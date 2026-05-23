public class arraysum {

    public static void main(){
        int arr[]={12,13,122,33,44};
        int sum=0;
        int n=arr.length;

        for(int i=0;i<n;i++){
            int val=arr[i];
            sum=sum+val;

        }
        System.out.println(sum);
    }
}

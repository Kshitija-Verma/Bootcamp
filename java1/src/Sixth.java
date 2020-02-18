public class Sixth {
    public static void main(String[] args) {
        int arr[] = new int[]{2,3,4,5,7,2,3,4,5 };
        int count = 0;
        for(int i =0; i<arr.length;i++)
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j] && arr[i]!=0) {
                    arr[j] = 0;
                    arr[i] = 0;
                }


            }
        for(int i=0;i<arr.length;i++)
            if(arr[i]!=0) {
                count = 1;
                System.out.println("The element is : " + arr[i]);
            }
            if(count==0)
                System.out.println("The element is : 0 ");
    }
}

public class Fifth {
    public static void main(String[] args) {
        int Arr1[]= new int[]{1,3,4,5,7,12,56};
        int Arr2[] = new int[]{3,5,45,34,1,50};

        for(int i=0;i< Arr1.length;i++)
            for(int j=0 ; j<Arr2.length;j++)
            {
                if(Arr1[i]==Arr2[j])
                    System.out.println(Arr1[i]);
            }
    }
}

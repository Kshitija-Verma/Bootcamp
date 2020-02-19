public class Second {
    public static void main(String[] args) {
        String str = "Hello this is Kshitija Verma";
       str =  str.toLowerCase();
        char[] ch = str.toCharArray();
        char temp;
        for(int i=0;i<ch.length;i++)
            for(int j=0;j<ch.length;j++) {
                if (ch[i] < ch[j]) {
                    temp = ch[i];
                    ch[i] = ch[j];
                    ch[j] = temp;
                }
            }
                for(int k = 0;k<ch.length;k++) {
                    System.out.print(ch[k]);
                }


    }
}

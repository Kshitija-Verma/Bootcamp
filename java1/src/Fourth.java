
public class Fourth {
    public static void main(String[] args) {
        String str = "Hello hi KKR Stamp World 12 fgt534 @& ft@* chherjjhuy^&^&#^^ gd2347";
        int upper =0;
        int lower = 0;
        int digits = 0;
        int other = 0;
        float upcnt,lpcnt , dpcnt , opcnt;
         int len = str.length();
         for(int i = 0; i<len;i++)
         {
             char c = str.charAt(i);
             if(c >='A' && c <='Z')
                 upper++;
             else
                 if(c >='a' && c<='z')
                     lower++;
                 else
                     if(c>='0' && c <= '9')
                         digits++;
                     else
                         other++;
         }
         upcnt = (upper*100)/len;
         lpcnt = (lower*100)/len;
         dpcnt = (digits*100)/len;
         opcnt = (other*100)/len;

         System.out.println("The number of uppercase letters are = "+ upper + " and percentage = "+ upcnt);
        System.out.println("The number of lowercase letters are = "+ lower + " and percentage = "+ lpcnt);
        System.out.println("The number of digits are = "+ digits + " and percentage = "+ dpcnt);
        System.out.println("The number of special characters are = "+ other + " and percentage = "+ opcnt);

    }
}

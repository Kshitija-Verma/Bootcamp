public class Second {
    public static void main(String[] args) {
        String str = "this is name is is name Kshitija Verma oo hello hi oo hello hiiii hi guess Kshitija official Verma ";
        String[] word = str.split(" ");
        int count;
        for (int i = 0; i < word.length; i++) {
                      count =1;
            for (int j = i + 1; j < word.length; j++) {
                if (word[i].equals(word[j])&& !word[i].equals("0")) {
                    count++;
                    word[j] = "0";
                }

            }
            if (!word[i].equals("0")&& count!=1) {

                System.out.println("the word" + word[i] + "occured at times" + count);
            }
        }
    }
}

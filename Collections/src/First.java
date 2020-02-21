import java.util.*;

class Iterate {
    public void iteration() {
        List<Float> list = new ArrayList<Float>();
        list.add(5.5f);
        list.add(4.3f);
        list.add(1.2f);
        list.add(7.8f);
        list.add(2.3f);
        Iterator<Float> it = list.iterator();
        float sum = 0f;

        while (it.hasNext()) {
            sum+=it.next();

        }
        System.out.println(sum);


    }
}


public class First {
    public static void main(String[] args) {
        Iterate i = new Iterate();
        i.iteration();


    }

}

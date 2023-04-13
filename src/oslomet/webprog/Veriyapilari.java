package oslomet.webprog;

import java.util.*;

public class Veriyapilari {
    public static void main(String[] args) {
        /*
        System.out.println("Veri Yapilari");
        int [] array={2,5,21,1,7,8};
        List<Integer> basitListe=new ArrayList<>();
        basitListe.add(2);
        basitListe.add(54);

        List<Integer>basitListe2=new ArrayList<>(Arrays.asList(2,4,2,1,654,2));

        List<Integer>bagliListe=new LinkedList<>();
        bagliListe.add(324);
        bagliListe.add(5432);



        //System.out.println(basitListe2);
        basitListe2.remove(2);
        //  System.out.println(basitListe2);

        List<Integer>stack= new Stack<>();
stack.add(2);
stack.add(4);
        System.out.println(stack);

        Stack<Integer> stack2=(Stack<Integer>) stack;
        stack2.push(2);
        System.out.println(stack2.pop());
        stack2.push(4);
        System.out.println(stack2.pop());

        */
        BenimListem benimListem=new BenimListem();
        benimListem.ekleNode(2);
        benimListem.ekleNode(5);
        benimListem.ekleNode(9);

        benimListem.yazdir();

    }
}

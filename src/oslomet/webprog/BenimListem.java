package oslomet.webprog;

class Node1{
    int data;
    Node1 sonraki;

    public Node1(int data){
        this.data=data;
    }
}

public class BenimListem {
    private Node1 kafa = null;
    private Node1 kuyruk = null;

    public void ekleNode(int deger) {
        Node1 yeniNode = new Node1(deger);

        if (kafa == null) {
            kafa = yeniNode;
        } else {
            kuyruk.sonraki = yeniNode;
        }
        kuyruk = yeniNode;
        kuyruk.sonraki = kafa;
    }

    public void yazdir() {
        Node1 buNode = kafa;

        if (kafa != null) {
            do {
                System.out.print(buNode.data + " ");
                buNode = buNode.sonraki;
            } while (buNode != kafa);
        }
    }
}
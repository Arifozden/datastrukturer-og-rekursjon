package oslomet.webprog;

class Node{
    int data;
    Node sonraki;

    public Node(int data){
        this.data=data;
    }
}

public class BenimListem {
    private Node kafa = null;
    private Node kuyruk = null;

    public void ekleNode(int deger) {
        Node yeniNode = new Node(deger);

        if (kafa == null) {
            kafa = yeniNode;
        } else {
            kuyruk.sonraki = yeniNode;
        }
        kuyruk = yeniNode;
        kuyruk.sonraki = kafa;
    }

    public void yazdir() {
        Node buNode = kafa;

        if (kafa != null) {
            do {
                System.out.print(buNode.data + " ");
                buNode = buNode.sonraki;
            } while (buNode != kafa);
        }
    }
}
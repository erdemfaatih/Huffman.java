public class Huffman {
    Node root;
    String text;




    public void ElemanlarıGoster(String text){
        for(char i : text.toCharArray()){
            System.out.println(i);
        }
    }


    public void sortedAdd(String val,int frequency){
        Node newNode = new Node(val,frequency);
        if(root == null){
            root = newNode;
            newNode.next = null;
        }else{
            if(root.frequency > newNode.frequency){
                root.next = newNode;
                newNode.next =null;
            }else{
                root = newNode;
                newNode.next = root;
                root.next=null;
            }
        }
    }

    public void yazdir(Node root)
    {
        while (root != null) {
            System.out.print(root.character + " ");
            root = root.next;
        }
    }


    public void ekle(String val,int frequency){
        Node newNode = new Node(val,frequency);
        newNode.next=root;
        root = newNode;
    }

    public void sortedInsert(Node newnode) {
        Node sıralama;

        if (sıralama == null || sıralama.frequency >= newnode.frequency) {
            newnode.next = sıralama;
            sıralama = newnode;
        }
        else {
            Node current = sıralama;


            while (current.next != null
                    && current.next.frequency < newnode.frequency) {
                current = current.next;
            }

            newnode.next = current.next;
            current.next = newnode;
        }
    }
     // çok uğraştım olmadı hocam :(







}

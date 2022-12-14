public class Node  {
    int frequency;
    String character;
    Node  left;
    Node  right;
    Node  next;

    public Node(String character, int frequency ) {
        this.frequency = frequency;
        this.character = character;
        this.left = null;
        this.right = null;
        this.next = null;
    }
}

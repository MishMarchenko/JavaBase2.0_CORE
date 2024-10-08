package Collections;

public class CustomLinkedList<Element> {

    private Node<Element> first;
    private Node<Element> last;
    private int size = 0;

    public void add(Element element){
        Node<Element> node;
        if(first == null){
            node = new Node<>(element, null, null);
            first = node;
        } else {
            node = new Node<>(element, null, last);
            last.next = node;
        }
        last = node;
        size++;
    }
    public void addFirst(Element element){
        Node<Element> node;
        if(first == null){
            node = new Node<>(element, null, null);
            first = node;
        } else {
            node = new Node<>(element, first, null);
            first.prev = node;
        }
        first = node;
        size++;
    }
    public int getSize(){
        return size;
    }
    public Element get(int index){
        return getNodeByIndex(index).item;
    }
    public Element getFirst(){
        return getNodeByIndex(0).item;
    }
    public Element getLast(){
        int lastElement = getSize() - 1;
        return getNodeByIndex(lastElement).item;
    }
    public Node<Element> getNodeByIndex(int index){
        Node<Element> node = first;
        for (int i = 0; i < index; i++){
            node = node.next;
        }
        return node;
    }

    public void delete(int index){
        Node<Element> currentNode = getNodeByIndex(index);
        if (index == 0){
            first = currentNode.next;
        } else if (index == size - 1) {
            last = currentNode.prev;
        } else {
            Node<Element> nodeBefore = currentNode.prev;
            Node<Element> nodeAfter = currentNode.next;
            nodeBefore.next = nodeAfter;
            nodeAfter.prev = nodeBefore;
        }
        size--;
    }



    private static class Node<Element> {
        Element item;
        Node<Element> next;
        Node<Element> prev;

        public Node(Element item, Node<Element> next, Node<Element> prev) {
            this.item = item;
            this.next = next;
            this.prev = prev;
        }
    }
}

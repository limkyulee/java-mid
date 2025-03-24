package collection.link;

public class MyLinkedListV1 {

    private Node first;
    private int size = 0;

//  마지막에 데이터를 추가.
    public void add(Object o) {
        Node newNode = new Node(o);
        if(first == null) {
//          첫 노드일 경우 그냥 대입.
            first = newNode;
        }else{
//          첫 노드가 아닐 경우 마지막 노드를 찾아 next 에 대입.
            Node lastNode = getLastNode();
            lastNode.next = newNode;
        }
        size++;
    }

//  마지막 노드 탐색
    private Node getLastNode() {
        Node x = first;
        while(x.next != null) {
            x = x.next;
        }

        return x;
    }

//  특정 위치에 있는 데이터를 찾아서 변경 후 기존 값 반환.
    public Object set(int index, Object element) {
        Node x = getNode(index);
        Object oldValue = x.item;
        x.item = element;
        return oldValue;
    }

//  특정 위치에 있는 데이터 반환.
    public Object get(int index) {
        Node node = getNode(index);
        return node.item;
    }

//  배열과 달리 특정 위치에 있는 값을 찾으려면 loop 를 돌아야한다는 단점이 있음.
    private Node getNode(int index) {
        Node x = first;
        for(int i = 0; i < index; i++) {
            x = x.next;
        }

        return x;
    }

//  데이터를 검색하고 검색된 위치를 반환.
    public int indexOf(Object o) {
        int index = 0;
        for(Node x = first; x != null; x = x.next) {
            if(x.item.equals(o)) {
                return index;
            }
            index++;
        }
        return -1;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return "MyLinkedListV1{" +
                "first=" + first +
                ", size=" + size +
                '}';
    }
}

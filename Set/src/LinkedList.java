public class LinkedList<E> {

    private class Node{
        public E e;
        public Node next;

        public Node(E e, Node next){
            this.e = e;
            this.next = next;
        }

        public Node(E e){
            this(e, null);
        }

        public Node(){
            this(null, null);
        }

        @Override
        public String toString() {
            return e.toString();
        }
    }

    private Node dummyHead;
    private int size;

    public LinkedList(){
        dummyHead = new Node(null, null);
        size = 0;
    }

    //获取元素个数
    public int getSize(){
        return size;
    }

    //判断是否为空
    public boolean isEmpty(){
        return size == 0;
    }

    //在链表头添加元素e
    public void addFirst(E e){
//        Node node = new Node(e);
//        node.next = head;
//        head = node;
//        dummyHead = new Node(e, dummyHead.next);
//        size++;
        add(0, e);
    }

    //在链表index位置添加新的元素e
    public void add(int index, E e){
        if(index < 0 || index > size)
            throw new IllegalArgumentException("add failed. Illegal index.");

        Node prev = dummyHead;
        for(int i = 0; i < index; ++i)
            prev = prev.next;

//          Node node = new Node(e);
//          node.next = prev.next;
//          prev.next = node;
        prev.next = new Node(e, prev.next);
        size++;
    }

    //在链表末尾添加元素e
    public void addLast(E e){
        add(size, e);
    }

    //获得第index个元素
    public E get(int index){
        if(index < 0 || index > size)
            throw new IllegalArgumentException("get failed. Illegal index.");
        Node cur = dummyHead.next;
        for(int i = 0; i < index; ++i)
            cur = cur.next;
        return cur.e;
    }

    //获得链表的第一个元素
    public E getFirst(){
        return get(0);
    }

    public E getLast(){
        return get(size - 1);
    }

    //修改第index元素
    public void set(int index, E e){
        if(index < 0 || index > size)
            throw new IllegalArgumentException("set failed. Illegal index.");
        Node cur = dummyHead.next;
        for(int i = 0; i < index; ++i)
            cur = cur.next;
        cur.e = e;
    }

    //查找链表中是否有元素e
    public boolean contains(E e){
        Node cur = dummyHead.next;
        while(cur != null){
            if(cur.e.equals(e))
                return true;
            cur = cur.next;
        }
        return false;
    }

    public void removeElement(E e){
        Node prev = dummyHead;
        while(prev.next != null){
            if(prev.next.e.equals(e))
                break;
            prev = prev.next;
        }

        if(prev.next != null){
            Node delNode = prev.next;
            prev.next = delNode.next;
            delNode.next = null;
            size --;
        }
    }
    //删除index位置元素，并返回
    public E remove(int index){
        if(index < 0 || index > size)
            throw new IllegalArgumentException("set failed. Illegal index.");
        Node prev = dummyHead;
        for(int i = 0; i < index; ++i)
            prev = prev.next;
        Node retNode = prev.next;
        prev.next = retNode.next;
        retNode.next = null;
        size--;
        return retNode.e;
    }
    //删除链表第一个元素
    public E removeFirst(){
        return remove(0);
    }

    //删除链表最后一个元素
    public E removeLast(){
        return remove(size - 1);
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        Node cur = dummyHead.next;
        while (cur != null){
            res.append(cur + "->");
            cur = cur.next;
        }
        res.append("NULL");
        return res.toString();
    }
}

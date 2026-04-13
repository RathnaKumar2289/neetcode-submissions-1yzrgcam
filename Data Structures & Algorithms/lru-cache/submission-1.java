class Node{
    int key,value;
    public Node(int key,int value){
        this.key=key;
        this.value=value;
    }
    Node next;
    Node prev;
}

class LRUCache {
    final int capacity;
    final Map<Integer,Node> map;
    final Node head;
    final Node tail;
    public LRUCache(int capacity) {
        this.capacity=capacity;
        map = new HashMap<>();
        head = new Node(-1,-1);
        tail = new Node(-1,-1);
        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        if(map.containsKey(key)){
            Node node = map.get(key);
            deleteNode(node);
            insertAfterHead(node);
            return node.value;
        }

        return -1;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            Node node = map.get(key);
            node.value=value;
            deleteNode(node);
            insertAfterHead(node);
        }else{
            if(capacity==map.size()){
                Node tailNode = tail.prev;
                deleteNode(tailNode);
                map.remove(tailNode.key);             
            }
                Node newNode = new Node(key,value);
                map.put(key,newNode);
                insertAfterHead(newNode);
            
        }
    }

 void deleteNode(Node node){
        Node prevNode = node.prev;
        Node nextNode = node.next;
        prevNode.next = nextNode;
        nextNode.prev = prevNode;
        node.prev = null;
        node.next = null;
    }

 void insertAfterHead(Node node){
        Node currentNode = head.next;
        head.next = node;
        currentNode.prev = node;
        node.prev=head;
        node.next=currentNode;
    }
}

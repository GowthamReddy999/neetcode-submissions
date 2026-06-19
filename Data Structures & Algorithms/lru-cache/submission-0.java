
class LRUCache {
    class Node{
    int key;
    int value;
    Node next=null;
    Node prev=null;
    Node(int key , int value){
        this.key=key;
        this.value=value;
    }
}

    Node head = new Node(-1,0);
    Node tail = new Node(-1,0);
    int capacity;
    HashMap<Integer,Node> map;

    public LRUCache(int capacity) {
        this.capacity=capacity;
        head.next=tail;
        tail.prev = head;
        map= new HashMap<>();
    }
    
    public int get(int key) {

        if(map.containsKey(key)){
            Node oldnode = map.get(key);

            int val = oldnode.value;
            map.remove(key);
            delete(oldnode);
            
            add(oldnode);
            map.put(key,oldnode);
            return val;
        }
        return -1;
        
    }
    
    public void put(int key, int value) {
        Node newnode = new Node(key,value);

        if(map.containsKey(key)){
            Node oldnode = map.get(key);
            delete(oldnode);
            map.remove(key);

        }
        if(map.size()==capacity){
            Node oldnode = map.get(tail.prev.key);
            map.remove(tail.prev.key);
            delete(oldnode);
            
        }
        map.put(key,newnode);
        add(newnode);

    }
    public void delete(Node node){
        Node prev = node.prev;
        Node next = node.next;

        prev.next = next;
        next.prev = prev;
    }

    public void add(Node node){
     
        Node savenode = head.next;
        head.next = node;
        node.next = savenode;
        savenode.prev = node;
        node.prev = head;
        
    }
}

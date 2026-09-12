class MyCircularQueue {
    private final int[] queue;
    private int head;
    private int tail;
    private int count;
    private final int capacity;

    /** Initializes the object with the size of the queue to be k. */
    public MyCircularQueue(int k) {
        this.capacity = k;
        this.queue = new int[k];
        this.head = 0;
        this.tail = 0;
        this.count = 0;
    }
    
    /** Inserts an element into the circular queue. Return true if successful. */
    public boolean enQueue(int value) {
        if (isFull()) {
            return false;
        }
        queue[tail] = value;
        tail = (tail + 1) % capacity; // Wrap around to index 0 when reaching the end
        count++;
        return true;
    }
    
    /** Deletes an element from the circular queue. Return true if successful. */
    public boolean deQueue() {
        if (isEmpty()) {
            return false;
        }
        head = (head + 1) % capacity; // Wrap around to index 0 when reaching the end
        count--;
        return true;
    }
    
    /** Gets the front item from the queue. If empty, return -1. */
    public int Front() {
        if (isEmpty()) {
            return -1;
        }
        return queue[head];
    }
    
    /** Gets the last item from the queue. If empty, return -1. */
    public int Rear() {
        if (isEmpty()) {
            return -1;
        }
        // Since tail points to the next available slot, 
        // the last inserted element is at (tail - 1 + capacity) % capacity
        return queue[(tail - 1 + capacity) % capacity];
    }
    
    /** Checks whether the circular queue is empty or not. */
    public boolean isEmpty() {
        return count == 0;
    }
    
    /** Checks whether the circular queue is full or not. */
    public boolean isFull() {
        return count == capacity;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */
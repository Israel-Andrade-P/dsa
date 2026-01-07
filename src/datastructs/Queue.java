package datastructs;

public class Queue {
    private Object[] queue;
    private int first = 0;
    private int last = 0;

    public Queue(int maxCap) {
        queue = new Object[maxCap];
    }

    public void insert(Object data) {
        if (isFull()) return;
        if (last == queue.length) moveElementsForward();
        queue[last] = data;
        last++;
    }

    public void remove() {
        if (isEmpty()) return;
        queue[first] = null;
        first++;
    }

    public void displayQueue() {
        for (int i = first; i < last; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }

    private void moveElementsForward() {
        int idx = 0;
        for (int i = first; i < last; i++) {
            queue[idx] = queue[i];
            idx++;
        }
        first = 0;
        last = idx;
        clearMovedElements(idx);
    }

    private void clearMovedElements(int idx) {
        do {
            queue[idx] = null;
            idx++;
        }while (idx < queue.length);
    }

    private boolean isEmpty() {
        return first == last;
    }

    private boolean isFull() {
        return getLength() == queue.length;
    }

    private int getLength() {
        return last - first;
    }
}

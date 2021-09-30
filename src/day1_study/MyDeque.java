package day1_study;


public class MyDeque<T> {
    private static class DequeNode<T> {
        T data;
        DequeNode front_pointer;
        DequeNode back_pointer;

        public DequeNode() {
            this.front_pointer = null;
            this.back_pointer = null;
        }

        public DequeNode(T data) {
            this.data = data;
            this.front_pointer = null;
            this.back_pointer = null;
        }
    }

    DequeNode front;
    DequeNode rear;

    public MyDeque() {
        front = null;
        rear = null;
    }

    public boolean isEmpty() {
        return (front == null);
    }



    public void offer(T item) {
        DequeNode node = new DequeNode(item);
        if (isEmpty()) {
            front = node;
            rear = node;
            node.back_pointer = null;
            node.front_pointer = null;
        } else {
            node.back_pointer = front;
            node.front_pointer = null;
            front.front_pointer = node;
            front = node;
        }
    }

    public void offerFirst(char item) {
        DequeNode node = new DequeNode(item);
        if (isEmpty()) {
            front = node;
            rear = node;
            node.back_pointer = null;
            node.front_pointer = null;
        } else {
            node.front_pointer = rear;
            node.back_pointer = null;
            rear.back_pointer = node;
            rear = node;
        }
    }


    public T deleteFront() {
        if (isEmpty()) {
            System.out.println("덱이 비어있습니다.");
            return null;
        } else {
            T data = (T) front.data;
            if (front.back_pointer == null) {
                front = null;
                rear = null;
            } else {
                front = front.back_pointer;
                front.front_pointer = null;
            }
            return data;
        }
    }


    public T deleteRear() {
        if (isEmpty()) {
            System.out.println("덱이 비어있습니다.");
            return null;
        } else {
            T data = (T) rear.data;
            if (rear.front_pointer == null) {
                front = null;
                rear = null;
            } else {
                rear = rear.front_pointer;
                rear.back_pointer = null;
            }
            return data;
        }
    }

    public void removeFront() {
        if (isEmpty()) {
            System.out.println("덱이 비어있습니다.");
        } else {
            if (front.back_pointer == null) {
                front = null;
                rear = null;
            } else {
                front = front.back_pointer;
                front.front_pointer = null;
            }
        }
    }

    public void removeRear() {
        if (isEmpty()) {
            System.out.println("덱이 비어있습니다.");
        } else {
            if (rear.front_pointer == null) {
                front = null;
                rear = null;
            } else {
                rear = rear.front_pointer;
                rear.back_pointer = null;
            }
        }
    }

    public T peekRear() {
        if (isEmpty()) {
            System.out.println("덱이 비어있습니다.");
            return null;
        } else {
            return (T) rear.data;
        }
    }

    public T peekFront() {
        if (isEmpty()) {
            System.out.println("덱이 비어있습니다.");
            return null;
        } else {
            return (T) front.data;
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("덱이 비어있습니다.");
        } else {
            DequeNode node = front;
            while (node != null) {
                System.out.print(node.data + " ");
                node = node.back_pointer;
            }
            System.out.println();
        }
    }
}
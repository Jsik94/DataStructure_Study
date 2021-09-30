package day1_study;

class MyNode<E> {

    E data;
    MyNode<E> next;	// 다음 노드객체를 가리키는 래퍼런스 변수

    MyNode(E data) {
        this.data = data;
        this.next = null;
    }
}

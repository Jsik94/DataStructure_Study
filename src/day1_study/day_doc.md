#Day1

## 1. 연결리스트 (Linked List)
***
###왜 써야하나요? 
링크드 리스트의 개념을 이해하기 위해서는 노드라는 개념을 먼저 이해해야한다.


###노드란?
자료의 하나의 단위를 표현할 때 노드라고 정의한다. 
예를들어, 당신이 사람을 정의하고 관리하기 위해서 아래와 같은 데이터 타입을 만들었다고 가정해보자. 

### 그럼 이제 연결 리스트를 알려줘 

```java
public class MyDataType{
    int age;
    int number;
    String name;
    String addr;
}

```
우리는 이 클래스를 자료형처럼 사용할 것이다. 이 클래스를 배열로 사용하려면 아래와 같이 사용한다.

```java
public class Manage{

  public static void main(String[] args) {
    MyDataType[] people = new MyDataType[100];
  }
    
}

```
위와 같이 생성을 하려면 배열의 갯수를 확정할 수 밖에 없다. 만약, 데이터가 <u>**월등히 적거나**</u>,
<u>**100개 이상으로 많다면**</u>, 동적으로 공간을 늘릴 수가 없다. 배열 생성의 특성상 사이즈를 지정해야하므로,
가변적인 상황에서 대응하기가 어려운 구조다. 이러한 문제를 해결하기 위해 다음과 같은 방식을 이용한다.

```java
public class MyDataType{
    public MyDataType next_node; 
    int age;
    int number;
    String name;
    String addr;
    
    ///생성자 생략
       
}

```
C++에서는 "자가참조포인터를 만든다" 라고 배웠던 기억이난다. 무슨말이냐 하면, 자기 자신과 같은 타입의 객체 변수를 내부에 둔다는 말이다.
(JAVA에서는 포인터의 개념이 없고, 기본형을 제외한 나머지 자료형이 참조형이므로 포인터의 개념은 생각하지 않아도 된다.) 이렇게 만들어 졌을 때, MyDataType의 객체 하나 하나를 노드라고 표현한다.

## 아~ 그래서 저렇게 구현하면 뭐가 좋냐고~?  😡😡
각 인스턴스 내부에 자가참조 변수가 있기 때문에 자가 참조변수에 새로운 인스턴스를 연결 시킨다면,배열 없이도 배열처럼 구현을 할 수 있다.
심지어 동적으로 말이다. 

```java
public class Manage{

  public static void main(String[] args) {
    MyDataType instance1 = new MyDataType(10,1,"jik","None");
    MyDataType instance2 = new MyDataType(10,2,"jik","None");
    MyDataType instance3 = new MyDataType(10,3,"jik","None");
    
    instance1.next_node = instance2;
    instance2.next_node = instance3;
  }
    
}
```
그림으로 표현하면 아래와 같다.

![img.png](img_support/img.png)

연결리스트는 배열이 가지는 단점 중 하나인 고정크기 문제를 해결하는 자료구조이다. 
크기를 할당할 필요없이 그때 그때 필요에 따라 늘려갈 수 있으므로 배열 보다 더 효율적으로 사용할 수 있다.


또한 삽입과 삭제 부분에서 유리하다. 배열의 경우, 원소 중간에 데이터를 끼어넣으려면, 고정된 크기를 넘지 않는지 확인하고, 데이터를 추가 한 뒤, 모든 데이터를 미뤄야하하지만, 연결리스트는 그럴 필요가없다. 
그냥 넣고 싶은 위치의 자가 참조 변수들만 바꿔주면 추가가 일어난다.


###단점은 없어 그럼 ?🤔
1. 검색이 효율이 홀리몰리하게 쓰레기다.
   + 이유는 간단하다. 배열처럼 인덱스가 없다. 오로지 자가참조변수만 있을 뿐이다.
   + 따라서 마지막 노드를 검색하려면, 모든 노드를 거쳐 마지막까지 가야한다.😱😱😱

###연결리스트의 종류

 단점을 보완한 종류의 연결리스트도 존재한다.
1. 단일 연결리스트 (Singly Linked List)
2. 이중 연결리스트 (Doubly Linked List)
3. 다중 연결리스트 (Multiply Linked List)
4. 원형 연결리스트 (Circular Linked List)

## 2. Stack
***
###왜써요 이거 ?
링크드 리스트의 개념을 이해하기 위해서는

### 정의


###장점은 모야 그럼 ?😍

###단점은 없어 그럼 ?🤔

## 3. Queue
***
###왜써요 이거 ?
링크드 리스트의 개념을 이해하기 위해서는


### 정의


###장점은 모야 그럼 ?😍

###단점은 없어 그럼 ?🤔

## 4. Deque
***
###왜써요 이거 ?
링크드 리스트의 개념을 이해하기 위해서는



### 정의


###장점은 모야 그럼 ?😍

###단점은 없어 그럼 ?🤔




##Reference
***
* heejeong kwon 님의 Stack Queue 구현
  + stack : https://gmlwjd9405.github.io/2018/08/03/data-structure-stack.html
  + queue : https://gmlwjd9405.github.io/2018/08/02/data-structure-queue.html
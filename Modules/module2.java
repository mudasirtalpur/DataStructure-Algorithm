package Modules;

import java.util.*;

public class module2{
    public void main(String[] args){

        //         Methods
        // add() - Inserts the specified element into the queue. If the task is successful, add() return true, if not it throws an exception.
        // offer() - Inserts the specified element into the queue. If the task is successful, offer() returns true, if not it returns false.
        // element() - Returns the head of the queue. Throws an exception if the queue is empty.
        // peek() - Returns the head of the queue. Returns null if the queue is empty.
        // remove() - Returns and removes the head of the queue. Throws an exception if the queue is empty.
        // poll() - Returns and removes the head of the queue. Returns null if the queue is empty.

        Queue<Integer> queue = new LinkedList<>();

        queue.offer(6);
        queue.offer(40); 
        queue.offer(49);
        queue.offer(101);
        System.out.println(queue);

        System.out.println(queue.peek());

        System.out.println("Removing: " + queue.poll());

        System.out.println(queue);


        //==========ArrayDeque==========

        Deque<Integer> aq = new ArrayDeque<>();

        aq.offer(10);
        aq.offer(40);
        aq.offer(49);
        aq.offerFirst(5);
        aq.offerLast(50);
        System.out.println(aq);

        aq.pollLast();
        System.out.println(aq);

        aq.pollFirst();
        System.out.println(aq);

        System.out.println(aq.size());

        System.out.println(aq.peek());

        System.out.println(aq.peekFirst());
        System.out.println(aq.peekLast());


        //======Stack/Queue Operations using ArrayDeque=======

        // Stack Operations: push(), pop()
        // Queue Operations: add(), remove()

        Deque<Integer> stack = new ArrayDeque<>();

        stack.push(80);
        stack.push(49);
        stack.push(40);
        stack.push(101);
        System.out.println(stack);

        System.out.println("Removing: " + stack.pop());

        System.out.println(stack);


        Queue<Integer> pq = new PriorityQueue<>((a, b) -> b-a);

        //The greater the value the more priority it'll hold.

        pq.offer(89);
        pq.offer(40);
        pq.offer(49);
        pq.offer(101);
        

        System.out.println(pq); 


        //==========HashSet==========
        // Methods
        // add() - adds the specified element to the set.
        // addAll() - adds all the elements of the specified collection to the set.
        // iterator() - returns an iterator that can be used to access elements of the set sequentially.
        // remove() - removes the specified element from the set.
        // removeAll() - removes all the elements from the set that is present in another specified set.
        // retainAll() - retains all the elements in the set that are also present in another specified set.
        // clear() - removes all the elements from the set.
        // size() - returns the length (number of elements) of the set.
        // toArray() - returns an array containing all the elements of the set.
        // contains() - returns true if the set contains the specified element.
        // containsAll() - returns true if the set contains all the elements of the specified collection.
        // hashCode() - returns a hash code value (address of the element in the set)

        Set<Integer> set = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        set.add(80);
        set.add(40);
        set.add(49);
        set.add(78);
        System.out.println(set);

        set2.add(40);
        set2.add(49);
        System.out.println(set2);


        System.out.println(set.containsAll(set2));//whether set contains all elements of set2

        System.out.println(set2.containsAll(set));//whether set2 contains all elements of set

        set.retainAll(set2);
        System.out.println("Set intersection Set2: " + set);


        Set<Student> sSet = new HashSet<>();
        //We need to add two additional methods (hashcode() & equals()),
        //If we want to make hashset on userdefined class

        Student s1 = new Student(1 , "Mudasir");
        Student s2 = new Student(2 , "Mudasir");
        Student s3 = new Student(3 , "Mudasir");

        sSet.add(s1);
        sSet.add(s2);
        sSet.add(s3);

        System.out.println(sSet);



    
    }
}

class Student{
    int rollNo;
    String name;
    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }
    @Override
    public String toString() {
        return "Student [rollNo=" + rollNo + ", name=" + name + "]";
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + rollNo;
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Student other = (Student) obj;
        if (rollNo != other.rollNo)
            return false;
        return true;
    }
    
    
}
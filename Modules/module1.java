package Modules;
import java.util.*;
public class module1 {
    public static void main(String[] args){
        //         Methods of Collection
        // add() - inserts the specified element to the collection
        // size() - returns the size of the collection
        // remove() - removes the specified element from the collection
        // iterator() - returns on iterator to access elements of the collection
        // addAll() - adds all the elements of a specified collection to the collection
        // removeAll() - removes all the elements of the specified collection from the collection
        // clear() - removes all the elements of the collection.


        //==========ArrayList==========
        
        //         Methods
        // add() - adds an element to a list.
        // addAll() - adds all elements of one list to another
        // get() - helps to randomly access elements from lists
        // iterator() - returns iterator object that can be used to sequentially access elements of lists.
        // set() - changes elements of lists
        // remove() - removes an element from the list
        // removeAll() - removes all the elements from the list.
        // clear() - removes all the elements from the list (more efficient thatn removeAll())
        // size() - returns the length of lists
        // toArray() - converts a list into an array
        // contains() - returns true is a list contains specific element.

        

        ArrayList<Integer> list = new ArrayList<>();

        list.add(50);
        list.add(3);
        System.out.println(list);

        Collection<Integer> list2 = new ArrayList<>();

        list2.add(29);
        list2.add(17);
        list2.add(3);
        System.out.println(list2);

        list.addAll(list2);
        System.out.println(list);

        System.out.println(list.get(3));

        Iterator<Integer> iterator = list.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        list.set(1 , 6);
        System.out.println(list);

        // list.remove(0);
        // System.out.println(list);

        // list.removeAll(list2);
        // System.out.println(list);

        list.clear();
        System.out.println(list);

        System.out.println(list.size()); //because we've cleared the list

        list2.add(78);
        list2.add(101);

        Object[] arr = list2.toArray();
        for(Object obj : arr){
            System.out.println(obj);
        }

        System.out.println(list2.contains(101));


        //==========LinkedList==========
        //         Methods
        // contains() - check if the LinkedList contains the element.
        // indexOf() - returns the index of the first occurrence of the element.
        // lastIndexOf() - returns the index of the last occurrence of the element.
        // clear() - removes all the elements of the LinkedList.
        // iterator() - returns an iterator to iterative over LinkedList.

        LinkedList<Integer> Llist = new LinkedList<>();//Llist -> LinkedList

        Llist.add(3);
        Llist.add(3);
        Llist.addAll(list2);
        System.out.println(Llist);//Same list2 just copied in LinkedList

        System.out.println(Llist.contains(68));

        
        System.out.println(Llist.indexOf(101));
        
        System.out.println(Llist.lastIndexOf(3));

        // Iterator<Integer> LIterator = Llist.iterator();
        // while(LIterator.hasNext()){
        //     System.out.println(iterator.next());
        // }

        Llist.clear();

        //==========LinkedList as QUEUE & DEQUE==========
        //         Methods
        // addFirst() - add the specified element at the beginning of the linked list.
        // addLast() - add the specified element at the end of the linked list.
        // getFirst() - returns the first element.
        // getLast() - returns the last element.
        // removeFirst() - removes the first element.
        // removeLast() - removes the last element.
        // peek() - returns the first element (head) of the linked list.
        // poll() - returns and removes the first element from the linked list.
        // offer() - adds the specified element at the end of the linked list.

        LinkedList<Integer> Llist2 = new LinkedList<>();

        Llist2.addFirst(1);
        System.out.println(Llist2);

        Llist2.addLast(10);
        System.out.println(Llist2);

        System.out.println(Llist2.getFirst());
        //get keyword only returns the value
        System.out.println(Llist2.getLast());

        Llist2.removeFirst();
        System.out.println(Llist2);
        //remove keyword only removes the element
        Llist2.removeLast();
        System.out.println(Llist2);

        Llist2.offer(0);
        Llist2.offer(40); //offer adds th specified element at the end
        Llist2.offer(49);
        Llist2.offer(58);

        System.out.println(Llist2.peek()); //peek return and removes the first element

        System.out.println(Llist2.poll()); //poll return and removes the last element


        //==========Vector==========
        //         Methods
        // Adding Elements: add(element), add(index, element), addAll(vector).
        // Access Elements: get(index), iterator().
        // Removing Elements: remove(index), removeAll(), clear().
        // set(): changes an element of the vector.
        // size(): returns the size of the vector.
        // toArray(): converts the vector into an array.
        // toString(): converts the vector into a String.
        // contains(): searches the vector for specified element and returns a boolean result.
        
        Vector<Integer> VList = new Vector<>();

        VList.add(0);
        VList.add(49);
        System.out.println(VList);

        VList.set(0, 40);
        System.out.println(VList);

        System.out.println(VList.size());

        // System.out.println(VList.toString());

        System.out.println(VList.contains(22));


        //==========Stack==========

        //Stack extends Vector and It's almost same as Vector,
        //So no need to write code for it again.



    }
}
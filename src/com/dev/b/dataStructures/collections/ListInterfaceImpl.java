package com.dev.b.dataStructures.collections;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class ListInterfaceImpl {

    private final List<Integer> list1, list2;
    private final int scannerSize;
    Random random = new Random();

    public ListInterfaceImpl(int size){
        list1 = new ArrayList<>(size);
        list2 = new ArrayList<>(size);
        this.scannerSize = size;
    }

    void listInterfaceMethods(){

        // Adding element in the list -> boolean add(E)
        for(int i=0; i<scannerSize; i++){
            //Add Element -> boolean add(E);
            list1.add(random.nextInt(101,110));
        }
        System.out.println("After adding elements: "+list1);
        // Size in collections -> int size();
        // Size() is a method in collections framework while length is a property of an array
        // Strings has method for finding length()
        System.out.println("Size of collection list: "+list1.size());

        // Add element at a given index -> void add(I, E);
        list1.add(3,200);
        System.out.println("After adding elements at given index: "+list1+" with size: "+list1.size());
        // Get element by index -> E get(I);

        // Get index by element of first occurrence -> int indexOf(O)

        // Get index by element of last occurrence -> int lastIndexOf(O)

        // Set element at a given index -> E set(I, E)

        // Remove element at given index -> E remove(I)

        // If the list is empty -> list.isEmpty()

        // If the list contains element -> list.contains(E) return true;

        //equals()

        for(int element: list1){
            //System.out.print(element+" ");

            //Generates Concurrent Modification Exception as it cannot print and modify at the same time
            //To fix: Use Iterator method
//            if(element == 101){
//                list1.remove(Integer.valueOf(element));
//            }
        }

        System.out.println("\n\nInside iterator demo");
        Iterator<Integer> itr = list1.iterator();
        while(itr.hasNext()){
            if(itr.next()==101){
                itr.remove();
            }
        }
        System.out.println("Removing element using iterator: "+list1+" with size: "+list1.size());


        //------------------------------------RANGE------------------------------------
        // Range -> List<E> subList(fromIndex, toIndex)
        // set() and add()
        System.out.println("Range: "+list1.subList(1,5));



        //------------------------------------BULK OPERATION------------------------------------
        // Adding another list at a given index -> boolean addAll(I, C)
        // RemoveAll
        // RetainAll

        //ListIterator<E> listIterator()
        //ListIterator<E> listIterator(int index)

    }

    void iteratorMethodInArrayList(){
        //used to fix ConcurrentModificationException
        Iterator<Integer> iterator = list1.iterator();
        System.out.print("Iterator: ");
        while(iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
        System.out.println();
        iterator.remove(); // Remove last element
        System.out.println("Remove last element: "+list1);

    }
}

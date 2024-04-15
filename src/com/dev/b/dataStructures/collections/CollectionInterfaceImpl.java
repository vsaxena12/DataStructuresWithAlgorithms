package com.dev.b.dataStructures.collections;

import java.util.Iterator;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Random;

public class CollectionInterfaceImpl {

    private final Collection<Integer> collectionList;
    private final int scannerSize;
    Random random = new Random();

    public CollectionInterfaceImpl(int scannerSize){
        collectionList = new ArrayList<>();
        this.scannerSize = scannerSize;
    }

    void collectionMethod(){

        // Adding element in the list -> boolean add(E)
        for(int i=0; i<scannerSize; i++){
            //Add Element -> boolean add(E);
            collectionList.add(random.nextInt(101,110));
        }
        System.out.println("After adding elements: "+collectionList);
        // Size in collections -> int size();
        // Size() is a method in collections framework while length is a property of an array
        // Strings has method for finding length()
        int sizeOfList = collectionList.size();
        System.out.println("Size of collection list: "+sizeOfList);




        // Remove method in Collection takes Object, no index -> boolean remove(Object);
        collectionList.remove(103);
        System.out.println("After Removing 105 :"+collectionList);
        System.out.println("Size of collection list after removal: "+sizeOfList);




        // Checks if element exists in the list -> boolean contains(Object)
        if(collectionList.contains(103)){
            System.out.println("Element 103 is present: "+true);
        } else{
            System.out.println("Element 103 is not present: "+false);
        }

        // Check if the list is empty -> boolean isEmpty()


        // Iterator()
        iteratorMethod();

        /* ---------------------BULK OPERATION---------------------*/
        // Adding two lists i.e. collectionList1 and collectionList2 -> boolean addAll(C)
        System.out.println("--------------------------BULK OPERATIONS--------------------------");
        Collection<Integer> list1 = new ArrayList<>();
        list1.addAll(collectionList);
        System.out.println("List1: "+list1);

        Collection<Integer> list2 = new ArrayList<>();
        list2.add(10);
        list2.add(40);
        System.out.println("List2: "+list2);

        // boolean removeAll(C)
        list1.removeAll(list2); //Remove common elements
        System.out.println("List1: "+list1);
        System.out.println("List2: "+list2);


        // boolean retainAll(C)
        list1.add(40);
        list1.retainAll(list2); //Retain common elements
        System.out.println("List1: "+list1);
        System.out.println("List2: "+list2);


        // boolean containsAll(C)
        list1.addAll(list2); // Adds all element from list2 to list1
        System.out.println("List1: "+list1);
        System.out.println("List2: "+list2);


        // void clear()

        // Convert Collections to an array using toArray()

    }

    /**
     *
     */
    void iteratorMethod(){
        Iterator<Integer> itr = collectionList.iterator();
    }
}

package com.dev.b.dataStructures.collections;

import java.util.Scanner;
public class CollectionsDriver {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the collection list: ");
        int sizeOfCollection = scanner.nextInt();

//        CollectionInterfaceImpl collectionFramework = new CollectionInterfaceImpl(sizeOfCollection);
//        collectionFramework.collectionMethod();
//        collectionFramework.iteratorMethod();

        ListInterfaceImpl listInterfaceImpl = new ListInterfaceImpl(sizeOfCollection);
        listInterfaceImpl.listInterfaceMethods();
    }
}

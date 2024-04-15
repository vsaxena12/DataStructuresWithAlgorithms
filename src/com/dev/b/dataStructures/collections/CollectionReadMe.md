# Collections Framework

Iterable <Interface> 
    - boolean hasNext(); 
    - E next(); 
    - void remove(); 
    - void forEachRemaining(parameters); 
    - iterator();

Collection <Interface> implements Iterable
    - boolean add(E); //Add Element
    - boolean remove(Object); // Remove method in Collection takes Object, no index
    - boolean contains(Object); // Checks if element exists in the list 
    - int size(); //Size in collections    
        - Size() is a method in collections framework while length is a property of an array
        - Strings has method for finding length()
    - boolean isEmpty(); // Check if the list is empty



    - List
    - Arraylist
    - Linked List
    - I_Vector (synchronized)   
        - Stack (synchronized)
    - I_Queues
        - Priority Queues
        - I_Dequeue 
                - ArrayDequeue
        - I_Set
            - HashSet
            - Linked HashSet
            - I_Sorted
                - TreeSet
    - I_Map
        - I_SortedMap
            - HashMap
            - TreeMap
            - LinkedHashMap
    
Limitations:
Arrays:
    - Fixed size
    - Not extendable
    - Expensive search ~ Linear Search




# Collections In Java

![memoryStructure.png](img%2Farrays%2FmemoryStructure.png)

- Variable size collection: Arraylist, Linked List
- Distinct Collection: Set
- Sorted Collection: Sorted Set

  +     Insertion, Deletion, Search time and space complexity 

## One Dimensional Array
![oneDimArray.png](img%2Farrays%2FoneDimArray.png)

## Two Dimensional Array
![twoDimArray.png](img%2Farrays%2FtwoDimArray.png)

## Find occurrences of each character.
```
int[] count = new int[256];
for(char ch : s.toCharArray()){
    count[ch]++;
}
```

count[ch]++: For each character ch in the string, this line increments the value at the 
index corresponding to the ASCII value of ch. Each position in the array represents an 
ASCII value, so count[65], for example, would count how many times the character 'A' (ASCII 65) 
appears in the string.


Common pattern used especially in problems involving calculations for pairings or ensuring even increments
'''
result = result + count/2 * 2;
'''

## Collection Framework
![collectionFramework.png](img%2Farrays%2FcollectionFramework.png)

### Iterator Interface
Iterators are used to iterate over collections such as lists, sets and other data structures 
which implements Iterable interface. 

1. public boolean hasNext(); //It returns true if the iterator has more elements otherwise it returns false.
2. public Object next(); //It returns the element and moves the cursor pointer to the next element.
3. public void remove(); //It removes the last elements returned by the iterator.




## In Java, both `LinkedList` and `ArrayList` implement the `List` interface, but they do so in fundamentally different ways. An `ArrayList` is implemented as a resizable array, while a `LinkedList` is implemented as a doubly linked list

### ArrayList Operations

- **Add Elements:**
    - `add(E e)`: Appends the specified element to the end of the list.
    - `add(int index, E element)`: Inserts the specified element at the specified position in the list.

- **Remove Elements:**
    - `remove(int index)`: Removes the element at the specified position in the list.
    - `remove(Object o)`: Removes the first occurrence of the specified element from the list.

- **Access Elements:**
    - `get(int index)`: Returns the element at the specified position in the list.
    - `set(int index, E element)`: Replaces the element at the specified position in the list with the specified element.

- **Size, Check, and Search:**
    - `size()`: Returns the number of elements in the list.
    - `isEmpty()`: Returns `true` if the list contains no elements.
    - `contains(Object o)`: Returns `true` if the list contains the specified element.
    - `indexOf(Object o)`: Returns the index of the first occurrence of the specified element, or `-1` if the list does not contain the element.

- **Iterate:**
    - `iterator()`: Returns an iterator over the elements in the list.
    - `listIterator()`: Returns a list iterator over the elements in the list.

- **Other:**
    - `clear()`: Removes all of the elements from the list.
    - `toArray()`: Returns an array containing all of the elements in the list in proper sequence.

### LinkedList Operations

- **Add Elements:**
    - `add(E e)`: Appends the specified element to the end of the list.
    - `add(int index, E element)`: Inserts the specified element at the specified position in the list.
    - `addFirst(E e)`: Inserts the specified element at the beginning of the list.
    - `addLast(E e)`: Appends the specified element to the end of the list.

- **Remove Elements:**
    - `remove(int index)`: Removes the element at the specified position in the list.
    - `remove(Object o)`: Removes the first occurrence of the specified element from the list.
    - `removeFirst()`: Removes and returns the first element from the list.
    - `removeLast()`: Removes and returns the last element from the list.

- **Access Elements:**
    - `get(int index)`: Returns the element at the specified position in

the list.

- `getFirst()`: Returns the first element in the list.
- `getLast()`: Returns the last element in the list.
- `set(int index, E element)`: Replaces the element at the specified position in the list with the specified element.

- **Size, Check, and Search:**
    - `size()`: Returns the number of elements in the list.
    - `isEmpty()`: Returns `true` if the list contains no elements.
    - `contains(Object o)`: Returns `true` if the list contains the specified element.
    - `indexOf(Object o)`: Returns the index of the first occurrence of the specified element, or `-1` if the list does not contain the element.

- **Iterate:**
    - `iterator()`: Returns an iterator over the elements in the list.
    - `listIterator()`: Returns a list iterator over the elements in the list.

- **Other:**
    - `clear()`: Removes all of the elements from the list.
    - `toArray()`: Returns an array containing all of the elements in the list in proper sequence.
    - `peek()`, `poll()`, and other Queue-related operations, since `LinkedList` also implements the `Queue` interface.

### Key Differences

- **Performance:**
    - `ArrayList` is fast for storing and accessing data as it provides O(1) time complexity for random access.
    - `LinkedList` is generally slower to access specific elements but faster for adding and removing elements, especially at the beginning or end of the list, as these operations are generally O(1) time complexity.

- **Memory Overhead:**
    - `ArrayList` has less memory overhead because it stores elements in a contiguous block of memory.
    - `LinkedList` uses more memory per element due to the need for additional pointer fields for each element (previous and next references in a doubly linked list).

### When to Use Each

- **Use `ArrayList`:**
    - When you need fast access to elements using an index.
    - You're adding elements only to the end of the list.

- **Use `LinkedList`:**
    - When you frequently add or remove elements from the beginning or middle of the list.
    - When you use the list as a queue or stack, and you need operations such as `addFirst()`, `removeFirst()`, `addLast()`, and `removeLast()`.

### Example Usage

Here's an example of how you might use an `ArrayList` and a `LinkedList` in a LeetCode problem:

```
// ArrayList example
ArrayList<Integer> arrayList = new ArrayList<>();
arrayList.add(1);
arrayList.add(2);
arrayList.add(3);
int element = arrayList.get(1); // Accessing element at index 1

// LinkedList example
LinkedList<Integer> linkedList = new LinkedList<>();
linkedList.addFirst(1);
linkedList.addLast(2);
int firstElement = linkedList.getFirst(); // Accessing the first element
```

Choosing between `ArrayList` and `LinkedList` depends on the specific requirements of the LeetCode problem you are solving. Consider the operations you need to perform most frequently and select the most appropriate data structure based on those needs.









# HashMap in Java

Java HashMap class inplements Map interface which allows to store data in <Key, Value> pair where keys are unique. If user tries to insert duplicate Key with same or different Value, it will replace the element (Value) of the corresponding Key.

- Key is unique and no duplication is allowed.
- HashMap allows one null key and multiple null values.
- HashMap is not synchronized, which means it is not thread-safe

HashMap class in found in the java.util package.

1. Java HashMap contains values based on the key.
2. Java HashMap contains only unique keys.
3. Java HashMap may have one null key and multiple null values.
4. Java HashMap is non synchronized.
5. Java HashMap maintains no order.
6. The initial default capacity of Java HashMap class is 16 with a load factor of 0.75.

## Basic HashMap Operations

### A. HashMap extends AbstractMap which implements Map interface

- public class HashMap<K,V> extends AbstractMap<K,V> implements Map<K,V>, Cloneable, Serializable

### B. Create a map object

- Map<K,V> map = new HashMap<>();
- Map<K,V> map = new HashMap<>(int initialCapacity);

### C. Add Key and Value in a HashMap -> V put(K,V)

- map.put(K,V); // Adding or putting elements at a given key forming a key-value pair.
- map.putIfAbsent(K, V);
- map2.putAll(map1);

### D. Contains Key and value -> boolean containsKey(K) or boolean containsValue(V)

- map.containsKey(K); //retrieve the value associated with a specific key
- map.containsValue(V); //retrieve the key associated with a specific value

### E. Get method -> V get(K)

- ValueType value = map.get(K); //retrieve the value associated with a specific key
- ValueType value = map.getOrDefault(key, defaultValue); //get a value or a default if the key is not found

### F. Is the map empty -> boolean isEmpty()

- map.isEmpty();

### G. Remove K-V pair -> V remove(K)

- map.remove(K); //remove a key-value pair by key
- map.remove(K,V);

### H. Replace V -> V replace(K,V)

- map.replace(K,V);
- map.replace(K,V,V1);
- map.replaceAll((k,v) -> "Ajay");

### I. Size of the Map -> int size()

- map.size(); //number of key-value pairs

## J. Clear the Map -> void clear()

- map.clear();

### K. IsEmpty() -> check if the map is empty

boolean isEmpty = map.isEmpty();

### L. Iterate over map

```
HashMap<Integer, String> map = new HashMap<>();
map.put(1, "One");
map.put(2, "Two");
map.put(3, "Three");
```

//Iterate over key-value pair
```
for (Map.Entry<KeyType, ValueType> entry : map.entrySet()) {
    KeyType key = entry.getKey(); //1,2,3
    ValueType value = entry.getValue(); //One, Two, Three
    System.out.println(entry.getKey()+" -> "+entry.getValue()+" "+entry);
    // process the key and value
}
```

// Iterating over values only
```
for (Integer value : map.values()) {
    System.out.println(value); //One, Two, Three
}
```

// Iterating over keys only
```
for (Integer key : map.keySet()) {
    System.out.println("Key = " + key); //1,2,3
}
```

## Iteration in Map (Advanced)

### Map to Set

In order to traverse the map, we need to convert the map into a set first using Entry and entrySet().

- Set<Map.Entry<Integer, String>> set = map.entrySet(); // Converting map to set using map.entrySet()
- System.out.println("Set: "+set);

### Using Non-Generic Method

Calling iterator method which we use to traverse collection objects like Lists, Sets etc.

- Iterator itr = set.iterator();
```
while(itr.hasNext()){
    Map.Entry entry = (Map.Entry) itr.next(); //Converting to Map.Entry so that we can get key and value separately.
    System.out.println(entry.getKey()+" -> "+entry.getValue());
}
```

### Using Generic Method (Point L in Basic HashMap Operations)
```
Map<K,V> map = new HashMap<>();
for(Map.Entry<Integer, String> entry: map.entrySet()){
    System.out.println(entry.getKey()+" -> "+entry.getValue()+" "+entry);
}
```

## Comparing By Key - Map

- map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);

- map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(System.out::println);

- map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);

- map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(System.out::println);

## Constructors in Map
```
new HashMap() -> It is used to construct a default HashMap.
new HashMap(Map<K,V> m) -> It is used to initialize the hash map by using the elements of the given Map object m.
new HashMap(int capacity) -> It is used to initializes the capacity of the hash map to the given integer value, capacity.
new HashMap(int capacity, float loadFactor) -> It is used to initialize both the capacity and load factor of the hash map by using its new arguments (load factor is 0.75).
```




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

HashMap<Integer, String> map = new HashMap<>();
map.put(1, "One");
map.put(2, "Two");
map.put(3, "Three");

//Iterate over key-value pair
for (Map.Entry<KeyType, ValueType> entry : map.entrySet()) {
    KeyType key = entry.getKey(); //1,2,3
    ValueType value = entry.getValue(); //One, Two, Three
    System.out.println(entry.getKey()+" -> "+entry.getValue()+" "+entry);
    // process the key and value
}

// Iterating over values only
for (Integer value : map.values()) {
    System.out.println(value); //One, Two, Three
}

// Iterating over keys only
for (Integer key : map.keySet()) {
    System.out.println("Key = " + key); //1,2,3
}

## Iteration in Map (Advanced)

### Map to Set

In order to traverse the map, we need to convert the map into a set first using Entry and entrySet().

- Set<Map.Entry<Integer, String>> set = map.entrySet(); // Converting map to set using map.entrySet()
- System.out.println("Set: "+set);

### Using Non-Generic Method

Calling iterator method which we use to traverse collection objects like Lists, Sets etc.

- Iterator itr = set.iterator();

while(itr.hasNext()){
    Map.Entry entry = (Map.Entry) itr.next(); //Converting to Map.Entry so that we can get key and value separately.
    System.out.println(entry.getKey()+" -> "+entry.getValue());
}

### Using Generic Method (Point L in Basic HashMap Operations)

Map<K,V> map = new HashMap<>();
for(Map.Entry<Integer, String> entry: map.entrySet()){
    System.out.println(entry.getKey()+" -> "+entry.getValue()+" "+entry);
}

## Comparing By Key - Map

- map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);

- map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(System.out::println);

- map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);

- map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(System.out::println);

## Constructors in Map

new HashMap() -> It is used to construct a default HashMap.
new HashMap(Map<K,V> m) -> It is used to initialize the hash map by using the elements of the given Map object m.
new HashMap(int capacity) -> It is used to initializes the capacity of the hash map to the given integer value, capacity.
new HashMap(int capacity, float loadFactor) -> It is used to initialize both the capacity and load factor of the hash map by using its new arguments (load factor is 0.75).

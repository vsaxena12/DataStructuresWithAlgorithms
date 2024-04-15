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


Choosing between `ArrayList` and `LinkedList` depends on the specific requirements of the LeetCode problem you are solving. Consider the operations you need to perform most frequently and select the most appropriate data structure based on those needs.

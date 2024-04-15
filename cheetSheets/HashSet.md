# HashSet

HashSet<Integer> set = new HashSet<>();

set.add(1); // Adds 1 to the set
set.remove(1); // Removes 1 from the set
boolean hasOne = set.contains(1); // Returns true if 1 is in the set
int size = set.size(); // Returns the size of the set
boolean isEmpty = set.isEmpty(); // Returns true if the set is empty

for (Integer element : set) {
    System.out.println(element);
}

set.clear(); // Removes all elements from the set
HashSet<Integer> clonedSet = (HashSet<Integer>) set.clone();

Object[] array = set.toArray(); // Returns an array containing all the elements in the set
// For a typed array
Integer[] typedArray = set.toArray(new Integer[0]);

HashSet<Integer> anotherSet = new HashSet<>();
anotherSet.add(2);
set.addAll(anotherSet); // Adds all elements from anotherSet to set

set.removeAll(anotherSet); // Removes all elements in anotherSet from set
set.retainAll(anotherSet); // Retains only elements that are in anotherSet

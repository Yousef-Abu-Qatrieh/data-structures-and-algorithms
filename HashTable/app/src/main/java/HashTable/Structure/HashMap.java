package HashTable.Structure;

import HashTable.data.HashNode;

import java.util.*;

public class HashMap<K, V> {
    private ArrayList<HashNode<K, V>> bucketArray;
    private int buckets;
    private int size;
    private final List<K> keyOfSet = new ArrayList<>();

    public HashMap() {
        bucketArray = new ArrayList<>();
        buckets = 10;
        size = 0;
        for (int index = 0; index < buckets; index++) {
            bucketArray.add(null);

        }
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int hashCode(K key) {
        return key.hashCode();
    }

    private int getBucketIndex(K key) {
        int hashCode = hashCode(key);
        int arrayIndex = hashCode % buckets;
        if (arrayIndex < 0) {
            arrayIndex = arrayIndex * -1;
        }
        return arrayIndex;
    }

    public void set(K key, V value) {
        // find the index of where we should put the value in
        // the bucket array
        int index = getBucketIndex(key);
        int hashcode = hashCode(key);

        // create head and make it point to where the index is
        HashNode<K, V> head = bucketArray.get(index);

        HashNode<K, V> newNode = new HashNode<>(key, value, hashcode);

        // head could be pointing to a list, so we need
        // to loop over the potential list and insert a
        // new node at the end.
        if (head == null) {
            bucketArray.set(index, newNode);
            size++;
        } else {
            newNode.setNext(head.getNext());
            head.setNext(newNode);
            size++;
        }

        // If load factor goes beyond threshold, then
        // double hash table size
        if ((1.0 * size) / buckets >= 0.7) {
            ArrayList<HashNode<K, V>> temp = bucketArray;
            bucketArray = new ArrayList<>();
            buckets = 2 * buckets;
            size = 0;
            for (int i = 0; i < buckets; i++)
                bucketArray.add(null);

            for (HashNode<K, V> headNode : temp) {
                while (headNode != null) {
                    set(headNode.getKey(), headNode.getValue());
                    headNode = headNode.getNext();
                }
            }
        }
    }

    // this method will return the value based on the key
    public V get(K key) {
        int bucketIndex = getBucketIndex(key);
        int hashCode = hashCode(key);
        HashNode<K, V> head = bucketArray.get(bucketIndex);
        while (head != null) {
            if (head.getKey().equals(key) && head.getHashCode() == hashCode)
                return head.getValue();
            head = head.getNext();
        }
        return null;
    }

    // method will check if the key exist in the Hashmap or not
    public boolean contains(K key) {

        return keyOfSet.contains(key);

    }

    //method will return all keys of hash map
    public List<K> keys() {
        List<K> allKeys = new ArrayList<>();
        for (int index = 0; index < bucketArray.size(); index++) {
            HashNode<K, V> head = bucketArray.get(index);
            while (head != null) {
                allKeys.add(head.getKey());
                head = head.getNext();
            }

        }
        return allKeys;
    }

    // method will return all values of Hashmap
    public List<V> Values() {
        List<V> allValues = new ArrayList<>();
        for (int index = 0; index < bucketArray.size(); index++) {
            HashNode<K, V> head = bucketArray.get(index);
            while (head != null) {
                allValues.add(head.getValue());
                head = head.getNext();
            }

        }
        return allValues;
    }


}



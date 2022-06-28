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
            if (head.getKey().equals(key) && head.getHashCode() == hashCode) return head.getValue();
            head = head.getNext();
        }
        return null;
    }

    // method will check if the key exist in the Hashmap or not
    public boolean contains(K key) {

        int index = getBucketIndex(key);

        HashNode<K, V> head = bucketArray.get(index);

        while (head != null) {
            if (head.getKey().equals(key) && head.getHashCode() == hashCode(key)) {
                return true;
            }
            head = head.getNext();
        }
        return false;

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

    public String repeatedWord(String str) {
        String word = str.toLowerCase(Locale.ROOT).replace(",", "");
        String[] listOfWords = word.split(" ");
        HashMap<String, Integer> repeatedWord = new HashMap<>();
        for (String wrd : listOfWords) {
            if (repeatedWord.contains(wrd)) {
                // if word or letter exist inside the string
                repeatedWord.set(wrd, repeatedWord.get(wrd) + 1);
                // will return the first duplicate letter or word
                return wrd;
            } else
                /*
                it will add new word to the list of repeated word if he found it during the next search
                 he will back it as duplicated word
                 */
                repeatedWord.set(wrd, 1);
        }
        return "There is no redundant word";

    }

    public HashSet<Integer> tree_intersection(BinaryTree tree1, BinaryTree tree2) {
        HashSet<Integer> result = new HashSet<>();
        if (tree1.getRoot() == null || tree2.getRoot() == null) {
            return null;
        } else {
            List<Integer> traversTree1 = tree1.preOrder(tree1.getRoot());
            List<Integer> traversTree2 = tree2.preOrder(tree2.getRoot());
            for (Integer res : traversTree1) {
                if (traversTree2.contains(res)) {
                    result.add(res);
                }
            }
            return result;
        }
    }

    public List<ArrayList<String>> leftJoin(HashMap hash1, HashMap hash2) {

        List<ArrayList<String>> result = new ArrayList<>();
        List setKeyForHash = hash1.keys();

        for (Object key : setKeyForHash) {
            List<String> strings = new ArrayList<>();
            strings.add((String) key);
            strings.add((String) hash1.get(key));
            if (hash2.contains(key)) {
                strings.add((String) hash2.get(key));
            } else {
                strings.add(null);
            }
            result.add((ArrayList<String>) strings);
        }
        return result;
    }

}







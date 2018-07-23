"# FirstHashMapping" 

<h1>Data Structures</h1>
import java.util.HashMap
<h2>Hashing</h2>
<ul> 
    <li>Provides O(1) time on average for insert, search and remove.</li>
</ul>
<h2>Hash function</h2>
<ul> 
    <li>Maps a big number or String (or object) to a small int that can be stored as index in hash table.</li>
</ul>

<h2><< interface >> Map</h2>
<ul> 
    <li>AbstractMap - implements Map</li>
    HashMap - extends AbstractMap
    <ul>
        <li>HashMap has a table of Nodes ( Node<  k,v > ) which is a linked list that contains:</li>
        <li>Node < k,v > [] table</li>
        <li>By defauklt hash table contains 16 indexes (0-15)</li>
        <li>int hash</li>
        <li>K k // key</li>
        <li>V v // value</li>
        <li>Node < k,v > next</li>
    </ul>
    <li>hash (k) // to int</li>
    <li>index = hash % (n - 1)</li>
    Useful functions:
    <ul>
        <li>containsValue(value), containsKey(key), put(key), get(key), remove(key)</li>
    </ul>    
</ul>

<h2>Questions and answers</h2>
<ul>
    <li>Can the key be any type of Object? - Yes, but should not be... Better to use the value for any Object and the key for easy search that points to an Object.</li>
    <li>Efficiency wrost case can be O(n) / O(logn) for Java 8, if the indexes are matches each time(?), but is the still average case is O(1)?</li>
    <li>Can we controll the lenngth of the Hashing table to avoid the previous issue?</li>
</ul>
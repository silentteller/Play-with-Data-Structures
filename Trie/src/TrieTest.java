public class TrieTest {
    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.add("apple");
        trie.add("banana");
        trie.add("peach");
        System.out.println(trie.contains("apple"));
        System.out.println(trie.contains("app"));
    }
}

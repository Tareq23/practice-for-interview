package interview_practice.data_structure.trie;


/**
 * 

# Trie Data Structure

-> Search (fast)
-> root is an empty node
-> prefix is not repeated

words[] = {"the", "a", "there", "their", "any"}

class Node{
  
  Node[] children; //26
  boolean endOfWord;

}

# Normal Binary Tree Node  

static class Node{

  int data;
  Node left;
  Node right;

}


=> Trie data structure is not a binary tree, it is a K-tree

=> 26 nodes requires for only small (a-z) or capital (A-Z) characters, 
   if there have any special character and capital A-Z and small a-z that means all character are allowed 
   then required 256 nodes


***/

public class TrieMain {
	
	
	
	static class Node{
		
		Node[] children;
		boolean endOfWord;
		
		public Node() {
			
			children = new Node[26]; // a to z
			endOfWord = false;
			
			for(int i=0; i<26; i++) {
				children[i] = null;
			}
		}
	}
	
	
	static Node root = new Node();
	static int countWord=0;
	
	public static void insert(String word)
	{
		
		Node current = root;
		for(int i=0; i<word.length(); i++)
		{
			int index = word.charAt(i) - 'a';
			
			if(current.children[index] == null)
			{
				current.children[index] = new Node();
			}
			
			
			if(i == word.length() -1) {
				current.endOfWord = true;
				countWord++;
			}
			
			current = current.children[index];
		}
	}
	
	public static boolean search(String word)
	{
	
		Node curr = root;
		for(int i = 0 ; i < word.length(); i++)
		{
			int index = word.charAt(i) - 'a';
			
			if(curr.children[index] ==  null) return false;
			
			if(i == word.length() - 1 && curr.endOfWord == false) return false;
			
			curr = curr.children[index];
			
			System.out.println("search word: "+word+" ; index: "+i);
		}
		
		return true;
	}

	public static void main(String[] args) {
		
		
		String words[] = {"the","a","there","any","their","of","hen"};
		
		for(int i=0; i<words.length; i++)
		{
			insert(words[i]);
		}
		
		
		System.out.println("Total word inserted: "+countWord);
		
		System.out.println(search("the"));
		System.out.println(search("they"));
		System.out.println(search("of"));
	}

}

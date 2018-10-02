import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNull;
import static org.junit.Assume.*;

import org.junit.Test;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class LCATest {
	//Testing Node class
	@Test
	public void testNode() {
		
		 new Node();	
		 new Node(4);
		 new Node(8);
	}
	//FindLCA test case
	@Test
	public void testFindLCA(){ 
	BinaryTree tree = new BinaryTree(); 
    tree.root = new Node(1); 
    tree.root.left = new Node(2); 
    tree.root.right = new Node(3); 
    tree.root.left.left = new Node(4); 
    tree.root.left.right = new Node(5); 
    tree.root.right.left = new Node(6); 
    tree.root.right.right = new Node(7); 
    assertEquals(tree.findLCA(4, 5).data,2);
    assertEquals(tree.findLCA(4, 6).data,1); 
    assertEquals(tree.findLCA(3,4).data,1); 
    assertEquals(tree.findLCA(2, 4).data,2);
    
	
	}
	@Test
	public void testFindLCAFalse() {
		BinaryTree tree = new BinaryTree(); 
	    tree.root = new Node(1); 
	    tree.root.left = new Node(2); 
	    tree.root.right = new Node(3); 
	    tree.root.left.left = new Node(4); 
	    tree.root.left.right = new Node(5); 
	    tree.root.right.left = new Node(6); 
	    tree.root.right.right = new Node(7); 
	    
	    
	    assertNotEquals(tree.findLCA(4, 5).data,600);
	    assertNotEquals(tree.findLCA(4, 6).data,5200); 
	    assertNotEquals(tree.findLCA(3,4).data,183); 
	    assertNotEquals(tree.findLCA(2, 4).data,1);
	    
		
	}
	@Test
	public void testNull() {
		BinaryTree tree = new BinaryTree(); 
	    tree.root = null; 
	    assertNull(tree.root);
	    
	}
	
	
}

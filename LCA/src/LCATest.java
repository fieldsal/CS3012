import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNull;

import org.junit.Test;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class LCATest {
	//Testing Node class
	@Test
	public void testNode() {
		
		 new Node(4);
		 new Node(8);
	}
	//FindLCA test case
	@Test
	public void testFindLCA(){ BinaryTree tree = new BinaryTree(); 
    tree.root = new Node(1); 
    tree.root.left = new Node(2); 
    tree.root.right = new Node(3); 
    tree.root.left.left = new Node(4); 
    tree.root.left.right = new Node(5); 
    tree.root.right.left = new Node(6); 
    tree.root.right.right = new Node(7); 
    System.out.println("LCA(4, 5) = " + 
                        tree.findLCA(4, 5).data); 
    assertEquals(tree.findLCA(4, 5).data,2);
    System.out.println("LCA(4, 6) = " + 
                        tree.findLCA(4, 6).data); 
    assertEquals(tree.findLCA(4, 6).data,1);
    System.out.println("LCA(3, 4) = " + 
                        tree.findLCA(3, 4).data); 
    assertEquals(tree.findLCA(3,4).data,1);
    System.out.println("LCA(2, 4) = " + 
                        tree.findLCA(2, 4).data); 
    assertEquals(tree.findLCA(2, 4).data,2);
		
		
		
	}
	
	
}

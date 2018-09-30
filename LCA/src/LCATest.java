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
	public void testFindLCA(){
		Node binNode = new Node(6);
		BinaryTree binTree = new BinaryTree();
		binTree.findLCA(3,5);
		binTree.findLCA(binNode,3,5);
		
	}
	
	
}

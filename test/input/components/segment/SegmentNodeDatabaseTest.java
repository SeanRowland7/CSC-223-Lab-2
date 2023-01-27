package input.components.segment;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import input.components.point.PointNode;

class SegmentNodeDatabaseTest
{
	
    public SegmentNodeDatabase build()
    {
    	//      A                                 
    	//     / \                                
    	//    B___C                               
    	//   / \ / \                              
    	//  /   X   \ 
    	// D_________E
    	//
		//
    	PointNode a = new PointNode("A", 3, 6);
    	PointNode b = new PointNode("B", 2, 4);
    	PointNode c = new PointNode("C", 4, 4);

    	PointNode d = new PointNode("D", 0, 0);
    	PointNode e = new PointNode("E", 6, 0);
    	PointNode x = new PointNode("X", 3, 3);

    	SegmentNodeDatabase db = new SegmentNodeDatabase();
    	  	
    	db.addUndirectedEdge(a, b);
    	db.addUndirectedEdge(a, c);
    	db.addUndirectedEdge(b, c);
    	db.addUndirectedEdge(b, x);
    	db.addUndirectedEdge(b, d);
    	db.addUndirectedEdge(c, x);
    	db.addUndirectedEdge(c, e);
    	db.addUndirectedEdge(x, d);
    	db.addUndirectedEdge(x, e);
    	db.addUndirectedEdge(d, e);
    	
    	return db;
    }

    
    public SegmentNodeDatabase build2()
    {
    	//      A___B___C                             
    	//     / \ / \ / \                                                    
    	//    D___E___F___G		
    	//  
    	PointNode a = new PointNode("A", 1, 1);
    	PointNode b = new PointNode("B", 3, 1);
    	PointNode c = new PointNode("C", 5, 1);

    	PointNode d = new PointNode("D", 0, 0);
    	PointNode e = new PointNode("E", 2, 0);
    	PointNode f = new PointNode("F", 4, 0);
    	PointNode g = new PointNode("G", 6, 0);

    	SegmentNodeDatabase db = new SegmentNodeDatabase();
    	  	
    	db.addUndirectedEdge(a, b);
    	db.addUndirectedEdge(b, c);
    	db.addUndirectedEdge(a, d);
    	db.addUndirectedEdge(a, e);
    	db.addUndirectedEdge(b, e);
    	db.addUndirectedEdge(b, f);
    	db.addUndirectedEdge(c, f);
    	db.addUndirectedEdge(c, g);
    	db.addUndirectedEdge(d, e);
    	db.addUndirectedEdge(e, f);
    	db.addUndirectedEdge(f, g);
    	
    	return db;
    }
	@Test
	void testNumUndirectedEdges()
	{
		SegmentNodeDatabase db = build();
		
		assertEquals(10, db.numUndirectedEdges());
		
		SegmentNodeDatabase db2 = build2();
		
		assertEquals(11, db2.numUndirectedEdges());
	}
	
	@Test
	void testAddUndirectedEdge()
	{
		SegmentNodeDatabase db = build();
		
		assertEquals(10, db.numUndirectedEdges());
		
		SegmentNodeDatabase db2 = build2();
		
		assertEquals(11, db2.numUndirectedEdges());
	}
	
	@Test
	void testAddAdjacencyList()
	{
		SegmentNodeDatabase db = build();
		assertEquals(15, db.addAdjacencyList(null, null));
		//assertThrows(NullPointerException.class);
		SegmentNodeDatabase db2 = build2();
		assertEquals(20, db2.addAdjacencyList(null, null));
	}
	
	@Test
	void testAsSegmentList()
	{
		SegmentNodeDatabase db = build();
		assertEquals(10, db.asSegmentList());
		SegmentNodeDatabase db2 = build2();
		assertEquals(10, db2.asSegmentList());
	}
	
	@Test
	void testAsUniqueSegmentList()
	{
		SegmentNodeDatabase db = build();
		assertEquals(10, db.asUniqueSegmentList());
		SegmentNodeDatabase db2 = build2();
		assertEquals(10, db2.asUniqueSegmentList());
	}
}

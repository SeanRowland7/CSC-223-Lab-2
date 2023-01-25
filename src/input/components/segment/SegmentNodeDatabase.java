package input.components.segment;

import input.components.point.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SegmentNodeDatabase
{
	protected Map<PointNode, Set<PointNode>> _adjLists;
	
	public SegmentNodeDatabase()
	{
		_adjLists = new LinkedHashMap<PointNode, Set<PointNode>>();
	}
	
	public SegmentNodeDatabase(Map<PointNode, Set<PointNode>> map)
	{
		_adjLists = new LinkedHashMap<PointNode, Set<PointNode>>(map);
	}

	
	public int numUndirectedEdges()
	{
		//Collection<Set<PointNode>> adjValuesList = _adjLists.values();
		
		int count = 0;
		
		for( Set<PointNode> adjValueList : _adjLists.values())
		{
			count += adjValueList.size();
		}
		
		return count;
	}
	
	private void addDirectedEdge(PointNode p1, PointNode p2)
	{
		// Create a copy of the adjacency list for p1.
		LinkedHashSet<PointNode> adjList = new LinkedHashSet<PointNode>(_adjLists.get(p1));
		 
		// Add the new edge to that adjacency list 
		adjList.add(p2);
		
		// Replace the old adjacency list with the new one.
		_adjLists.put(p1, adjList);
	}
		
	public void addUndirectedEdge(PointNode p1, PointNode p2)
	{
		addDirectedEdge(p1, p2);
		addDirectedEdge(p2, p1);
	}
	
	public void addAdjacencyList(PointNode p, List<PointNode> list)
	{
		if( list instanceof Set) _adjLists.put(p, (Set<PointNode>)list);
	}
	
	public List<SegmentNode> asSegmentList()
	{
		// Try using entrySet()
	
		List<SegmentNode> listSegNodes = new ArrayList<SegmentNode>();
		
		for( Set<PointNode> adjValueList : _adjLists.values())
		{
			for(PointNode p : adjValueList)
			{
				//listSegNodes.add(new SegmentNode(, p)):
			}
			
		}
		
		return listSegNodes;
	}
	
	public List<SegmentNode> asUniqueSegmentList()
	{
		List<SegmentNode> listSegNodes = new ArrayList<SegmentNode>();
		return listSegNodes;
	}
	
}

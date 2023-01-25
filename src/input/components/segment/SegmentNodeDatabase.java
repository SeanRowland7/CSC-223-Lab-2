package input.components.segment;

import input.components.point.*;

import java.util.LinkedHashMap;
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

	}
	
	private void addDirectedEdge(PointNode p1, PointNode p2)
	{
		//_adjLists.put(p1, ? )
	}
		
	public void addUndirectedEdge(PointNode p1, PointNode p2)
	{
		addDirectedEdge(p1, p2);
		addDirectedEdge(p2, p1);
	}
	
	public void addAdjacencyList(PointNode p, List<PointNode> list)
	{
		
	}
	
	public List<SegmentNode> asSegmentList()
	{
		
	}
	
	public List<SegmentNode> asUniqueSegmentList()
	{
		
	}
	
}

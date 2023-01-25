package input.components.point;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PointNodeDatabase {
	
	protected Set <PointNode> _points;

	public PointNodeDatabase()
	{
		_points = new HashSet();
	}
	
	public PointNodeDatabase(List<PointNode> list)
	{
		if (list.size() == 0) _points = new HashSet<PointNode>();
		_points = (Set<PointNode>) list;
	}
	
	public void put (PointNode node)
	{
		// todo 
	}
	
	public boolean contains (PointNode node)
	{
		for (PointNode p : _points)
		{
			if (p.equals(node)) return true;
		}
		
		return false;
	}
	public boolean contains (double x, double y)
	{
		for (PointNode p : _points)
		{
			if (p.getX() == x && p.getY() == y) return true;
		}
		
		return false;
	}
	
	public String getName (PointNode node)
	{
		
		// todo
		return "";
	}
	
	public String getName (double x, double y)
	{
		// todo
		
		return "";
	}
	
	public PointNode getPoint (PointNode node)
	{
		PointNode empty = new PointNode(0,0);
		if (!_points.contains(node)) return empty;
		for (PointNode p : _points)
		{
			if (p.equals(node)) return p;
		}
		return empty;
	}
	
	public PointNode getPoint (double x, double y)
	{
		PointNode empty = new PointNode(0,0);		
		for (PointNode p : _points)
		{
			if (p.getX() == x && p.getY() == y) return p;
		}
		return empty;
	}
	
	
	
	
	
}

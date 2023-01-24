

/**
 * A 2D Point (x, y).
 */
public class PointNode
{
	// test
	protected static final String ANONYMOUS = "__UNNAMED";

	protected double _x;
	public double getX() { return this._x; }

	protected double _y; 
	public double getY() { return this._y; }

	protected String _name; 
	public String getName() { return _name; }

	/**
	 * Create a new Point with the specified coordinates.
	 * @param x The X coordinate
	 * @param y The Y coordinate
	 */
	public PointNode(double x, double y)
	{
		x = getX();
		y = getY();
		
		
	}

	/**
	 * Create a new Point with the specified coordinates.
	 * @param name -- The name of the point. (Assigned by the UI)
	 * @param x -- The X coordinate
	 * @param y -- The Y coordinate
	 */
	public PointNode(String name, double x, double y)
	{
		x = getX();
		y = getY();
		name = getName();
	}

	@Override
	public int hashCode()
	{
		return Double.valueOf(_x).hashCode() + Double.valueOf(_y).hashCode();
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == null) return false;
)
		
		PointNode a = obj;
		if (!a.getX().equals(_x) || !a.getY().equals(_y)) return false;
		return true;
	}

    @Override
    public String toString()
    {
		return _name + "(" + _x + ", " + _y + ")";
	}
}


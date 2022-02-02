/*
 * deysi garcia
 */
public class Dresser {

	private Clothing [][] clothes;
	
	public Dresser () 
	{
	clothes = new Clothing[5][10];	//size of the 2D array
	}
	
	public void add (Clothing aC)
	{
		if(aC.getType().equalsIgnoreCase("Undergarments"))
		{
			for(int j = 0; j<10; j++)
			{
				if(clothes[0][j] == null) //looks at the index 0 with undergarments
				{
					clothes[0][j] = aC;
					break;
				}
				System.out.println("Undergarments drawer is full");
			}
		}
	
		if(aC.getType().equalsIgnoreCase("Socks"))
		{
			for(int j = 0; j<10; j++)
			{
				if(clothes[1][j] == null) //looks at the index 1 with the socks and stockings
				{
					clothes[1][j] = aC;
					break;
				}
				System.out.println("Socks drawer is full");//if the drawer is full message will print out
			}
		}
		
		if(aC.getType().equalsIgnoreCase("Stockings")) 
		{
			for(int j = 0; j<10; j++)
			{
				if(clothes[2][j] == null) //looks at the index 1 with the socks and stockings
				{
					clothes[2][j] = aC;
					break;
				}
				System.out.println("Socks and Stockings drawer is full");//if the drawer is full message will print out
			}
		}
		
	if(aC.getType().equalsIgnoreCase("Tops"))
	{
		for(int j = 0; j<10; j++)
		{
			if(clothes[3][j] == null) //looks at the index 2 with the tops
			{
				clothes[3][j] = aC;
				break;
			}
			System.out.println("Tops drawer is full");	//if the drawer is full message will print out
		}
	}
	if(aC.getType().equalsIgnoreCase("Bottoms"))
	{
		for(int j = 0; j<10; j++)
		{
			if(clothes[4][j] == null) //looks at the index 3 with the bottoms
			{
				clothes[4][j] = aC;
				break;
			}
			System.out.println("Bottoms drawer is full"); //if the drawer is full message will print out
		}
	}
	if(aC.getType().equalsIgnoreCase("Capes"))
	{
		for(int j = 0; j<10; j++)
		{
			if(clothes[5][j] == null)  //looks at the index 4 with the capes
			{
				clothes[5][j] = aC;
				break;
			}
			System.out.println("Capes drawer is full"); //if the drawer is full message will print out
		}
	}
	}
	
	public void remove (Clothing rC)
	{
		for (int i = 0; i < clothes.length; i++) 
		{
			for(int j = 0; j <clothes[i].length; j++)
			{
				if (clothes[i][j] == null)
				{
					break;
				}
				if(clothes[i][j].getType()==rC.getType() && clothes[i][j].getColor()==rC.getColor()) 
				{
					clothes[i][j] = null;
				}
			}
					
		}
	}
	public void print ()
	{
		for (int i = 0; i < clothes.length; i++) 
		{
			for(int j = 0; j <clothes[i].length; j++)
			{
				if(clothes[i][j]!=null)
				{
					System.out.println(clothes[i][j].toString());
				}
			}
		}
	}
}

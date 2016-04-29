import java.util.Scanner;
import java.util.ArrayList;

        public class Pokemon implements Cloneable
{
                 String name;
                 int health;
                int escape;
                int points;

                public Pokemon(String n, int h, int esc, int pts)
                        {
                        name =n;
                        health= h;
                        escape = esc;
                        points = pts;
                        }
                
                Pokemon() throws CloneNotSupportedException {
                    try
                    	{
                        throw new CloneNotSupportedException();
                    	} 
                    catch(Exception e) 
                    	{
                        e.printStackTrace();
                    	}
                }   
               
                public Object clone()
                {  
                    try
                    	{  
                        return super.clone();  
                    	}
                    catch(Exception e)
                    	{ 
                        return null; 
                    	}
                }
				public String getName()
					{
						return name;
					}

				public void setName(String name)
					{
						this.name = name;
					}

				public int getHealth()
					{
						return health;
					}

				public void setHealth(int health)
					{
						this.health = health;
					}

				public int getEscape()
					{
						return escape;
					}

				public void setEscape(int escape)
					{
						this.escape = escape;
					}

				public int getPoints()
					{
						return points;
					}

				public void setPoints(int points)
					{
						this.points = points;
					}

}
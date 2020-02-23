import java.io.*;
import java.util.*;

public class ZigZag {

	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(new File("zigzag.dat"));
		int h = s.nextInt();
		int w = s.nextInt();
		
		String[][] mat = new String[h][w];
		
		s.nextLine();
		for (int i = 0; i < h; i++)
		{
			mat[i] = s.nextLine().split("");
		}
		
		int n = s.nextInt();
		
		for (int i = 0; i < n; i++)
		{
			String m = "";
			int y = s.nextInt();
			int x = s.nextInt();
			int count = 0;
			String p = s.next();
			int dir = 0;
			
			while(true)
			{
				m += mat[y][x];
				
				switch(dir)
				{
				case(0) : {
					x++;
					break;
				}
				case(1) : {
					y++;
					break;
				}
				case(2) : {
					x--;
					break;
				}
				case(3) : {
					y--;
					break;
				}
				}
				if (((y > (h - 1)) || (y < 0)) || ((x > (w - 1) || (x < 0))))
				{
					System.out.println(m);
					break;
				}
				if (mat[y][x].equals("."))
				{
					if (count > (p.length() - 1))
					{
						System.out.println(m);
						break;
					}
					m += " ";
					switch(dir)
					{
					case(0) : {
						x--;
						break;
					}
					case(1) : {
						y--;
						break;
					}
					case(2) : {
						x++;
						break;
					}
					case(3) : {
						y++;
						break;
					}
					}
					char c = p.charAt(count);
					count++;
					switch(c)
					{
					case('R') : {
						dir++;
						if (dir == 4)
						{
							dir = 0;
						}
						break;
					}
					case('L') : {
						dir--;
						if (dir == -1)
						{
							dir = 3;
						}
						break;
					}
					}
					switch(dir)
					{
					case(0) : {
						x++;
						break;
					}
					case(1) : {
						y++;
						break;
					}
					case(2) : {
						x--;
						break;
					}
					case(3) : {
						y--;
						break;
					}
					}
				}
			}
		}
		s.close();
	}

}

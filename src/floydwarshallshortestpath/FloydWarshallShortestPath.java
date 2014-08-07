package floydwarshallshortestpath;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author Dinesh Appavoo
 *
 */
public class FloydWarshallShortestPath 
{

	/**
	 * @param args
	 */
	public static int noOfVertices=0;
	public static int noOfEdges=0;
	public static Graph graph=null;
	public static int[][][] D=null;
	

	public static void main(String[] args) 
	{
		FloydWarshallShortestPath floydWarshallSP=new FloydWarshallShortestPath();
		floydWarshallSP.findShortestPath();

	}

	public void constructGraph() 
	{
		int u, v, w;
		Scanner scanner=new Scanner(System.in);
		while(scanner.hasNextInt())
		{
			noOfVertices=scanner.nextInt();
			noOfEdges=scanner.nextInt();//To bypass no of edges
			graph=new Graph(noOfVertices);

			for(int i=0;i<noOfEdges;i++)
			{
				u=scanner.nextInt();
				v=scanner.nextInt();
				w=scanner.nextInt();
				graph.addEdge(u, v, w);

			}
			break;

		}
		//graph.alignMatrix();
		//graph.printGraph();
	}
	
	
	/**
	 * 
	 * FLOYD-WARSHALL(W)
		n <- rows[W]
		D(0 ) <- W
		for k <- 1 to n
			do for i <- 1 to n
				do for j <- 1 to n
					d(k)i,j <- min [d(k-1)i,j , d(k-1)i,k + d(k-1)k,j ]
		return D(n)
	 * 
	 * 
	 * 
	 */
	public void findFloydWarshallShortestPath()
	{
		int[][] W=graph.getAdjacencyMatrix();
		int n=W.length;
		D=new int[n][n][n];
		
		//D(0 ) <- W
		for(int i=1;i<n;i++)
		{
			for(int j=1;j<n;j++)
			{
				D[0][i][j]=W[i][j];
			}
		}
		
		
		for(int k=1;k<n;k++)
		{
			for(int i=1;i<n;i++)
			{
				for(int j=1;j<n;j++)
				{
					D[k][i][j]=Math.min(D[k-1][i][j], (D[k-1][i][k]+D[k-1][k][j]));
				}
			}
		}
	}
	
	
	public void findShortestPath()
	{
		constructGraph();
		findFloydWarshallShortestPath();
		int n=D.length;
		for(int i=1;i<n;i++)
		{
			for(int j=1;j<n;j++)
			{
				System.out.println("Distance from "+i+" to "+j+" is "+D[n-1][i][j]);
			}
		}
	}
}

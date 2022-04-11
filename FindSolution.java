import java.io.*;
import java.util.*;

public class FindSolution {
	private int V; // Number of vertices
	private LinkedList<Integer> adj[]; // adjacency Lists
	
	//constructor
	FindSolution(int v)
	{
		V=v;
		adj = new LinkedList[v];
		for (int i = 0; i < v; ++i)
			adj[i] = new LinkedList();
			
	}
	
	// Function to add edge into the graph
	void addEdge(int v, int w)
	{
		
		adj[v].add(w);
	}
	
	// print BFS traversal from a given source s
	void BFS(int s) {
		// before marked as all the vertices as not visited
		//defaut it's value false
		
		boolean visited[] = new boolean[V];
		
		LinkedList<Integer> queue = new LinkedList<Integer>(); // create the the queue
		
		//mark the current node as visite and include into queue
		visited[s] = true;
		queue.add(s);
		
		while (queue.size() != 0)
		{
			//print the value from the queue
			s = queue.poll();
			System.out.print(s+" ");
			
			//check the adjacent vertices 
			
			Iterator<Integer> i = adj[s].listIterator();
				while(i.hasNext())
				{
					int n = i.next();
					if(!visited[n])
					{
						visited[n] = true;
						queue.add(n);
						
					}
					
				}		
		}	
	}
	
	public static void main(String args []) {
		
		FindSolution g = new FindSolution(4);
		
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 2);
		g.addEdge(2, 0);
		g.addEdge(2, 3);
		g.addEdge(3, 3);
		
		System.out.println("");
		g.BFS(2);
			
		
	}
	
	

}

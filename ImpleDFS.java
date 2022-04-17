import java.io.*;
import java.util.*;

public class ImpleDFS {
	private int V; //No of vertices
	private LinkedList<Integer> adj[]; // adjacency list
	
	public ImpleDFS(int v) {
		V = v;
		adj = new LinkedList[v];
		for(int i = 0; i < v; ++i) {
			adj[i] = new LinkedList();
			
		}
	}	
		
		void addEdge(int v, int w) {
			adj[v].add(w);   // adding edge to the adjacency list
			
		}
		
		void DFSPro(int vertex, boolean nodes[]) {
			nodes[vertex] = true;   // marked the node as explored
			System.out.print(vertex + " ");
			int a = 0;
			
			for(int i = 0; i < adj[vertex].size(); i++) {  // go through the linked list and bring it to the next nodes
				a = adj[vertex].get(i);
				if(!nodes[a]) {  // only propagate to next nodes which have not explore
					DFSPro(a, nodes);
				}
				
			}
 			
			
		}
		
		void DFS(int v) {
			boolean already[] = new boolean[V]; // boolean array to store details of explored nodes
			DFSPro(v, already);
			
		}
		
		public static void main(String args[]) {
			ImpleDFS I = new ImpleDFS(8);
			
			I.addEdge(0, 3);
			I.addEdge(3, 0);
			I.addEdge(3, 5);
			I.addEdge(3, 7);
			I.addEdge(5, 3);
			I.addEdge(5, 6);
			I.addEdge(6, 5);
			I.addEdge(6, 2);
			I.addEdge(2, 6);
			I.addEdge(2, 1);
			I.addEdge(1, 2);
			I.addEdge(7, 4);
			I.addEdge(7, 3);
			I.addEdge(4, 7);
			
			
			System.out.println("DFS" );
			I.DFS(0);
		}		
		
      }


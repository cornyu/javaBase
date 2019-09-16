package com.ff.algorithm.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;


/**
 * @author cornyu
 * @version 创建时间：2019年9月14日 下午4:40:46 类说明
 */
public class MinPath {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int S = sc.nextInt();
		int T = sc.nextInt();
		Graph g = new Graph(n + 1);
		for (int i = 0; i < m; i++) {
			int u = sc.nextInt(), v = sc.nextInt(), w = sc.nextInt();

			g.addWeightedEdge(u, v, w);
			g.addWeightedEdge(v, u, w);
		}
		System.out.println(ShortestPath.dijkstra(g, S, T));

	}

	 static class ShortestPath {
		 
	        public static long[] dijkstra(Graph g, int from) {
	   	            
	            PriorityQueue<long[]> q = new PriorityQueue<>(10, new Comparator<long[]>() {
					@Override
					public int compare(long[] o1, long[] o2) {
						 long c = (o1[0] == o2[0] ? o1[1] - o2[1] : o1[0] - o2[0]);
						 return c > 0L ? 1 : c == 0L ? 0 : -1;
					}
	            	
				});
	            int n = g.getVertexNumber();
	            long[] dis = new long[n];
	            
	            Arrays.fill(dis, Long.MAX_VALUE);
	            
	            boolean[] vis = new boolean[n];
	            dis[from] = 0;
	            
	            q.add(new long[] { 0, from });
	            
	            while (!q.isEmpty()) {
	                int u = (int) q.poll()[1];
	                if (vis[u])
	                    continue;
	                vis[u] = true;
	                for (Edge e : g.getEdges(u)) {
	                    if (dis[u] + e.weight < dis[e.to]) {
	                        dis[e.to] = dis[u] + e.weight;
	                        q.add(new long[] { dis[e.to], e.to });
	                    }
	                }
	            }
	            return dis;
	        }

	        public static long dijkstra(Graph g, int from, int to) {
	            return dijkstra(g, from)[to];
	        }
	        
	    }
	

	static class Graph {
		List<Edge>[] g;

		public Graph(int n) {
			g = new List[n];
			for (int i = 0; i < n; i++) {
				g[i] = new ArrayList<>();
			}
		}

		public void addWeightedEdge(int from, int to, long weight) {
			g[from].add(new Edge(to, weight));
		}

		public List<Edge> getEdges(int from) {
			return g[from];
		}

		public int getVertexNumber() {
			return g.length;
		}
	}

	static class Edge {
		int to;
		long weight;

		public Edge(int to) {
			this.to = to;
		}

		public Edge(int to, long weight) {
			this(to);
			this.weight = weight;
		}
	}

}

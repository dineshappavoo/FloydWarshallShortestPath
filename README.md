Floyd Warshall Shortest Path (All Pairs)
=========

The Floyd–Warshall algorithm (also known as Floyd's algorithm, Roy–Warshall algorithm, Roy–Floyd algorithm, or 
the WFI algorithm) is a graph analysis algorithm for finding shortest paths in a weighted graph with positive or 
negative edge weights (but with no negative cycles, see below) and also for finding transitive closure of a 
relation R. A single execution of the algorithm will find the lengths (summed weights) of the shortest paths 
between all pairs of vertices, though it does not return details of the paths themselves.

##Complexity
	  Worst case performance  O(|V|^3)
	  Worst case space complexity O (|V|^2)

##Install

This library has the java implementation of Floyd - Warshall Shortest Path algorithm to find the shortest path in a 
directed graph G=[V,E].The following code snippet shows how to get the shortest path,

    FloydWarshallShortestPath floydWarshallSP=new FloydWarshallShortestPath();
	floydWarshallSP.findShortestPath();

###Input
	3 3
	1 2 1
	2 3 2
	1 3 3

First integer is the total number of vertices |V| in the graph G. The next integer is the number of edges |E| in the graph.
Next |E| lines has the edges information (u, v, w). All inputs must be given through terminal.

###Output
	Distance from 1 to 1 is 0
	Distance from 1 to 2 is 1
	Distance from 1 to 3 is 3
	Distance from 2 to 1 is 0
	Distance from 2 to 2 is 0
	Distance from 2 to 3 is 2
	Distance from 3 to 1 is 0
	Distance from 3 to 2 is 0
	Distance from 3 to 3 is 0
  
##Project Contributor

* Dinesh Appavoo ([@DineshAppavoo](https://twitter.com/DineshAppavoo))
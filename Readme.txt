
Instruction:

1. Folder contains "Java Files" 
2. "Java Files" folder contains 3 java files,Please Compile all three files using 
3. "Java Class Files" is for your reference
4. Thank you
*******************************************************
Program Structure
*******************************************************
The program consists of three classes   
1. node
2. Graphclass
3. Graph
saved as node.java,Graphclass.java and Graph.java respectively

Please Note : In the given assignment, Graph vertex/cities are represented by nodes and edges are represented by an Array Matrix.

-------> Nodes Class comprises of variables: city(String) ,Visitnode(boolean), distance(int) and cost(int)
City:This variable is used to store the City Name as String.
Visitnode:Check if the node is already visited.By Default its set as false
distance:The Shortest distance from the goal is constantly stored in node distance.
cost:The Shortest cost from the goal is constantly stored in the node cost
 
------->Graphclass: Contains functions
********************************************** 
addedge : Add an edge between node pairs.
addedge_distance : Add an edge between node pairs where distance is saved
addedge_cost:Add an edge between node pairs where cost is saved.
Childrenofnodes: This function signifies Expansion of nodes.

Main Function in Graphclass :
breadthfirstqueing: BFS Traversal is displayed from Los Angeles- New York
depthfirstqueing: DFS Traversal is displayed from Los Angeles- New York   
uniformsearch_distance: Uniform Cost Search according to Distance is displayed from Los Angeles- New York. 
uniformsearch_cost:Uniform Cost Search according to cost is displayed from Los Angeles- New York.
Search: Search function implements BFS,DFS,UCS(Distance), UCS(Cost).

------->Graph class contains the main function which is used to hardcode all the cities names of type nodes and invokes Search() function (mentioned in Graphclass).

********************************************************
Expected Code Output Format :
********************************************************
Breadthfirstqueing:

[Los Angeles, Seattle, San Francisco, Dallas, Chicago, Miami, Denver, DC, Atlanta, New Orleans, Omaha, St. Louis, New York]

Depthfirstqueing:

[Los Angeles, Seattle, San Francisco, Denver, Salt Lake City, Dallas, Atlanta, DC, Chicago, Omaha, St. Louis, New York]

UniformCostSearch_Distance:

[Los Angeles, San Francisco, Seattle, Dallas, Denver, New Orleans, Salt Lake City, Atlanta, Chicago, Miami, St. Louis, DC, Omaha, New York]

UniformCostSearch_Cost

[Los Angeles, Seattle, San Francisco, Dallas, Denver, New Orleans, Atlanta, Salt Lake City, Chicago, Miami, DC, St. Louis, New York]


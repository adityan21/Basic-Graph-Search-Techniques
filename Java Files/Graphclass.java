import java.util.*;
public class Graphclass {
public node root;
public node goal;
int no_of_nodes;
public ArrayList tree=new ArrayList();
public ArrayList nodes=new ArrayList();
ArrayList tree1=new ArrayList();
ArrayList<node> temp=new ArrayList();
public int [][]arraymatrix;
public int [][]arraymatrix_distance;
public int [][]arraymatrix_cost;
public int []total_distance=null;
public void setrootnode(node root)
{
	this.root=root;
}
public node tree_root(){
	return this.root;
}
public node setgoalnode(node n)
{
	return this.goal=n;
}
public node tree_goal()
{
	return this.goal;
}
public void add_node(node n)
{
	try
	{
   nodes.add(n);
	}
catch(Exception e)
{
	System.out.println("Node cannot be added");
}
}
public void addedge(node start,node end)
{
	if(arraymatrix==null)
	{
		no_of_nodes=nodes.size();
		arraymatrix=new int[no_of_nodes][no_of_nodes];
	}
		int start_pos=nodes.indexOf(start);
		int end_pos=nodes.indexOf(end);
		arraymatrix[start_pos][end_pos]=1;
		arraymatrix[end_pos][start_pos]=1;
	
}
public void addedge_distance(node start,node end,int distance)
{
	if(arraymatrix_distance==null)
	{
		no_of_nodes=nodes.size();
		arraymatrix_distance=new int[no_of_nodes][no_of_nodes];
	}
		int start_pos=nodes.indexOf(start);
		int end_pos=nodes.indexOf(end);
		arraymatrix_distance[start_pos][end_pos]=distance;
		arraymatrix_distance[end_pos][start_pos]=distance;
	
}
public void addedge_cost(node start,node end,int cost)
{
	if(arraymatrix_cost==null)
	{
		no_of_nodes=nodes.size();
		arraymatrix_cost=new int[no_of_nodes][no_of_nodes];
	}
		int start_pos=nodes.indexOf(start);
		int end_pos=nodes.indexOf(end);
		arraymatrix_cost[start_pos][end_pos]=cost;
		arraymatrix_cost[end_pos][start_pos]=cost;
	
}
public node Childrenofnodes(node vertex)
{
   	
	int position=nodes.indexOf(vertex);
   	for(int j=0;j<no_of_nodes;j++)
   	{
   		if(arraymatrix[position][j]==1 && ((node)nodes.get(j)).visitnode!=true)
   		{
   			return (node)nodes.get(j);
   		}
   	}
   	return null;
}


public Queue breadthfirstqueing(Queue q,node parent_node)
{
	parent_node=(node)q.remove();	
		node child=null;
		while((child=Childrenofnodes(parent_node))!=null)
		
		{
			child.visitnode=true;
			q.add(child);		    
		  tree.add(child.city);	
		  
		}
	
		return q;
		
	}
		

public Stack depthfirstqueing(Stack s,node child_node)
{
	
	    child_node=(node)s.peek();
		node child=Childrenofnodes(child_node);
		if(child!=null)
		{
			child.visitnode=true;
			s.push(child);
			//s.add(child);
			tree.add(child.city);
			
		}
		else
		{
		   s.pop();
		}

return s;
	

}
public Queue uniformsearch_distance(Queue q,node parentnode)
{   int totaldist;	
		int track_parentpos=nodes.indexOf((node)q.peek());
		int parent_value=((node)q.peek()).distance;
		parentnode=(node)q.remove();
	
		node child=null;
		while((child=Childrenofnodes(parentnode))!=null)
		{
			int track_childpos=nodes.indexOf(child);
			//child.visitnode=true;
			//child.distance=arraymatrix_distance[track_parentpos][track_childpos]+parent_value;
			boolean present1=temp.contains(child);
			boolean present2=tree1.contains(child);
			if(present1==false && present2==false)
			{
				child.distance=arraymatrix_distance[track_parentpos][track_childpos]+parent_value;
				child.visitnode=true;
				temp.add(child);
			}
			else if(present1==true)
			{
			    totaldist=arraymatrix_distance[track_parentpos][track_childpos]+parent_value;
				if(totaldist<child.distance)
				{
					temp.remove(child);
					child.distance=totaldist;
					child.visitnode=true;
					temp.add(child);
				}
				else
				{
					child.visitnode=true;
				}
			}
			else if(present2==true)
			{
				totaldist=arraymatrix_distance[track_parentpos][track_childpos]+parent_value;
				if(totaldist<child.distance)
				{
					tree1.remove(child);
					tree.remove(child.city);
					child.distance=totaldist;
					child.visitnode=true;
					temp.add(child);
				}
				else
				{
				child.visitnode=true;	
				}
			}
			
			   
		}
		
		//Sorting the Child Nodes
		while(!q.isEmpty())
		{
			q.remove();
		}
		for(int i=0;i<temp.size();i++)
		{((node)temp.get(i)).visitnode=false;
		  int tempvalue=((node)temp.get(i)).distance;
		   int y=i+1;
		   node temp1;
		   while(y<temp.size())
		   {
			   if(tempvalue>((node)temp.get(y)).distance)
			   {
				   tempvalue=((node)temp.get(y)).distance;
				   temp1=(node)temp.get(i);
				   temp.set(i, (node)temp.get(y));
				   temp.set(y, temp1);
				   
			   }
			   y++;
		   }
		q.add((node)temp.get(i));
		
		}
		temp.remove(0);
		tree1.add(q.element());
		String city=((node)q.element()).city;
		tree.add(city);
	return q;
	
	//Test for the Distance of each Nodes from Start_Node
//	for(int pos=0;pos<nodes.size();pos++)
//	System.out.println(((node)nodes.get(pos)).distance);
	
}
public Queue uniformsearch_cost(Queue q,node parentnode)
{
	 int totalcost;	
		int track_parentpos=nodes.indexOf((node)q.peek());
		int parent_value=((node)q.peek()).cost;
		parentnode=(node)q.remove();
	
		node child=null;
		while((child=Childrenofnodes(parentnode))!=null)
		{
			int track_childpos=nodes.indexOf(child);
			//child.visitnode=true;
			//child.distance=arraymatrix_distance[track_parentpos][track_childpos]+parent_value;
			boolean present1=temp.contains(child);
			boolean present2=tree1.contains(child);
			if(present1==false && present2==false)
			{
				child.cost=arraymatrix_cost[track_parentpos][track_childpos]+parent_value;
				child.visitnode=true;
				temp.add(child);
			}
			else if(present1==true)
			{
			    totalcost=arraymatrix_cost[track_parentpos][track_childpos]+parent_value;
				if(totalcost<child.cost)
				{
					temp.remove(child);
					child.cost=totalcost;
					child.visitnode=true;
					temp.add(child);
				}
				else
				{
					child.visitnode=true;
				}
			}
			else if(present2==true)
			{
				totalcost=arraymatrix_distance[track_parentpos][track_childpos]+parent_value;
				if(totalcost<child.cost)
				{
					tree1.remove(child);
					tree.remove(child.city);
					child.cost=totalcost;
					child.visitnode=true;
					temp.add(child);
				}
				else
				{
				child.visitnode=true;	
				}
			}
			
			   
		}
		
		//Sorting the Child Nodes
		while(!q.isEmpty())
		{
			q.remove();
		}
		for(int i=0;i<temp.size();i++)
		{((node)temp.get(i)).visitnode=false;
		  int tempvalue=((node)temp.get(i)).cost;
		   int y=i+1;
		   node temp1;
		   while(y<temp.size())
		   {
			   if(tempvalue>((node)temp.get(y)).cost)
			   {
				   tempvalue=((node)temp.get(y)).cost;
				   temp1=(node)temp.get(i);
				   temp.set(i, (node)temp.get(y));
				   temp.set(y, temp1);
				   
			   }
			   y++;
		   }
		q.add((node)temp.get(i));
		
		}
		temp.remove(0);
		tree1.add(q.element());
		String city=((node)q.element()).city;
		tree.add(city);
	return q;

}

//Main Algorithm Search Technique
public void search()
{   node current_node;
    current_node=tree_root();
    current_node.distance=0;
    current_node.cost=0;
    Queue queue=new LinkedList();
    Stack queue1=new Stack();
    current_node.visitnode=true;
    tree1.add(tree_root());
    tree.add(current_node.city);
    queue.add(current_node);
    queue1.push(current_node);
    
    while(!tree.contains(tree_goal().city))
    {
     	//queue=breadthfirstqueing(queue,current_node);	
    	//queue1=depthfirstqueing(queue1,current_node);
     	// queue=uniformsearch_distance(queue,current_node);
    	 queue=uniformsearch_cost(queue,current_node);
    }
	System.out.println(tree);
}
}
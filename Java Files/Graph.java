
import java.util.*;
public class Graph {
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		node Seattle=new node("Seattle");
		node Sfo=new node("San Francisco");
		node Lax=new node("Los Angeles");
		node Slc=new node("Salt Lake City");
		node Denver=new node("Denver");
		node Dallas=new node("Dallas");
		node Omaha=new node("Omaha");
		node Slouis=new node("St. Louis");
		node Chicago=new node("Chicago");
		node Atlanta=new node("Atlanta");
		node Nyc=new node("New York");
		node Orleans=new node("New Orleans");
		node DC=new node("DC");
		node Miami=new node("Miami");
		
	
		
		Graphclass g=new Graphclass();
		g.add_node(Seattle);	
		g.add_node(Sfo);
		g.add_node(Lax);
		g.add_node(Slc);
		g.add_node(Denver);
		g.add_node(Dallas);
		g.add_node(Omaha);
		g.add_node(Slouis);
		g.add_node(Chicago);
		g.add_node(Atlanta);
		g.add_node(Nyc);
		g.add_node(Orleans);
		g.add_node(DC);
		g.add_node(Miami);
		g.setrootnode(Lax);
		g.setgoalnode(Nyc);
		//Edges according to arraymatrix=1
		g.addedge(Seattle, Sfo);
	    g.addedge(Sfo, Lax);
	    g.addedge(Seattle, Lax);
	    g.addedge(Sfo, Denver);
	    g.addedge(Lax, Dallas);
	    g.addedge(Slc, Denver);
	    g.addedge(Denver, Dallas);
	    g.addedge(Seattle, Chicago);
	    g.addedge(Denver, Chicago);
	    g.addedge(Sfo, DC);
	    g.addedge(Seattle, Miami);
	    g.addedge(Dallas, Orleans);
	    g.addedge(Omaha, Chicago);
	    g.addedge(Slouis, Chicago);
	    g.addedge(Dallas, Atlanta);
	    g.addedge(Chicago, Nyc);
	    g.addedge(Chicago, DC);
	    g.addedge(Atlanta, Miami);
	    g.addedge(Atlanta, DC);
	    g.addedge(Nyc, DC);
	    g.addedge(Orleans, Miami);
	    g.addedge(Nyc, Miami);
		//Edges according to Distance
		g.addedge_distance(Seattle, Sfo, 679);
	    g.addedge_distance(Sfo, Lax, 338);
	    g.addedge_distance(Seattle, Lax, 954);
	    g.addedge_distance(Sfo, Denver, 967);
	    g.addedge_distance(Lax, Dallas, 1235);
	    g.addedge_distance(Slc, Denver, 391);
	    g.addedge_distance(Denver, Dallas, 641);
	    g.addedge_distance(Seattle, Chicago, 1721);
	    g.addedge_distance(Denver, Chicago, 888);
	    g.addedge_distance(Sfo, DC, 2442);
	    g.addedge_distance(Seattle, Miami, 2724);
	    g.addedge_distance(Dallas, Orleans, 448);
	    g.addedge_distance(Omaha, Chicago, 416);
	    g.addedge_distance(Slouis, Chicago, 258);
	    g.addedge_distance(Dallas, Atlanta, 732);
	    g.addedge_distance(Chicago, Nyc, 740);
	    g.addedge_distance(Chicago, DC, 612);
	    g.addedge_distance(Atlanta, Miami, 595);
	    g.addedge_distance(Atlanta, DC, 547);
	    g.addedge_distance(Nyc, DC, 213);
	    g.addedge_distance(Orleans, Miami, 675);
	    g.addedge_distance(Nyc, Miami, 1090);
	    //Edges according to Cost
	    g.addedge_cost(Seattle, Sfo, 149);
	    g.addedge_cost(Sfo, Lax, 199);
	    g.addedge_cost(Seattle, Lax, 159);
	    g.addedge_cost(Sfo, Denver, 219);
	    g.addedge_cost(Lax, Dallas, 239);
	    g.addedge_cost(Slc, Denver, 129);
	    g.addedge_cost(Denver, Dallas, 199);
	    g.addedge_cost(Seattle, Chicago, 399);
	    g.addedge_cost(Denver, Chicago, 199);
	    g.addedge_cost(Sfo, DC, 439);
	    g.addedge_cost(Seattle, Miami, 529);
	    g.addedge_cost(Dallas, Orleans, 199);
	    g.addedge_cost(Omaha, Chicago, 349);
	    g.addedge_cost(Slouis, Chicago, 159);
	    g.addedge_cost(Dallas, Atlanta, 249);
	    g.addedge_cost(Chicago, Nyc, 199);
	    g.addedge_cost(Chicago, DC, 199);
	    g.addedge_cost(Atlanta, Miami, 229);
	    g.addedge_cost(Atlanta, DC, 209);
	    g.addedge_cost(Nyc, DC, 109);
	    g.addedge_cost(Orleans, Miami, 199);
	    g.addedge_cost(Nyc, Miami, 199);
	    
//Search Function 	    
	    g.search();

	}

}

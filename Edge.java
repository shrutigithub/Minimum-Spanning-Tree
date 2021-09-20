/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mst;

/**
 *
 * @author abhishek kumar
 */
import mst.Node;
import java.awt.Color;

public class Edge {
	private Node first, second;
	private int w;
	private Color c;

	/*****************************
	 * constructor of Edge class *
	 *****************************/
	public Edge(Node firstNode, Node secondNode, int weight, Color color) {
		first = firstNode;
		second = secondNode;
		w = weight;
		c = color;
	}
		
	public void setWeight(int weight) { w = weight; } // set edge weight to given weight
	public void setColor(Color color) { c = color; } // set edge color to given color
	
	public Node firstNode() { return first; } // return the first node which is in this edge
	public Node secondNode() { return second; } // return the second node which is in this edge
	public int weight() { return w; } // return the edge weight
	public Color color() { return c; } // return the edge color
	
	public int xPos() {
		double hyp, x, y;
		x = second.xPos() - first.xPos();
		y = second.yPos() - first.yPos();
		hyp = Math.sqrt(x*x + y*y);
		return (first.xPos() + (int)((x/hyp)*(hyp/2)));
	}

	public int yPos() {		
		double hyp, x, y;
		x = second.xPos() - first.xPos();
		y = second.yPos() - first.yPos();
		hyp = Math.sqrt(x*x + y*y);
		return (first.yPos() + (int)((y/hyp)*(hyp/2)));
	}
}
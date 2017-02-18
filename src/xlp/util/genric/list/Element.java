package xlp.util.genric.list;

import xlp.util.genric.Node;

public class Element <T> implements Node<T> {
	private Integer position;
	private T value;
	private Node<T> node;
	
	public Element (){}
	
	@Override
	public Integer getPosition() {
		return position;
	}
	@Override
	public void setPosition(Integer position) {
		this.position = position;
	}
	@Override
	public T getValue() {
		return value;
	}
	@Override
	public void setValue(T value) {
		this.value = value;		
	}
	
	public Node<T> getNode() {
		return node;
	}
	
	public void setNode(Node<T> node) {
		this.node = node;
	}
	
	public Integer getNextPosition(){
		return position+1;
	}
}
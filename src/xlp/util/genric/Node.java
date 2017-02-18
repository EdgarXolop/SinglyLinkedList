package xlp.util.genric;

public interface Node <T>{
	
	public Integer getPosition();//save current position, null for root element
	
	public void setPosition(Integer position);
	
	public T getValue();//get element element 
	
	public void setValue(T value);// set current element
	
}
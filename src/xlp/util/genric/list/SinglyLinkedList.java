package xlp.util.genric.list;

import xlp.util.genric.List;

public class SinglyLinkedList <T> implements List<T> {
	
	private Element<T> root; //root Element
	
	public SinglyLinkedList() {
		root = null;
	}
	 
	@Override
	public void add(T t) {
		if(root == null){
			root = new Element<>();
			root.setValue(t);
			root.setPosition(UtilConstant.START_INDEX);
		}else{
			Element<T> newElement = new Element<>();
			newElement.setNode(root);
			newElement.setValue(t);
			newElement.setPosition(root.getNextPosition());		
				
			root = newElement;
		}
	}
	
	public void printList(){
		Element<T> record = root;
		while (record != null) {
			System.out.println(record.getValue());
			record = (Element<T>) record.getNode();
		}
	}
}

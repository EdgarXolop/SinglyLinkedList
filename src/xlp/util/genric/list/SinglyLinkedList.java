package xlp.util.genric.list;

import xlp.util.genric.List;

public class SinglyLinkedList <T> implements List<T> {
	
	private Element<T> root; //root Element
	private Integer size;
	
	public SinglyLinkedList() {
		root = null;
		size = 0;
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
		++size;
	}
	public void remove(Integer position){
		Element<T> record = root;
		Element<T> last = null;
		while (record != null) {
			if(record.getPosition().equals(position)){
				if(last == null){
					root = (Element<T>) record.getNode();

					System.out.println("last null " + position);
					record = null;
				}else if(position.equals(UtilConstant.START_INDEX)){
					System.out.println("position  0 " + position);
					
					last.setNode(null);
					record = null;
				}else{
					System.out.println("position  " + position);
					last.setNode(record.getNode());
					record = null;
				}
				--size;
			}else{
				last = record;
				record = (Element<T>) last.getNode();
			}
			
		}
	}
	
	public void printList(){
		Element<T> record = root;
		while (record != null) {
			System.out.println(record.getPosition() + "  " + record.getValue());
			record = (Element<T>) record.getNode();
		}
	}
	
	public Integer getSize(){
		return size;
	};
}

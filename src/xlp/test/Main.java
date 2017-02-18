package xlp.test;
import xlp.util.genric.list.SinglyLinkedList;

public class Main {

	public static void main(String[] args) {
		SinglyLinkedList<String> list = new SinglyLinkedList<>();

		list.add(" ordenada.");
		list.add(" lista");
		list.add(" propia");
		list.add(" mi");
		list.add(" es");
		list.add(", esta");
		list.add(" mundo");
		list.add("Hola");
		
		list.printList();
		System.out.println("size = " + list.getSize());
		
		list.update(5,"Khe");

		list.printList();
		System.out.println("size = " + list.getSize());
	}

}

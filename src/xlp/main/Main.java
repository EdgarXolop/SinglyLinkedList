package xlp.main;

import java.util.Scanner;

import xlp.bean.Product;
import xlp.util.genric.list.SinglyLinkedList;

public class Main {
	
	public static void main(String[] args ){
		Scanner s = new Scanner(System.in);
		SinglyLinkedList<Product> products = new SinglyLinkedList<>();
		Integer option = 0;
		Integer index = 0;

		products.add(new Product("12312","nuevo","12-12-23",67.23,"asd"));
		products.add(new Product("12312","nuevo","12-12-23",67.23,"asd"));
		products.add(new Product("12312","nuevo","12-12-23",67.23,"asd"));
		products.add(new Product("12312","nuevo","12-12-23",67.23,"asd"));

		while(option < 5){

			System.out.println("1 - Agreagar");
			System.out.println("2 - Modificar");
			System.out.println("3 - Eliminar");
			System.out.println("4 - Listar");
			System.out.println("5 - Salir");
			
			option = s.nextInt();

			s.nextLine();
			
			switch(option){
				case 1:
					Product np = new Product();
					
					System.out.println("codigo :");
					np.setCode(s.nextLine());
					System.out.println("name : ");
					np.setName(s.nextLine());
					System.out.println("due date : ");
					np.setDueDate(s.nextLine());
					System.out.println("price :");
					np.setPrice(s.nextDouble());
					s.nextLine();
					System.out.println("type : ");
					np.setType(s.nextLine());
					
					break;
				case 2:
					products.printList();
					Product up = new Product();
	
					System.out.println("Index :");
					index = s.nextInt();
					s.nextLine();
					
					System.out.println("codigo :");
					up.setCode(s.nextLine());
					System.out.println("name : ");
					up.setName(s.nextLine());
					System.out.println("due date : ");
					up.setDueDate(s.nextLine());
					System.out.println("price :");
					up.setPrice(s.nextDouble());
					s.nextLine();
					System.out.println("type : ");
					up.setType(s.nextLine());
					
					products.update(index, up);
					
					break;
				case 3:
					products.printList();
	
					System.out.println("Index :");
					index = s.nextInt();
					s.nextLine();
					
					products.remove(index);
					
					break;
				case 4:
					products.printList();
					break;
			}	

		}
		
	}
	
}
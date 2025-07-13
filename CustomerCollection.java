class CustomerCollection{
	private class Node{
		private Customer data;
		private Node next;
		
		Node(Customer data){this.data = data;}
	}
	
	private Node first;
	
	public void addFirst(Customer data){
		Node temp = new Node(data);
		temp.next = first;
		first = temp;
	}
	
	public void addLast(Customer data){
		if(size() == 0)addFirst(data);
		else{
			Node temp = first;
			Node node = new Node(data);
			while(temp.next != null){
				temp = temp.next;
			}
			temp.next = node;
		}
	}
	
	public void add(Customer data){addLast(data);}
	
	public void add(int index, Customer data){
		if(index >= 0 && index <= size()){
			if(index == 0)addFirst(data);
			else if(index == size())addLast(data);
			else{
				int count = 0;
				Node temp = first;
				Node node = new Node(data);
				while(count < index - 1){
					temp = temp.next;
					count++;
				}
				node.next = temp.next;
				temp.next = node;
			}
		}
	}
	
	public int size(){
		int count = 0;
		Node temp = first;
		while(temp != null){
			count++;
			temp = temp.next;
		}
		return count;
	}
	
	public void printList(){
		System.out.print("[");
		Node temp = first;
		while(temp != null){
			System.out.print(temp.data + ", ");
			temp = temp.next;
		}
		System.out.println(first == null ? "empty]" : "\b\b]");
	}
	
	
	public void removeFirst(){if(!isEmpty()){first = first.next;}}
	
	public void removeLast(){
		if(!isEmpty()){
			if(first.next == null)removeFirst();
			else{
				Node temp = first;
				while(temp.next.next != null){
					temp = temp.next;
				}
				temp.next = null;
			}
		}
	}
	
	public void remove(int index){
		if(index >= 0 && index < size()){
			if(index == 0)removeFirst();
			else if(index == size() -1)removeLast();
			else{
				int count = 0;
				Node temp = first;
				while(count < index -1){
					temp = temp.next;
				}
				temp.next = null;
			}
		}
	}
	
	public void remove(){removeFirst();}
	
	public int indexOf(String phoneNum){
		int count = 0;
		Node temp = first;
		while(temp != null){
			if(temp.data.getPhoneNum().equals(phoneNum))return count;
			temp = temp.next;
			count++;
		}
		return -1;
	}
	
	public Customer get(int index){
		if(index >= 0 && index < size() && !isEmpty()){
			int count = 0;
			Node temp = first;
			while(count < index){
				temp = temp. next;
			}
			return temp.data;
		}
		return new Customer(null,null,null,null);
	}
	
	public boolean contains(String phoneNum){return indexOf(phoneNum) != -1;}
	
	public boolean isEmpty(){return first == null;}
	
}



/*class CustomerCollection{
	
	public static void main(String[] args){
		List list = new List();
		
		list.printList();
		list.addFirst(new Customer("0704132218","Malaka","Kurunegala","malaka@gmail.com"));
		list.addFirst(new Customer("2234234","nethmal","anuradhapura","nehtma@gmai.com"));
		list.printList();
		System.out.println("Size of list : " + list.size());
		System.out.println("is list empty : " + list.isEmpty());
		list.removeFirst();
		list.addLast(new Customer("545323","Damika","galgamuwa","damika@gmail.com"));
		list.printList();
		System.out.println("Size of list : " + list.size());
		list.add(1,new Customer("639405","Madhubhashana","panadura","mm.@gmail.com"));
		list.printList();
		System.out.println("index : "+list.indexOf("545323"));
		list.removeLast();
		list.printList();
		list.remove(1);
		list.printList();
		System.out.println("get : "+list.get(0));
		System.out.println("Contains : " + list.contains("0704132218"));
	}
	
}  */


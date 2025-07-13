class Customer{
	private String phoneNumber;
	private String name;
	private String address;
	
	Customer(String phoneNumber, String name, String address){
		this.phoneNumber = phoneNumber;
		this.name = name;
		this.address = address;
	}
	
	public void setPhoneNumber(String phoneNumber){this.phoneNumber = phoneNumber;}
	public void setName(String name){this.name = name;}
	public void setAddress(String address){this.address = address;}
	public String getPhoneNumber(){return this.phoneNumber;}
	public String getName(){return this.name;}
	public String getAddress(){return this.address;}
	
}

class List{
	private Customer[] dataArray;
	private int initCapacity;
	private double loadFact;
	private int nextIndex;
	
	List(int initCapacity, double loadFact){
		this.initCapacity = initCapacity;
		this.loadFact = loadFact;
		
		dataArray = new Customer[initCapacity];
		nextIndex = 0;
	}
	
	private void extendsArray(){
		Customer[] tempDataArray = new Customer[dataArray.length + (int)(dataArray.length * loadFact)];
		for (int i = 0; i < nextIndex; i++)
		{
			tempDataArray[i] = dataArray[i];
		}
		dataArray = tempDataArray;
		
	}
	
	public boolean add(Customer data){return add(nextIndex,data);}
	
	public boolean add(int index, Customer data){
		if(index >= 0 && index <= nextIndex){
			if(index >= dataArray.length) extendsArray();
				for (int i = nextIndex - 1; i >= index ; i--)
				{
					dataArray[i+1] = dataArray[i];
				}
				dataArray[index] = data;
				nextIndex++;
				return true;
				
		}
		return false;
	}
	
	public boolean remove(){return remove(0);}
	
	public boolean remove(int index){
		if(index >= 0 && index < nextIndex){
			for (int i = index; i < nextIndex - 1; i++)
			{
				dataArray[i] = dataArray[i+1];
			}
			nextIndex--;
			return true;
		}
		return false;
	}
	
	public int indexOf(String data){
		for (int i = 0; i < nextIndex; i++)
		{
			if(dataArray[i].getPhoneNumber().equals(data))return i;
		}
		return -1;
		
	}
	
	public boolean search(String data){
		return indexOf(data) != -1;
	}
	
	public void printList(){
		System.out.print("[");
		for (int i = 0; i < nextIndex; i++)
		{
			System.out.print(dataArray[i].getName() + ", ");
		}
		System.out.println(nextIndex == 0 ? "empty]" : "\b\b]");
		
	}
	
	public String toString(){
		String list = "[";
		for (int i = 0; i < nextIndex; i++)
		{
			list += dataArray[i].getPhoneNumber() + ", ";
		}
		return nextIndex == 0 ? "[empty]" : list + "\b\b]";
	}
	
}

class CustomerList{
	public static void main(String[] args){
		List list = new List(30,0.25);
		
		
		list.add(new Customer("234234","malaka","kurunegala"));
		list.add(new Customer("93475","madhubhashana","galgamuwa"));
		list.add(new Customer("56756","dissanayake","mahagalkadawala"));
		list.printList();
		list.remove(1);
		list.printList();
		
		System.out.println(list.indexOf("56756"));
		System.out.println(list.toString());
	}
}

package ClothingProject;


public class Clothing {
	//�ʵ�

	String day;//�ֹ���
	String category; //ī�װ�
	String productName; //��ǰ��
	String productNameSearch;
	String salesStore; //�Ǹ�ó
	String storeSearch; //�Ǹ�ó�˻�
	String customerName; //����
	int amount; //����
	int productPrice; //��ǰ�ݾ�
	int payPrice; //�����ݾ�
	int commissionPrice; //������ݾ�
	int salesPrice; //����ݾ�
	String coupon;//��������
	int stock;// ���
	int cardigan,pants,jacket,socks;//�� ��ǰ���
	String stockSearch; //���˻�

	public Clothing() {
		cardigan=100;
		pants=100;
		jacket=100;
		socks=100;
	}
	public void PrintTitle1() {
		System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
		System.out.println("�ֹ�����"+"\t"+"ī�װ�"+"\t"+"��ǰ��"+"\t"+"�Ǹ�ó"+"\t"+"����"+"\t"+"����"+"\t"+"�����ݾ�");  
		System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
	}
	public void PrintTitle2() {
		System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
		System.out.println("�ֹ�����"+"\t"+"��ǰ��"+"\t"+"�Ǹ�ó"+"\t"+"����"+"\t"+"����"+"\t"+"�����ݾ�"+"\t"+"�Ǹż�����"+"\t"+"�����");  
		System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
	}


	public void CustomerSearch() {

	} 
	public int PayPrice(int amount, String produtNameSearch) {
		//�����ݾ� = ��ǰ�ݾ� x ����
		switch(productNameSearch) {
		case "���̰����":
			payPrice = 39000 * amount; break;
		case "������":
			payPrice = 35000 * amount; break;
		case "��������":
			payPrice = 47000 * amount; break; 
		case "�������縻":
			payPrice = 1500 * amount; break;  
		}
		return payPrice;
	}
	public String Category() {
		switch(productNameSearch){
		case "���̰����":
			category = "����";break;
		case "������":
			category = "����";break;
		case "��������":
			category = "����";break;
		case "�������縻":
			category = "��ȭ";break; 
		case "�ս�ĿƮ":
			category = "����";break; 

		}
		return category;
	}

	public int Commission(int payPrice){
		switch(salesStore) {
		case "������":
			commissionPrice= (int)(payPrice*0.1);break;
		case "����":
			commissionPrice= (int)(payPrice*0.12);break; 
		case "11����":
			commissionPrice= (int)(payPrice*0.09);break;
		}  
		return commissionPrice;
	}
	public int SalesPrice() {  
		salesPrice = payPrice - commissionPrice;
		return salesPrice;
	}

	public int Stock(int amount) {  
		switch(stockSearch) {
		case "���̰����": 
			cardigan -= amount;
			stock = cardigan;break;
		case "������":
			pants -= amount;
			stock = pants;break;
		case "��������":
			jacket -= amount;
			stock = jacket;break;
		case "�������縻":
			socks -= amount;
			stock = socks;break;    
		}    
		return  stock;
	}

	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getSalesStore() {
		return salesStore;
	}
	public void setSalesStore(String salesStore) {
		this.salesStore = salesStore;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	public void setPayPrice(int payPrice) {
		this.payPrice = payPrice;
	}
	public int getSalesPrice() {
		return salesPrice;
	}
	public void setSalesPrice(int salesPrice) {
		this.salesPrice = salesPrice;
	}

}

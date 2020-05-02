package ClothingProject;


public class Clothing {
	//필드

	String day;//주문일
	String category; //카테고리
	String productName; //제품명
	String productNameSearch;
	String salesStore; //판매처
	String storeSearch; //판매처검색
	String customerName; //고객명
	int amount; //수량
	int productPrice; //제품금액
	int payPrice; //결제금액
	int commissionPrice; //수수료금액
	int salesPrice; //매출금액
	String coupon;//할인쿠폰
	int stock;// 재고량
	int cardigan,pants,jacket,socks;//각 상품재고량
	String stockSearch; //재고검색

	public Clothing() {
		cardigan=100;
		pants=100;
		jacket=100;
		socks=100;
	}
	public void PrintTitle1() {
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		System.out.println("주문일자"+"\t"+"카테고리"+"\t"+"제품명"+"\t"+"판매처"+"\t"+"고객명"+"\t"+"수량"+"\t"+"결제금액");  
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
	}
	public void PrintTitle2() {
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		System.out.println("주문일자"+"\t"+"제품명"+"\t"+"판매처"+"\t"+"고객명"+"\t"+"수량"+"\t"+"결제금액"+"\t"+"판매수수료"+"\t"+"매출액");  
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
	}


	public void CustomerSearch() {

	} 
	public int PayPrice(int amount, String produtNameSearch) {
		//결제금액 = 제품금액 x 수량
		switch(productNameSearch) {
		case "브이가디건":
			payPrice = 39000 * amount; break;
		case "봄팬츠":
			payPrice = 35000 * amount; break;
		case "데님자켓":
			payPrice = 47000 * amount; break; 
		case "베이직양말":
			payPrice = 1500 * amount; break;  
		}
		return payPrice;
	}
	public String Category() {
		switch(productNameSearch){
		case "브이가디건":
			category = "상의";break;
		case "봄팬츠":
			category = "하의";break;
		case "데님자켓":
			category = "상의";break;
		case "베이직양말":
			category = "잡화";break; 
		case "롱스커트":
			category = "하의";break; 

		}
		return category;
	}

	public int Commission(int payPrice){
		switch(salesStore) {
		case "지마켓":
			commissionPrice= (int)(payPrice*0.1);break;
		case "옥션":
			commissionPrice= (int)(payPrice*0.12);break; 
		case "11번가":
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
		case "브이가디건": 
			cardigan -= amount;
			stock = cardigan;break;
		case "봄팬츠":
			pants -= amount;
			stock = pants;break;
		case "데님자켓":
			jacket -= amount;
			stock = jacket;break;
		case "베이직양말":
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

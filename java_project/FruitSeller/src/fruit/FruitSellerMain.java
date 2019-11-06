package fruit;

public class FruitSellerMain {

	public static void main(String[] args) {
		
		//셀러 생성
		FruitSeller seller;	//참조변수 생성 목적: 인스턴스의 주소를 저장
		seller = new FruitSeller();	//인스턴스 생성 -> 인스턴스의 메모리의 주소값을 반환(저장)
		//바이어 생성
		FruitBuyer buyer = new FruitBuyer();	//변수 생성과 동시에 저장
		
		
		//구매자가 5000원 어치 사과를 구매
		buyer.buyApple(seller, 5000);
		
		System.out.println("판매자의 현재 상황");
		seller.showSaleResult();
		
		System.out.println("구매자의 현재 상황");
		buyer.showBuyResult();

	}

}

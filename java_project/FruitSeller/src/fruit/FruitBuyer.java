package fruit;

public class FruitBuyer {
	
	//상태값(변수): 보유금액, 사과의 개수
	int myMoney = 10000;	//보유금액: 초기값 10000원
	int numOfApple;			//보유한 사과의 개수: 기본값 0. int numofApple = 0;으로 작성가능.
	
	
	//기능: 구매, 현재 구매 현황
	
	//구매기능:
	//구매할 셀러, 구매할 금액 -> FruitSeller seller, int money
	//셀러에게 판매 요청(금액전달) -> int num = seller.saleApple(money)
	//반환 받은 사과의 개수로 사과의 개수를 변경 -> numOfApple += num
	//보유한 금액 변경 -> myMoney -= money
	
	void buyApple(FruitSeller seller, int money) {
		//구매한 사과의 개수
		int num = seller.saleApple(money);
		
		numOfApple += num;	//사과의 개수 변경처리. numOfApple = numOfApple + num로 써도 됨
		myMoney -= money;
	
	
	
	}
		
	//현재 구매 현황 기능:
	void showBuyResult() {
		System.out.println("현재 보유금액: " + myMoney);
		System.out.println("사과의 개수: " + numOfApple);
	}
}

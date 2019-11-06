package fruit;

public class FruitSeller {
	
	//상태값(변수): 사과의 개수, 수익금, 사과의 가격
	int numofApple = 20;	//사과의 개수. 20개로 초기화
	int myMoney = 0;	//수익금. 초기값이 0이기 때문에 int myMoney;로 표현할 수 있음
	final int APPLE_PRICE = 1000;	//사과 한개의 가격. 상수의 경우 final과 대문자를 사용
	
	//기능: 판매, 판매 결과 출력
	
	//판매기능:
	//돈으로 받고 -> int money
	//사과의 개수를 계산 -> num = money/APPLE_PRICE
	//사과의 개수를 변경 -> numofApple = numofApple - num
	//돈의 수치 변경 -> myMoney = myMoney + money
	//사과의 개수를 반환 -> return num
	
	int saleApple(int money) {
		//판매한 사과의 개수
		int num = money/APPLE_PRICE;
		numofApple = numofApple - num;	//현재 보유한 사과의 개수 변경
		myMoney = myMoney + money;	//보유한 돈의 데이터 변경
		
		return num;
		
	}

	//판매 결과 출력 기능:
	void showSaleResult() {
		System.out.println("남은 사과의 개수: " + numofApple);
		System.out.println("판매 수익: " + myMoney);
	}
}



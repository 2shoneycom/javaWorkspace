package ch05.sec03;

public class ArrayEx2 {

	public static void main(String[] args) {
		// myLottoNums: 내 로또 번호 6개
		// isSelected: 이미 뽑힌 숫자 마스킹용
		int[] myLottoNums = new int[6];
		boolean[] isSelected = new boolean[46]; // 46까지 false로 초기화
		
		// 6번 랜덤 숫자 뽑기
		for (int i = 0; i < 6; i++) {
			// 1 ~ 45 사이의 난수 발생
			int num;			
			do {
				num = (int)(Math.random() * 45 + 1);	
			} while (isSelected[num]); // 이미 뽑힌 숫자면 다시 뽑기
			
			isSelected[num] = true;	// 뽑힌 숫자 true로 체크
			myLottoNums[i] = num;	// 내 로또 번호에 추가
		}
		
		// 내 로또 번호 출력
		for (int i = 0; i < 6; i++) {
			System.out.print(myLottoNums[i] + " ");
		}
		System.out.println();
	}

}

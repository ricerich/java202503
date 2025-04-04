package ch05_ex;


abstract class PairMap 
{
	protected String keyArray []; // key들을 저장하는 배열
	protected String valueArray []; // value 들을 저장하는배열
	
	abstract String get(String key); // key 값으로 value를 검색
	abstract void put(String key, String value); // key와 value를 쌍으로 저장
	abstract String delete(String key); // key 값을 가진 아이템(value와 함께)을 삭제. 삭제된 value 값 리턴
	abstract int length(); // 현재 저장된 아이템의 개수 리턴
}

class Dictionary extends PairMap{
	
	//1.멤버변수 ??
	private int count;
	
	
	//2.생성자
	public Dictionary(int capacity) {
		keyArray = new String[capacity];
		valueArray = new String[capacity];
		count = 0;
	}

	//3.메소드
	@Override
	String get(String key) {
		
		for(int i=0; i<count; i++) {//배열에 들어있는 전체 값을 순회하면서
			if(key.equals(keyArray[i])) {
				return valueArray[i];
			}
				
		}
		
		return null;//같은게 없으면
	}

	@Override
	void put(String key, String value) 
	{
		//0.같은 key 값이 있는지 체크부터
		//1.key값이 같은게 있으면 -> 수정
		//2.key값이 같은게 없으면 -> 입력
		//2-1.입력은 꽉찼는지 체크
		
//		int pos=0;
		int i=0;
		//0.같은 key 값이 있는지 체크부터
		for(i=0; i<count; i++) {
			if(key.equals(keyArray[i])) {
//				pos=i;//위치를 저장
				break;//순회중단
			}
		}
		
		//1.key값이 같은게 없으면 -> 입력
		if(i==count) {
			//1.입력은 꽉찼는지 체크
			if(i<keyArray.length) {//꽉 차있지 않는 경우에는 저장
				keyArray[i] = key;
				valueArray[i] = value;
				count++;
			}
		}
		else//2. 같은게 있으면 수정
		{
			keyArray[i] = key;
			valueArray[i] = value;
		}
	}

	@Override
	String delete(String key) 
	{
		int i=0;
		for(i=0;i<count;i++)
		{
			if(key.equals(keyArray[i]))
				break;
		}
		
		//key값이 없어요! 찾을 수 없을때
		if(i == count)
			return null;
		
		int last = count -1;//1개를 삭제하니까 크기가 1개 줄음
		for(int j=i;j<last;j++) {
			keyArray[j] = keyArray[j+1]; 
			valueArray[j] = valueArray[j+1]; 
		}
		
		count--;
		
		return null;
	}

	@Override
	public int length() {
		return count;
	}
	
}

public class Ex10 
{
	public static void main(String[] args) 
	{
		Dictionary dic = new Dictionary(10);
		dic.put("손흥민", "축구");
		dic.put("아이유", "가수");
		dic.put("아이유", "배우"); // 아이유의 값을 배우로 수정		
		System.out.println("아이유의 값은 " + dic.get("아이유"));
		System.out.println("손흥민의 값은 " + dic.get("손흥민"));
		dic.delete("손흥민");		
		System.out.println("손흥민의 값은 " + dic.get("손흥민"));	
	}
}

package adapter;

// 요청 해결을 위해
// adapterImpl가 math와 adapterPattern의 연결역할을 한다.
public class AdapterImpl implements Adapter {

	// 기존에 존재하던 함수
	// @Override
	//public Float twiceOf(Float f) {
	//	return (float)Math.twoTime(f.doubleValue());
	// }
	
	// 메인함수의 변경 없이 바뀐 알고리즘 수정
	@Override
	public Float twiceOf(Float f) {
		return Math.doubled(f.doubleValue()).floatValue();
	}

	@Override
	public Float halfOf(Float f) {
		System.out.println("halfOf 함수 호출 시작"); // 로그기록 추가
		return (float) Math.half(f.doubleValue());
	}

}

package prob6;

public class MyBase extends Base {
	@Override
	public void service(String state) {
		// TODO Auto-generated method stub

		if (state.equals("오후")) {
			afternoon();
		} else {
			super.service(state);
		}
	}

	@Override
	public void day() {
		// TODO Auto-generated method stub
		System.out.println("낮에는 열심히 일하자");
	}

	public void afternoon() {
		System.out.println("오후도 낮과 마찬가지로 일해야 합니다");
	}
}

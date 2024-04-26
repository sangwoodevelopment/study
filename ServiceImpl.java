package di.constructor.exam02;

public class ServiceImpl implements MyService {
	String name;
	String msg;
	Logic logic;
	
	public ServiceImpl() {
		
	}
	
	public ServiceImpl(String name, String msg, Logic logic) {
		super();
		this.name = name;
		this.msg = msg;
		this.logic = logic;
	}

	@Override
	public void testService() {
		System.out.println(msg+","+name);
		logic.testLogic();
	}

	
}

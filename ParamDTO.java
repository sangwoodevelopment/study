package test;

public class ParamDTO {
	private String data;
	private String id;
	private String pass;
	public ParamDTO() {
		System.out.println("기본생성자");
	}
	
	
	public ParamDTO(String data, String id, String pass) {
		super();
		this.data = data;
		this.id = id;
		this.pass = pass;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}


	public String getData() {
		System.out.println("getData");
		return data;
	}


	public void setData(String data) {
		this.data = data;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getPass() {
		return pass;
	}


	public void setPass(String pass) {
		this.pass = pass;
	}
	
	
}

package phoneCom;

public class PhoneComDto {

	private int idx; //인덱스
	private String name; //이름
	private String phoneNumber; //전화번호
	private String address; //주소
	private String email; //이메일
	private String regdate; //생일
	private String company; //회사이름

	
	public PhoneComDto(int idx, String name, String phoneNumber, String address, String email, String regdate,
			String company) {
		
		this.idx=idx;
		this.name=name;
		this.phoneNumber=phoneNumber;
		this.address=address;
		this.email=email;
		this.regdate=regdate;
		this.company=company;
		
		
	}
	


	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getPhoneNumber() {
		return phoneNumber;
	}



	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getRegdate() {
		return regdate;
	}



	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}





	public int getIdx() {
		return idx;
	}


	public void setIdx(int idx) {
		this.idx = idx;
	}



	public String getCompany() {
		return company;
	}



	public void setCompany(String company) {
		this.company = company;
	}



}

package kr.green.spring.vo;

<<<<<<< Updated upstream
import java.sql.Date;

=======
>>>>>>> Stashed changes
public class AccountVo {
	//멤버변수의 이름은 테이블 속성의 이름과 일치시켜주는것이 좋다.
	//단 필수는 아니지만 일치하지 않으면 Mapper에서 추가 작업을 해야한다.
	private String id;
	private String pw;
	private String email;
<<<<<<< Updated upstream
	private String gender;
	private Date registered_date;
	private String authority;
	
=======
>>>>>>> Stashed changes
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
<<<<<<< Updated upstream
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getRegistered_date() {
		return registered_date;
	}
	public void setRegistered_date(Date registered_date) {
		this.registered_date = registered_date;
	}
	public String getAuthority() {
		return authority;
	}
	public void setAuthority(String authority) {
		this.authority = authority;
	}
	@Override
	public String toString() {
		return "AccountVo [id=" + id + ", pw=" + pw + ", email=" + email + ", gender=" + gender + ", registered_date="
				+ registered_date + ", authority=" + authority + "]";
	}


=======
	@Override
	public String toString() {
		return "AccountVo [id=" + id + ", pw=" + pw + ", email=" + email + "]";
	}
>>>>>>> Stashed changes
	
}
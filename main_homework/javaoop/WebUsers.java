package javaoop;
/*
 * 处理的信息有用户ID、用户密码、email地址。在建立类的实例时，把以上三个信息都作为构造函数的参数输入，其中用户ID和用户密码时必须的，缺省的email地址是用户ID加上字符串"@gameschool.com"
 * 
 * */
public class WebUsers {
	private String ID;
	private String password;
	private String email;
	WebUsers(String ID,String password){
		this.ID=ID;
	this.password=password;
	this.email=ID+"@gameschool.com";
	}
		
	
WebUsers(String ID,String password,String email){
	this.ID=ID;
	this.password=password;
	this.email=email;}
void show() {
	System.out.println("姓名："+this.ID + "\n密码："+ this.password+"\nEmail地址："+this.email+"\n");
}

//-------------------------------------------

public String getID() {
	return ID;
}
public void setID(String iD) {
	this.ID = iD;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}

}

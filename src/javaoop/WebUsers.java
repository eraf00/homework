package javaoop;
/*
 * �������Ϣ���û�ID���û����롢email��ַ���ڽ������ʵ��ʱ��������������Ϣ����Ϊ���캯���Ĳ������룬�����û�ID���û�����ʱ����ģ�ȱʡ��email��ַ���û�ID�����ַ���"@gameschool.com"
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
	System.out.println("������"+this.ID + "\n���룺"+ this.password+"\nEmail��ַ��"+this.email+"\n");
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

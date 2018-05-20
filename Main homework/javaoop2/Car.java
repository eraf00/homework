package javaoop2;

public class Car {
	
private String color;
private String model;
Car(){
	setColor("ºìÉ«");
	setModel("½Î³µ");
}
Car(String color,String model){
	this.setColor(color);
	this.setModel(model);
}
//---------------------
void showColor(){
	
}
void showModel(){
	
}
//----------------------------
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
}

package Java8;

public class Transaction {
String name;
String sport;
int number;
String timing;

public Transaction(String name, String sport, int number, String timing) {
	super();
	this.name = name;
	this.sport = sport;
	this.number = number;
	this.timing = timing;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getSport() {
	return sport;
}

public void setSport(String sport) {
	this.sport = sport;
}

public int getNumber() {
	return number;
}

public void setNumber(int number) {
	this.number = number;
}

public String getTiming() {
	return timing;
}

public void setTiming(String timing) {
	this.timing = timing;
}

@Override
public String toString() {
	return "Transaction [name=" + name + ", sport=" + sport + ", number="
			+ number + ", timing=" + timing + "]";
}

}


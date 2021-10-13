package Java8;

public class Com   {
public static void main(String[] args) {
Company c = (profit , name) -> {
	return name;
};
System.out.println(c.getCompDetails(10000 , "Techouts"));
}

}

/*
22. Provide an interface Company with
default method of return type double calculating the profit(CP-SP)
static method of return type String which takes (double) input from previous method and returns company name.
Abstract method String getCompDetails(double profit,String name);=>Needs to be implemented using Lambda expression.
*/
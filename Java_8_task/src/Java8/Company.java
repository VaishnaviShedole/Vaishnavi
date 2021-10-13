package Java8;

public interface Company {
	default double profit()
	{
		double cp = 20000;
		double sp = 10000;
	    double p = cp - sp;
	    method(p);
	    return p;
}

public static String method(double p){
	String cName = "Techouts";
	return cName ;
}
abstract String getCompDetails(double profit , String name);
}


/*
22. Provide an interface Company with
default method of return type double calculating the profit(CP-SP)
static method of return type String which takes (double) input from previous method and returns company name.
Abstract method String getCompDetails(double profit,String name);=>Needs to be implemented using Lambda expression.
*/
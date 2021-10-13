package Java8;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class summaryStatistics {
public static void main(String[] args) {
	IntSummaryStatistics summary = IntStream.of(1,2,3,4,5)
			.summaryStatistics();
	System.out.println(summary);
}
}

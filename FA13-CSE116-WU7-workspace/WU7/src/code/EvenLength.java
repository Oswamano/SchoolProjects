package code;

public class EvenLength implements UnaryFunction<String, Boolean>{
	@Override public Boolean apply(String s) {
		return s.length() % 2 == 0;
	}
}

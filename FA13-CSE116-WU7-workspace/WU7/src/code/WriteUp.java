package code;
import code.LRStruct.IAlgo;


public class WriteUp implements IAlgo<Boolean,String,UnaryFunction<String,Boolean>> {

}

@Override
public Boolean emptyCase(LRStruct<String> host,
		UnaryFunction<String, Boolean> arg) {
	
	return false;
}

@Override
public Boolean nonEmptyCase(LRStruct<String> host,
		UnaryFunction<String, Boolean> arg) {
	EvenLength eve = new EvenLength();
	return eve.apply(host.execute(this,arg);
}
}
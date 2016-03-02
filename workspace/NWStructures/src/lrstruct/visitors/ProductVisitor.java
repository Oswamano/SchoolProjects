package lrstruct.visitors;

import lrstruct.LRStruct;
import lrstruct.LRStruct.IAlgo;

public class ProductVisitor implements IAlgo<Integer,Integer,Object> {
	@Override public Integer emptyCase(LRStruct<Integer> host, Object _) {
		return 1;
	}

	@Override public Integer nonEmptyCase(LRStruct<Integer> host, Object _) {
		return host.getDatum() * host.getRest().execute(this, _);
	}
}

package Model.exp;
import Model.adt.IDict;
import Model.adt.IHeap;
import Model.types.IType;
import Model.value.IValue;

import java.lang.reflect.Type;

public interface  Exp {

     IValue eval(IDict<String, IValue> symTable, IHeap<Integer, IValue> heap) throws Exception;
     String toString();
     IType typeCheck(IDict<String, IType> typeEnv) throws Exception;
}

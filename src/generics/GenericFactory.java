package generics;

@SuppressWarnings("rawtypes")
public class GenericFactory<T> {

	Class theClass = null;
	
	public GenericFactory(Class theClass) {
		this.theClass = theClass;
	}
	
	@SuppressWarnings("unchecked")
	public T createInstance() throws IllegalAccessException, InstantiationException {
		return (T) this.theClass.newInstance();
	}
}

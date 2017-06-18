package generics;

import java.util.ArrayList;
import java.util.List;

class Machine {

	@Override
	public String toString() {
		return "I am a Machine";
	}
	
}

class Camera extends Machine {
	
	@Override
	public String toString() {
		return "I am a Camera";
	}
	
	public String snap() {
		return "Snap!";
	}
}

class Clock extends Machine {
	@Override
	public String toString() {
		return "I am a Clock";
	}
	
	public String alarm() {
		return "Alarm!";
	}
}


public class WildCardGenerics {

	public static void main(String[] args) {
		
		ArrayList<Machine> list1 = new ArrayList<Machine>();
		list1.add(new Machine());
		
		ArrayList<Camera> list2 = new ArrayList<Camera>();
		list2.add(new Camera());
		
		ArrayList<Clock> list3 = new ArrayList<Clock>();
		list3.add(new Clock());
		
		System.out.println("---Generics---");
		listGenericObjects(list1);
		listGenericObjects(list2);
		listGenericObjects(list3);
		
		System.out.println("---Machine or its subclass---");
		listMachineOrSubclass(list1);
		listMachineOrSubclass(list2);
		listMachineOrSubclass(list3);
		
		System.out.println("---Camera or its parents---");
		listCameraOrParents(list1);
		listCameraOrParents(list2);
		
		System.out.println("---Clock or its parents---");
		listClockOrParents(list1);
		listClockOrParents(list3);

	}
	
	public static void listGenericObjects(ArrayList<?> list) {
		System.out.println( list.get(0) );
	}
	
	public static void listMachineOrSubclass(ArrayList<? extends Machine> list) {
		for (Machine machine : list) {
			
			if (machine instanceof Camera) {
				System.out.print( machine );
				System.out.println(", and I can " + ((Camera) machine).snap() );
			} else if (machine instanceof Clock) {
				System.out.print( machine );
				System.out.println(", and I can " + ((Clock) machine).alarm() );
			} else {
				System.out.println( machine );
			}
		}
	}
	
	public static void listClockOrParents(ArrayList<? super Clock> list) {
		for (Object obj : list) {
			
			if (obj instanceof Clock) {
				System.out.print( obj );
				System.out.println(", and I can " + ((Clock) obj).alarm() );
			} else {
				System.out.println( obj );
			}
		}
	}
	
	public static void listCameraOrParents(ArrayList<? super Camera> list) {
		for (Object obj : list) {
			
			if (obj instanceof Camera) {
				System.out.print( obj );
				System.out.println(", and I can " + ((Camera) obj).snap() );
			} else {
				System.out.println( obj );
			}
		}
	}

}

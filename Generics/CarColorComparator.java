

import java.util.Comparator;

public class CarColorComparator implements Comparator<Car> {

	@Override
	public int compare(Car o1, Car o2) {
		// TODO Auto-generated method stub
		return o1.color.compareTo(o2.color);
	}
	

}

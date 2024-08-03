import java.util.Date;
import java.util.function.Supplier;

public class SupplierDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		SupplierDemo demo = new SupplierDemo();
//		System.out.println(demo.currentDate());
		
		Supplier<Date> demo1 = ()->new Date();
		System.out.println(demo1.get());
		
	}
	
//	private Date currentDate() {
//		return new Date();
//	}

}

import java.util.Optional;

public class OptionalClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Optional<String> name = getName(1);
		if(name.isPresent()) {
			System.out.println(name.get());
		}
		
		name.ifPresent(System.out::println);
	}
	
	private static Optional<String> getName(int id) {
		//return "Ram";
		//return null;
		
		String name =null;
		//return Optional.of(name);
		return Optional.ofNullable(name);
	}

}

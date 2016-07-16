package stripes.demo.Utils;

public class CommonUtils {

	public static Boolean isNull(Object object) {
		Boolean value=false;
		if(object==null){
			value=true;
		}
		return value;
	}
}

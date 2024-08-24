package LambdaExpression;

import java.util.Optional;

public class OptionalDemo {
	public Optional<String> getusername(Integer id) {
		String name = null;
		if (id == 100) {
			name = "Biswa";
		} else if (id == 101) {
			name = "tiku";
		} else if (id == 102) {
			name = "miku";
		} else if (id == 103) {
			name = "subhu";
		}
		return Optional.ofNullable(name);
	}
}
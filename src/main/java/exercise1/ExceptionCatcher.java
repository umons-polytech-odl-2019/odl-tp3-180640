package exercise1;

public class ExceptionCatcher {
	private final ExceptionThrower exceptionThrower;

	public ExceptionCatcher(ExceptionThrower exceptionThrower) {
		this.exceptionThrower = exceptionThrower;
	}

	void executeExceptionThrowerSafely(int value) throws ACatchedException42 {
		try {
			exceptionThrower.throwACustomExceptionWhenValueIs42(value);
		} catch (RuntimeException e) {
		}
	}
}

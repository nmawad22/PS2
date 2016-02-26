package base;

public class MyInteger {

	private int iValue;

	public MyInteger(int Value) {
		super();
		this.iValue = Value;
	}

	public int getiValue() {
		return iValue;
	}

	public boolean isEven() {

		if (getiValue() % 2 == 0) {

			return true;

		}

		return false;

	}

	// Tests if odd

	public boolean isOdd() {

		if (getiValue() % 2 != 0) {

			return true;

		}

		return false;

	}

	// Tests if prime

	public boolean isPrime() {

		for (int i = 2; i < getiValue(); i++) {

			if (getiValue() % i == 0)

				return false;

		}

		return true;

	}

	public boolean isEven(int Even) {

		if (Even % 2 == 0) {

			return true;

		}

		return false;

	}

	public boolean isOdd(int Odd) {

		if (Odd % 2 != 0) {

			return true;

		}

		return false;

	}

	public boolean isPrime(int Prime) {

		for (int i = 2; i < Prime; i++) {

			if (Prime % i == 0)

				return false;

		}

		return true;

	}

	public boolean isEven(MyInteger a) {

		if (a.isEven()) {

			return true;

		}

		return false;

	}

	public boolean isOdd(MyInteger b) {

		if (b.isOdd()) {

			return true;

		}

		return false;

	}

	public boolean isPrime(MyInteger c) {

		if (c.isPrime()) {

			return true;

		}

		return false;

	}

	public boolean equals(int d) {

		if (d == iValue) {

			return true;

		}

		return false;

	}

	public boolean equals(MyInteger Value) {
		return (Value.getiValue() == iValue);

	}

}

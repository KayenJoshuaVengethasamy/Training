package org.lessons.shop;

public class Door {
//	Object of lock class
	private Lock lock;

	public Door() {
		lock = new Lock(true);
	}

	public Lock getLock() {
		return lock;
	}

	public void shopStatus() {
		if (lock.isLock()) {
			System.out.println("Shop is closed, please visit later");
		} else {
			System.out.println("Welcome, we are open");
		}
	}

	public class Lock {
//		local variable in Lock class
		private boolean lock;

		public Lock(boolean lock) {
			this.lock = lock;
		}

		public boolean isLock() {
			return lock;
		}

		public void setLock(boolean lock) {
			this.lock = lock;
		}

	}

}

package week1.day7.exercises.solution;
public class NewPrimeFinder implements Runnable {
    public long target;
    public long prime;
    public boolean finished = false;
    private Thread runner;

    NewPrimeFinder(long inTarget) throws NegativeNumberException {
        if (inTarget < 0) {
            NegativeNumberException nne = new NegativeNumberException(
                    "Negative numbers not allowed: " + inTarget);
            throw nne;
        }
        target = inTarget;
        if (runner == null) {
            runner = new Thread(this);
            runner.start();
        }
    }

    public void run() {
        long numPrimes = 0;
        long candidate = 2;
        while (numPrimes < target) {
            if (isPrime(candidate)) {
                numPrimes++;
                prime = candidate;
            }
            candidate++;
        }
        finished = true;
    }

    boolean isPrime(long checkNumber) {
        double root = Math.sqrt(checkNumber);
        for (int i = 2; i <= root; i++) {
            if (checkNumber % i == 0)
                return false;
        }
        return true;
    }
}

class NegativeNumberException extends Exception {
    NegativeNumberException() {
        super();
    }

    NegativeNumberException(String message) {
        super(message);
    }
}
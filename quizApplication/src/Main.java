import java.util.*;

public class Main {
    public static void quiz() {
        Scanner si = new Scanner(System.in);
        int count = 0;
        System.out.println("\tQUIZ\nEach MCQ has a time limit of 5 seconds");

        for (int i = 1; i <= 5; i++) {
            String x = "";
            boolean[] timeUp = {false};

            TimerTask task = new TimerTask() {
                @Override
                public void run() {
                    timeUp[0] = true;
                    System.out.println("\nTime limit over for this question\nPress 'n' to move to the next question.");
                }
            };

            Timer timer = new Timer();
            timer.schedule(task, 5000);

            switch (i) {
                case 1:
                    System.out.println("1. Which of the following is not a feature of Object-Oriented Programming in Java?\n" +
                            "\n" +
                            "a. Inheritance\n" +
                            "b. Encapsulation\n" +
                            "c. Polymorphism\n" +
                            "d. Compilation");
                    break;
                case 2:
                    System.out.println("2. What is the default value of a boolean variable in Java?\n" +
                            "\n" +
                            "A. true\n" +
                            "B. false\n" +
                            "C. 0\n" +
                            "D. null");
                    break;
                case 3:
                    System.out.println("3. Which of the following exceptions is thrown when a dividing by zero operation occurs?\n" +
                            "\n" +
                            "a. ArithmeticException\n" +
                            "b. NullPointerException\n" +
                            "c. NumberFormatException\n" +
                            "d. ArrayIndexOutOfBoundsException");
                    break;
                case 4:
                    System.out.println("4. Which keyword is used to handle exceptions in Java?\n" +
                            "\n" +
                            "a. try\n" +
                            "b. catch\n" +
                            "c. throw\n" +
                            "d. All of the above");
                    break;
                case 5:
                    System.out.println("5. Which of the following methods is used to make the main thread wait for another thread to complete?\n" +
                            "\n" +
                            "a. sleep()\n" +
                            "b. wait()\n" +
                            "c. join()\n" +
                            "d. notify()");
                    break;
            }

            System.out.print("Enter choice: ");

            long startTime = System.currentTimeMillis();
            while ((System.currentTimeMillis() - startTime < 5000) && !timeUp[0] && !si.hasNextLine()) {

            }

            if (si.hasNextLine()) {
                x = si.nextLine().trim();
            }

            task.cancel();
            timer.cancel();


            switch (i) {
                case 1:
                    if (x.equals("d")) {
                        count++;
                    }
                    break;
                case 2:
                    if (x.equalsIgnoreCase("b")) {
                        count++;
                    }
                    break;
                case 3:
                    if (x.equals("a")) {
                        count++;
                    }
                    break;
                case 4:
                    if (x.equals("d")) {
                        count++;
                    }
                    break;
                case 5:
                    if (x.equals("c")) {
                        count++;
                    }
                    break;
            }
            System.out.println("---------------------------------------------------------");
        }

        int score = count * 10;
        System.out.println("SCOREBOARD\nYour score: " + score + " / 50");
    }

    public static void main(String[] args) {
        quiz();
    }
}

import java.util.ArrayList;

public class RandomStringGenerator {
    private ArrayList<Range> ranges = new ArrayList<>();

    public void addRange(char start, char end) {
        Range r = new Range(start, end);
        this.ranges.add(r);
    }

    public String nextString(int length) {
        String result = "";
        Range range;
        for (int i = 0; i < length; i++) {
            range = this.ranges.get((int) (Math.random() * this.ranges.size()));
            result += range.nextChar();
        }
        return result;
    }

    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Please provide the length of the random string as an argument.");
            return;
        }

        try {
            int size = Integer.parseInt(args[0]);
            RandomStringGenerator generator = new RandomStringGenerator();
            generator.addRange('a', 'z');
            generator.addRange('A', 'Z');
            String s = generator.nextString(size);
            System.out.println(s);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please provide a valid integer for the string length.");
        }
    }
}

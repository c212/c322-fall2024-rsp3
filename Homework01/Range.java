public class Range {
    private char start, stop;

    public Range(char start, char stop) {
        this.start = start;
        this.stop = stop;
    }

    // Method to generate a random character within the range
    public char nextChar() {
        return (char) (start + (Math.random() * (stop - start + 1)));
    }
}

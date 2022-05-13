public class Matrix {    
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String[] COLORS = {ANSI_BLACK, ANSI_GREEN, ANSI_BLUE, ANSI_PURPLE, ANSI_CYAN, ANSI_WHITE};

    public static void main(String[] args) throws InterruptedException {
        String[] chars = {"日","ﾊ","ﾐ","ﾋ","ｰ","ｳ","ｼ","ﾅ","ﾓ","ﾆ","ｻ","ﾜ","ﾂ","ｵ","ﾘ","ｱ","ﾎ","ﾃ","ﾏ",
        "ｹ","ﾒ","ｴ","ｶ","ｷ","ﾑ","ﾕ","ﾗ","ｾ","ﾈ","ｽ","ﾀ","ﾇ","ﾍ",":","・",".","=","*",
        "+","-","<",">","¦","｜","ﾘ", "0", "1", "2", "3", "4", "5", "7", "8", "9"};
        String character = "", color = "";
        System.out.println();

        while (true) {
            character = chars[(int)(Math.random() * chars.length)];
            color = COLORS[(int)(Math.random() * COLORS.length)];
            System.out.print(color + character + ANSI_RESET);
        }
    }
}

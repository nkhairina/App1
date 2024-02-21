package quiz.quiz3;

class Currency { // Line 3
    String notation = ""; // Line 4

    String getNotation() { // Line 6
        return notation;
    }
}

class USDollar extends Currency { // Line 11
    String notation = "$"; // Line 12

    String getNotation() { // Line 14
        return notation;
    }
}

class Euro extends Currency { // Line 19
    protected String notation = "€"; // Line 20

    protected String getNotation() { // Line 21
        return notation;
    }
}

public class question3 { // Line 27
    public static void main(String[] args) { // Line 28
        Currency c1 = new USDollar(); // Line 29
        System.out.println(c1.notation + ":" + c1.getNotation()); // Line 30

        Currency c2 = new Euro(); // Line 32
        System.out.println(c2.notation + ":" + c2.getNotation()); // Line 33
    }
}

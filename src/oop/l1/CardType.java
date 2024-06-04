package oop.l1;

public enum CardType {
    PRIDE("","","",""),
    COBAGGE("","","",""),
    PRIVATE("","","","");
    private final String code;
    private final String uz;
    private final String en;
    private final String ru;

    CardType(String code, String uz, String en, String ru) {
        this.code = code;
        this.uz = uz;
        this.en = en;
        this.ru = ru;
    }


    public static void main(String[] args) {
        CardType cobagge1 = CardType.COBAGGE;
        CardType2 cobagge2 = CardType2.COBAGGE;
    }
}

class CardType2 {
    public static final CardType2 PRIDE = new CardType2();
    public static final CardType2 COBAGGE = new CardType2();
    public static final CardType2 PRIVATE = new CardType2();
}

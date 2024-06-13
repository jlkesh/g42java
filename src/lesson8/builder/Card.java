package lesson8.builder;

import java.util.UUID;

public class Card {
        private UUID id;
        private String holderName;
        private String pan;
        private String expiry;
        private long balance;
        private long holdAmount;
        private int pinTry = 0;

    public Card() {
    }

    public Card(UUID id, String holderName, String pan, String expiry, long balance, long holdAmount, int pinTry) {
        this.id = id;
        this.holderName = holderName;
        this.pan = pan;
        this.expiry = expiry;
        this.balance = balance;
        this.holdAmount = holdAmount;
        this.pinTry = pinTry;
    }

    public static CardBuilder builder() {
        return new CardBuilder();
    }

    @Override
    public String toString() {
        return "Card{" +
                "id=" + id +
                ", holderName='" + holderName + '\'' +
                ", pan='" + pan + '\'' +
                ", expiry='" + expiry + '\'' +
                ", balance=" + balance +
                ", holdAmount=" + holdAmount +
                ", pinTry=" + pinTry +
                '}';
    }

    public static class CardBuilder {
        private UUID id;
        private String holderName;
        private String pan;
        private String expiry;
        private long balance;
        private long holdAmount;
        private int pinTry = 0;

        public CardBuilder id(UUID id) {
            this.id = id;
            return this;
        }

        public CardBuilder holderName(String holderName) {
            this.holderName = holderName;
            return this;
        }

        public CardBuilder pan(String pan) {
            this.pan = pan;
            return this;
        }

        public CardBuilder expiry(String expiry) {
            this.expiry = expiry;
            return this;
        }

        public CardBuilder balance(long balance) {
            this.balance = balance;
            return this;
        }

        public CardBuilder holdAmount(long holdAmount) {
            this.holdAmount = holdAmount;
            return this;
        }

        public CardBuilder pinTry(int pinTry) {
            this.pinTry = pinTry;
            return this;
        }

        public Card build() {
            return new Card(id, holderName, pan, expiry, balance, holdAmount, pinTry);
        }
    }


}

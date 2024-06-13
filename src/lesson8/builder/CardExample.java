package lesson8.builder;

import java.util.Random;
import java.util.UUID;

public class CardExample {
    public static void main(String[] args) {
        Card.CardBuilder cardBuilder = Card.builder()
                .id(UUID.randomUUID())
                .holderName("Zayniddinov Jahongir")
                .balance(123123123)
                .holdAmount(12312)
                .expiry("12/26")
                .pinTry(2);

        if (new Random().nextBoolean()) {
            cardBuilder.pan("8600909012123434");
        } else {
            cardBuilder.pan("98601212312312312");
        }
        Card card = cardBuilder.build();

        System.out.println("card = " + card);

    }
}

package oop.l1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

public class ChainedConstructor {
    private String body;
    private Map errorData;
    private UUID requestId;
    private boolean success;
/*
    public ChainedConstructor(UUID requestId, Map errorData) {
        this(requestId, null, false);
        this.errorData = errorData;
    }

    public ChainedConstructor(UUID requestId, String body, boolean success) {
        this.success = success;
        this.requestId = requestId;
        this.body = body;
    } */

    public void setRequestId(UUID requestId) {
        this.requestId = requestId;
    }

    public static ChainedConstructor of(UUID requestId) {
        ChainedConstructor chainedConstructor = new ChainedConstructor();
        chainedConstructor.setRequestId(requestId);
        return chainedConstructor;
    }

    public static void main(String[] args) {
        ChainedConstructor chainedConstructor = ChainedConstructor.of(UUID.randomUUID());
        // Set.of()
    }

}

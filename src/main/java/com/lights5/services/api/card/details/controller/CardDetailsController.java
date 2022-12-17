package com.lights5.services.api.card.details.controller;

import com.lights5.services.api.card.details.model.CardDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/v1")
public class CardDetailsController {

    private static final List<CardDetails> CARD_DETAILS = new ArrayList<>();

    static {

        CARD_DETAILS.add(new CardDetails("saikrishna_csk", "SBI", "98765432109876"));
        CARD_DETAILS.add(new CardDetails("saikrishna_csk1", "HDFC", "98765432109876"));
        CARD_DETAILS.add(new CardDetails("saikrishna_csk2", "AXIS", "98765432109876"));
        CARD_DETAILS.add(new CardDetails("saikrishna_csk3", "ICICI", "98765432109876"));
    }

    @GetMapping("/{user_name}/cards")
    public CardDetails getCardDetails(@PathVariable String user_name) {

        return CARD_DETAILS.stream()
                .filter(cardDetail -> user_name.equals(cardDetail.getUserName()))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("user not found"));
    }
}

package com.lights5.services.api.card.details.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CardDetails {

    private String userName;
    private String bankName;
    private String cardNumber;
}

package com.calculator.domain;


import lombok.*;

/**
 * Stores information to identify the user.
 */
@Getter
@ToString
@EqualsAndHashCode
@RequiredArgsConstructor
public final class User {

	private String alias;

}
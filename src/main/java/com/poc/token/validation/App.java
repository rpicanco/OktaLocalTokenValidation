package com.poc.token.validation;

import com.okta.jwt.AccessTokenVerifier;
import com.okta.jwt.Jwt;
import com.okta.jwt.JwtVerificationException;
import com.okta.jwt.JwtVerifiers;

import java.time.Duration;

public class App 
{
    public static void main( String[] args )
    {
        final String API_DEFAULT = "api://default";
        final String ISSUER = "https://dev-90175074.okta.com/oauth2/default";

        AccessTokenVerifier jwtVerifier = JwtVerifiers.accessTokenVerifierBuilder()
                .setIssuer(ISSUER)
                .setAudience(API_DEFAULT)
                .setConnectionTimeout(Duration.ofSeconds(10)) // defaults to 1s
                .build();

        String tokenToValidate = args[0];

        try {
            Jwt jwt = jwtVerifier.decode(tokenToValidate);
            System.out.println("****************");
            jwt.getClaims().forEach((key, value) -> System.out.println(key + ":" + value));
            System.out.println("****************");

        }catch (JwtVerificationException e) {
            System.out.println("Token is not valid. Reason - [ " + e.getCause().getLocalizedMessage() + "]");
        }
    }
}

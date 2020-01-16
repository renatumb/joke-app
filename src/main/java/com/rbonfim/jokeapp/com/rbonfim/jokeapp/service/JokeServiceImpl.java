package com.rbonfim.jokeapp.com.rbonfim.jokeapp.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

public class JokeServiceImpl implements JokeService {

    @Service
    private final ChuckNorrisQuotes chuckNorrisQuote;
        public JokeServiceImpl(ChuckNorrisQuotes chuckNorrisQuote) {
            this.chuckNorrisQuote = chuckNorrisQuote;
    }

    @Override
    public String getJoke() {
        return this.chuckNorrisQuote.getRandomQuote();
    }
}

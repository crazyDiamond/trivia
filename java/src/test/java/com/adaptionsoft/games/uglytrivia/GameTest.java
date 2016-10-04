package com.adaptionsoft.games.uglytrivia;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class GameTest {

    @Test
    public void GameByDefault_puts_50_questions_in_each_list() {
        Game game = new Game();

        assertThat(game.popQuestions.size(), is(50));
        assertThat(game.scienceQuestions.size(), is(50));
        assertThat(game.sportsQuestions.size(), is(50));
        assertThat(game.rockQuestions.size(), is(50));
    }

    @Test
    public void GameByDefault_puts_proper_questions() {
        Game game = new Game();

        assertThat(game.popQuestions.get(0).toString(), is("Pop Question 0"));
        assertThat(game.scienceQuestions.get(1).toString(), is("Science Question 1"));
        assertThat(game.sportsQuestions.get(2).toString(), is("Sports Question 2"));
        assertThat(game.rockQuestions.get(3).toString(), is("Rock Question 3"));
    }

}
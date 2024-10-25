package examples.tests;

import com.intuit.karate.junit5.Karate;

public class recipesRunner {
    @Karate.Test
    public Karate runRecipes()
    {
        return Karate.run("recipes").relativeTo(getClass());
    }

}
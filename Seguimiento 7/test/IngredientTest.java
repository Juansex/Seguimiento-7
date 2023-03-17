import Exceptions.WeightException;
import model.Ingredient;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class IngredientTest {

    private Ingredient ingredient;

    public void setupStage1(){
        try {
            ingredient = new Ingredient("Tomate",245);
        } catch (WeightException e) {
            System.out.println(e);
        }
    }

    @Test
    public void testAddWeight(){
        setupStage1();
        try {
            ingredient.addWeight(54);
            assertEquals(299, ingredient.getWeight());


        } catch (WeightException e) {
            System.out.println(e);
        }
    }
    @Test
    public void testAddWeight2(){
        setupStage1();
        try {
            ingredient.addWeight(-100);

        } catch (WeightException e) {
            System.out.println(e);
            assertEquals(245, ingredient.getWeight());
        }
    }
    @Test
    public void testRemoveWeight(){
        setupStage1();
        try {
            ingredient.removeWeight(45);
            assertEquals(200, ingredient.getWeight());


        } catch (WeightException e) {
            System.out.println(e);
        }
    }
    @Test
    public void testRemoveWeight2(){
        setupStage1();
        try {
            ingredient.removeWeight(-100);

        } catch (WeightException e) {
            System.out.println(e);
            assertEquals(245, ingredient.getWeight());
        }
    }
}

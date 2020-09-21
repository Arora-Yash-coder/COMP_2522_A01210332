package ca.bcit.comp2522.labs.lab02.test;

import ca.bcit.comp2522.labs.lab02.Cat;
import ca.bcit.comp2522.labs.lab02.Dog;
import ca.bcit.comp2522.labs.lab02.IncessantSpeakable;
import ca.bcit.comp2522.labs.lab02.Poodle;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class AnimalTest {
    @Test
    public void testIncessantSpeakableOfCat() {
        Cat c = new Cat();
        Dog d = new Dog();
        assertEquals(false, (c instanceof  IncessantSpeakable));
        assertEquals(false, (d instanceof IncessantSpeakable));
        assertEquals("Woof woof!", d.getSpeak());
    }
}



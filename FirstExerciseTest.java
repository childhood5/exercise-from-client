package com.company.test;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;

import org.junit.Test;

/**
 * Unit test for First exercise
 */
public class FirstExerciseTest {

    @Test
    public void testEmptyStore() {
        HashMap<?, ?>[] foo = new HashMap[0];
        FirstExercise exercise = new FirstExercise();
        String text = exercise.store(foo);
        assertEquals("", text);
    }
    
    @Test
    public void testEmptyKeyAndValueMap() {
        HashMap<?, ?>[] foo = new HashMap[1];
        HashMap<String, String> map = new HashMap<String, String>();
        foo[0] = map;
        FirstExercise exercise = new FirstExercise();
        String text = exercise.store(foo);
        assertEquals("", text);
    }
    
    @Test
    public void testNotEmptyStore() {
        HashMap<?, ?>[] foo = new HashMap[2];
        HashMap<String, String> map1 = new HashMap<String, String>();
        map1.put("key1", "Object1");
        map1.put("key2", "Object2");
        HashMap<String, String> map2 = new HashMap<String, String>();
        map2.put("key3", "Object3");
        foo[0] = map1;
        foo[1] = map2;
        FirstExercise exercise = new FirstExercise();
        String text = exercise.store(foo);
        assertEquals("key1=Object1;key2=Object2\nkey3=Object3\n", text);
    }
    
    @Test
    public void testEmptyLoad() {
        String text = "key1=Object1;key2=Object2\nkey3=Object3\n";
        FirstExercise exercise = new FirstExercise();
        HashMap<?, ?>[] array = exercise.load(text);
        assertEquals("Object1", array[0].get("key1"));
        assertEquals("Object2", array[0].get("key2"));
        assertEquals("Object3", array[1].get("key3"));
    }
}

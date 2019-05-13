package com.company.test;

import java.util.HashMap;
import java.util.Map.Entry;

public class FirstExercise {

    public String store(HashMap<?, ?>[] array) {
        String text = "";
        for (HashMap<?, ?> hashMap : array) {
            for (Entry<?, ?> entry : hashMap.entrySet()) {
                text += entry.getKey() + "=" + entry.getValue() + ";";
            }
            if (!"".equals(text)) {
                text = text.substring(0, text.length() - 1);
                text += "\n";
            }
        }
        return text;
    }

    public HashMap<?, ?>[] load(String text) {
        String[] elementArray = text.split("\n");
        HashMap<?, ?>[] array = new HashMap[elementArray.length];
        for (int i = 0; i < elementArray.length; i++) {
            HashMap<String, String> map = new HashMap<String, String>();
            String[] mapArray = elementArray[i].split(";");
            if (mapArray.length <= 1) {
                getHashMap(mapArray[0], map);
            } else {
                for (String ele : mapArray) {
                    getHashMap(ele, map);
                }
            }
            array[i] = map;
        }
        return array;
    }

    private HashMap<String, String> getHashMap(String mapArray, HashMap<String, String> map) {
        String[] keyAndValue = mapArray.split("=");
        map.put(keyAndValue[0], keyAndValue[1]);
        return map;
    }
}

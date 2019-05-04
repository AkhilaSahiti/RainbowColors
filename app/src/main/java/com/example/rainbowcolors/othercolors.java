package com.example.rainbowcolors;
import java.util.ArrayList;
import java.util.List;

public class othercolors {
    List<String> getothers(String colorType) {
        List<String> others = new ArrayList<>();
        if(colorType.equals("Green")) {
            others.add("dark green");
            others.add("light green");

        }
        return others;


    }
}

//
//  Main.java
//  ex3-killEnemies
//
//  Created by Fernando Pastor on 24/7/24.
//

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        ArrayList<Character> characters = new ArrayList<>();

        for(int i = 0; i < 5; i++) {
            characters.add(new Friend());
            characters.add(new Enemy());
        }

        Collections.shuffle(characters);

        int count = 0;
        for(Character character :characters) {
            if(character instanceof Friend) {
                System.out.println("Character " + count++ + " is a friend! :-)" );
            }
            else {
                System.out.println("Character " + count++ + " is an enemy! kill it!" );
                ((Enemy)character).kill();
            }
        }

    }
}
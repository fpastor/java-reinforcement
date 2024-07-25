//
//  Enemy.java
//  ex3-killEnemies
//
//  Created by Fernando Pastor on 24/7/24.
//

public class Enemy implements Character {

    @Override
    public boolean isEnemy() {
        return true;
    }

    public void kill() {
        System.out.println("Ahhhggg, you killed me, bastard!");
    }

}

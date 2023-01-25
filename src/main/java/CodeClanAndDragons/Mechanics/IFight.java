package CodeClanAndDragons.Mechanics;

import CodeClanAndDragons.Enemy.Enemy;
import CodeClanAndDragons.Player.Player;

public interface IFight {


    public void attack(Enemy enemy);
    public void attack(Player player);

}

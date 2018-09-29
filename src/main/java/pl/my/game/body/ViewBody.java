package pl.my.game.body;

import pl.my.game.controllers.newGame.NamePaneController;
import pl.my.game.database.models.Player;
import pl.my.game.modelFX.LevelModel;
import pl.my.game.modelFX.PlayerModel;

public class ViewBody {

    private PlayerModel playerModel = new PlayerModel();
    private LevelModel levelModel;
    private Player player=playerModel.loadPlayerFromDB(NamePaneController.counter) ;

    public int computeMaxEnergy(){
        double maxEne=(82+player.getLevel()*10)+((100+player.getLevel()*10)*player.getAgility()*0.01);
        return (int)maxEne;
    }
    public int computeMaxHealth(){
        double maxHp=(82+player.getLevel()*10)+((100+player.getLevel()*10)*player.getStrange()*0.01);
        return (int)maxHp;
    }

    public int computeExp(){
        levelModel = new LevelModel();
        int exp=levelModel.loadLevelFromDB(player.getLevel());
        return exp;
    }

}

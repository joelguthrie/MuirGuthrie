/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlLayer;



import modelLayer.Game;
import modelLayer.Location;
import modelLayer.Map;
import starwarsgame.StarWarsGame;

/**
 *
 * @author Joel
 */
public class mapControl {

    public static Map createMap() {
      Map map = new Map(5,5);
      
      Scene[] scenes = createScenes();
      
      assignScenesToLocations(map, scenes);
      
      return map;
      
    }

    public enum SceneType {
        start,
        spaceship,
        forcegame,
        endboss,
        finish;
    }
    
    private static Scene[] createScenes() {
              Game game = StarWarsGame.getCurrentGame;
              
              Scene[] scenes = new Scene[SceneType.values().length];
              
              Scene startingScene = new Scene();
              startingScene.setDescription(
              "\nAnd now we do the starting scene!");
              startingScene.setMapSymbol("ST");
              startingScene.setBlocked(false);
              startingScene.setTravelTime(240);
              scenes[SceneType.start.ordinal()] = startingScene;
        
              Scene finishScene = new Scene();
              finishScene.setDescription(
              "\nAnd now we do the finish scene!");
              finishScene.setMapSymbol("ST");
              finishScene.setBlocked(false);
              finishScene.setTravelTime(240);
              scenes[SceneType.finish.ordinal()] = startingScene;
    return scenes;
    }
    private static void assignScenesToLocations(Map map, Scene[] scenes) {
      location[0][0].setScene(scenes[SceneType.start.ordinal()]);
      Location[5][5].setScene(scenes[SceneType.finish.ordinal()]);

    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlLayer;

import java.util.Map;
import javafx.scene.Scene;
import modelLayer.MapModel;

/**
 *
 * @author Joel
 */
public class mapControl {

    public static MapModel createMap() {
      MapModel map = new MapModel (5,5);
      
      Scene[] scenes = createScenes();
      
      assignScenesToLocations(map, scenes);
      
      return map;
      
    }

    private static Scene[] createScenes() {
               System.out.println("the createscenes fuction was called.");
               return null;
    }

    private static void assignScenesToLocations(Map map, Scene[] scenes) {
                System.out.println("the assignScenestolocation fuction was called.");
    }
    
}

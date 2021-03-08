//This factory is essentially a hub for our enemy ship.
// With this design pattern, we are able to do all of our decision making in this class instead of having it all in the main.
//We are encapsulating the modification to this class. Thus, this is where we would come if we have to modify something

public class EnemyShipFactory {

    public EnemyShip makeEnemyShip(String newShipType){

        EnemyShip newShip = null;

        if(newShipType.equals("U")){
            return new UFOEnemyShip();
        } else
            if(newShipType.equals("R")){
                return new RocketEnemyShip();
            } else
                if(newShipType.equals("B")){
                    return new BigUFOEnemyShip();
                }else return null;
    }


}

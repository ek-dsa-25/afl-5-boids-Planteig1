package main.behavior;
import java.util.List;

import main.behavior.BehaviorStrategy;
import main.model.Boid;
import main.simulation.Forces;
import main.simulation.Vector2D;

import java.util.Random;

public class RandomBehavior implements BehaviorStrategy {

    @Override
    public Forces calculateForces(Boid boid, List<Boid> neighbors) {
    if (neighbors.isEmpty()) {
        return new Forces();
    }

   
    return new Forces(separation, alignment, cohesion);
    }

    
    
}

package UI;

public class Energy extends Formula{
    // Asher Adeyemi BHU/22/04/05/0128
    float kineticEnergy(float mass, float velocity) {
        return mass * velocity * velocity ;
    }


    // Sharon Danjuma BHU/22/04/05/0101
    float gravitationalEnergy(float mass, float height)
    {
        return mass * getGravity() * height;
    }

  
     // David Okoro Anya BHU/22/04/05/0130
    int totalEnergy(int pEnergy, int kEnergy) {
        return pEnergy + kEnergy;
    }
    // Bassey Emmanuel BHU/19/04/02/0005
    float potentialEnergy(float mass, float height){
        float v = mass * getGravity() * height;
        final float v1 = v;
        return v1;
    }
}
    
    private float getGravity() {
    }



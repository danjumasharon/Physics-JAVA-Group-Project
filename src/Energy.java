package UI;

public class Energy extends Formula{
    // Asher Adeyemi BHU/22/04/05/0128
    float kineticEnergy(float mass, float velocity) {
        return mass * velocity * velocity ;
    }


    // Sharon
    float gravitationalEnergy(float mass, float height)
    {
        return mass * getGravity() * height;
    }
}
       //
    int totalEnergy(int pEnergy, int kEnergy) {
        return pEnergy + kEnergy;
    }
     //
    float potentialEnergy(float mass, float height) {
        return mass * getGravity() * height;
    }

    private float getGravity() {
    }

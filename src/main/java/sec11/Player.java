package sec11;

import java.util.Arrays;
import java.util.List;

public class Player implements ISaveable {

    private String name;
    private String weapon;
    private int hitPoints;
    private int strength;

    public Player(String name, int hitPoints, int strength) {
        this.name = name;
        this.weapon = "Sword";
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public List<String> write() {

        String[] array = {this.name, Integer.toString(this.hitPoints), Integer.toString(this.strength), this.weapon};
//        List<String> data = Arrays.asList(array);

        return Arrays.asList(array);

//        List<String> data = new ArrayList<>();
//        data.add(this.name);
//        data.add(Integer.toString(this.hitPoints));
//        data.add(Integer.toString(this.strength));
//        data.add(this.weapon);
//        return data;
    }

    @Override
    public void read(List<String> data) {
        if (data != null && data.size() > 0) {
            this.name = data.get(0);
            this.hitPoints = Integer.parseInt(data.get(1));
            this.strength = Integer.parseInt(data.get(2));
            this.weapon = data.get(3);
        }
    }

    @Override
    public String toString() {
        // Player{name='Tim', hitPoints=10, strength=15, weapon='Sword'}
        String print = getClass().getSimpleName() +                 """
                        {name='%s', hitPoints=%d, strength=%d, weapon='%s'}""";

        return String.format(print, this.name, this.hitPoints, this.strength, this.weapon);
    }
}

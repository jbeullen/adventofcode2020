package be.upgrade.it.adventofcode2020.day12;

public class RainRisk2 {
    private final String[] navigation;
    private int x,y;
    private int xWaypoint,yWaypoint;

    public RainRisk2(String[] navigation, int xWaypoint, int yWaypoint) {
        this.navigation = navigation;
        this.xWaypoint = xWaypoint;
        this.yWaypoint = yWaypoint;
    }

    public int getManhattanDistance(){
        for (String s : navigation) {
            process(s);
        }


        return Math.abs(x) + Math.abs(y);
    }

    private void process(String s) {
        String command = s.substring(0, 1);
        int value = Integer.parseInt(s.substring(1));

        switch (command){
            case "E":
                xWaypoint += value;
                break;
            case "N":
                yWaypoint += value;
                break;
            case "S":
                yWaypoint -= value;
                break;
            case "W":
                xWaypoint -= value;
                break;
            case "F":
                x += (xWaypoint * value);
                y += (yWaypoint * value);
                break;
            case "L":
                rotateWaypoint(value, false);
                break;
            case "R":
                rotateWaypoint(value, true);
                break;
        }



    }

    private void rotateWaypoint(int value, boolean clockwise){
        int i = value / 90;
        int xWaypoint = this.xWaypoint;
        int yWaypoint = this.yWaypoint;

        if(i == 2){
            xWaypoint = -this.xWaypoint;
            yWaypoint = -this.yWaypoint;
        }

        if((clockwise && i == 1) || (!clockwise && i== 3)){
            xWaypoint = this.yWaypoint;
            yWaypoint = -this.xWaypoint;
        }

        if((clockwise && i == 3) || (!clockwise && i== 1)){
            xWaypoint = -this.yWaypoint;
            yWaypoint = this.xWaypoint;
        }

        this.xWaypoint = xWaypoint;
        this.yWaypoint = yWaypoint;
    }

}

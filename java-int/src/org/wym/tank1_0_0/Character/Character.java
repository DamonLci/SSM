package org.wym.tank1_0_0.Character;

import org.wym.tank1_0_0.Jframe.Jpanel;
import org.wym.tank1_0_0.Jframe.Map;

import java.awt.*;

public class Character {
    protected int x;
    protected int y;
    protected int direction;
    protected boolean isLive;
    protected int imgIndex;

    public void drawGrass(Graphics g, Image gas, Jpanel jp) {
        if (Map.MAP[y][x] == Map.GAS) {
            g.drawImage(gas, x * Map.CELL - 3, y * Map.CELL - 3, (x + 1) * Map.CELL, (y + 1) * Map.CELL, 0, 0, 87, 83, jp);
        }
    }


}

package com.aricneto.twistytimer.layout.isometric.paths;

import com.aricneto.twistytimer.layout.isometric.Path;
import com.aricneto.twistytimer.layout.isometric.Point;

/**
 * Created by fabianterhorst on 01.04.17.
 */

public class Rectangle extends Path {

    public Rectangle(Point origin, int width, int height) {
        super();
        push(origin);
        push(new Point(origin.getX() + width, origin.getY(), origin.getZ()));
        push(new Point(origin.getX() + width, origin.getY() + height, origin.getZ()));
        push(new Point(origin.getX(), origin.getY() + height, origin.getZ()));
    }
}

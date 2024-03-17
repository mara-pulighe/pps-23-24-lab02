package Taskpart4

import java.awt.Shape
import scala.math.Pi

object geometricshapes extends App:
    enum Shape:
        case Rectangle(height: Double, width:Double)
        case Circle (radius: Double)
        case Square (side: Double)

    object Shape:
        def perimeter(shape: Shape): Double = shape match
            case Shape.Rectangle(height,width) => 2 * (width+height)
            case Shape.Circle(radius) =>  2 * Pi *radius
            case Shape.Square(side) => side * 4

        def scale(shape: Shape, alpha: Double): Shape = shape match
            case Rectangle(height,width) => Rectangle(height* alpha,width *alpha)
            case Circle(radius) =>  Circle(radius * alpha)
            case Square(side) => Square(side * alpha)
        

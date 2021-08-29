package kotlinx.css

import kotlinx.css.properties.*
import kotlin.test.Test
import kotlin.test.assertEquals

class TestGradient {
    @Test
    fun testLinearGradient() {
        val gradient = linearGradient {
            colorStop(Color.white)
            colorStop(Color.red, 10.pct)
            colorStop(Color.green, 30.pct, 40.pct)
            colorStop(Color("#0000FF"))
        }

        assertLinearGradient("linear-gradient(white, red 10%, green 30% 40%, #0000FF)", gradient)
    }

    @Test
    fun testLinearGradientWithAngle() {
        val gradient = linearGradient(120.deg) {
            colorStop(Color.white)
            colorStop(Color.red, 10.pct)
            colorStop(Color.green, 30.pct, 40.pct)
            colorStop(Color("#0000FF"))
        }

        assertLinearGradient("linear-gradient(120deg, white, red 10%, green 30% 40%, #0000FF)", gradient)
    }

    @Test
    fun testLinearGradientWithSideOrCorner() {
        val gradient = fun(sideOrCorner: GradientSideOrCorner) = linearGradient(sideOrCorner) {
            colorStop(Color.white)
            colorStop(Color.black)
        }

        assertLinearGradient("linear-gradient(to left, white, black)", gradient(GradientSideOrCorner.ToLeft))
        assertLinearGradient("linear-gradient(to left top, white, black)", gradient(GradientSideOrCorner.ToLeftTop))
        assertLinearGradient(
            "linear-gradient(to left bottom, white, black)",
            gradient(GradientSideOrCorner.ToLeftBottom)
        )
        assertLinearGradient("linear-gradient(to right, white, black)", gradient(GradientSideOrCorner.ToRight))
        assertLinearGradient("linear-gradient(to right top, white, black)", gradient(GradientSideOrCorner.ToRightTop))
        assertLinearGradient(
            "linear-gradient(to right bottom, white, black)",
            gradient(GradientSideOrCorner.ToRightBottom)
        )
        assertLinearGradient("linear-gradient(to top, white, black)", gradient(GradientSideOrCorner.ToTop))
        assertLinearGradient("linear-gradient(to bottom, white, black)", gradient(GradientSideOrCorner.ToBottom))
    }

    @Test
    fun testRadialGradient() {
        assertRadialGradient("radial-gradient(yellow, green)", radialGradient {
            colorStop(Color.yellow)
            colorStop(Color.green)
        })
        assertRadialGradient("radial-gradient(ellipse at center, yellow 2%, green 100%)", radialGradient {
            ellipse()
            at(RelativePosition.center)
            colorStop(Color.yellow, 2.pct)
            colorStop(Color.green, 100.pct)
        })
        assertRadialGradient("radial-gradient(circle farthest-corner at 50% 50%, yellow, green)", radialGradient {
            circle(RadialGradientExtent.farthestCorner)
            at(RelativePosition.offset(xOffset = 50.pct, yOffset = 50.pct))
            colorStop(Color.yellow)
            colorStop(Color.green)
        })
        assertRadialGradient("radial-gradient(circle, yellow, green)", radialGradient {
            circle()
            colorStop(Color.yellow)
            colorStop(Color.green)
        })

        assertRadialGradient(
            "radial-gradient(circle farthest-side at left bottom, red, yellow 50px, green)",
            radialGradient {
                circle(RadialGradientExtent.farthestSide)
                at(RelativePosition.leftBottom)
                colorStop(Color.red)
                colorStop(Color.yellow, 50.px)
                colorStop(Color.green)
            })

        assertRadialGradient("radial-gradient(circle closest-side at 20px 30px, red, yellow, green)", radialGradient {
            circle(RadialGradientExtent.closestSide)
            at(RelativePosition.offset(20.px, 30.px))
            colorStop(Color.red)
            colorStop(Color.yellow)
            colorStop(Color.green)
        })
        assertRadialGradient("radial-gradient(ellipse 20px 30px at 20px 30px, red, yellow, green)", radialGradient {
            ellipse(20.px, 30.px)
            at(RelativePosition.offset(20.px, 30.px))
            colorStop(Color.red)
            colorStop(Color.yellow)
            colorStop(Color.green)
        })
    }

    @Test
    fun testRepeatingLinearGradient() {
        assertRepeatingLinearGradient(
            "repeating-linear-gradient(45deg, blue, red)",
            linearGradient(45.deg, repeat = true) {
                colorStop(Color.blue)
                colorStop(Color.red)
            }
        )
        assertRepeatingLinearGradient(
            "repeating-linear-gradient(to left top, blue, red)",
            linearGradient(GradientSideOrCorner.ToLeftTop, repeat = true) {
                colorStop(Color.blue)
                colorStop(Color.red)
            }
        )
        assertRepeatingLinearGradient(
            "repeating-linear-gradient(0deg, blue, green 40%, red)",
            linearGradient(0.deg, repeat = true) {
                colorStop(Color.blue)
                colorStop(Color.green, start = 40.pct)
                colorStop(Color.red)
            }
        )
    }

    @Test
    fun testRepeatingRadialGradient() {
        assertRepeatingRadialGradient(
            "repeating-radial-gradient(black, black 5px, white 5px, white 10px)",
            radialGradient(repeat = true) {
                colorStop(Color.black)
                colorStop(Color.black, 5.px)
                colorStop(Color.white, 5.px)
                colorStop(Color.white, 10.px)
            }
        )
        assertRepeatingRadialGradient(
            "repeating-radial-gradient(ellipse farthest-corner, red, black 5%, blue 5%, green 10%)",
            radialGradient(repeat = true) {
                ellipse(RadialGradientExtent.farthestCorner)
                colorStop(Color.red)
                colorStop(Color.black, 5.pct)
                colorStop(Color.blue, 5.pct)
                colorStop(Color.green, 10.pct)
            }
        )
    }

    private fun assertLinearGradient(expected: String, gradient: Image) {
        assertEquals(expected, gradient.value, "Linear gradient is built incorrectly")
    }

    private fun assertRepeatingLinearGradient(expected: String, gradient: Image) {
        assertEquals(expected, gradient.value, "Repeating linear gradient is built incorrectly")
    }

    private fun assertRadialGradient(expected: String, gradient: Image) {
        assertEquals(expected, gradient.value, "Radial gradient is built incorrectly")
    }

    private fun assertRepeatingRadialGradient(expected: String, gradient: Image) {
        assertEquals(expected, gradient.value, "Linear radial gradient is built incorrectly")
    }
}
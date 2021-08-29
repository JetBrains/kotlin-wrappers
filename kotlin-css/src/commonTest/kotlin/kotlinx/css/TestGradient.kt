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

        assertEquals("linear-gradient(white, red 10%, green 30% 40%, #0000FF)", gradient.value, "Linear gradient is built incorrectly")
    }

    @Test
    fun testLinearGradientWithAngle() {
        val gradient = linearGradient(120.deg) {
            colorStop(Color.white)
            colorStop(Color.red, 10.pct)
            colorStop(Color.green, 30.pct, 40.pct)
            colorStop(Color("#0000FF"))
        }

        assertEquals("linear-gradient(120deg, white, red 10%, green 30% 40%, #0000FF)", gradient.value, "Linear gradient is built incorrectly")
    }

    @Test
    fun testLinearGradientWithSideOrCorner() {
        val gradient = fun (sideOrCorner: GradientSideOrCorner) = linearGradient(sideOrCorner) {
            colorStop(Color.white)
            colorStop(Color.black)
        }.value

        assertEquals("linear-gradient(to left, white, black)", gradient(GradientSideOrCorner.ToLeft), "Linear gradient with <side-or-corner> is built incorrectly")
        assertEquals("linear-gradient(to left top, white, black)", gradient(GradientSideOrCorner.ToLeftTop), "Linear gradient with <side-or-corner> is built incorrectly")
        assertEquals("linear-gradient(to left bottom, white, black)", gradient(GradientSideOrCorner.ToLeftBottom), "Linear gradient with <side-or-corner> is built incorrectly")
        assertEquals("linear-gradient(to right, white, black)", gradient(GradientSideOrCorner.ToRight), "Linear gradient with <side-or-corner> is built incorrectly")
        assertEquals("linear-gradient(to right top, white, black)", gradient(GradientSideOrCorner.ToRightTop), "Linear gradient with <side-or-corner> is built incorrectly")
        assertEquals("linear-gradient(to right bottom, white, black)", gradient(GradientSideOrCorner.ToRightBottom), "Linear gradient with <side-or-corner> is built incorrectly")
        assertEquals("linear-gradient(to top, white, black)", gradient(GradientSideOrCorner.ToTop), "Linear gradient with <side-or-corner> is built incorrectly")
        assertEquals("linear-gradient(to bottom, white, black)", gradient(GradientSideOrCorner.ToBottom), "Linear gradient with <side-or-corner> is built incorrectly")
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

        assertRadialGradient("radial-gradient(circle farthest-side at left bottom, red, yellow 50px, green)", radialGradient {
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

    private fun assertRadialGradient(expected: String, gradient: Image) {
        assertEquals(expected, gradient.value, "Radial gradient is built incorrectly")
    }
}
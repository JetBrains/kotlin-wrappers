package kotlinx.css

import kotlinx.css.properties.GradientSideOrCorner
import kotlinx.css.properties.deg
import kotlinx.css.properties.linearGradient
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

}
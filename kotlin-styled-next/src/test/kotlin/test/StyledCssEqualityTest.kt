package test

import kotlinx.css.*
import kotlinx.css.properties.KeyframesBuilder
import kotlinx.css.properties.Timing
import kotlinx.css.properties.s
import styled.*
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals

/**
 * Check that [StyledCss] and [StyledKeyframes] with the same content are equal and have the same hash code
 */
class StyledCssEqualityTest : TestBase() {
    @Test
    fun simpleCssBuilders() {
        val first = CssBuilder().apply {
            addSomeCss()
        }

        val second = CssBuilder().apply {
            addSomeCss()
        }

        assertEquals(first.hashCode(), second.hashCode())
        assertEquals(first, second)
    }

    @Test
    fun assertDifferentOrderNotEquals() {
        val first = CssBuilder().apply {
            backgroundColor = Color.blue
            height = 18.px
        }

        val second = CssBuilder().apply {
            height = 18.px
            backgroundColor = Color.blue
        }

        assertNotEquals(first, second)
    }

    @Test
    fun assertKeyframesEquals() {
        val first = KeyframesBuilder().apply {
            addRotation()
        }
        val second = KeyframesBuilder().apply {
            addRotation()
        }
        assertEquals(first.hashCode(), second.hashCode())
        assertEquals(first, second)
    }

    @Test
    fun assertCssWithAnimationEquals() {
        val first = CssBuilder().apply {
            backgroundColor = Color.blue
            animation(5.s, Timing.linear) {
                addRotation()
            }
            padding = "1px 2px 3px 4px"
        }

        val second = CssBuilder().apply {
            backgroundColor = Color.blue
            animation(5.s, Timing.linear) {
                addRotation()
            }
            padding = "1px 2px 3px 4px"
        }

        assertEquals(first.hashCode(), second.hashCode())
        assertEquals(first, second)
    }
}
package test

import kotlinx.css.*
import react.RProps
import react.fc
import runTest
import styled.GlobalStyles
import styled.css
import styled.styledDiv
import kotlin.test.Test
import kotlin.test.assertEquals

class ElementTest : TestBase() {
    @Test
    fun min() = runTest {
        val styledComponent = fc<RProps> {
            styledDiv {
                css {
                    paddingLeft = min(1.px, 2.px)
                }
            }
        }
        val element = clearAndInject(styledComponent)
        assertEquals("1px", element.getStyle().paddingLeft)
    }

    @Test
    fun max() = runTest {
        val styledComponent = fc<RProps> {
            styledDiv {
                css {
                    paddingLeft = max(1.px, 2.px)
                }
            }
        }
        val element = clearAndInject(styledComponent)
        assertEquals("2px", element.getStyle().paddingLeft)
    }

    @Test
    fun clamp() = runTest {
        val styledComponent = fc<RProps> {
            styledDiv {
                css {
                    paddingTop = clamp(2.px, 3.px, 4.px) // value inside bounds
                    paddingLeft = clamp(2.px, 1.px, 4.px) // value lesser than lower bound
                    paddingRight = clamp(2.px, 5.px, 4.px) // value greater than higher bound
                }
            }
        }
        val element = clearAndInject(styledComponent)
        assertEquals("3px", element.getStyle().paddingTop)
        assertEquals("2px", element.getStyle().paddingLeft)
        assertEquals("4px", element.getStyle().paddingRight)
    }

    @Test
    fun addsValidRulesIfSomeInvalid() = runTest {
        val firstRule = CssBuilder().apply { ".$firstClassName" { color = firstColor } }.toString()
        val secondRule = "Some invalid css for browser"
        val thirdRule = CssBuilder().apply { ".$secondClassName" { backgroundColor = secondColor } }.toString()
        GlobalStyles.sheet.scheduleToInject(listOf(firstRule, secondRule, thirdRule))
        GlobalStyles.sheet.injectScheduled()
        assertCssInjected(firstClassName, listOf("color" to firstColor.toString()))
        assertCssInjected(secondClassName, listOf("background-color" to secondColor.toString()))
    }
}
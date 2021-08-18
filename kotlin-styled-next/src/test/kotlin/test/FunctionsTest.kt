package test

import kotlinx.css.paddingLeft
import kotlinx.css.paddingRight
import kotlinx.css.paddingTop
import kotlinx.css.px
import react.Props
import react.fc
import runTest
import styled.css
import styled.styledDiv
import kotlin.test.Test
import kotlin.test.assertEquals

class FunctionsTest : TestBase() {
    @Test
    fun min() = runTest {
        val styledComponent = fc<Props> {
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
        val styledComponent = fc<Props> {
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
        val styledComponent = fc<Props> {
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
}

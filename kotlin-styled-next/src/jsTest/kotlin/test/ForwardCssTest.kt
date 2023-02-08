package test

import kotlinx.css.backgroundColor
import kotlinx.css.color
import kotlinx.css.rgb
import react.*
import runTest
import styled.CustomStyledProps
import styled.css
import styled.forwardCss
import styled.styledDiv
import kotlin.test.Test
import kotlin.test.assertEquals

open class ForwardCssTest : TestBase() {
    val aComponent = fc<CustomStyledProps> { props ->
        styledDiv {
            css {
                color = rgb(2, 2, 2)
                backgroundColor = rgb(3, 3, 3)
                specific {
                    props.forwardCss(this)
                }
            }
        }
    }

    @Test
    fun forwardCssForwards() = runTest {
        val styledComponent = fc<Props> {
            aComponent {
                css {
                    color = rgb(1, 1, 1)
                }
            }
        }
        val styledElement = clearAndInject(styledComponent)
        assertEquals(rgb(1, 1, 1).toString(), styledElement.color())
        assertEquals(rgb(3, 3, 3).toString(), styledElement.getStyle().backgroundColor)
    }
}

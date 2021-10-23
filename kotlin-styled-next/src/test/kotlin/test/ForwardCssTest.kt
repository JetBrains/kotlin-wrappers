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

interface SearchBarProps : Props {
    var onClick: () -> Unit
    var onChange: (String) -> () -> Unit
    var inStockOnly: Boolean
    var filterText: String
}


open class ForwardCssTest : TestBase() {
    inner class AComponent(props: CustomStyledProps) : RComponent<CustomStyledProps, State>(props) {
        override fun RBuilder.render() {
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
    }

    inner class BComponent(props: CustomStyledProps) : RComponent<CustomStyledProps, State>(props) {
        override fun RBuilder.render() {
            child(AComponent::class) {
                css {
                    color = rgb(1, 1, 1)
                }
            }
        }
    }

    @Test
    fun forwardCssForwards() = runTest {
        val styledComponent = fc<Props> {
            child(BComponent::class) {}
        }
        val styledElement = clearAndInject(styledComponent)
        assertEquals(rgb(1, 1, 1).toString(), styledElement.color())
        assertEquals(rgb(3, 3, 3).toString(), styledElement.getStyle().backgroundColor)
    }
}
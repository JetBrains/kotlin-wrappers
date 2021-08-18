package test

import kotlinx.css.*
import react.Props
import react.dom.div
import react.fc
import runTest
import styled.css
import styled.styledDiv
import styled.styledSpan
import kotlin.test.Test
import kotlin.test.assertEquals

/**
 * Check every public interface function in [CssBuilder]
 */
class AtRulesTest : TestBase() {
    @Test
    fun supports() = runTest {
        val query = "(color: $firstColor)"
        val styledComponent = fc<Props> {
            styledDiv {
                css {
                    supports(query) {
                        "div" {
                            color = firstColor
                        }
                    }
                }
                div {}
            }
        }
        val element = clearAndInject(styledComponent)
        assertEquals(firstColor.toString(), element.childAt(0).color())
        assertCssInjected("@supports $query", listOf("color" to firstColor.toString()))
    }

    @Test
    fun fontFace() = runTest {
        val styledComponent = fc<Props> {
            styledDiv {
                css {
                    fontFace {
                        fontFamily = "Roboto"
                    }
                }
            }
        }
        clearAndInject(styledComponent)
        assertCssInjected("@font-face", listOf("font-family" to "Roboto"))
    }

    @Test
    fun retina() = runTest {
        val styledComponent = fc<Props> {
            styledDiv {
                css {
                    fontSize = 15.px
                    retina {
                        fontSize = 18.px
                    }
                }
            }
        }
        clearAndInject(styledComponent)
        assertCssInjected(
            "@media (-webkit-min-device-pixel-ratio: 2), (min-resolution: 192dpi)",
            listOf("font-size" to "18px")
        )
    }

    @Test
    fun media() = runTest {
        val query = "only screen and (max-width: 600px)"
        val styledComponent = fc<Props> {
            styledSpan {
                css {
                    media(query) {
                        textTransform = TextTransform.capitalize
                    }
                }
            }
        }
        clearAndInject(styledComponent)
        assertCssInjected(
            "@media $query", listOf(
                "text-transform" to "capitalize",
            )
        )
    }
}

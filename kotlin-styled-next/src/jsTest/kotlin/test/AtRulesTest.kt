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
    fun container() = runTest {
        val query = "(max-width: 600px)"
        val styledComponent = fc<Props> {
            styledSpan {
                css {
                    container(query) {
                        textTransform = TextTransform.capitalize
                    }
                }
            }
        }
        clearAndInject(styledComponent)
        assertCssInjected(
            "@container $query",
            "text-transform" to "capitalize",
        )
    }

    @Test
    fun containerName() = runTest {
        val query = "(max-width: 600px)"
        val containerName = ContainerName("foo")
        val styledComponent = fc<Props> {
            styledSpan {
                css {
                    container(containerName, query) {
                        textTransform = TextTransform.capitalize
                    }
                }
            }
        }
        clearAndInject(styledComponent)
        assertCssInjected(
            "@container ${containerName.value} $query",
            "text-transform" to "capitalize",
        )
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
        assertCssInjected("@font-face", "font-family" to "Roboto")
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
            "@media $query",
            "text-transform" to "capitalize",
        )
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
            "font-size" to "18px"
        )
    }

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
        assertCssInjected("@supports $query", "color" to firstColor.toString())
    }

    @Test
    fun supportsSelector() = runTest {
        val query = "(h2 > p)"
        val styledComponent = fc<Props> {
            styledDiv {
                css {
                    supportsSelector(query) {
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
        assertCssInjected("@supports selector($query)", "color" to firstColor.toString())
    }
}

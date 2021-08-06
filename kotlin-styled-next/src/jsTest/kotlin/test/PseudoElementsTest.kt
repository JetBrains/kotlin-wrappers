package test

import kotlinx.browser.window
import kotlinx.css.CssBuilder
import kotlinx.css.color
import react.RProps
import react.dom.attrs
import react.fc
import runTest
import styled.css
import styled.styledDiv
import styled.styledInput
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals

/**
 * Check every public interface function in [CssBuilder]
 */
class PseudoElementsTest : TestBase() {
    @Test
    fun afterPseudoElement() = runTest {
        val styledComponent = fc<RProps> {
            styledDiv {
                css {
                    after {
                        color = firstColor
                    }
                }
            }
        }
        val element = clearAndInject(styledComponent)
        assertEquals(firstColor.toString(), element.color(":after"))
        assertNotEquals(firstColor.toString(), element.color())
    }

    @Test
    fun beforePseudoElement() = runTest {
        val styledComponent = fc<RProps> {
            styledDiv {
                css {
                    before {
                        color = firstColor
                    }
                }
            }
        }
        val element = clearAndInject(styledComponent)
        assertEquals(firstColor.toString(), element.color(":before"))
        assertNotEquals(firstColor.toString(), element.color())
    }

    @Test
    fun placeholder() = runTest {
        val styledComponent = fc<RProps> {
            styledInput {
                attrs {
                    placeholder = "sdf"
                }
                css {
                    placeholder {
                        color = firstColor
                    }
                }
            }
        }
        val element = clearAndInject(styledComponent)
        // Checking computed css not working for placeholder pseudo element in chrome, https://bugs.chromium.org/p/chromium/issues/detail?id=850744
        if (window.navigator.userAgent.lowercase().contains("firefox")) {
            assertEquals(firstColor.toString(), element.getStyle("::placeholder").color)
        }
        assertCssInjected("${element.className}::placeholder", listOf("color" to firstColor.toString()))
    }
}
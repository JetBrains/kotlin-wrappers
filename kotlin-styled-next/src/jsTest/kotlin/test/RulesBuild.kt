package test

import Component
import TestScope
import kotlinx.css.*
import org.w3c.dom.Element
import org.w3c.dom.get
import react.RProps
import react.fc
import runTest
import styled.StyleSheet
import styled.css
import styled.styledSpan
import waitForAnimationFrame
import kotlin.test.*

private object SimpleStyleSheet : StyleSheet("testStyleSheet") {
    val simpleProperty by css {
        minHeight = 66.px
        padding(0.px)
    }

    val specificProperty by css {
        specific {
            padding(80.px)
            border = "none"
        }
    }
}


private object StaticStyleSheet : StyleSheet("testStyleSheet", isStatic = true) {
    val property by css {
        alignContent = Align.end
    }
}

class ElementTest {
    /**
     * Assert that injected css for [selector] contains all of the [declarations]
     */
    private fun TestScope.assertCSS(selector: String, declarations: List<Pair<String, String>>) {
        val rules = getStylesheet().cssRules
        for (i in 0 until rules.length) {
            val css = rules.item(i)?.cssText
            if (css == null || selector !in css)
                continue
            css.let {
                declarations.forEach { (property, value) ->
                    val declaration = "$property: $value"
                    assertTrue("Could not find declaration $declaration in $it") {
                        declaration in css
                    }
                }
            }
            return
        }
        assertTrue(false, "Could not find rule for class")
    }

    private suspend fun TestScope.injectComponent(styledComponent: Component): Element {
        renderComponent(styledComponent)
        waitForAnimationFrame()
        val styledElement = root.children[0]
        assertNotNull(styledElement)
        return styledElement
    }

    private fun TestScope.assertChildrenCount(n: Int) {
        assertEquals(n, root.childElementCount)
    }

    @Test
    fun styledElement() = runTest {
        assertChildrenCount(0)
        val styledComponent = fc<RProps> {
            styledSpan {
                css {
                    backgroundColor = Color.blue
                    height = 15.px
                }
            }
        }
        val styledElement = injectComponent(styledComponent)
        assertCSS(
            styledElement.className, listOf(
                "background-color" to Color.blue.toString(),
                "height" to 15.px.toString()
            )
        )
    }

    @Test
    fun styleSheet() = runTest {
        assertChildrenCount(0)
        val styledComponent = fc<RProps> {
            styledSpan {
                css {
                    +SimpleStyleSheet.simpleProperty
                }
            }
        }
        val styledElement = injectComponent(styledComponent)
        assertCSS(
            styledElement.className, listOf(
                "min-height" to 66.px.toString(),
                "padding" to 0.px.toString()
            )
        )
    }

    @Test
    fun styleSheetStaticTest() = runTest {
        assertChildrenCount(0)
        val styledComponent = fc<RProps> {
            styledSpan {
                css {
                    +StaticStyleSheet.property
                }
            }
        }
        val className = injectComponent(styledComponent).className.split(" ").first { "ksc-" !in it }
        assertCSS(
            className, listOf(
                "align-content" to "end",
            )
        )
    }

    @Test
    fun styleSheetSpecificTest() = runTest {
        assertChildrenCount(0)
        val styledComponent = fc<RProps> {
            styledSpan {
                css {
                    +SimpleStyleSheet.specificProperty
                }
            }
        }
        val className = injectComponent(styledComponent).className

        assertCSS(
            ".$className.$className", listOf(
                "padding" to 80.px.toString(),
                "border" to "none"
            )
        )
    }

    @Test
    fun mediaRuleTest() = runTest {
        assertChildrenCount(0)
        val query = "only screen and (max-width: 600px)"
        val styledComponent = fc<RProps> {
            styledSpan {
                css {
                    media(query) {
                        textTransform = TextTransform.capitalize
                    }
                }
            }
        }
        injectComponent(styledComponent).className
        assertCSS(
            "@media $query", listOf(
                "text-transform" to "capitalize",
            )
        )
    }

    @BeforeTest
    fun before() = runTest {
        val rules = getStylesheet().cssRules
        for (i in rules.length - 1 downTo 0) {
            getStylesheet().deleteRule(i)
        }
    }
}
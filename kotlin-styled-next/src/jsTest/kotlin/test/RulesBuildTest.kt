package test

import Component
import TestScope
import kotlinx.css.*
import kotlinx.css.properties.*
import org.w3c.dom.Element
import org.w3c.dom.css.get
import org.w3c.dom.get
import react.RProps
import react.fc
import runTest
import styled.StyleSheet
import styled.animation
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

    /**
     * Inject [styledComponent] into the DOM and return corresponding [Element]
     */
    private suspend fun TestScope.clearAndInject(styledComponent: Component): Element {
        clear()
        renderComponent(styledComponent)
        waitForAnimationFrame()
        assertChildrenCount(1)
        val styledElement = root.children[0]
        assertNotNull(styledElement)
        return styledElement
    }

    private fun TestScope.assertChildrenCount(n: Int) {
        assertEquals(n, root.childElementCount)
    }

    @BeforeTest
    fun before() = runTest {
        val rules = getStylesheet().cssRules
        for (i in rules.length - 1 downTo 0) {
            getStylesheet().deleteRule(i)
        }
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
        val styledElement = clearAndInject(styledComponent)
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
        val styledElement = clearAndInject(styledComponent)
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
        val className = clearAndInject(styledComponent).className.split(" ").first { "ksc-" !in it }
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
        val className = clearAndInject(styledComponent).className

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
        clearAndInject(styledComponent)
        assertCSS(
            "@media $query", listOf(
                "text-transform" to "capitalize",
            )
        )
    }

    @Test
    fun animationTest() = runTest {
        assertChildrenCount(0)
        val styledComponent = fc<RProps> {
            styledSpan {
                css {
                    animation(
                        5.s,
                        Timing.linear,
                        3.s,
                        IterationCount.infinite,
                        AnimationDirection.reverse,
                        FillMode.forwards,
                        PlayState.running
                    ) {
                        from {
                            transform {
                                rotate(0.deg)
                            }
                        }
                        to {
                            transform {
                                rotate(360.deg)
                            }
                        }
                    }
                }
            }
        }
        val classname = clearAndInject(styledComponent).className
        val rules = getStylesheet().cssRules
        val keyframeIdx = (0 until rules.length).first { i ->
            val rule = rules[i]
            rule != null && rule.cssText.contains("@keyframes")
        }
        val keyframeName = rules[keyframeIdx]!!.cssText.substringAfter("@keyframes ").substringBefore("{").trim()
        assertCSS(
            classname, listOf(
                "animation" to "5s linear 3s infinite reverse forwards running $keyframeName",
            )
        )
        assertCSS(
            "@keyframes", listOf(
                "transform" to "rotate(0deg)",
                "transform" to "rotate(360deg)"
            )
        )
    }
}
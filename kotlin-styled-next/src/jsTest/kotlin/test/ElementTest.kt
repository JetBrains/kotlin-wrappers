package test

import kotlinx.css.*
import kotlinx.css.properties.*
import org.w3c.dom.css.get
import org.w3c.dom.get
import react.RProps
import react.dom.div
import react.dom.span
import react.fc
import runTest
import styled.*
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull
import kotlin.test.assertTrue

class ElementTest : TestBase() {
    @Test
    fun styledElement() = runTest {
        val styledComponent = fc<RProps> {
            styledSpan {
                css {
                    backgroundColor = Color.blue
                    height = 15.px
                }
            }
        }
        val styledElement = clearAndInject(styledComponent)
        assertCssInjected(
            styledElement.className, listOf(
                "background-color" to Color.blue.toString(),
                "height" to 15.px.toString()
            )
        )
    }


    @Test
    fun innerElementPseudoClass() = runTest {
        val styledComponent = fc<RProps> {
            styledDiv {
                styledInput {
                    css {
                        color = firstColor
                        ":focus" {
                            color = secondColor
                        }
                    }
                }
            }
        }
        val child = clearAndInject(styledComponent).children[0]
        assertNotNull(child)

        assertEquals(firstColor.toString(), child.getStyle().color)

        child.asInput().focus()
        assertEquals(secondColor.toString(), child.getStyle().color)
    }

    @Test
    fun multipleInnerCss() = runTest {
        val styledComponent = fc<RProps> {
            styledSpan {
                css {
                    ":first-child" {
                        ":first-child" {
                            backgroundColor = firstColor
                        }
                    }
                }
            }
            styledSpan {}
        }
        val element = clearAndInject(styledComponent)
        assertEquals(firstColor.toString(), element.getStyle().backgroundColor)
        val rule = getRules()[0]
        assertNotNull(rule)
        assertTrue(rule.cssText.contains("${element.className}:first-child:first-child"))
    }

    @Test
    fun keyframesNotInjectedWithoutComponent() = runTest {
        CssBuilder().apply {
            animation {
                addRotation()
            }
        }
        val rules = getStylesheet().cssRules
        assertEquals(2, GlobalStyles.scheduledRules.size)
        assertEquals(0, rules.length)
    }

    /**
     *  Check that two different styled components with the same CSS use the same class
     */
    @Test
    fun cssReuse() = runTest {
        val first = fc<RProps> {
            styledSpan {
                css {
                    addSomeCss()
                }
            }
        }
        val second = fc<RProps> {
            styledDiv {
                css {
                    addSomeCss()
                }
            }
            div {
                styledH1 {
                    css {
                        addSomeCss()
                    }
                }
            }
        }
        val firstElement = clearAndInject(first)
        val secondElement = inject(second)
        val rules = getStylesheet().cssRules
        assertEquals(firstElement.className, secondElement.className)
        assertEquals(1, rules.length)
    }

    /**
     * Add second CSS block to a component and check that it's processed correctly
     */
    @Test
    fun styledElementSecondCSS() = runTest {
        val styledComponent = fc<RProps> {
            styledSpan {
                css {
                    backgroundColor = firstColor
                    height = 15.px
                }

                css {
                    backgroundColor = secondColor
                    width = 30.px
                }
            }
        }
        val element = clearAndInject(styledComponent)
        val style = element.getStyle()
        assertEquals(secondColor.toString(), style.backgroundColor)
        assertEquals("15px", style.height)
        assertEquals("30px", style.width)
    }

    @Test
    fun styledElementPropertyRedeclare() = runTest {
        val firstColor = rgb(12, 16, 18)
        val secondColor = rgb(15, 15, 25)
        val styledComponent = fc<RProps> {
            styledSpan {
                css {
                    backgroundColor = firstColor
                    height = 15.px
                    backgroundColor = secondColor
                }
            }
        }
        val element = clearAndInject(styledComponent)
        val style = element.getStyle()
        assertEquals(secondColor.toString(), style.backgroundColor)
        assertEquals("15px", style.height)
    }

    @Test
    fun specificTest() = runTest {
        val styledComponent = fc<RProps> {
            styledSpan {
                css {
                    specific {
                        color = secondColor
                    }
                    color = firstColor
                }
            }
        }
        val element = clearAndInject(styledComponent)
        val className = element.className
        assertCssInjected(".$className", listOf("color" to firstColor.toString()))
        assertCssInjected(".$className.$className", listOf("color" to secondColor.toString()))

        assertEquals(secondColor.toString(), element.getStyle().color)
    }

    @Test
    fun commaSelector() = runTest {
        val styledComponent = fc<RProps> {
            styledSpan {
                css {
                    "div, span" {
                        color = firstColor
                    }
                }
                div {}
                span {}
            }
        }
        val element = clearAndInject(styledComponent)
        assertEquals(firstColor.toString(), element.childAt(0).getStyle().color)
        assertEquals(firstColor.toString(), element.childAt(1).getStyle().color)
    }

    @Test
    fun commaSelectorSpaced() = runTest {
        val styledComponent = fc<RProps> {
            styledSpan {
                css {
                    "  div , span   " {
                        color = firstColor
                    }
                }
                div {}
                span {}
            }
        }
        val element = clearAndInject(styledComponent)
        assertEquals(firstColor.toString(), element.childAt(0).getStyle().color)
        assertEquals(firstColor.toString(), element.childAt(1).getStyle().color)
    }

    @Test
    fun animationTest() = runTest {
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
                        addRotation()
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
        assertCssInjected(
            classname, listOf(
                "animation" to "5s linear 3s infinite reverse forwards running $keyframeName",
            )
        )
        assertCssInjected(
            "@keyframes", listOf(
                "transform" to "rotate(0deg)",
                "transform" to "rotate(360deg)"
            )
        )
    }


    @Test
    fun setCustomProperty() = runTest {
        val styledComponent = fc<RProps> {
            styledDiv {
                css {
                    setCustomProperty("first-color", firstColor)
                }
                styledSpan {
                    css {
                        color = Color("first-color".toCustomProperty())
                    }
                }
            }
        }
        val element = clearAndInject(styledComponent)
        assertEquals(firstColor.toString(), element.getStyle().getPropertyValue("--first-color").trim())
        assertEquals(firstColor.toString(), element.childAt(0).color())
    }

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
    fun root() = runTest {
        val css = CssBuilder().apply {
            root {
                color = firstColor
            }
        }
        injectGlobal(css)
        val styledComponent = fc<RProps> {
            div {}
        }
        val element = clearAndInject(styledComponent)
        assertEquals(firstColor.toString(), element.color())
    }

    @Test
    fun compareTo() = runTest {
        val styledComponent = fc<RProps> {
            styledDiv {
                css {
                    color = firstColor
                    this > "div" {
                        color = secondColor
                    }
                }
                div {}
                span { div {} }
            }
        }
        val element = clearAndInject(styledComponent)
        assertEquals(firstColor.toString(), element.color())
        assertEquals(secondColor.toString(), element.childAt(0).color())
    }
}
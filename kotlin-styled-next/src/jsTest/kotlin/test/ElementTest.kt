package test

import TestScope
import kotlinx.css.*
import kotlinx.css.properties.*
import kotlinx.html.classes
import react.Props
import react.dom.attrs
import react.dom.div
import react.dom.span
import react.fc
import runTest
import styled.*
import kotlin.test.*

class ElementTest : TestBase() {
    @Test
    fun styledElement() = runTest {
        val styledComponent = fc<Props> {
            styledSpan {
                css {
                    backgroundColor = Color.blue
                    height = 15.px
                }
            }
        }
        val styledElement = clearAndInject(styledComponent)
        assertCssInjected(
            styledElement.className,
            "background-color" to Color.blue.toString(),
            "height" to 15.px.toString()
        )
    }

    @Test
    fun emptyCssNoClassname() = runTest {
        val styledComponent = fc<Props> {
            styledSpan {
                css {}
            }
        }
        val styledElement = clearAndInject(styledComponent)
        assertEquals("", styledElement.className)
    }

    @Test
    fun emptyCssClassnameAdded() = runTest {
        val className = "className"
        val styledComponent = fc<Props> {
            styledSpan {
                css {
                    +className
                }
            }
        }
        val styledElement = clearAndInject(styledComponent)
        assertEquals(className, styledElement.className)
    }


    @Test
    fun innerElementPseudoClass() = runTest {
        val styledComponent = fc<Props> {
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
        val child = clearAndInject(styledComponent).children.item(0)
        assertNotNull(child)

        assertEquals(firstColor.toString(), child.getStyle().color)

        child.asInput().focus()
        assertEquals(secondColor.toString(), child.getStyle().color)
    }

    @Test
    fun multipleInnerCss() = runTest {
        val styledComponent = fc<Props> {
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
        assertTrue(rule.contains("${element.className}:first-child:first-child"))
    }

    @Test
    fun keyframesNotInjectedWithoutComponent() = runTest {
        CssBuilder().apply {
            animation {
                addRotation()
            }
        }
        val rules = getRules()
        assertEquals(1, sheet.scheduledGroups.size)
        assertEquals(2, sheet.scheduledGroups.values.first().toList().size)
        assertEquals(0, rules.size)
    }

    /**
     *  Check that two different styled components with the same CSS use the same class
     */
    @Test
    fun cssReuse() = runTest {
        val first = fc<Props> {
            styledSpan {
                css {
                    addSomeCss()
                }
            }
        }
        val second = fc<Props> {
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
        val rules = getRules()
        assertEquals(firstElement.className, secondElement.className)
        assertEquals(1, rules.size)
    }

    /**
     * Add second CSS block to a component and check that it's processed correctly
     */
    @Test
    fun styledElementSecondCSS() = runTest {
        val styledComponent = fc<Props> {
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
        val styledComponent = fc<Props> {
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
    fun specific() = runTest {
        val styledComponent = fc<Props> {
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
        assertCssInjected(".$className", "color" to firstColor.toString())
        assertCssInjected(".$className.$className", "color" to secondColor.toString())

        assertEquals(secondColor.toString(), element.getStyle().color)
    }

    @Test
    fun commaSelector() = runTest {
        val styledComponent = fc<Props> {
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
        val styledComponent = fc<Props> {
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
    fun animation() = runTest {
        val styledComponent = fc<Props> {
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
        val rules = getRules()
        val keyframeIdx = rules.indexOfFirst {
            it.contains("@keyframes")
        }
        val keyframeName = rules[keyframeIdx].substringAfter("@keyframes ").substringBefore("{").trim()
        assertCssInjected(
            classname,
            "animation" to "5s linear 3s infinite reverse forwards running $keyframeName",
        )
        assertCssInjected(
            "@keyframes",
            "transform" to "rotate(0deg)",
            "transform" to "rotate(360deg)"
        )
    }


    @Test
    fun setCustomProperty() = runTest {
        val styledComponent = fc<Props> {
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
    fun addsValidRulesIfSomeInvalid() = runTest {
        val firstRule = CssBuilder().apply { ".$firstClassName" { color = firstColor } }.toString()
        val secondRule = "Some invalid css for browser"
        val thirdRule = CssBuilder().apply { ".$secondClassName" { backgroundColor = secondColor } }.toString()
        GlobalStyles.sheet.scheduleToInject(listOf(firstRule, secondRule, thirdRule))
        GlobalStyles.sheet.injectScheduled()
        assertCssInjected(firstClassName, "color" to firstColor.toString())
        assertCssInjected(secondClassName, "background-color" to secondColor.toString())
    }

    @Test
    fun externalClassName() = runTest {
        val styledComponent = fc<Props> {
            styledSpan {
                attrs { classes = setOf("classname") }
                css { color = firstColor }
            }
        }
        val element = clearAndInject(styledComponent)
        assertContains(element.className, "classname ksc-")
    }

    @Test
    fun multipleAnimations() = runTest {
        val styledComponent = fc<Props> {
            styledSpan {
                css {
                    animation { addRotation() }
                    animation {
                        from { opacity = 0 }
                        to { opacity = 1 }
                    }
                }
            }
        }
        clearAndInject(styledComponent)
        assertRulesContain("opacity: 0;")
        assertRulesContain("opacity: 1;")
        assertRulesContain("transform: rotate(0deg);")
        assertRulesContain("transform: rotate(360deg);")
    }

    private fun TestScope.assertRulesContain(substring: String) {
        val rule = getRules().find { it.contains(substring) }
        assertNotNull(rule)
    }

    @Test
    fun declarationsPrefixed() {
        val css = CssBuilder().apply {
            transition("all", 200.ms, Timing.linear)
        }
        val rule = css.getCssRules(".someClass").first()
        assertContains(rule, "-moz-transition: all 200ms linear 0s")
        assertContains(rule, "-webkit-transition: all 200ms linear 0s")
    }

    @Test
    fun elementCssPrefixed() = runTest {
        val styledComponent = fc<Props> {
            styledSpan {
                css {
                    alignItems = Align.center
                }
            }
        }
        val element = clearAndInject(styledComponent)
        assertCssInjected(element.className, "-webkit-box-align" to "center")
    }

    @Test
    fun specificLinearClassnameGrowth() = runTest {
        val styledComponent = fc<Props> {
            styledSpan {
                css {
                    backgroundColor = firstColor
                    color = firstColor

                    specific { // ".ksc-x.ksc-x"
                        backgroundColor = secondColor
                        color = secondColor
                        specific { // ".ksc-x.ksc-x.ksc-x"
                            color = thirdColor
                        }
                    }
                }
            }
        }
        val element = clearAndInject(styledComponent)
        val linearClassName = ".${element.className}".repeat(3)
        val linearCss = getRules().find { it.contains(linearClassName) }
        assertNotNull(linearCss)

        val exponentialClassName = ".${element.className}".repeat(4)
        val exponentialCss = getRules().find { it.contains(exponentialClassName) }
        assertNull(exponentialCss)

        assertCssInjected(linearClassName, "color" to thirdColor.toString())
        assertEquals(secondColor.toString(), element.getStyle().backgroundColor)
        assertEquals(thirdColor.toString(), element.color())
    }
}

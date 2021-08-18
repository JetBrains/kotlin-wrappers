package test

import kotlinx.css.CssBuilder
import kotlinx.css.backgroundColor
import kotlinx.css.color
import react.Props
import react.dom.div
import react.dom.span
import react.fc
import runTest
import styled.css
import styled.styledDiv
import styled.styledSpan
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals

/**
 * Check every public interface function in [CssBuilder]
 */
class RelativeSelectorsTest : TestBase() {
    @Test
    fun children() = runTest {
        val styledComponent = fc<Props> {
            styledDiv {
                css {
                    color = firstColor
                    children {
                        color = secondColor
                    }
                }
                div {}
                span { div {} }
                div {}
            }
        }
        val element = clearAndInject(styledComponent)
        assertEquals(secondColor.toString(), element.childAt(0).getStyle().color)
        assertEquals(secondColor.toString(), element.childAt(1).getStyle().color)
        assertEquals(secondColor.toString(), element.childAt(1).childAt(0).getStyle().color)
        assertEquals(secondColor.toString(), element.childAt(2).getStyle().color)
    }

    @Test
    fun descendantsSelector() = runTest {
        val styledComponent = fc<Props> {
            styledDiv {
                css {
                    color = firstColor
                    backgroundColor = secondColor
                    descendants("div") {
                        color = secondColor
                    }
                }
                span { div {} }
                div {}
            }
        }
        val element = clearAndInject(styledComponent)
        assertNotEquals(secondColor.toString(), element.color())
        assertEquals(firstColor.toString(), element.childAt(0).color())
        assertEquals(secondColor.toString(), element.childAt(0).childAt(0).color())
        assertEquals(secondColor.toString(), element.childAt(1).color())
    }

    @Test
    fun descendants() = runTest {
        val styledComponent = fc<Props> {
            styledDiv {
                css {
                    color = firstColor
                    descendants {
                        color = secondColor
                    }
                }
                span { div {} }
                div {}
            }
        }
        val element = clearAndInject(styledComponent)
        assertNotEquals(secondColor.toString(), element.color())
        assertEquals(secondColor.toString(), element.childAt(0).color())
        assertEquals(secondColor.toString(), element.childAt(0).childAt(0).color())
        assertEquals(secondColor.toString(), element.childAt(1).color())
    }

    @Test
    fun ancestorHover() = runTest {
        val styledComponent = fc<Props> {
            styledDiv {
                +"ancestor"
                styledSpan {
                    css {
                        color = firstColor
                        ancestorHover(".ancestor") {
                            color = secondColor
                        }
                    }
                }
            }
        }
        val element = clearAndInject(styledComponent)
        assertCssInjected(".ancestor:hover .${element.childAt(0).className}", listOf("color" to secondColor.toString()))
    }


    @Test
    fun child() = runTest {
        val styledComponent = fc<Props> {
            styledDiv {
                css {
                    color = firstColor
                    child("div") {
                        color = secondColor
                    }
                }
                div {}
                span { div {} }
                div {}
            }
        }
        val element = clearAndInject(styledComponent)
        assertEquals(secondColor.toString(), element.childAt(0).getStyle().color)
        assertEquals(firstColor.toString(), element.childAt(1).getStyle().color)
        assertEquals(firstColor.toString(), element.childAt(1).childAt(0).getStyle().color)
        assertEquals(secondColor.toString(), element.childAt(2).getStyle().color)
    }

    @Test
    fun sibling() = runTest {
        val styledComponent = fc<Props> {
            div {
                span {}
                styledDiv {
                    css {
                        sibling("div") {
                            color = firstColor
                        }
                    }
                }
                styledDiv { css { color = secondColor } }
                div {}
            }
        }
        val element = clearAndInject(styledComponent)
        assertNotEquals(firstColor.toString(), element.color())
        assertNotEquals(firstColor.toString(), element.childAt(0).color())
        assertNotEquals(firstColor.toString(), element.childAt(1).color())
        assertEquals(firstColor.toString(), element.childAt(2).color())
        assertEquals(firstColor.toString(), element.childAt(3).color())
    }

    @Test
    fun adjacentSibling() = runTest {
        val styledComponent = fc<Props> {
            div {
                span {}
                styledDiv {
                    css {
                        adjacentSibling("div") {
                            color = secondColor
                        }
                        color = firstColor
                    }
                }
                div {}
                div {}
            }
        }
        val element = clearAndInject(styledComponent)
        assertNotEquals(secondColor.toString(), element.color())
        assertNotEquals(firstColor.toString(), element.childAt(0).color())
        assertEquals(firstColor.toString(), element.childAt(1).color())
        assertEquals(secondColor.toString(), element.childAt(2).color())
        assertNotEquals(secondColor.toString(), element.childAt(3).color())
    }

    @Test
    fun universal() = runTest {
        val styledComponent = fc<Props> {
            styledDiv {
                css {
                    universal {
                        color = firstColor
                    }
                }
                span { div {} }
                div {}
            }
        }
        val element = clearAndInject(styledComponent)
        assertNotEquals(firstColor.toString(), element.color())
        assertEquals(firstColor.toString(), element.childAt(0).color())
        assertEquals(firstColor.toString(), element.childAt(0).childAt(0).color())
        assertEquals(firstColor.toString(), element.childAt(1).color())
    }

    @Test
    fun unaryPlus() = runTest {
        val styledComponent = fc<Props> {
            styledDiv {
                css {
                    ".$firstClassName" {
                        color = firstColor
                    }
                    ".$secondClassName" {
                        backgroundColor = firstColor
                    }
                }
                styledSpan {
                    css { +firstClassName }
                }
                styledSpan {
                    css { +arrayOf(firstClassName, secondClassName) }
                }
                styledSpan {
                    css {
                        +setOf(firstClassName, secondClassName)
                    }
                }
            }
        }

        val element = clearAndInject(styledComponent)
        assertEquals(firstColor.toString(), element.childAt(0).color())
        assertNotEquals(firstColor.toString(), element.childAt(0).getStyle().backgroundColor)

        assertEquals(firstColor.toString(), element.childAt(1).color())
        assertEquals(firstColor.toString(), element.childAt(1).getStyle().backgroundColor)
        assertEquals(firstColor.toString(), element.childAt(2).color())
        assertEquals(firstColor.toString(), element.childAt(2).getStyle().backgroundColor)
    }

    @Test
    fun not() = runTest {
        val styledComponent = fc<Props> {
            styledDiv {
                css {
                    children {
                        "div" {
                            color = firstColor
                        }.not()
                    }
                }
                styledDiv { }
                styledSpan { }
            }
        }
        val element = clearAndInject(styledComponent)
        assertNotEquals(firstColor.toString(), element.childAt(0).color())
        assertEquals(firstColor.toString(), element.childAt(1).color())
    }

    @Test
    fun classNameNot() = runTest {
        val styledComponent = fc<Props> {
            styledDiv {
                css {
                    "div" {
                        ".$firstClassName" {
                            color = firstColor
                        }.not()
                    }
                }
                styledDiv { css { +firstClassName } }
                styledDiv { }
            }
        }
        val element = clearAndInject(styledComponent)
        assertNotEquals(firstColor.toString(), element.childAt(0).color())
        assertEquals(firstColor.toString(), element.childAt(1).color())
    }

    @Test
    fun prefix() = runTest {
        val styledComponent = fc<Props> {
            styledDiv {
                css { +firstClassName }
                styledDiv {
                    css {
                        color = firstColor
                        prefix(".$firstClassName") {
                            color = secondColor
                        }
                    }
                }
            }
        }
        val element = clearAndInject(styledComponent)
        assertEquals(secondColor.toString(), element.childAt(0).color())
    }

    @Test
    fun ruleUnaryPlus() = runTest {
        val styledComponent = fc<Props> {
            styledDiv {
                css {
                    +"someExternalClass1" {
                        color = firstColor
                    }
                    +"someExternalClass2" {
                        backgroundColor = secondColor
                    }
                    +"someExternalClass1"
                }
            }
        }
        val element = clearAndInject(styledComponent)
        assertEquals(firstColor.toString(), element.color())
        assertNotEquals(secondColor.toString(), element.getStyle().backgroundColor)
    }

    @Test
    fun compareTo() = runTest {
        val styledComponent = fc<Props> {
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

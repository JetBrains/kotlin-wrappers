package test

import Component
import TestScope
import kotlinx.browser.document
import kotlinx.css.color
import kotlinx.css.paddingLeft
import kotlinx.css.paddingRight
import kotlinx.css.px
import kotlinx.dom.clear
import org.w3c.dom.Element
import org.w3c.dom.HTMLElement
import react.Props
import react.dom.unmountComponentAtNode
import react.fc
import runTest
import styled.css
import styled.styledDiv
import styled.styledSpan
import waitForAnimationFrame
import kotlin.test.BeforeTest
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull

class RemoveCssTest : TestBase() {
    val secondRoot: HTMLElement by lazy {
        (document.createElement("div") as HTMLElement).also {
            document.body?.appendChild(it)
        }
    }
    var thirdRoot: HTMLElement = (document.createElement("div") as HTMLElement).also { document.body?.appendChild(it) }

    fun TestScope.injectAdditional(component: Component, root: HTMLElement = secondRoot): Element {
        renderComponent(component, root)
        val element = root.firstElementChild
        assertNotNull(element)
        return element
    }

    @BeforeTest
    override fun before() {
        super.before()
        unmountComponentAtNode(secondRoot)
        secondRoot.clear()
        unmountComponentAtNode(thirdRoot)
        thirdRoot.clear()
    }

    @Test
    fun removesSingleUnusedCss() = runTest {
        sheet.cleanTimeout = 0
        val styledComponent = fc<Props> {
            styledDiv {
                css {
                    color = firstColor
                }
            }
        }
        clearAndInject(styledComponent)
        assertEquals(1, getRules().length)
        clear()
        waitForAnimationFrame()

        assertEquals(0, getRules().length)
    }

    @Test
    fun removesMultipleUnusedCss() = runTest {
        sheet.cleanTimeout = 0
        val styledComponent = fc<Props> {
            styledDiv { css { color = firstColor } }
            styledDiv { css { color = secondColor } }
            styledSpan { css { paddingLeft = 0.px } }
        }
        clearAndInject(styledComponent)
        assertEquals(3, getRules().length)
        clear()
        waitForAnimationFrame()

        assertEquals(0, getRules().length)
    }

    @Test
    fun leavesUsedCss() = runTest {
        sheet.cleanTimeout = 0

        val styledComponent = fc<Props> {
            styledDiv {
                css {
                    color = firstColor
                }
            }
        }
        val element = clearAndInject(styledComponent)
        val element2 = injectAdditional(styledComponent)
        assertEquals(firstColor.toString(), element.color())
        assertEquals(firstColor.toString(), element2.color())
        clear()
        waitForAnimationFrame()

        assertEquals(1, getRules().length)
        assertEquals(firstColor.toString(), element2.color())
    }

    @Test
    fun removesReinjectedMultipleCss() = runTest {
        sheet.cleanTimeout = 0
        val styledComponent = fc<Props> {
            styledDiv { css { color = firstColor } }
            styledDiv { css { paddingLeft = 0.px } }
            styledSpan { css { color = secondColor } }
            styledSpan { css { paddingRight = 0.px } }
        }
        val styledComponent2 = fc<Props> {
            styledDiv { css { color = firstColor } }
            styledSpan { css { paddingRight = 1.px } }
        }
        clearAndInject(styledComponent)
        injectAdditional(styledComponent2)
        assertEquals(5, getRules().length)
        injectAdditional(styledComponent, thirdRoot)
        clear()
        waitForAnimationFrame()
        assertEquals(5, getRules().length)
        unmountComponentAtNode(thirdRoot)
        waitForAnimationFrame()
        assertEquals(2, getRules().length)
        unmountComponentAtNode(secondRoot)
        waitForAnimationFrame()
        assertEquals(0, getRules().length)
    }

    @Test
    fun leavesIntersectedCss() = runTest {
        sheet.cleanTimeout = 0
        val styledComponent = fc<Props> {
            styledDiv { css { color = firstColor } }
            styledDiv { css { paddingLeft = 0.px } }
            styledSpan { css { color = secondColor } }
            styledSpan { css { paddingRight = 0.px } }
        }
        val styledComponent2 = fc<Props> {
            styledDiv { css { color = firstColor } }
            styledDiv { css { color = thirdColor } }
        }
        clearAndInject(styledComponent)
        injectAdditional(styledComponent2)
        assertEquals(5, getRules().length)

        clear()
        waitForAnimationFrame()

        assertEquals(2, getRules().length)
        assertEquals(firstColor.toString(), secondRoot.childAt(0).color())
        assertEquals(thirdColor.toString(), secondRoot.childAt(1).color())
    }
}
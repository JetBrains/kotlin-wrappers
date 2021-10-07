package test

import Component
import TestScope
import createDOMElement
import kotlinx.css.color
import kotlinx.css.paddingLeft
import kotlinx.css.paddingRight
import kotlinx.css.px
import kotlinx.dom.clear
import org.w3c.dom.Element
import org.w3c.dom.HTMLElement
import react.Props
import react.fc
import runTest
import styled.animation
import styled.css
import styled.styledDiv
import styled.styledSpan
import styleSheets.StaticStyleSheet
import unmount
import waitForAnimationFrame
import kotlin.test.BeforeTest
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull

class RemoveCssTest : TestBase() {
    private val secondRoot by lazy { createDOMElement() }
    private val thirdRoot by lazy { createDOMElement() }
    private var staticStyleSheet = StaticStyleSheet()

    private fun TestScope.injectAdditional(component: Component, root: HTMLElement = secondRoot): Element {
        renderComponent(component, root)
        val element = root.firstElementChild
        assertNotNull(element)
        return element
    }

    private suspend fun removeInjectedStyleSheet() {
        staticStyleSheet.removeInjected()
        waitForAnimationFrame()
    }

    @BeforeTest
    override fun before() = runTest {
        super.before()
        unmount(secondRoot)
        secondRoot.clear()
        unmount(thirdRoot)
        thirdRoot.clear()
        staticStyleSheet = StaticStyleSheet()
    }

    @Test
    fun removesSingleUnusedCss() = runTest {
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

        assertEquals(0, getRules().length)
    }

    @Test
    fun removesMultipleUnusedCss() = runTest {
        val styledComponent = fc<Props> {
            styledDiv { css { color = firstColor } }
            styledDiv { css { color = secondColor } }
            styledSpan { css { paddingLeft = 0.px } }
        }
        clearAndInject(styledComponent)
        assertEquals(3, getRules().length)
        clear()

        assertEquals(0, getRules().length)
    }

    @Test
    fun leavesUsedCss() = runTest {

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

        assertEquals(1, getRules().length)
        assertEquals(firstColor.toString(), element2.color())
    }

    @Test
    fun removesReusableMultipleCss() = runTest {
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
        assertEquals(5, getRules().length)
        unmount(thirdRoot)
        assertEquals(2, getRules().length)
        unmount(secondRoot)
        assertEquals(0, getRules().length)
    }

    @Test
    fun removesReinjectedMultipleCss() = runTest {
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

        clear()
        assertEquals(2, getRules().length)
        clearAndInject(styledComponent)
        assertEquals(5, getRules().length)
        unmount(secondRoot)
        assertEquals(4, getRules().length)
        clear()
        assertEquals(0, getRules().length)
        injectAdditional(styledComponent2)
        assertEquals(2, getRules().length)
    }

    @Test
    fun leavesIntersectedCss() = runTest {
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

        assertEquals(2, getRules().length)
        assertEquals(firstColor.toString(), secondRoot.childAt(0).color())
        assertEquals(thirdColor.toString(), secondRoot.childAt(1).color())
    }

    @Test
    fun removesNestedRules() = runTest {
        val styledComponent = fc<Props> {
            styledDiv {
                css {
                    paddingLeft = 0.px
                    ":hover" {
                        color = firstColor
                    }
                }
            }
        }
        clearAndInject(styledComponent)
        assertEquals(2, getRules().length)

        clear()
        assertEquals(0, getRules().length)
    }

    @Test
    fun removesAnimation() = runTest {
        val styledComponent = fc<Props> {
            styledDiv {
                css { animation { addRotation() } }
            }
        }
        clearAndInject(styledComponent)
        assertEquals(3, getRules().length)

        clear()
        // 2 rules remaining are keyframes, which we do not remove
        assertEquals(2, getRules().length)
    }

    @Test
    fun removesMultipleAnimations() = runTest {
        val styledComponent = fc<Props> {
            styledDiv {
                css { animation { addRotation() } }
                css { animation { addRotation() } }
            }
        }
        clearAndInject(styledComponent)
        assertEquals(3, getRules().length)

        clear()
        // 2 rules remaining are keyframes, which we do not remove
        assertEquals(2, getRules().length)
    }

    @Test
    fun reinjectsMultipleAnimations() = runTest {
        val styledComponent = fc<Props> {
            styledDiv {
                css { animation { addRotation() } }
                css { animation { addRotation() } }
            }
        }
        clearAndInject(styledComponent)
        clearAndInject(styledComponent)
        assertEquals(3, getRules().length)
    }

    @Test
    fun removesStyleSheet() = runTest {
        val styledComponent = fc<Props> {
            styledDiv { css { +staticStyleSheet.property1 } }
        }
        clearAndInject(styledComponent)
        assertEquals(1, getRules().length)
        removeInjectedStyleSheet()
        assertEquals(0, getRules().length)
    }

    @Test
    fun removesMultiComponentStyleSheet() = runTest {
        val styledComponent = fc<Props> {
            styledDiv { css { +staticStyleSheet.property1 } }
        }
        clearAndInject(styledComponent)
        assertEquals(1, getRules().length)
        removeInjectedStyleSheet()
        assertEquals(0, getRules().length)

        val styledComponent2 = fc<Props> {
            styledDiv {
                css {
                    +staticStyleSheet.property1
                    +staticStyleSheet.property2
                }
            }
        }
        clearAndInject(styledComponent)
        injectAdditional(styledComponent2)
        assertEquals(2, getRules().length)
        removeInjectedStyleSheet()
        assertEquals(0, getRules().length)
    }
}
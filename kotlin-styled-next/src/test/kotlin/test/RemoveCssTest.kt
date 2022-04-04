package test

import Component
import RootInfo
import kotlinx.css.color
import kotlinx.css.paddingLeft
import kotlinx.css.paddingRight
import kotlinx.css.px
import org.w3c.dom.Element
import react.Props
import react.dom.client.createRoot
import react.dom.flushSync
import react.fc
import runTest
import styleSheets.StaticStyleSheet
import styled.animation
import styled.css
import styled.styledDiv
import styled.styledSpan
import kotlin.test.BeforeTest
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull

class RemoveCssTest : TestBase() {
    private val secondRootInfo by lazy { RootInfo.create() }
    private val thirdRootInfo by lazy { RootInfo.create() }
    private var staticStyleSheet = StaticStyleSheet()

    private fun injectAdditional(component: Component, root: RootInfo = secondRootInfo): Element {
        flushSync {
            root.root = createRoot(root.element)
            root.renderComponent(component)
        }
        val element = root.element.firstElementChild
        assertNotNull(element)
        return element
    }

    private fun removeInjectedStyleSheet() {
        staticStyleSheet.removeInjected()
    }

    @BeforeTest
    fun beforeRemoveCssTest() = runTest {
        secondRootInfo.clear()
        thirdRootInfo.clear()
        staticStyleSheet = StaticStyleSheet()
    }

    @Test
    fun removesSingleUnusedCss() = runTest {
        assertEquals(0, getRules().size)
        val styledComponent = fc<Props> {
            styledDiv {
                css {
                    color = firstColor
                }
            }
        }
        clearAndInject(styledComponent)
        assertEquals(1, getRules().size)
        clear()

        assertEquals(0, getRules().size)
    }

    @Test
    fun removesMultipleUnusedCss() = runTest {
        val styledComponent = fc<Props> {
            styledDiv { css { color = firstColor } }
            styledDiv { css { color = secondColor } }
            styledSpan { css { paddingLeft = 0.px } }
        }
        clearAndInject(styledComponent)
        assertEquals(3, getRules().size)
        clear()

        assertEquals(0, getRules().size)
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

        assertEquals(1, getRules().size)
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
        assertEquals(5, getRules().size)
        injectAdditional(styledComponent, thirdRootInfo)
        clear()
        assertEquals(5, getRules().size)
        thirdRootInfo.unmount()
        assertEquals(2, getRules().size)
        secondRootInfo.unmount()
        assertEquals(0, getRules().size)
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
        assertEquals(2, getRules().size)
        clearAndInject(styledComponent)
        assertEquals(5, getRules().size)
        secondRootInfo.unmount()
        assertEquals(4, getRules().size)
        clear()
        assertEquals(0, getRules().size)
        injectAdditional(styledComponent2)
        assertEquals(2, getRules().size)
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
        assertEquals(5, getRules().size)

        clear()

        assertEquals(2, getRules().size)
        assertEquals(firstColor.toString(), secondRootInfo.element.childAt(0).color())
        assertEquals(thirdColor.toString(), secondRootInfo.element.childAt(1).color())
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
        assertEquals(2, getRules().size)

        clear()
        assertEquals(0, getRules().size)
    }

    @Test
    fun removesAnimation() = runTest {
        val styledComponent = fc<Props> {
            styledDiv {
                css { animation { addRotation() } }
            }
        }
        clearAndInject(styledComponent)
        assertEquals(3, getRules().size)

        clear()
        // 2 rules remaining are keyframes, which we do not remove
        assertEquals(2, getRules().size)
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
        assertEquals(3, getRules().size)

        clear()
        // 2 rules remaining are keyframes, which we do not remove
        assertEquals(2, getRules().size)
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
        assertEquals(3, getRules().size)
    }

    @Test
    fun removesStyleSheet() = runTest {
        val styledComponent = fc<Props> {
            styledDiv { css { +staticStyleSheet.property1 } }
        }
        clearAndInject(styledComponent)
        assertEquals(1, getRules().size)
        removeInjectedStyleSheet()
        assertEquals(0, getRules().size)
    }

    @Test
    fun removesMultiComponentStyleSheet() = runTest {
        val styledComponent = fc<Props> {
            styledDiv { css { +staticStyleSheet.property1 } }
        }
        clearAndInject(styledComponent)
        assertEquals(1, getRules().size)
        flushSync {
            removeInjectedStyleSheet()
        }
        assertEquals(0, getRules().size)

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
        assertEquals(2, getRules().size)

        removeInjectedStyleSheet()
        assertEquals(0, getRules().size)
    }
}
package test

import Component
import TestScope
import kotlinx.css.*
import kotlinx.css.properties.KeyframesBuilder
import kotlinx.css.properties.deg
import kotlinx.css.properties.rotate
import kotlinx.css.properties.transform
import org.w3c.dom.Element
import org.w3c.dom.HTMLInputElement
import org.w3c.dom.get
import runTest
import styled.GlobalStyles
import waitForAnimationFrame
import kotlin.test.BeforeTest
import kotlin.test.assertNotNull
import kotlin.test.assertTrue

open class TestBase {
    protected val firstColor = rgb(1, 1, 1)
    protected val secondColor = rgb(2, 2, 2)
    protected val thirdColor = rgb(3, 3, 3)

    protected val firstClassName = "firstClassName"
    protected val secondClassName = "secondClassName"

    /**
     * Assert that injected CSS for [selector] contains all of the [declarations]
     */
    protected fun TestScope.assertCssInjected(selector: String, declarations: List<Pair<String, String>>) {
        assertCssInjected(selector, declarations.map { (property, value) -> "$property: $value" })
    }

    protected fun TestScope.assertCssInjected(selector: String, strings: Iterable<String>) {
        val rules = getStylesheet().cssRules
        val checkedCss = StringBuilder()
        for (i in 0 until rules.length) {
            val css = rules.item(i)?.cssText
            checkedCss.appendLine(css)
            if (css == null || selector !in css)
                continue
            css.let {
                strings.forEach {
                    assertTrue("Could not find declaration $it in $css") {
                        it in css
                    }
                }
            }
            return
        }
        assertTrue(false, "Could not find rule for selector $selector. Checked css is $checkedCss")
    }

    @BeforeTest
    open fun before() = runTest {
        val rules = getStylesheet().cssRules
        for (i in rules.length - 1 downTo 0) {
            getStylesheet().deleteRule(i)
        }
        GlobalStyles.scheduledRules.clear()
        GlobalStyles.injectedStyleSheetRules.clear()
        GlobalStyles.injectedKeyframes.clear()
        GlobalStyles.styledClasses.clear()
    }

    protected suspend fun TestScope.clearAndInject(styledComponent: Component): Element {
        clear()
        return inject(styledComponent)
    }

    /**
     * Inject [styledComponent] into the DOM and return corresponding [Element]
     */
    protected suspend fun TestScope.inject(styledComponent: Component): Element {
        renderComponent(styledComponent)
        waitForAnimationFrame()
        val styledElement = root.children[0]
        assertNotNull(styledElement)
        return styledElement
    }

    protected fun KeyframesBuilder.addRotation() {
        from { transform { rotate(0.deg) } }
        to { transform { rotate(360.deg) } }
    }

    protected fun CssBuilder.addSomeCss() {
        backgroundColor = Color.blue
        height = 18.px
        alignContent = Align.end
        appearance = Appearance.listbox
        padding = "1px 2px 3px 4px"
    }

    protected fun Element.childAt(i: Int): Element {
        val child = children[i]
        assertNotNull(child)
        return child
    }

    protected fun Element.asInput(): HTMLInputElement {
        return this as HTMLInputElement
    }
}
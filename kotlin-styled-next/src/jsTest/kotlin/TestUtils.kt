import kotlinext.js.jsObject
import kotlinx.browser.document
import kotlinx.browser.window
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.promise
import kotlinx.css.CssBuilder
import kotlinx.dom.clear
import org.w3c.dom.Element
import org.w3c.dom.HTMLElement
import org.w3c.dom.HTMLStyleElement
import org.w3c.dom.css.*
import react.ComponentType
import react.RProps
import react.createElement
import react.dom.render
import react.dom.unmountComponentAtNode
import styled.GlobalStyles
import styled.injectGlobal
import kotlin.coroutines.resume
import kotlin.coroutines.suspendCoroutine
import kotlin.js.Promise
import kotlin.test.assertEquals

typealias Component = ComponentType<RProps>

private val testScope = MainScope()

class TestScope : CoroutineScope by testScope {
    val root = "div".asHtmlElement()

    init {
        GlobalStyles.isTest = true
    }

    fun injectBuilder(builder: CssBuilder) {
        injectGlobal(builder)
    }

    fun renderComponent(component: Component) {
        val reactElement = createElement(component, jsObject { })
        render(reactElement, root)
    }

    fun getStylesheet(): CSSStyleSheet {
        val styles = document.getElementById(GlobalStyles.styleId) as HTMLStyleElement
        return styles.sheet as CSSStyleSheet
    }

    fun getRules(): CSSRuleList {
        return getStylesheet().cssRules
    }

    fun Element.getStyle(pseudoElt: String? = null): CSSStyleDeclaration {
        return window.getComputedStyle(this, pseudoElt)
    }

    fun Element.color(pseudoElt: String? = null): String {
        return getStyle(pseudoElt).color
    }

    fun CSSRuleList.forEach(block: (rule: CSSRule?) -> Unit) {
        for (i in 0 until this.length) {
            block(this[i])
        }
    }

    fun assertChildrenCount(n: Int) {
        assertEquals(n, root.childElementCount)
    }

    fun clear() {
        unmountComponentAtNode(root)
        root.clear()
    }
}

internal fun runTest(block: suspend TestScope.() -> Unit): dynamic {
    val scope = TestScope()
    scope.assertChildrenCount(0)
    return scope.promise { block(scope) }
}

internal fun String.asHtmlElement(): HTMLElement {
    return (document.createElement(this) as HTMLElement).also {
        document.body?.appendChild(it)
    }
}

/**
 * Wait for the next animation frame, during which React has most probably rendered the updated DOM.
 * It's not a certainty, so assertions are needed after function invocation.
 */
internal suspend fun waitForAnimationFrame() {
    suspendCoroutine<Unit> { continuation ->
        window.requestAnimationFrame {
            continuation.resume(Unit)
        }
    }
}

/** Hack for Flow emit function not to crash in inner js code */

internal suspend fun waitFlowCoroutine() {
    suspendCoroutine<Unit> { continuation ->
        Promise.Companion.resolve(Unit).then {
            continuation.resume(Unit)
        }
    }
}

import kotlinext.js.jsObject
import kotlinx.browser.document
import kotlinx.browser.window
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.promise
import kotlinx.css.CssBuilder
import kotlinx.dom.clear
import org.w3c.dom.HTMLElement
import org.w3c.dom.HTMLStyleElement
import org.w3c.dom.css.CSSStyleSheet
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

typealias Component = ComponentType<RProps>

private val testScope = MainScope()

class TestScope : CoroutineScope by testScope {
    val root = "div".asHtmlElement()

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

    fun clear() {
        unmountComponentAtNode(root)
        root.clear()
    }
}

internal fun runTest(block: suspend TestScope.() -> Unit): dynamic {
    val scope = TestScope()
    return scope.promise { block(scope) }
}

internal fun String.asHtmlElement() = document.createElement(this) as HTMLElement

/** Wait for the next animation frame, in which react most probably rendered updated the DOM.
 * This isn't certain that the DOM will be updated on the next frame,
 * so the assertions of this are needed after function invocation */
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

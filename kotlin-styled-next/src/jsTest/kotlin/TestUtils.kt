import kotlinext.js.jsObject
import kotlinx.browser.document
import kotlinx.browser.window
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.promise
import kotlinx.css.CSSBuilder
import kotlinx.dom.clear
import org.w3c.dom.HTMLElement
import org.w3c.dom.HTMLStyleElement
import org.w3c.dom.css.CSSRuleList
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

    fun injectBuilder(builder: CSSBuilder) {
        injectGlobal(builder)
    }

    fun renderComponent(component: Component) {
        root.clear()
        val reactElement = createElement(component, jsObject {})
        render(reactElement, root)
    }

    fun getStylesheet(): CSSStyleSheet {
        val styles = document.getElementById(GlobalStyles.styleId) as HTMLStyleElement
        return styles.sheet as CSSStyleSheet
    }


    fun clear() {
        unmountComponentAtNode(root)
    }
}

internal fun runTest(block: suspend TestScope.() -> Unit): dynamic {
    val scope = TestScope()
    return scope.promise { block(scope) }
}

internal fun String.asHtmlElement() = document.createElement(this) as HTMLElement

/* Currently, the recompositionRunner relies on AnimationFrame to run the recomposition and
applyChanges. Therefore we can use this method after updating the state and before making
assertions.

If tests get broken, then DefaultMonotonicFrameClock need to be checked if it still
uses window.requestAnimationFrame */
internal suspend fun waitForAnimationFrame() {
    suspendCoroutine<Unit> { continuation ->
        window.requestAnimationFrame {
            continuation.resume(Unit)
        }
    }
}

// Hack for Flow emit function not to crash in inner js code
internal suspend fun waitFlowCoroutine() {
    suspendCoroutine<Unit> { continuation ->
        Promise.Companion.resolve(Unit).then {
            continuation.resume(Unit)
        }
    }
}

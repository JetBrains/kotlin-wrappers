import kotlinext.js.jsObject
import kotlinx.browser.document
import kotlinx.browser.window
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.promise
import kotlinx.dom.clear
import org.w3c.dom.HTMLElement
import react.*
import react.dom.div
import react.dom.render
import react.dom.unmountComponentAtNode
import kotlin.coroutines.resume
import kotlin.coroutines.suspendCoroutine

fun RBuilder.Welcome(name: String) {
    div {
        +"Hello, $name"
    }
}

private val testScope = MainScope()

class TestScope : CoroutineScope by testScope {
    val root = "div".asHtmlElement()

    fun renderComponent(component: Any) {
        root.clear()
        val reactElement = createElement(component, jsObject {})
        render(reactElement, root)
    }

    fun clearComponents() {
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

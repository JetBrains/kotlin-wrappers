import dom.html.HTMLElement
import dom.html.HTMLStyleElement
import kotlinx.browser.document
import kotlinx.browser.window
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.promise
import kotlinx.css.CssBuilder
import kotlinx.dom.clear
import kotlinx.js.jso
import org.w3c.dom.Element
import org.w3c.dom.asList
import org.w3c.dom.css.CSSRule
import org.w3c.dom.css.CSSRuleList
import org.w3c.dom.css.CSSStyleDeclaration
import org.w3c.dom.css.CSSStyleSheet
import react.ComponentType
import react.Props
import react.createElement
import react.dom.client.Root
import react.dom.client.createRoot
import react.dom.flushSync
import styled.GlobalStyles
import styled.injectGlobal
import styled.sheets.*
import kotlin.coroutines.resume
import kotlin.coroutines.suspendCoroutine
import kotlin.js.Promise
import kotlin.test.assertEquals
import kotlin.test.assertNotNull
import kotlin.time.Duration
import kotlin.time.measureTime

typealias Component = ComponentType<Props>

private val testScope = MainScope()

data class RootInfo(val element: Element, var root: Root) {
    fun clear() {
        unmount()
        element.clear()
    }

    fun renderComponent(component: Component) {
        val reactElement = createElement(component, jso { })
        root.render(reactElement)
    }

    fun unmount() = flushSync {
        root.unmount()
    }

    companion object {
        fun create(): RootInfo {
            val element = createDOMElement()
            val root = createRoot(element)
            return RootInfo(element, root)
        }
    }
}

class TestScope : CoroutineScope by testScope {
    internal val sheet: CSSOMSheet
        get() = GlobalStyles.sheet as CSSOMSheet

    init {
        if (sheet.removeMode != RemoveMode.Instantly) {
            GlobalStyles.sheet = CSSOMSheet(RuleType.REGULAR, RemoveMode.Instantly)
        }
    }

    private var _rootInfo: RootInfo? = null
    internal fun getRootInfo() = _rootInfo ?: RootInfo.create().also { _rootInfo = it }
    private fun getRoot() = getRootInfo().root
    private fun getRootElement() = getRootInfo().element

    fun injectBuilder(builder: CssBuilder) {
        injectGlobal(builder)
    }

    fun CSSStyleSheet.clear() {
        for (i in 0 until cssRules.length) {
            deleteRule(0)
        }
    }

    fun getStylesheets(): List<CSSStyleSheet> {
        val elements = document.querySelectorAll(styleElementsSelector(styleId)).asList()
        return elements.map { it.unsafeCast<HTMLStyleElement>().sheet.unsafeCast<CSSStyleSheet>() }
    }

    fun getRules(): List<String> {
        return getStylesheets().flatMap { sheet ->
            sheet.cssRules.asList().map { it.cssText }
        }
    }

    fun Element.getStyle(pseudoElt: String? = null): CSSStyleDeclaration {
        return window.getComputedStyle(this, pseudoElt)
    }

    fun Element.color(pseudoElt: String? = null): String {
        return getStyle(pseudoElt).color
    }

    fun Element.alignContent(pseudoElt: String? = null): String {
        return getStyle(pseudoElt).alignContent
    }

    fun CSSRuleList.forEach(block: (rule: CSSRule) -> Unit) = asList().forEach(block)

    fun assertChildrenCount(n: Int) {
        assertEquals(n, getRootElement().childElementCount)
    }

    fun clear() {
        _rootInfo?.clear()
        _rootInfo = null
    }

    fun clearStyles() {
        GlobalStyles.sheet.clear()
        GlobalStyles.importSheet.clear()

        GlobalStyles.injectedStyleSheetRules.clear()
        GlobalStyles.injectedKeyframes.clear()
        GlobalStyles.keyframeByName.clear()
        GlobalStyles.styledClasses.clear()
        GlobalStyles.scheduledToDelete.clear()
    }

    fun clearAndInject(styledComponent: Component): Element {
        clear()
        return inject(styledComponent)
    }

    /**
     * Inject [styledComponent] into the DOM and return corresponding [Element]
     */
    fun inject(styledComponent: Component): Element {
        flushSync {
            getRootInfo().renderComponent(styledComponent)
        }
        val styledElement = getRootElement().firstElementChild
        assertNotNull(styledElement)
        return styledElement
    }
}

internal fun createDOMElement(): HTMLElement {
    return (document.createElement("div") as HTMLElement).also {
        document.body?.appendChild(it)
    }
}

internal fun runTest(block: suspend TestScope.() -> Unit): dynamic {
    val scope = TestScope()
    scope.assertChildrenCount(0)
    return scope.promise { block(scope) }
}

internal suspend fun measureTimeJSSync(block: () -> Unit): Duration = measureTimeJS {
    flushSync(block)
}

internal suspend fun measureTimeJS(block: () -> Unit): Duration = measureTime {
    block()
    waitFlowCoroutine()
}

/**
 * Wait for the next animation frame, during which React has most probably rendered the updated DOM.
 * It's not a certainty, so assertions are needed after function invocation.
 */
internal suspend fun waitForAnimationFrame() {
    suspendCoroutine<Unit> { continuation ->
        window.requestAnimationFrame {
            flushSync { continuation.resume(Unit) }
        }
    }
}

/** Hack for Flow emit function not to crash in inner js code */
private suspend fun waitFlowCoroutine() {
    suspendCoroutine<Unit> { continuation ->
        Promise.Companion.resolve(Unit).then {
            continuation.resume(Unit)
        }
    }
}

import kotlinext.js.jso
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
import org.w3c.dom.asList
import org.w3c.dom.css.CSSRule
import org.w3c.dom.css.CSSRuleList
import org.w3c.dom.css.CSSStyleDeclaration
import org.w3c.dom.css.CSSStyleSheet
import react.ComponentType
import react.Props
import react.createElement
import react.dom.render
import react.dom.unmountComponentAtNode
import styled.GlobalStyles
import styled.injectGlobal
import styled.sheets.*
import kotlin.coroutines.resume
import kotlin.coroutines.suspendCoroutine
import kotlin.js.Promise
import kotlin.test.assertEquals
import kotlin.test.assertNotNull

typealias Component = ComponentType<Props>

private val testScope = MainScope()

class TestScope : CoroutineScope by testScope {
    internal val sheet: CSSOMSheet
        get() = GlobalStyles.sheet as CSSOMSheet

    init {
        if (sheet.removeMode != RemoveMode.Instantly) {
            GlobalStyles.sheet = CSSOMSheet(RuleType.REGULAR, RemoveMode.Instantly)
        }
    }

    private var root: HTMLElement? = null
    internal fun getRoot(): HTMLElement {
        return root ?: createDOMElement().also { root = it }
    }

    fun injectBuilder(builder: CssBuilder) {
        injectGlobal(builder)
    }

    fun renderComponent(component: Component, root: Element = getRoot()) {
        val reactElement = createElement(component, jso { })
        render(reactElement, root)
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
        assertEquals(n, getRoot().childElementCount)
    }

    suspend fun clear() {
        unmount(getRoot())
        getRoot().clear()
        root = null
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

    suspend fun clearAndInject(styledComponent: Component): Element {
        clear()
        return inject(styledComponent)
    }

    /**
     * Inject [styledComponent] into the DOM and return corresponding [Element]
     */
    suspend fun inject(styledComponent: Component): Element {
        renderComponent(styledComponent)
        waitForAnimationFrame()
        val styledElement = getRoot().firstElementChild
        assertNotNull(styledElement)
        return styledElement
    }
}

internal suspend fun unmount(domContainerNode: Element?) {
    unmountComponentAtNode(domContainerNode)
    waitForAnimationFrame()
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

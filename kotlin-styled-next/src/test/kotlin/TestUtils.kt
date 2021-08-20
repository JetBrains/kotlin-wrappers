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
        if (GlobalStyles.sheet !is CSSOMSheet) {
            GlobalStyles.sheet = CSSOMSheet(RuleType.REGULAR, RemoveMode.Instantly)
        }
        if (GlobalStyles.importSheet !is CSSOMPersistentSheet) {
            GlobalStyles.importSheet = CSSOMPersistentSheet(RuleType.IMPORT)
        }
    }

    private var root: HTMLElement? = null
    internal fun getRoot(): HTMLElement {
        return root ?: (document.createElement("div") as HTMLElement).also {
            document.body?.appendChild(it)
            root = it
        }
    }

    fun injectBuilder(builder: CssBuilder) {
        injectGlobal(builder)
    }

    fun renderComponent(component: Component, root: Element = getRoot()) {
        val reactElement = createElement(component, jsObject { })
        render(reactElement, root)
    }

    fun CSSStyleSheet.clear() {
        for (i in 0 until cssRules.length) {
            deleteRule(0)
        }
    }

    fun getStylesheet(): CSSStyleSheet {
        val styles = document.getElementById(styleId) as HTMLStyleElement
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
        assertEquals(n, getRoot().childElementCount)
    }

    fun clear() {
        unmountComponentAtNode(getRoot())
        getRoot().clear()
        root = null
    }

    fun clearStyles() {
        sheet.sheet.clear()
        (GlobalStyles.importSheet as CSSOMPersistentSheet).sheet.clear()

        GlobalStyles.sheet.clear()
        GlobalStyles.importSheet.clear()
        GlobalStyles.injectedStyleSheetRules.clear()
        GlobalStyles.injectedKeyframes.clear()
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

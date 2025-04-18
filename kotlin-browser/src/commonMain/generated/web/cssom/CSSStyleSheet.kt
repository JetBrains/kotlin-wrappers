// Automatically generated - do not modify!

package web.cssom

import js.promise.Promise
import seskar.js.JsAsync
import kotlin.js.JsName
import kotlin.js.definedExternally

/**
 * The **`CSSStyleSheet`** interface represents a single CSS stylesheet, and lets you inspect and modify the list of rules contained in the stylesheet.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSStyleSheet)
 */
open external class CSSStyleSheet(
    options: CSSStyleSheetInit = definedExternally,
) : StyleSheet {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSStyleSheet/cssRules)
     */
    val cssRules: CSSRuleList

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSStyleSheet/ownerRule)
     */
    val ownerRule: CSSRule?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSStyleSheet/deleteRule)
     */
    fun deleteRule(index: Int)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSStyleSheet/insertRule)
     */
    fun insertRule(
        rule: String,
        index: Int = definedExternally,
    ): Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSStyleSheet/replace)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun replace(text: String): CSSStyleSheet

    @JsName("replace")
    fun replaceAsync(text: String): Promise<CSSStyleSheet>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSStyleSheet/replaceSync)
     */
    fun replaceSync(text: String)
}

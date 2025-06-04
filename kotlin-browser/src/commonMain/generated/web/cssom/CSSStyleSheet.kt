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
     * The read-only CSSStyleSheet property **`cssRules`** returns a live CSSRuleList which provides a real-time, up-to-date list of every CSS rule which comprises the stylesheet.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSStyleSheet/cssRules)
     */
    val cssRules: CSSRuleList

    /**
     * The read-only CSSStyleSheet property **`ownerRule`** returns the CSSImportRule corresponding to the @import at-rule which imported the stylesheet into the document.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSStyleSheet/ownerRule)
     */
    val ownerRule: CSSRule?

    /**
     * The CSSStyleSheet method **`deleteRule()`** removes a rule from the stylesheet object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSStyleSheet/deleteRule)
     */
    fun deleteRule(index: Int)

    /**
     * The **`CSSStyleSheet.insertRule()`** method inserts a new CSS rule into the current style sheet.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSStyleSheet/insertRule)
     */
    fun insertRule(
        rule: String,
        index: Int = definedExternally,
    ): Int

    /**
     * The **`replace()`** method of the CSSStyleSheet interface asynchronously replaces the content of the stylesheet with the content passed into it.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSStyleSheet/replace)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun replace(text: String): CSSStyleSheet

    @JsName("replace")
    fun replaceAsync(text: String): Promise<CSSStyleSheet>

    /**
     * The **`replaceSync()`** method of the CSSStyleSheet interface synchronously replaces the content of the stylesheet with the content passed into it.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSStyleSheet/replaceSync)
     */
    fun replaceSync(text: String)
}

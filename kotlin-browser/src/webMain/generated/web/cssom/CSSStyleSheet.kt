// Automatically generated - do not modify!

package web.cssom

import js.promise.Promise
import js.promise.await
import web.errors.DOMExceptionType.*
import web.errors.JsThrows

/**
 * The **`CSSStyleSheet`** interface represents a single CSS stylesheet, and lets you inspect and modify the list of rules contained in the stylesheet. It inherits properties and methods from its parent, StyleSheet.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSStyleSheet)
 */
open external class CSSStyleSheet(
    options: CSSStyleSheetInit = definedExternally,
) : StyleSheet {
    /**
     * The read-only CSSStyleSheet property **`cssRules`** returns a live CSSRuleList which provides a real-time, up-to-date list of every CSS rule which comprises the stylesheet. Each item in the list is a CSSRule defining a single rule.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSStyleSheet/cssRules)
     */
    val cssRules: CSSRuleList

    /**
     * The read-only CSSStyleSheet property **`ownerRule`** returns the CSSImportRule corresponding to the @import at-rule which imported the stylesheet into the document. If the stylesheet wasn't imported into the document using @import, the returned value is null.
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
    @JsThrows(HierarchyRequestError::class)
    @JsThrows(IndexSizeError::class)
    @JsThrows(InvalidStateError::class)
    @JsThrows(SyntaxError::class)
    fun insertRule(
        rule: String,
        index: Int = definedExternally,
    ): Int

    /**
     * The **`replace()`** method of the CSSStyleSheet interface asynchronously replaces the content of the stylesheet with the content passed into it. The method returns a promise that resolves with the CSSStyleSheet object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSStyleSheet/replace)
     */
    @JsThrows(NotAllowedError::class)
    @JsName("replace")
    fun replaceAsync(text: String): Promise<CSSStyleSheet>

    /**
     * The **`replaceSync()`** method of the CSSStyleSheet interface synchronously replaces the content of the stylesheet with the content passed into it.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSStyleSheet/replaceSync)
     */
    @JsThrows(NotAllowedError::class)
    fun replaceSync(text: String)
}

/**
 * The **`replace()`** method of the CSSStyleSheet interface asynchronously replaces the content of the stylesheet with the content passed into it. The method returns a promise that resolves with the CSSStyleSheet object.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSStyleSheet/replace)
 */
@JsThrows(NotAllowedError::class)
suspend inline fun CSSStyleSheet.replace(text: String): CSSStyleSheet {
    return replaceAsync(
        text = text,
    ).await()
}

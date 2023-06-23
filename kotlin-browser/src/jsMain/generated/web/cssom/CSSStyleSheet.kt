// Automatically generated - do not modify!

package web.cssom

import kotlin.js.Promise

/**
 * A single CSS style sheet. It inherits properties and methods from its parent, StyleSheet.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSStyleSheet)
 */
external class CSSStyleSheet(
    options: CSSStyleSheetInit = definedExternally,
) : StyleSheet {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSStyleSheet/cssRules) */
    val cssRules: CSSRuleList

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSStyleSheet/ownerRule) */
    val ownerRule: CSSRule?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSStyleSheet/deleteRule) */
    fun deleteRule(index: Int)

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSStyleSheet/insertRule) */
    fun insertRule(
        rule: String,
        index: Int = definedExternally,
    ): Number

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSStyleSheet/replace) */
    fun replace(text: String): Promise<CSSStyleSheet>

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSStyleSheet/replaceSync) */
    fun replaceSync(text: String)
}

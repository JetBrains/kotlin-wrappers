// Automatically generated - do not modify!

package cssom

import kotlin.js.Promise

sealed external class CSSStyleSheet :
    StyleSheet {
    val cssRules: CSSRuleList
    val ownerRule: CSSRule?
    fun deleteRule(index: Int)
    fun insertRule(
        rule: String,
        index: Int = definedExternally,
    ): Number

    fun replace(text: String): Promise<CSSStyleSheet>
    fun replaceSync(text: String)
}

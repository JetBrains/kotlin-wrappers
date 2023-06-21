// Automatically generated - do not modify!

package web.cssom

sealed external class CSSStyleRule :
    CSSRule {
    val cssRules: CSSRuleList
    var selectorText: String
    val style: CSSStyleDeclaration
    val styleMap: StylePropertyMap
    fun deleteRule(index: Int)
    fun insertRule(
        rule: String,
        index: Int = definedExternally,
    ): Number
}

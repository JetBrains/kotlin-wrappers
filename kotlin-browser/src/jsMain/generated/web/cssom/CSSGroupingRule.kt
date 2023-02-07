// Automatically generated - do not modify!

package web.cssom

sealed external class CSSGroupingRule :
    CSSRule {
    val cssRules: CSSRuleList
    fun deleteRule(index: Int)
    fun insertRule(
        rule: String,
        index: Int = definedExternally,
    ): Number
}

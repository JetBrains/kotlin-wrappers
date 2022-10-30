// Automatically generated - do not modify!

package cssom

sealed external class CSSGroupingRule :
    CSSRule {
    val cssRules: CSSRuleList
    fun deleteRule(index: Number)
    fun insertRule(
        rule: String,
        index: Number = definedExternally,
    ): Number
}

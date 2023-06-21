// Automatically generated - do not modify!

package web.cssom

import js.core.ArrayLike
import js.core.JsIterable

sealed external class CSSKeyframesRule :
    CSSRule,
    ArrayLike<CSSKeyframeRule>,
    JsIterable<CSSKeyframeRule> {
    val cssRules: CSSRuleList
    var name: String
    fun appendRule(rule: String)
    fun deleteRule(select: String)
    fun findRule(select: String): CSSKeyframeRule?
}

// Automatically generated - do not modify!

package web.cssom

import js.array.ArrayLike
import js.iterable.JsIterable

/**
 * The **`CSSKeyframesRule`** interface describes an object representing a complete set of keyframes for a CSS animation.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSKeyframesRule)
 */
external class CSSKeyframesRule
private constructor() :
    CSSRule,
    ArrayLike<CSSKeyframeRule>,
    JsIterable<CSSKeyframeRule> {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSKeyframesRule/cssRules)
     */
    val cssRules: CSSRuleList

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSKeyframesRule/length)
     */
    override val length: Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSKeyframesRule/name)
     */
    var name: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSKeyframesRule/appendRule)
     */
    fun appendRule(rule: String)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSKeyframesRule/deleteRule)
     */
    fun deleteRule(select: String)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSKeyframesRule/findRule)
     */
    fun findRule(select: String): CSSKeyframeRule?
}

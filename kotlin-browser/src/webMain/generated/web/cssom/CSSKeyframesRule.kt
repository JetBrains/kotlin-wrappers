// Automatically generated - do not modify!

package web.cssom

import js.array.ArrayLike
import js.iterable.JsIterable

/**
 * The **`CSSKeyframesRule`** interface describes an object representing a complete set of keyframes for a CSS animation. It corresponds to the contents of a whole @keyframes at-rule.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSKeyframesRule)
 */
open external class CSSKeyframesRule
private constructor() :
    CSSRule,
    ArrayLike<CSSKeyframeRule>,
    JsIterable<CSSKeyframeRule> {
    /**
     * The read-only **`cssRules`** property of the CSSKeyframeRule interface returns a CSSRuleList containing the rules in the keyframes at-rule.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSKeyframesRule/cssRules)
     */
    val cssRules: CSSRuleList

    /**
     * The read-only **`length`** property of the CSSKeyframeRule interface returns the number of CSSKeyframeRule objects in its list. You can then access each keyframe rule by its index directly on the CSSKeyframeRule object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSKeyframesRule/length)
     */
    override val length: Int

    /**
     * The **`name`** property of the CSSKeyframeRule interface gets and sets the name of the animation as used by the animation-name property.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSKeyframesRule/name)
     */
    var name: String

    /**
     * The **`appendRule()`** method of the CSSKeyframeRule interface appends a CSSKeyFrameRule to the end of the rules.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSKeyframesRule/appendRule)
     */
    fun appendRule(rule: String)

    /**
     * The **`deleteRule()`** method of the CSSKeyframeRule interface deletes the CSSKeyFrameRule that matches the specified keyframe selector.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSKeyframesRule/deleteRule)
     */
    fun deleteRule(select: String)

    /**
     * The **`findRule()`** method of the CSSKeyframeRule interface finds the CSSKeyFrameRule that matches the specified keyframe selector.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSKeyframesRule/findRule)
     */
    fun findRule(select: String): CSSKeyframeRule?
}

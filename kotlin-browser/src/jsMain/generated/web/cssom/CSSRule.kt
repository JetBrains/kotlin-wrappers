// Automatically generated - do not modify!

package web.cssom

/**
 * A single CSS rule. There are several types of rules, listed in the Type constants section below.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSRule)
 */
sealed external class CSSRule {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSRule/cssText) */
    var cssText: String

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSRule/parentRule) */
    val parentRule: CSSRule?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSRule/parentStyleSheet) */
    val parentStyleSheet: CSSStyleSheet?
    val STYLE_RULE: Short
    val CHARSET_RULE: Short
    val IMPORT_RULE: Short
    val MEDIA_RULE: Short
    val FONT_FACE_RULE: Short
    val PAGE_RULE: Short
    val NAMESPACE_RULE: Short
    val KEYFRAMES_RULE: Short
    val KEYFRAME_RULE: Short
    val SUPPORTS_RULE: Short

    companion object {
        val STYLE_RULE: Short
        val CHARSET_RULE: Short
        val IMPORT_RULE: Short
        val MEDIA_RULE: Short
        val FONT_FACE_RULE: Short
        val PAGE_RULE: Short
        val NAMESPACE_RULE: Short
        val KEYFRAMES_RULE: Short
        val KEYFRAME_RULE: Short
        val SUPPORTS_RULE: Short
    }
}

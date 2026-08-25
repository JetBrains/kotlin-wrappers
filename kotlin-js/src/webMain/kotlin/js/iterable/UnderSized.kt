package js.iterable

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Iterator/windows#underSized)
 */
@JsUnion
sealed /* union */
external interface UnderSized

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Iterator/windows#only-full)
 */
inline val UnderSized.Companion.onlyFull: UnderSized
    get() = unsafeCast("only-full")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Iterator/windows#allow-partial)
 */
inline val UnderSized.Companion.allowPartial: UnderSized
    get() = unsafeCast("allow-partial")

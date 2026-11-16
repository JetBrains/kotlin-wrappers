// Automatically generated - do not modify!

package web.aria

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaInvalid)
 */
@JsUnion
sealed /* union */
external interface AriaInvalid

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaInvalid#false)
 */
inline val AriaInvalid.Companion.`false`: AriaInvalid
    get() = unsafeCast("false")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaInvalid#grammar)
 */
inline val AriaInvalid.Companion.grammar: AriaInvalid
    get() = unsafeCast("grammar")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaInvalid#spelling)
 */
inline val AriaInvalid.Companion.spelling: AriaInvalid
    get() = unsafeCast("spelling")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaInvalid#true)
 */
inline val AriaInvalid.Companion.`true`: AriaInvalid
    get() = unsafeCast("true")

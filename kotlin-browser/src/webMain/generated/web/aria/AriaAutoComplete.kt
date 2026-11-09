// Automatically generated - do not modify!

package web.aria

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaAutoComplete)
 */
@JsUnion
sealed /* union */
external interface AriaAutoComplete

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaAutoComplete#both)
 */
inline val AriaAutoComplete.Companion.both: AriaAutoComplete
    get() = unsafeCast("both")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaAutoComplete#inline)
 */
inline val AriaAutoComplete.Companion.inline: AriaAutoComplete
    get() = unsafeCast("inline")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaAutoComplete#list)
 */
inline val AriaAutoComplete.Companion.list: AriaAutoComplete
    get() = unsafeCast("list")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaAutoComplete#none)
 */
inline val AriaAutoComplete.Companion.none: AriaAutoComplete
    get() = unsafeCast("none")

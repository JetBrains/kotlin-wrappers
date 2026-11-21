// Automatically generated - do not modify!

package web.html

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSelectElement/type)
 */
@JsUnion
sealed /* union */
external interface SelectType

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSelectElement/type#select-one)
 */
inline val SelectType.Companion.selectOne: SelectType
    get() = unsafeCast("select-one")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSelectElement/type#select-multiple)
 */
inline val SelectType.Companion.selectMultiple: SelectType
    get() = unsafeCast("select-multiple")

// Automatically generated - do not modify!

package web.html

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface SelectType

inline val SelectType.Companion.selectOne: SelectType
    get() = unsafeCast("select-one")

inline val SelectType.Companion.selectMultiple: SelectType
    get() = unsafeCast("select-multiple")

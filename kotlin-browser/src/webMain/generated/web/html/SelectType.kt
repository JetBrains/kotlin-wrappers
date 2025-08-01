// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.html

import js.reflect.unsafeCast

sealed external interface SelectType {
    companion object
}

inline val SelectType.Companion.selectOne: SelectType
    get() = unsafeCast("select-one")

inline val SelectType.Companion.selectMultiple: SelectType
    get() = unsafeCast("select-multiple")

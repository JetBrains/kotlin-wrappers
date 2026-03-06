package js.string

import js.reflect.unsafeCast

inline fun StringLike.asString(): String =
    unsafeCast(this)

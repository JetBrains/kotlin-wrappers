package js.core

import js.reflect.unsafeCast

inline fun StringLike.asString(): String =
    unsafeCast(this)

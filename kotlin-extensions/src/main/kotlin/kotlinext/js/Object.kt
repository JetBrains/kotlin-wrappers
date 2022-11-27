package kotlinext.js

import js.core.Object
import js.core.ReadonlyArray

fun Any.asJsObject(): Object = unsafeCast<Object>()

fun Any.getOwnPropertyNames(): ReadonlyArray<String> =
    Object.getOwnPropertyNames(this)

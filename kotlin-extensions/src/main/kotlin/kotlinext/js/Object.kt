package kotlinext.js

import kotlinx.js.Object
import kotlinx.js.ReadonlyArray

fun Any.asJsObject(): Object = unsafeCast<kotlinx.js.Object>()

fun Any.getOwnPropertyNames(): ReadonlyArray<String> =
    Object.getOwnPropertyNames(this)

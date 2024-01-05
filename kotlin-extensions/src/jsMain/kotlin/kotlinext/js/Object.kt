package kotlinext.js

import js.array.ReadonlyArray
import js.objects.Object

fun Any.asJsObject(): Object = unsafeCast<Object>()

fun Any.getOwnPropertyNames(): ReadonlyArray<String> =
    Object.getOwnPropertyNames(this)

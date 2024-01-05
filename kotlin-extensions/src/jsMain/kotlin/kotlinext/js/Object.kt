package kotlinext.js

import js.core.ReadonlyArray
import js.objects.Object

fun Any.asJsObject(): Object = unsafeCast<Object>()

fun Any.getOwnPropertyNames(): ReadonlyArray<String> =
    Object.getOwnPropertyNames(this)

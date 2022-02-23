package kotlinext.js

import kotlinx.js.ReadonlyArray

@Deprecated(
    message = "Will be removed soon!",
    replaceWith = ReplaceWith("kotlinx.js.PropertyDescriptor")
)
typealias PropertyDescriptor<T> = kotlinx.js.PropertyDescriptor<T>

fun Any.asJsObject(): kotlinx.js.Object = unsafeCast<kotlinx.js.Object>()

@Deprecated(
    message = "Will be removed soon!",
    replaceWith = ReplaceWith("kotlinx.js.Object")
)
typealias Object = kotlinx.js.Object

fun Any.getOwnPropertyNames(): ReadonlyArray<String> =
    kotlinx.js.Object.getOwnPropertyNames(this)

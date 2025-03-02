@file:Suppress(
    "WRONG_JS_INTEROP_TYPE",
    "UPPER_BOUND_VIOLATED",
)

package js.collections

import js.array.ReadonlyArray
import kotlin.js.definedExternally

open external class WeakSet<in T>(
    values: ReadonlyArray<T>? = definedExternally,
) {
    fun add(value: T): WeakSet<T>
    fun delete(value: T): Boolean
    fun has(key: T): Boolean
}

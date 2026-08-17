// Automatically generated - do not modify!

package web.animations

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface CompositeOperation

inline val CompositeOperation.Companion.accumulate: CompositeOperation
    get() = unsafeCast("accumulate")

inline val CompositeOperation.Companion.add: CompositeOperation
    get() = unsafeCast("add")

inline val CompositeOperation.Companion.replace: CompositeOperation
    get() = unsafeCast("replace")

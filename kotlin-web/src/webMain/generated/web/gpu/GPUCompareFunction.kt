// Automatically generated - do not modify!

package web.gpu

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface GPUCompareFunction

inline val GPUCompareFunction.Companion.always: GPUCompareFunction
    get() = unsafeCast("always")

inline val GPUCompareFunction.Companion.equal: GPUCompareFunction
    get() = unsafeCast("equal")

inline val GPUCompareFunction.Companion.greater: GPUCompareFunction
    get() = unsafeCast("greater")

inline val GPUCompareFunction.Companion.greaterEqual: GPUCompareFunction
    get() = unsafeCast("greater-equal")

inline val GPUCompareFunction.Companion.less: GPUCompareFunction
    get() = unsafeCast("less")

inline val GPUCompareFunction.Companion.lessEqual: GPUCompareFunction
    get() = unsafeCast("less-equal")

inline val GPUCompareFunction.Companion.never: GPUCompareFunction
    get() = unsafeCast("never")

inline val GPUCompareFunction.Companion.notEqual: GPUCompareFunction
    get() = unsafeCast("not-equal")

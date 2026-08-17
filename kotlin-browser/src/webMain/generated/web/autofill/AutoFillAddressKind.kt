// Automatically generated - do not modify!

package web.autofill

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface AutoFillAddressKind

inline val AutoFillAddressKind.Companion.billing: AutoFillAddressKind
    get() = unsafeCast("billing")

inline val AutoFillAddressKind.Companion.shipping: AutoFillAddressKind
    get() = unsafeCast("shipping")

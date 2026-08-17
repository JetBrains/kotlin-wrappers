// Automatically generated - do not modify!

package web.payment

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface PaymentComplete

inline val PaymentComplete.Companion.fail: PaymentComplete
    get() = unsafeCast("fail")

inline val PaymentComplete.Companion.success: PaymentComplete
    get() = unsafeCast("success")

inline val PaymentComplete.Companion.unknown: PaymentComplete
    get() = unsafeCast("unknown")

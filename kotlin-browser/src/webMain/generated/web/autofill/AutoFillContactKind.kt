// Automatically generated - do not modify!

package web.autofill

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface AutoFillContactKind

inline val AutoFillContactKind.Companion.home: AutoFillContactKind
    get() = unsafeCast("home")

inline val AutoFillContactKind.Companion.mobile: AutoFillContactKind
    get() = unsafeCast("mobile")

inline val AutoFillContactKind.Companion.work: AutoFillContactKind
    get() = unsafeCast("work")

// Automatically generated - do not modify!

package web.serviceworker

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface ClientTypes

inline val ClientTypes.Companion.all: ClientTypes
    get() = unsafeCast("all")

inline val ClientTypes.Companion.sharedworker: ClientTypes
    get() = unsafeCast("sharedworker")

inline val ClientTypes.Companion.window: ClientTypes
    get() = unsafeCast("window")

inline val ClientTypes.Companion.worker: ClientTypes
    get() = unsafeCast("worker")

// Automatically generated - do not modify!

package web.workers

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface WorkerType

inline val WorkerType.Companion.classic: WorkerType
    get() = unsafeCast("classic")

inline val WorkerType.Companion.module: WorkerType
    get() = unsafeCast("module")

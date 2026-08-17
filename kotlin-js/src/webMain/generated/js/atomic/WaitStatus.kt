// Automatically generated - do not modify!

package js.atomic

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface WaitStatus {
    sealed interface ok : WaitAsyncStatus
    sealed interface notEqual : WaitSyncStatus
    sealed interface timedOut : WaitAsyncStatus, WaitSyncStatus
}

inline val WaitStatus.Companion.ok: WaitStatus.ok
    get() = unsafeCast("ok")

inline val WaitStatus.Companion.notEqual: WaitStatus.notEqual
    get() = unsafeCast("not-equal")

inline val WaitStatus.Companion.timedOut: WaitStatus.timedOut
    get() = unsafeCast("timed-out")

sealed external interface WaitAsyncStatus : WaitStatus
sealed external interface WaitSyncStatus : WaitStatus

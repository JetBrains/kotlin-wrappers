// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package js.atomic

import js.reflect.unsafeCast

sealed external interface WaitStatus {
    sealed interface ok : WaitAsyncStatus
    sealed interface notEqual : WaitSyncStatus
    sealed interface timedOut : WaitAsyncStatus, WaitSyncStatus

    companion object
}

inline val WaitStatus.Companion.ok: WaitStatus.ok
    get() = unsafeCast("ok")

inline val WaitStatus.Companion.notEqual: WaitStatus.notEqual
    get() = unsafeCast("not-equal")

inline val WaitStatus.Companion.timedOut: WaitStatus.timedOut
    get() = unsafeCast("timed-out")

sealed external interface WaitAsyncStatus : WaitStatus
sealed external interface WaitSyncStatus : WaitStatus

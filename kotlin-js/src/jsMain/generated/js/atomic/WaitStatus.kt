// Automatically generated - do not modify!

@file:Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package js.atomic

// language=JavaScript
@JsName("""(/*union*/{ok: 'ok', notEqual: 'not-equal', timedOut: 'timed-out' }/*union*/)""")
sealed external interface WaitStatus {

    object ok : WaitAsyncStatus
    object notEqual : WaitSyncStatus
    object timedOut : WaitAsyncStatus, WaitSyncStatus
}

sealed external interface WaitAsyncStatus : WaitStatus
sealed external interface WaitSyncStatus : WaitStatus

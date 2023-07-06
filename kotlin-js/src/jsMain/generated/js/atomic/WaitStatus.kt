// Automatically generated - do not modify!

@file:Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package js.atomic

// language=JavaScript
@JsName("""(/*union*/{ok: 'ok', notEqual: 'not-equal', timedOut: 'timed-out' }/*union*/)""")
sealed external interface WaitStatus {
    companion object {
        val ok: WaitStatus
        val notEqual: WaitStatus
        val timedOut: WaitStatus
    }
}

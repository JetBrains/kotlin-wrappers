// Automatically generated - do not modify!

@file:Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package tanstack.query.core

// language=JavaScript
@JsName("""(/*union*/{fetching: 'fetching', paused: 'paused', idle: 'idle'}/*union*/)""")
sealed external interface FetchStatus {
    companion object {
        val fetching: FetchStatus
        val paused: FetchStatus
        val idle: FetchStatus
    }
}

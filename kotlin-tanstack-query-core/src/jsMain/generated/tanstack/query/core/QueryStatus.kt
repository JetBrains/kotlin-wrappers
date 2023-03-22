// Automatically generated - do not modify!

@file:Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package tanstack.query.core

// language=JavaScript
@JsName("""(/*union*/{loading: 'loading', error: 'error', success: 'success'}/*union*/)""")
sealed external interface QueryStatus {
    companion object {
        val loading: QueryStatus
        val error: QueryStatus
        val success: QueryStatus
    }
}

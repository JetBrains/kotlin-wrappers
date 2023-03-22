// Automatically generated - do not modify!

@file:Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package tanstack.query.core

// language=JavaScript
@JsName("""(/*union*/{idle: 'idle', loading: 'loading', success: 'success', error: 'error'}/*union*/)""")
sealed external interface MutationStatus {
    companion object {
        val idle: MutationStatus
        val loading: MutationStatus
        val success: MutationStatus
        val error: MutationStatus
    }
}

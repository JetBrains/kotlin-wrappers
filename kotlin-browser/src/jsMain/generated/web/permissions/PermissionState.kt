// Automatically generated - do not modify!

@file:Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.permissions

// language=JavaScript
@JsName("""(/*union*/{denied: 'denied', granted: 'granted', prompt: 'prompt'}/*union*/)""")
sealed external interface PermissionState {
    companion object {
        val denied: PermissionState
        val granted: PermissionState
        val prompt: PermissionState
    }
}

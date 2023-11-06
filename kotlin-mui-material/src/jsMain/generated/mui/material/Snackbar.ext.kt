// Automatically generated - do not modify!

package mui.material

@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
// language=JavaScript
@JsName("""(/*union*/{timeout: 'timeout', clickaway: 'clickaway', escapeKeyDown: 'escapeKeyDown'}/*union*/)""")
sealed external interface SnackbarCloseReason {
    companion object {
        val timeout: SnackbarCloseReason
        val clickaway: SnackbarCloseReason
        val escapeKeyDown: SnackbarCloseReason
    }
}

@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
// language=JavaScript
@JsName("""(/*union*/{top: 'top', bottom: 'bottom'}/*union*/)""")
sealed external interface SnackbarOriginVertical {
    companion object {
        val top: SnackbarOriginVertical
        val bottom: SnackbarOriginVertical
    }
}

@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
// language=JavaScript
@JsName("""(/*union*/{left: 'left', center: 'center', right: 'right'}/*union*/)""")
sealed external interface SnackbarOriginHorizontal {
    companion object {
        val left: SnackbarOriginHorizontal
        val center: SnackbarOriginHorizontal
        val right: SnackbarOriginHorizontal
    }
}

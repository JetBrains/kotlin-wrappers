@file:Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package react.beautiful.dnd

// There are two seperate modes that a drag can be in
// FLUID: everything is done in response to highly granular input (eg mouse)
// SNAP: items move in response to commands (eg keyboard);
// language=JavaScript
@JsName("""(/*union*/{FLUID: 'FLUID', SNAP: 'SNAP'}/*union*/)""")
sealed external interface MovementMode {
    companion object {
        val FLUID: MovementMode
        val SNAP: MovementMode
    }
}

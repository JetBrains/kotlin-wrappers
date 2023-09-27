@file:Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package react.select

// language=JavaScript
@JsName("""(/*union*/{setValue: 'set-value', inputChange: 'input-change', inputBlur: 'input-blur', menuClose: 'menu-close'}/*union*/)""")
sealed external interface InputAction {
    companion object {
        val setValue: InputAction
        val inputChange: InputAction
        val inputBlur: InputAction
        val menuClose: InputAction
    }
}

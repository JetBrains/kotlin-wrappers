package react.select

import kotlinx.js.JsPlainObject

@JsPlainObject
external interface InputActionMeta {
    val action: InputAction

    /** The previous value of the search input. */
    val prevInputValue: String
}

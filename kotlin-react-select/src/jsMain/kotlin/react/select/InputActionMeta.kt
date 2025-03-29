package react.select

import js.objects.JsPlainObject

@JsPlainObject
external interface InputActionMeta {
    val action: InputAction

    /** The previous value of the search input. */
    val prevInputValue: String
}

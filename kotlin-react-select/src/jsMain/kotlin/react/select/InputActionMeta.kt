package react.select

sealed external interface InputActionMeta {
    var action: InputAction

    /** The previous value of the search input. */
    var prevInputValue: String
}

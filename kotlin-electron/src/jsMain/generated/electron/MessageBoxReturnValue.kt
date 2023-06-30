package electron


external interface MessageBoxReturnValue {
    /**
     * The index of the clicked button.
     */
    var response: Double

    /**
     * The checked state of the checkbox if `checkboxLabel` was set. Otherwise `false`.
     */
    var checkboxChecked: Boolean
}

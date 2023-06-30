package electron


external interface TouchBarButtonConstructorOptions {
    /**
     * Button text.
     */
    var label: String?

    /**
     * A short description of the button for use by screenreaders like VoiceOver.
     */
    var accessibilityLabel: String?

    /**
     * Button background color in hex format, i.e `#ABCDEF`.
     */
    var backgroundColor: String?

    /**
     * Button icon.
     */
    var icon: Any /* (NativeImage) | (string) */?

    /**
     * Can be `left`, `right` or `overlay`. Defaults to `overlay`.
     */
    var iconPosition: (TouchBarButtonConstructorOptionsIconPosition)?

    /**
     * Function to call when the button is clicked.
     */
    var click: () -> Unit?

    /**
     * Whether the button is in an enabled state.  Default is `true`.
     */
    var enabled: Boolean?
}

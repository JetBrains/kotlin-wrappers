@file:JsModule("electron/electron")

package electron


external class TouchBarButton {
// Docs: https://electronjs.org/docs/api/touch-bar-button
    /**
     * TouchBarButton
     */
    constructor (options: TouchBarButtonConstructorOptions)

    /**
     * A `string` representing the description of the button to be read by a screen
     * reader. Will only be read by screen readers if no label is set.
     */
    var accessibilityLabel: String

    /**
     * A `string` hex code representing the button's current background color. Changing
     * this value immediately updates the button in the touch bar.
     */
    var backgroundColor: String

    /**
     * A `boolean` representing whether the button is in an enabled state.
     */
    var enabled: Boolean

    /**
     * A `NativeImage` representing the button's current icon. Changing this value
     * immediately updates the button in the touch bar.
     */
    var icon: NativeImage

    /**
     * A `string` - Can be `left`, `right` or `overlay`.  Defaults to `overlay`.
     */
    var iconPosition: (TouchBarButtonIconPosition)

    /**
     * A `string` representing the button's current text. Changing this value
     * immediately updates the button in the touch bar.
     */
    var label: String
}

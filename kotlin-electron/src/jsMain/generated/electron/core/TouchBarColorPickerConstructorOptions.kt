package electron.core


external interface TouchBarColorPickerConstructorOptions {
    /**
     * Array of hex color strings to appear as possible colors to select.
     */
    var availableColors: js.core.ReadonlyArray<String>?

    /**
     * The selected hex color in the picker, i.e `#ABCDEF`.
     */
    var selectedColor: String?

    /**
     * Function to call when a color is selected.
     */
    var change: ((color: String) -> Unit)?
}

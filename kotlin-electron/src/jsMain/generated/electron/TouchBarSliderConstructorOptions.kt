package electron


external interface TouchBarSliderConstructorOptions {
    /**
     * Label text.
     */
    var label: String?

    /**
     * Selected value.
     */
    var value: Double?

    /**
     * Minimum value.
     */
    var minValue: Double?

    /**
     * Maximum value.
     */
    var maxValue: Double?

    /**
     * Function to call when the slider is changed.
     */
    var change: (newValue: Double) -> Unit?
}

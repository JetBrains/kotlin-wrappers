@file:JsModule("electron/electron")

package electron

import node.events.EventEmitter as NodeEventEmitter


external class TouchBarSlider : NodeEventEmitter {
// Docs: https://electronjs.org/docs/api/touch-bar-slider
    /**
     * TouchBarSlider
     */
    constructor (options: TouchBarSliderConstructorOptions)

    /**
     * A `string` representing the slider's current text. Changing this value
     * immediately updates the slider in the touch bar.
     */
    var label: String

    /**
     * A `number` representing the slider's current maximum value. Changing this value
     * immediately updates the slider in the touch bar.
     */
    var maxValue: Double

    /**
     * A `number` representing the slider's current minimum value. Changing this value
     * immediately updates the slider in the touch bar.
     */
    var minValue: Double

    /**
     * A `number` representing the slider's current value. Changing this value
     * immediately updates the slider in the touch bar.
     */
    var value: Double
}

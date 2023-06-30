@file:JsModule("INTERNAL_ENTITY")

package electron

import node.events.EventEmitter as NodeEventEmitter


external class TouchBarColorPicker : NodeEventEmitter {
// Docs: https://electronjs.org/docs/api/touch-bar-color-picker
    /**
     * TouchBarColorPicker
     */
    constructor (options: TouchBarColorPickerConstructorOptions)

    /**
     * A `string[]` array representing the color picker's available colors to select.
     * Changing this value immediately updates the color picker in the touch bar.
     */
    var availableColors: js.core.ReadonlyArray<String>

    /**
     * A `string` hex code representing the color picker's currently selected color.
     * Changing this value immediately updates the color picker in the touch bar.
     */
    var selectedColor: String
}

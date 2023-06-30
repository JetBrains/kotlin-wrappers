@file:JsModule("INTERNAL_ENTITY")

package electron.core

import node.events.EventEmitter as NodeEventEmitter


external class TouchBarScrubber : NodeEventEmitter {
// Docs: https://electronjs.org/docs/api/touch-bar-scrubber
    /**
     * TouchBarScrubber
     */
    constructor (options: TouchBarScrubberConstructorOptions)

    /**
     * A `boolean` representing whether this scrubber is continuous or not. Updating
     * this value immediately updates the control in the touch bar.
     */
    var continuous: Boolean

    /**
     * A `ScrubberItem[]` array representing the items in this scrubber. Updating this
     * value immediately updates the control in the touch bar. Updating deep properties
     * inside this array **does not update the touch bar**.
     */
    var items: js.core.ReadonlyArray<ScrubberItem>

    /**
     * A `string` representing the mode of this scrubber. Updating this value
     * immediately updates the control in the touch bar. Possible values:
     *
     * * `fixed` - Maps to `NSScrubberModeFixed`.
     * * `free` - Maps to `NSScrubberModeFree`.
     */
    var mode: (TouchBarScrubberMode)

    /**
     * A `string` representing the style that selected items in the scrubber should
     * have. This style is overlayed on top of the scrubber item instead of being
     * placed behind it. Updating this value immediately updates the control in the
     * touch bar. Possible values:
     *
     * * `background` - Maps to `[NSScrubberSelectionStyle roundedBackgroundStyle]`.
     * * `outline` - Maps to `[NSScrubberSelectionStyle outlineOverlayStyle]`.
     * * `none` - Removes all styles.
     */
    var overlayStyle: (TouchBarScrubberOverlayStyle)

    /**
     * A `string` representing the style that selected items in the scrubber should
     * have. Updating this value immediately updates the control in the touch bar.
     * Possible values:
     *
     * * `background` - Maps to `[NSScrubberSelectionStyle roundedBackgroundStyle]`.
     * * `outline` - Maps to `[NSScrubberSelectionStyle outlineOverlayStyle]`.
     * * `none` - Removes all styles.
     */
    var selectedStyle: (TouchBarScrubberSelectedStyle)

    /**
     * A `boolean` representing whether to show the left / right selection arrows in
     * this scrubber. Updating this value immediately updates the control in the touch
     * bar.
     */
    var showArrowButtons: Boolean
}

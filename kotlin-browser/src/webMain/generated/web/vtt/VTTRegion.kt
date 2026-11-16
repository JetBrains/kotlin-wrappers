// Automatically generated - do not modify!

package web.vtt

/**
 * The **`VTTRegion`** interface of the WebVTT API describes a portion of the video to render a VTTCue onto.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VTTRegion)
 */
open external class VTTRegion {
    /**
     * The **`id`** property of the VTTRegion interface is a string that identifies the region.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VTTRegion/id)
     */
    open var id: String

    /**
     * The **`lines`** property of the VTTRegion interface represents the height of the region, in number of lines.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VTTRegion/lines)
     */
    open var lines: Int

    /**
     * The **`regionAnchorX`** property of the VTTRegion interface represents the x-coordinate of the region anchor, as a percentage of the region's width.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VTTRegion/regionAnchorX)
     */
    open var regionAnchorX: Double

    /**
     * The **`regionAnchorY`** property of the VTTRegion interface represents the y-coordinate of the region anchor, as a percentage of the region's height.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VTTRegion/regionAnchorY)
     */
    open var regionAnchorY: Double

    /**
     * The **`scroll`** property of the VTTRegion interface is an enumerated value indicating how existing cues in the region move when a new cue is added.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VTTRegion/scroll)
     */
    open var scroll: ScrollSetting

    /**
     * The **`viewportAnchorX`** property of the VTTRegion interface represents the x-coordinate of the viewport anchor, as a percentage of the video's width.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VTTRegion/viewportAnchorX)
     */
    open var viewportAnchorX: Double

    /**
     * The **`viewportAnchorY`** property of the VTTRegion interface represents the y-coordinate of the viewport anchor, as a percentage of the video's height.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VTTRegion/viewportAnchorY)
     */
    open var viewportAnchorY: Double

    /**
     * The **`width`** property of the VTTRegion interface represents the width of the region, as a percentage of the video's width.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VTTRegion/width)
     */
    open var width: Double
}

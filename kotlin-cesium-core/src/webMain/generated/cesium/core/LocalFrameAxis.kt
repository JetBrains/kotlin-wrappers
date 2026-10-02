// Automatically generated - do not modify!

package cesium.core

import seskar.js.JsValue

/**
 * The name of an axis in a local reference frame centered at a point on the ellipsoid:
 * 'east', 'north', 'up', 'west', 'south', or 'down'.
 */
sealed external interface LocalFrameAxis {
    companion object {
        @JsValue("east")
        val east: LocalFrameAxis

        @JsValue("north")
        val north: LocalFrameAxis

        @JsValue("up")
        val up: LocalFrameAxis

        @JsValue("west")
        val west: LocalFrameAxis

        @JsValue("south")
        val south: LocalFrameAxis

        @JsValue("down")
        val down: LocalFrameAxis
    }
}

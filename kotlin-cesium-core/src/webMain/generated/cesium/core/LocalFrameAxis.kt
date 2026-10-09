// Automatically generated - do not modify!

package cesium.core

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * The name of an axis in a local reference frame centered at a point on the ellipsoid:
 * 'east', 'north', 'up', 'west', 'south', or 'down'.
 */
@JsUnion
sealed /* union */
external interface LocalFrameAxis

inline val LocalFrameAxis.Companion.east: LocalFrameAxis
    get() = unsafeCast("east")

inline val LocalFrameAxis.Companion.north: LocalFrameAxis
    get() = unsafeCast("north")

inline val LocalFrameAxis.Companion.up: LocalFrameAxis
    get() = unsafeCast("up")

inline val LocalFrameAxis.Companion.west: LocalFrameAxis
    get() = unsafeCast("west")

inline val LocalFrameAxis.Companion.south: LocalFrameAxis
    get() = unsafeCast("south")

inline val LocalFrameAxis.Companion.down: LocalFrameAxis
    get() = unsafeCast("down")

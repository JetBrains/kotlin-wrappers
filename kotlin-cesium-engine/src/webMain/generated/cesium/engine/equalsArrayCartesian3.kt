// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

import js.array.ReadonlyArray

/**
 * Returns whether the given arrays are component-wise equal.
 *
 * When both arrays are undefined, then `true` is returned.
 * When only one array is defined, or they are both defined but have
 * different lengths, then `false` is returned.
 *
 * Otherwise, returns whether the corresponding elements of the arrays
 * are equal, as of `Cartesian3.equals`.
 * @param [a] The first array
 * @param [b] The second array
 * @return Whether the arrays are equal
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#equalsArrayCartesian3">Online Documentation</a>
 */
external fun equalsArrayCartesian3(
    a: ReadonlyArray<Cartesian3>?,
    b: ReadonlyArray<Cartesian3>?,
): Boolean

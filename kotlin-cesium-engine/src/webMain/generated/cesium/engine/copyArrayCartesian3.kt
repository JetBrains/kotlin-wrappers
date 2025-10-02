// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

import js.array.ReadonlyArray

/**
 * Returns a deep copy of the given array.
 *
 * If the input is undefined, then `undefined` is returned.
 *
 * Otherwise, the result will be a copy of the given array, where
 * each element is copied with `Cartesian3.clone`.
 * @param [input] The input array
 * @return The copy
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#copyArrayCartesian3">Online Documentation</a>
 */
external fun copyArrayCartesian3(input: ReadonlyArray<Cartesian3>?): ReadonlyArray<Cartesian3>?

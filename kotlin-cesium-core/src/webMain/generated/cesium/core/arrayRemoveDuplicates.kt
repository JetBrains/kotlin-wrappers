// Automatically generated - do not modify!

@file:JsModule("@cesium/core")

package cesium.core

import js.array.ReadonlyArray
import js.numbers.JsDouble

/**
 * Removes adjacent duplicate values in an array of values.
 * ```
 * // Returns [(1.0, 1.0, 1.0), (2.0, 2.0, 2.0), (3.0, 3.0, 3.0), (1.0, 1.0, 1.0)]
 * const values = [
 *     new Cartesian3(1.0, 1.0, 1.0),
 *     new Cartesian3(1.0, 1.0, 1.0),
 *     new Cartesian3(2.0, 2.0, 2.0),
 *     new Cartesian3(3.0, 3.0, 3.0),
 *     new Cartesian3(1.0, 1.0, 1.0)];
 * const nonDuplicatevalues = PolylinePipeline.removeDuplicates(values, Cartesian3.equalsEpsilon);
 * ```
 * ```
 * // Returns [(1.0, 1.0, 1.0), (2.0, 2.0, 2.0), (3.0, 3.0, 3.0)]
 * const values = [
 *     new Cartesian3(1.0, 1.0, 1.0),
 *     new Cartesian3(1.0, 1.0, 1.0),
 *     new Cartesian3(2.0, 2.0, 2.0),
 *     new Cartesian3(3.0, 3.0, 3.0),
 *     new Cartesian3(1.0, 1.0, 1.0)];
 * const nonDuplicatevalues = PolylinePipeline.removeDuplicates(values, Cartesian3.equalsEpsilon, true);
 * ```
 * ```
 * // Returns [(1.0, 1.0, 1.0), (2.0, 2.0, 2.0), (3.0, 3.0, 3.0)]
 * // removedIndices will be equal to [1, 3, 5]
 * const values = [
 *     new Cartesian3(1.0, 1.0, 1.0),
 *     new Cartesian3(1.0, 1.0, 1.0),
 *     new Cartesian3(2.0, 2.0, 2.0),
 *     new Cartesian3(2.0, 2.0, 2.0),
 *     new Cartesian3(3.0, 3.0, 3.0),
 *     new Cartesian3(1.0, 1.0, 1.0)];
 * const nonDuplicatevalues = PolylinePipeline.removeDuplicates(values, Cartesian3.equalsEpsilon, true);
 * ```
 * @param [values] The array of values.
 * @param [equalsEpsilon] Function to compare values with an epsilon. Boolean equalsEpsilon(left, right, epsilon).
 * @param [wrapAround] Compare the last value in the array against the first value. If they are equal, the last value is removed.
 *   Default value - `false`
 * @param [removedIndices] Store the indices that correspond to the duplicate items removed from the array, if there were any.
 * @return A new array of values with no adjacent duplicate values or the input array if no duplicates were found.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#arrayRemoveDuplicates">Online Documentation</a>
 */
external fun arrayRemoveDuplicates(
    values: ReadonlyArray<JsAny>,
    equalsEpsilon: Function<*>,
    wrapAround: Boolean? = definedExternally,
    removedIndices: ReadonlyArray<JsDouble>? = definedExternally,
): ReadonlyArray<JsAny>

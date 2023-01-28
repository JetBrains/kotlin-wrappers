// Automatically generated - do not modify!

@file:JsModule("cesium")

package cesium

import js.core.ReadonlyArray

/**
 * A stable merge sort.
 * ```
 * // Assume array contains BoundingSpheres in world coordinates.
 * // Sort them in ascending order of distance from the camera.
 * const position = camera.positionWC;
 * mergeSort(array, function(a, b, position) {
 *     return BoundingSphere.distanceSquaredTo(b, position) - BoundingSphere.distanceSquaredTo(a, position);
 * }, position);
 * ```
 * @param [array] The array to sort.
 * @param [comparator] The function to use to compare elements in the array.
 * @param [userDefinedObject] Any item to pass as the third parameter to `comparator`.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/mergeSort.html">Online Documentation</a>
 */
external fun mergeSort(
    array: ReadonlyArray<Any>,
    comparator: mergeSortComparator,
    userDefinedObject: Any? = definedExternally,
)

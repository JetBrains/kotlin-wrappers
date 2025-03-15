// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

import js.array.ReadonlyArray

/**
 * Finds an item in a sorted array.
 * ```
 * // Create a comparator function to search through an array of numbers.
 * function comparator(a, b) {
 *     return a - b;
 * };
 * const numbers = [0, 2, 4, 6, 8];
 * const index = binarySearch(numbers, 6, comparator); // 3
 * ```
 * @param [array] The sorted array to search.
 * @param [itemToFind] The item to find in the array.
 * @param [comparator] The function to use to compare the item to
 *   elements in the array.
 * @return The index of `itemToFind` in the array, if it exists.  If `itemToFind`
 *   does not exist, the return value is a negative number which is the bitwise complement (~)
 *   of the index before which the itemToFind should be inserted in order to maintain the
 *   sorted order of the array.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#binarySearch">Online Documentation</a>
 */
external fun binarySearch(
    array: ReadonlyArray<Any>,
    itemToFind: Any,
    comparator: binarySearchComparator,
): Int

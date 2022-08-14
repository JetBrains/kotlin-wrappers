// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

package cesium

import kotlinx.js.ReadonlyArray

/**
 * Static interface for types which can store their values as packed
 * elements in an array.  These methods and properties are expected to be
 * defined on a constructor function.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Packable.html">Online Documentation</a>
 */
external interface Packable<T : Any> {


    /**
     * The number of elements used to pack the object into an array.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Packable.html#.packedLength">Online Documentation</a>
     */
    val packedLength: Int

    /**
     * Stores the provided instance into the provided array.
     * @param [value] The value to pack.
     * @param [array] The array to pack into.
     * @param [startingIndex] The index into the array at which to start packing the elements.
     *   Default value - `0`
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Packable.html#.pack">Online Documentation</a>
     */
    fun pack(
        value: T,
        array: ReadonlyArray<Double>,
        startingIndex: Int? = definedExternally,
    ): ReadonlyArray<Double>

    /**
     * Retrieves an instance from a packed array.
     * @param [array] The packed array.
     * @param [startingIndex] The starting index of the element to be unpacked.
     *   Default value - `0`
     * @param [result] The object into which to store the result.
     * @return The modified result parameter or a new Object instance if one was not provided.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Packable.html#.unpack">Online Documentation</a>
     */
    fun unpack(
        array: ReadonlyArray<Double>,
        startingIndex: Int? = definedExternally,
        result: T? = definedExternally,
    ): T
}

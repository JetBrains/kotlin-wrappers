// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

package cesium

import kotlinx.js.ReadonlyArray

/**
 * Static interface for [Packable] types which are interpolated in a
 * different representation than their packed value.  These methods and
 * properties are expected to be defined on a constructor function.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PackableForInterpolation.html">Online Documentation</a>
 */
external object PackableForInterpolation {
    /**
     * The number of elements used to store the object into an array in its interpolatable form.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PackableForInterpolation.html#.packedInterpolationLength">Online Documentation</a>
     */
    var packedInterpolationLength: Int

    /**
     * Converts a packed array into a form suitable for interpolation.
     * @param [packedArray] The packed array.
     * @param [startingIndex] The index of the first element to be converted.
     *   Default value - `0`
     * @param [lastIndex] The index of the last element to be converted.
     *   Default value - [packedArray.size]
     * @param [result] The object into which to store the result.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PackableForInterpolation.html#.convertPackedArrayForInterpolation">Online Documentation</a>
     */
    fun convertPackedArrayForInterpolation(
        packedArray: ReadonlyArray<Double>,
        startingIndex: Int? = definedExternally,
        lastIndex: Int? = definedExternally,
        result: ReadonlyArray<Double>? = definedExternally,
    )

    /**
     * Retrieves an instance from a packed array converted with [PackableForInterpolation.convertPackedArrayForInterpolation].
     * @param [array] The array previously packed for interpolation.
     * @param [sourceArray] The original packed array.
     * @param [startingIndex] The startingIndex used to convert the array.
     *   Default value - `0`
     * @param [lastIndex] The lastIndex used to convert the array.
     *   Default value - [packedArray.size]
     * @param [result] The object into which to store the result.
     * @return The modified result parameter or a new Object instance if one was not provided.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PackableForInterpolation.html#.unpackInterpolationResult">Online Documentation</a>
     */
    fun unpackInterpolationResult(
        array: ReadonlyArray<Double>,
        sourceArray: ReadonlyArray<Double>,
        startingIndex: Int? = definedExternally,
        lastIndex: Int? = definedExternally,
        result: Any? = definedExternally,
    ): Any
}

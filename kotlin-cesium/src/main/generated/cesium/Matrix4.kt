// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

package cesium

import js.core.ReadonlyArray

/**
 * A 4x4 matrix, indexable as a column-major order array.
 * Constructor parameters are in row-major order for code readability.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix4.html">Online Documentation</a>
 *
 * @constructor
 * @param [column0Row0] The value for column 0, row 0.
 *   Default value - `0.0`
 * @param [column1Row0] The value for column 1, row 0.
 *   Default value - `0.0`
 * @param [column2Row0] The value for column 2, row 0.
 *   Default value - `0.0`
 * @param [column3Row0] The value for column 3, row 0.
 *   Default value - `0.0`
 * @param [column0Row1] The value for column 0, row 1.
 *   Default value - `0.0`
 * @param [column1Row1] The value for column 1, row 1.
 *   Default value - `0.0`
 * @param [column2Row1] The value for column 2, row 1.
 *   Default value - `0.0`
 * @param [column3Row1] The value for column 3, row 1.
 *   Default value - `0.0`
 * @param [column0Row2] The value for column 0, row 2.
 *   Default value - `0.0`
 * @param [column1Row2] The value for column 1, row 2.
 *   Default value - `0.0`
 * @param [column2Row2] The value for column 2, row 2.
 *   Default value - `0.0`
 * @param [column3Row2] The value for column 3, row 2.
 *   Default value - `0.0`
 * @param [column0Row3] The value for column 0, row 3.
 *   Default value - `0.0`
 * @param [column1Row3] The value for column 1, row 3.
 *   Default value - `0.0`
 * @param [column2Row3] The value for column 2, row 3.
 *   Default value - `0.0`
 * @param [column3Row3] The value for column 3, row 3.
 *   Default value - `0.0`
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix4.html">Online Documentation</a>
 */
external class Matrix4(
    column0Row0: Double? = definedExternally,
    column1Row0: Double? = definedExternally,
    column2Row0: Double? = definedExternally,
    column3Row0: Double? = definedExternally,
    column0Row1: Double? = definedExternally,
    column1Row1: Double? = definedExternally,
    column2Row1: Double? = definedExternally,
    column3Row1: Double? = definedExternally,
    column0Row2: Double? = definedExternally,
    column1Row2: Double? = definedExternally,
    column2Row2: Double? = definedExternally,
    column3Row2: Double? = definedExternally,
    column0Row3: Double? = definedExternally,
    column1Row3: Double? = definedExternally,
    column2Row3: Double? = definedExternally,
    column3Row3: Double? = definedExternally,
) {
    /**
     * Gets the number of items in the collection.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix4.html#length">Online Documentation</a>
     */
    var length: Int

    /**
     * Duplicates the provided Matrix4 instance.
     * @param [result] The object onto which to store the result.
     * @return The modified result parameter or a new Matrix4 instance if one was not provided.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix4.html#clone">Online Documentation</a>
     */
    fun clone(result: Matrix4? = definedExternally): Matrix4

    /**
     * Compares this matrix to the provided matrix componentwise and returns
     * `true` if they are within the provided epsilon,
     * `false` otherwise.
     * @param [right] The right hand side matrix.
     * @param [epsilon] The epsilon to use for equality testing.
     *   Default value - `0`
     * @return `true` if they are within the provided epsilon, `false` otherwise.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix4.html#equalsEpsilon">Online Documentation</a>
     */
    fun equalsEpsilon(
        right: Matrix4? = definedExternally,
        epsilon: Double? = definedExternally,
    ): Boolean

    companion object : Packable<Matrix4> {
        /**
         * The number of elements used to pack the object into an array.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix4.html#.packedLength">Online Documentation</a>
         */
        override val packedLength: Int

        /**
         * Stores the provided instance into the provided array.
         * @param [value] The value to pack.
         * @param [array] The array to pack into.
         * @param [startingIndex] The index into the array at which to start packing the elements.
         *   Default value - `0`
         * @return The array that was packed into
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix4.html#.pack">Online Documentation</a>
         */
        override fun pack(
            value: Matrix4,
            array: ReadonlyArray<Double>,
            startingIndex: Int?,
        ): ReadonlyArray<Double>

        /**
         * Retrieves an instance from a packed array.
         * @param [array] The packed array.
         * @param [startingIndex] The starting index of the element to be unpacked.
         *   Default value - `0`
         * @param [result] The object into which to store the result.
         * @return The modified result parameter or a new Matrix4 instance if one was not provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix4.html#.unpack">Online Documentation</a>
         */
        override fun unpack(
            array: ReadonlyArray<Double>,
            startingIndex: Int?,
            result: Matrix4?,
        ): Matrix4

        /**
         * Flattens an array of Matrix4s into an array of components. The components
         * are stored in column-major order.
         * @param [array] The array of matrices to pack.
         * @param [result] The array onto which to store the result. If this is a typed array, it must have array.length * 16 components, else a [DeveloperError] will be thrown. If it is a regular array, it will be resized to have (array.length * 16) elements.
         * @return The packed array.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix4.html#.packArray">Online Documentation</a>
         */
        fun packArray(
            array: ReadonlyArray<Matrix4>,
            result: ReadonlyArray<Double>? = definedExternally,
        ): ReadonlyArray<Double>

        /**
         * Unpacks an array of column-major matrix components into an array of Matrix4s.
         * @param [array] The array of components to unpack.
         * @param [result] The array onto which to store the result.
         * @return The unpacked array.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix4.html#.unpackArray">Online Documentation</a>
         */
        fun unpackArray(
            array: ReadonlyArray<Double>,
            result: ReadonlyArray<Matrix4>? = definedExternally,
        ): ReadonlyArray<Matrix4>

        /**
         * Duplicates a Matrix4 instance.
         * @param [matrix] The matrix to duplicate.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter or a new Matrix4 instance if one was not provided. (Returns undefined if matrix is undefined)
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix4.html#.clone">Online Documentation</a>
         */
        fun clone(
            matrix: Matrix4,
            result: Matrix4? = definedExternally,
        ): Matrix4

        /**
         * Creates a Matrix4 from 16 consecutive elements in an array.
         * ```
         * // Create the Matrix4:
         * // [1.0, 2.0, 3.0, 4.0]
         * // [1.0, 2.0, 3.0, 4.0]
         * // [1.0, 2.0, 3.0, 4.0]
         * // [1.0, 2.0, 3.0, 4.0]
         *
         * const v = [1.0, 1.0, 1.0, 1.0, 2.0, 2.0, 2.0, 2.0, 3.0, 3.0, 3.0, 3.0, 4.0, 4.0, 4.0, 4.0];
         * const m = Matrix4.fromArray(v);
         *
         * // Create same Matrix4 with using an offset into an array
         * const v2 = [0.0, 0.0, 1.0, 1.0, 1.0, 1.0, 2.0, 2.0, 2.0, 2.0, 3.0, 3.0, 3.0, 3.0, 4.0, 4.0, 4.0, 4.0];
         * const m2 = Matrix4.fromArray(v2, 2);
         * ```
         * @param [array] The array whose 16 consecutive elements correspond to the positions of the matrix.  Assumes column-major order.
         * @param [startingIndex] The offset into the array of the first element, which corresponds to first column first row position in the matrix.
         *   Default value - `0`
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter or a new Matrix4 instance if one was not provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix4.html#.fromArray">Online Documentation</a>
         */
        fun fromArray(
            array: ReadonlyArray<Double>,
            startingIndex: Int? = definedExternally,
            result: Matrix4? = definedExternally,
        ): Matrix4

        /**
         * Computes a Matrix4 instance from a column-major order array.
         * @param [values] The column-major order array.
         * @param [result] The object in which the result will be stored, if undefined a new instance will be created.
         * @return The modified result parameter, or a new Matrix4 instance if one was not provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix4.html#.fromColumnMajorArray">Online Documentation</a>
         */
        fun fromColumnMajorArray(
            values: ReadonlyArray<Double>,
            result: Matrix4? = definedExternally,
        ): Matrix4

        /**
         * Computes a Matrix4 instance from a row-major order array.
         * The resulting matrix will be in column-major order.
         * @param [values] The row-major order array.
         * @param [result] The object in which the result will be stored, if undefined a new instance will be created.
         * @return The modified result parameter, or a new Matrix4 instance if one was not provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix4.html#.fromRowMajorArray">Online Documentation</a>
         */
        fun fromRowMajorArray(
            values: ReadonlyArray<Double>,
            result: Matrix4? = definedExternally,
        ): Matrix4

        /**
         * Computes a Matrix4 instance from a Matrix3 representing the rotation
         * and a Cartesian3 representing the translation.
         * @param [rotation] The upper left portion of the matrix representing the rotation.
         * @param [translation] The upper right portion of the matrix representing the translation.
         *   Default value - [Cartesian3.ZERO]
         * @param [result] The object in which the result will be stored, if undefined a new instance will be created.
         * @return The modified result parameter, or a new Matrix4 instance if one was not provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix4.html#.fromRotationTranslation">Online Documentation</a>
         */
        fun fromRotationTranslation(
            rotation: Matrix3,
            translation: Cartesian3? = definedExternally,
            result: Matrix4? = definedExternally,
        ): Matrix4

        /**
         * Computes a Matrix4 instance from a translation, rotation, and scale (TRS)
         * representation with the rotation represented as a quaternion.
         * ```
         * const result = Matrix4.fromTranslationQuaternionRotationScale(
         *   new Cartesian3(1.0, 2.0, 3.0), // translation
         *   Quaternion.IDENTITY,           // rotation
         *   new Cartesian3(7.0, 8.0, 9.0), // scale
         *   result);
         * ```
         * @param [translation] The translation transformation.
         * @param [rotation] The rotation transformation.
         * @param [scale] The non-uniform scale transformation.
         * @param [result] The object in which the result will be stored, if undefined a new instance will be created.
         * @return The modified result parameter, or a new Matrix4 instance if one was not provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix4.html#.fromTranslationQuaternionRotationScale">Online Documentation</a>
         */
        fun fromTranslationQuaternionRotationScale(
            translation: Cartesian3,
            rotation: Quaternion,
            scale: Cartesian3,
            result: Matrix4? = definedExternally,
        ): Matrix4

        /**
         * Creates a Matrix4 instance from a [TranslationRotationScale] instance.
         * @param [translationRotationScale] The instance.
         * @param [result] The object in which the result will be stored, if undefined a new instance will be created.
         * @return The modified result parameter, or a new Matrix4 instance if one was not provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix4.html#.fromTranslationRotationScale">Online Documentation</a>
         */
        fun fromTranslationRotationScale(
            translationRotationScale: TranslationRotationScale,
            result: Matrix4? = definedExternally,
        ): Matrix4

        /**
         * Creates a Matrix4 instance from a Cartesian3 representing the translation.
         * @param [translation] The upper right portion of the matrix representing the translation.
         * @param [result] The object in which the result will be stored, if undefined a new instance will be created.
         * @return The modified result parameter, or a new Matrix4 instance if one was not provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix4.html#.fromTranslation">Online Documentation</a>
         */
        fun fromTranslation(
            translation: Cartesian3,
            result: Matrix4? = definedExternally,
        ): Matrix4

        /**
         * Computes a Matrix4 instance representing a non-uniform scale.
         * ```
         * // Creates
         * //   [7.0, 0.0, 0.0, 0.0]
         * //   [0.0, 8.0, 0.0, 0.0]
         * //   [0.0, 0.0, 9.0, 0.0]
         * //   [0.0, 0.0, 0.0, 1.0]
         * const m = Matrix4.fromScale(new Cartesian3(7.0, 8.0, 9.0));
         * ```
         * @param [scale] The x, y, and z scale factors.
         * @param [result] The object in which the result will be stored, if undefined a new instance will be created.
         * @return The modified result parameter, or a new Matrix4 instance if one was not provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix4.html#.fromScale">Online Documentation</a>
         */
        fun fromScale(
            scale: Cartesian3,
            result: Matrix4? = definedExternally,
        ): Matrix4

        /**
         * Computes a Matrix4 instance representing a uniform scale.
         * ```
         * // Creates
         * //   [2.0, 0.0, 0.0, 0.0]
         * //   [0.0, 2.0, 0.0, 0.0]
         * //   [0.0, 0.0, 2.0, 0.0]
         * //   [0.0, 0.0, 0.0, 1.0]
         * const m = Matrix4.fromUniformScale(2.0);
         * ```
         * @param [scale] The uniform scale factor.
         * @param [result] The object in which the result will be stored, if undefined a new instance will be created.
         * @return The modified result parameter, or a new Matrix4 instance if one was not provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix4.html#.fromUniformScale">Online Documentation</a>
         */
        fun fromUniformScale(
            scale: Double,
            result: Matrix4? = definedExternally,
        ): Matrix4

        /**
         * Creates a rotation matrix.
         * @param [rotation] The rotation matrix.
         * @param [result] The object in which the result will be stored, if undefined a new instance will be created.
         * @return The modified result parameter, or a new Matrix4 instance if one was not provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix4.html#.fromRotation">Online Documentation</a>
         */
        fun fromRotation(
            rotation: Matrix3,
            result: Matrix4? = definedExternally,
        ): Matrix4

        /**
         * Computes a Matrix4 instance from a Camera.
         * @param [camera] The camera to use.
         * @param [result] The object in which the result will be stored, if undefined a new instance will be created.
         * @return The modified result parameter, or a new Matrix4 instance if one was not provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix4.html#.fromCamera">Online Documentation</a>
         */
        fun fromCamera(
            camera: Camera,
            result: Matrix4? = definedExternally,
        ): Matrix4

        /**
         * Computes a Matrix4 instance representing a perspective transformation matrix.
         * @param [fovY] The field of view along the Y axis in radians.
         * @param [aspectRatio] The aspect ratio.
         * @param [near] The distance to the near plane in meters.
         * @param [far] The distance to the far plane in meters.
         * @param [result] The object in which the result will be stored.
         * @return The modified result parameter.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix4.html#.computePerspectiveFieldOfView">Online Documentation</a>
         */
        fun computePerspectiveFieldOfView(
            fovY: Double,
            aspectRatio: Double,
            near: Double,
            far: Double,
            result: Matrix4,
        ): Matrix4

        /**
         * Computes a Matrix4 instance representing an orthographic transformation matrix.
         * @param [left] The number of meters to the left of the camera that will be in view.
         * @param [right] The number of meters to the right of the camera that will be in view.
         * @param [bottom] The number of meters below of the camera that will be in view.
         * @param [top] The number of meters above of the camera that will be in view.
         * @param [near] The distance to the near plane in meters.
         * @param [far] The distance to the far plane in meters.
         * @param [result] The object in which the result will be stored.
         * @return The modified result parameter.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix4.html#.computeOrthographicOffCenter">Online Documentation</a>
         */
        fun computeOrthographicOffCenter(
            left: Double,
            right: Double,
            bottom: Double,
            top: Double,
            near: Double,
            far: Double,
            result: Matrix4,
        ): Matrix4

        /**
         * Computes a Matrix4 instance representing an off center perspective transformation.
         * @param [left] The number of meters to the left of the camera that will be in view.
         * @param [right] The number of meters to the right of the camera that will be in view.
         * @param [bottom] The number of meters below of the camera that will be in view.
         * @param [top] The number of meters above of the camera that will be in view.
         * @param [near] The distance to the near plane in meters.
         * @param [far] The distance to the far plane in meters.
         * @param [result] The object in which the result will be stored.
         * @return The modified result parameter.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix4.html#.computePerspectiveOffCenter">Online Documentation</a>
         */
        fun computePerspectiveOffCenter(
            left: Double,
            right: Double,
            bottom: Double,
            top: Double,
            near: Double,
            far: Double,
            result: Matrix4,
        ): Matrix4

        /**
         * Computes a Matrix4 instance representing an infinite off center perspective transformation.
         * @param [left] The number of meters to the left of the camera that will be in view.
         * @param [right] The number of meters to the right of the camera that will be in view.
         * @param [bottom] The number of meters below of the camera that will be in view.
         * @param [top] The number of meters above of the camera that will be in view.
         * @param [near] The distance to the near plane in meters.
         * @param [result] The object in which the result will be stored.
         * @return The modified result parameter.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix4.html#.computeInfinitePerspectiveOffCenter">Online Documentation</a>
         */
        fun computeInfinitePerspectiveOffCenter(
            left: Double,
            right: Double,
            bottom: Double,
            top: Double,
            near: Double,
            result: Matrix4,
        ): Matrix4

        /**
         * Computes a Matrix4 instance that transforms from normalized device coordinates to window coordinates.
         * ```
         * // Create viewport transformation using an explicit viewport and depth range.
         * const m = Matrix4.computeViewportTransformation({
         *     x : 0.0,
         *     y : 0.0,
         *     width : 1024.0,
         *     height : 768.0
         * }, 0.0, 1.0, new Matrix4());
         * ```
         * @param [viewport] The viewport's corners as shown in Example 1.
         *   Default value - `{ x : 0.0, y : 0.0, width : 0.0, height : 0.0 }`
         * @param [nearDepthRange] The near plane distance in window coordinates.
         *   Default value - `0.0`
         * @param [farDepthRange] The far plane distance in window coordinates.
         *   Default value - `1.0`
         * @param [result] The object in which the result will be stored.
         * @return The modified result parameter.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix4.html#.computeViewportTransformation">Online Documentation</a>
         */
        fun computeViewportTransformation(
            viewport: Any? = definedExternally,
            nearDepthRange: Double? = definedExternally,
            farDepthRange: Double? = definedExternally,
            result: Matrix4? = definedExternally,
        ): Matrix4

        /**
         * Computes a Matrix4 instance that transforms from world space to view space.
         * @param [position] The position of the camera.
         * @param [direction] The forward direction.
         * @param [up] The up direction.
         * @param [right] The right direction.
         * @param [result] The object in which the result will be stored.
         * @return The modified result parameter.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix4.html#.computeView">Online Documentation</a>
         */
        fun computeView(
            position: Cartesian3,
            direction: Cartesian3,
            up: Cartesian3,
            right: Cartesian3,
            result: Matrix4,
        ): Matrix4

        /**
         * Computes an Array from the provided Matrix4 instance.
         * The array will be in column-major order.
         * ```
         * //create an array from an instance of Matrix4
         * // m = [10.0, 14.0, 18.0, 22.0]
         * //     [11.0, 15.0, 19.0, 23.0]
         * //     [12.0, 16.0, 20.0, 24.0]
         * //     [13.0, 17.0, 21.0, 25.0]
         * const a = Matrix4.toArray(m);
         *
         * // m remains the same
         * //creates a = [10.0, 11.0, 12.0, 13.0, 14.0, 15.0, 16.0, 17.0, 18.0, 19.0, 20.0, 21.0, 22.0, 23.0, 24.0, 25.0]
         * ```
         * @param [matrix] The matrix to use..
         * @param [result] The Array onto which to store the result.
         * @return The modified Array parameter or a new Array instance if one was not provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix4.html#.toArray">Online Documentation</a>
         */
        fun toArray(
            matrix: Matrix4,
            result: ReadonlyArray<Double>? = definedExternally,
        ): ReadonlyArray<Double>

        /**
         * Computes the array index of the element at the provided row and column.
         * ```
         * const myMatrix = new Matrix4();
         * const column1Row0Index = Matrix4.getElementIndex(1, 0);
         * const column1Row0 = myMatrix[column1Row0Index];
         * myMatrix[column1Row0Index] = 10.0;
         * ```
         * @param [row] The zero-based index of the row.
         * @param [column] The zero-based index of the column.
         * @return The index of the element at the provided row and column.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix4.html#.getElementIndex">Online Documentation</a>
         */
        fun getElementIndex(
            row: Int,
            column: Int,
        ): Int

        /**
         * Retrieves a copy of the matrix column at the provided index as a Cartesian4 instance.
         * ```
         * //returns a Cartesian4 instance with values from the specified column
         * // m = [10.0, 11.0, 12.0, 13.0]
         * //     [14.0, 15.0, 16.0, 17.0]
         * //     [18.0, 19.0, 20.0, 21.0]
         * //     [22.0, 23.0, 24.0, 25.0]
         *
         * //Example 1: Creates an instance of Cartesian
         * const a = Matrix4.getColumn(m, 2, new Cartesian4());
         * ```
         * ```
         * //Example 2: Sets values for Cartesian instance
         * const a = new Cartesian4();
         * Matrix4.getColumn(m, 2, a);
         *
         * // a.x = 12.0; a.y = 16.0; a.z = 20.0; a.w = 24.0;
         * ```
         * @param [matrix] The matrix to use.
         * @param [index] The zero-based index of the column to retrieve.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix4.html#.getColumn">Online Documentation</a>
         */
        fun getColumn(
            matrix: Matrix4,
            index: Int,
            result: Cartesian4,
        ): Cartesian4

        /**
         * Computes a new matrix that replaces the specified column in the provided matrix with the provided Cartesian4 instance.
         * ```
         * //creates a new Matrix4 instance with new column values from the Cartesian4 instance
         * // m = [10.0, 11.0, 12.0, 13.0]
         * //     [14.0, 15.0, 16.0, 17.0]
         * //     [18.0, 19.0, 20.0, 21.0]
         * //     [22.0, 23.0, 24.0, 25.0]
         *
         * const a = Matrix4.setColumn(m, 2, new Cartesian4(99.0, 98.0, 97.0, 96.0), new Matrix4());
         *
         * // m remains the same
         * // a = [10.0, 11.0, 99.0, 13.0]
         * //     [14.0, 15.0, 98.0, 17.0]
         * //     [18.0, 19.0, 97.0, 21.0]
         * //     [22.0, 23.0, 96.0, 25.0]
         * ```
         * @param [matrix] The matrix to use.
         * @param [index] The zero-based index of the column to set.
         * @param [cartesian] The Cartesian whose values will be assigned to the specified column.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix4.html#.setColumn">Online Documentation</a>
         */
        fun setColumn(
            matrix: Matrix4,
            index: Int,
            cartesian: Cartesian4,
            result: Matrix4,
        ): Matrix4

        /**
         * Retrieves a copy of the matrix row at the provided index as a Cartesian4 instance.
         * ```
         * //returns a Cartesian4 instance with values from the specified column
         * // m = [10.0, 11.0, 12.0, 13.0]
         * //     [14.0, 15.0, 16.0, 17.0]
         * //     [18.0, 19.0, 20.0, 21.0]
         * //     [22.0, 23.0, 24.0, 25.0]
         *
         * //Example 1: Returns an instance of Cartesian
         * const a = Matrix4.getRow(m, 2, new Cartesian4());
         * ```
         * ```
         * //Example 2: Sets values for a Cartesian instance
         * const a = new Cartesian4();
         * Matrix4.getRow(m, 2, a);
         *
         * // a.x = 18.0; a.y = 19.0; a.z = 20.0; a.w = 21.0;
         * ```
         * @param [matrix] The matrix to use.
         * @param [index] The zero-based index of the row to retrieve.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix4.html#.getRow">Online Documentation</a>
         */
        fun getRow(
            matrix: Matrix4,
            index: Int,
            result: Cartesian4,
        ): Cartesian4

        /**
         * Computes a new matrix that replaces the specified row in the provided matrix with the provided Cartesian4 instance.
         * ```
         * //create a new Matrix4 instance with new row values from the Cartesian4 instance
         * // m = [10.0, 11.0, 12.0, 13.0]
         * //     [14.0, 15.0, 16.0, 17.0]
         * //     [18.0, 19.0, 20.0, 21.0]
         * //     [22.0, 23.0, 24.0, 25.0]
         *
         * const a = Matrix4.setRow(m, 2, new Cartesian4(99.0, 98.0, 97.0, 96.0), new Matrix4());
         *
         * // m remains the same
         * // a = [10.0, 11.0, 12.0, 13.0]
         * //     [14.0, 15.0, 16.0, 17.0]
         * //     [99.0, 98.0, 97.0, 96.0]
         * //     [22.0, 23.0, 24.0, 25.0]
         * ```
         * @param [matrix] The matrix to use.
         * @param [index] The zero-based index of the row to set.
         * @param [cartesian] The Cartesian whose values will be assigned to the specified row.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix4.html#.setRow">Online Documentation</a>
         */
        fun setRow(
            matrix: Matrix4,
            index: Int,
            cartesian: Cartesian4,
            result: Matrix4,
        ): Matrix4

        /**
         * Computes a new matrix that replaces the translation in the rightmost column of the provided
         * matrix with the provided translation. This assumes the matrix is an affine transformation.
         * @param [matrix] The matrix to use.
         * @param [translation] The translation that replaces the translation of the provided matrix.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix4.html#.setTranslation">Online Documentation</a>
         */
        fun setTranslation(
            matrix: Matrix4,
            translation: Cartesian3,
            result: Matrix4,
        ): Matrix4

        /**
         * Computes a new matrix that replaces the scale with the provided scale.
         * This assumes the matrix is an affine transformation.
         * @param [matrix] The matrix to use.
         * @param [scale] The scale that replaces the scale of the provided matrix.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix4.html#.setScale">Online Documentation</a>
         */
        fun setScale(
            matrix: Matrix4,
            scale: Cartesian3,
            result: Matrix4,
        ): Matrix4

        /**
         * Computes a new matrix that replaces the scale with the provided uniform scale.
         * This assumes the matrix is an affine transformation.
         * @param [matrix] The matrix to use.
         * @param [scale] The uniform scale that replaces the scale of the provided matrix.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix4.html#.setUniformScale">Online Documentation</a>
         */
        fun setUniformScale(
            matrix: Matrix4,
            scale: Double,
            result: Matrix4,
        ): Matrix4

        /**
         * Extracts the non-uniform scale assuming the matrix is an affine transformation.
         * @param [matrix] The matrix.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix4.html#.getScale">Online Documentation</a>
         */
        fun getScale(
            matrix: Matrix4,
            result: Cartesian3,
        ): Cartesian3

        /**
         * Computes the maximum scale assuming the matrix is an affine transformation.
         * The maximum scale is the maximum length of the column vectors in the upper-left
         * 3x3 matrix.
         * @param [matrix] The matrix.
         * @return The maximum scale.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix4.html#.getMaximumScale">Online Documentation</a>
         */
        fun getMaximumScale(matrix: Matrix4): Double

        /**
         * Sets the rotation assuming the matrix is an affine transformation.
         * @param [matrix] The matrix.
         * @param [rotation] The rotation matrix.
         * @return The modified result parameter.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix4.html#.setRotation">Online Documentation</a>
         */
        fun setRotation(
            matrix: Matrix4,
            rotation: Matrix3,
        ): Matrix4

        /**
         * Extracts the rotation matrix assuming the matrix is an affine transformation.
         * @param [matrix] The matrix.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix4.html#.getRotation">Online Documentation</a>
         */
        fun getRotation(
            matrix: Matrix4,
            result: Matrix3,
        ): Matrix3

        /**
         * Computes the product of two matrices.
         * @param [left] The first matrix.
         * @param [right] The second matrix.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix4.html#.multiply">Online Documentation</a>
         */
        fun multiply(
            left: Matrix4,
            right: Matrix4,
            result: Matrix4,
        ): Matrix4

        /**
         * Computes the sum of two matrices.
         * @param [left] The first matrix.
         * @param [right] The second matrix.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix4.html#.add">Online Documentation</a>
         */
        fun add(
            left: Matrix4,
            right: Matrix4,
            result: Matrix4,
        ): Matrix4

        /**
         * Computes the difference of two matrices.
         * @param [left] The first matrix.
         * @param [right] The second matrix.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix4.html#.subtract">Online Documentation</a>
         */
        fun subtract(
            left: Matrix4,
            right: Matrix4,
            result: Matrix4,
        ): Matrix4

        /**
         * Computes the product of two matrices assuming the matrices are affine transformation matrices,
         * where the upper left 3x3 elements are any matrix, and
         * the upper three elements in the fourth column are the translation.
         * The bottom row is assumed to be [0, 0, 0, 1].
         * The matrix is not verified to be in the proper form.
         * This method is faster than computing the product for general 4x4
         * matrices using [Matrix4.multiply].
         * ```
         * const m1 = new Matrix4(1.0, 6.0, 7.0, 0.0, 2.0, 5.0, 8.0, 0.0, 3.0, 4.0, 9.0, 0.0, 0.0, 0.0, 0.0, 1.0);
         * const m2 = Transforms.eastNorthUpToFixedFrame(new Cartesian3(1.0, 1.0, 1.0));
         * const m3 = Matrix4.multiplyTransformation(m1, m2, new Matrix4());
         * ```
         * @param [left] The first matrix.
         * @param [right] The second matrix.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix4.html#.multiplyTransformation">Online Documentation</a>
         */
        fun multiplyTransformation(
            left: Matrix4,
            right: Matrix4,
            result: Matrix4,
        ): Matrix4

        /**
         * Multiplies a transformation matrix (with a bottom row of `[0.0, 0.0, 0.0, 1.0]`)
         * by a 3x3 rotation matrix.  This is an optimization
         * for `Matrix4.multiply(m, Matrix4.fromRotationTranslation(rotation), m);` with less allocations and arithmetic operations.
         * ```
         * // Instead of Matrix4.multiply(m, Matrix4.fromRotationTranslation(rotation), m);
         * Matrix4.multiplyByMatrix3(m, rotation, m);
         * ```
         * @param [matrix] The matrix on the left-hand side.
         * @param [rotation] The 3x3 rotation matrix on the right-hand side.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix4.html#.multiplyByMatrix3">Online Documentation</a>
         */
        fun multiplyByMatrix3(
            matrix: Matrix4,
            rotation: Matrix3,
            result: Matrix4,
        ): Matrix4

        /**
         * Multiplies a transformation matrix (with a bottom row of `[0.0, 0.0, 0.0, 1.0]`)
         * by an implicit translation matrix defined by a [Cartesian3].  This is an optimization
         * for `Matrix4.multiply(m, Matrix4.fromTranslation(position), m);` with less allocations and arithmetic operations.
         * ```
         * // Instead of Matrix4.multiply(m, Matrix4.fromTranslation(position), m);
         * Matrix4.multiplyByTranslation(m, position, m);
         * ```
         * @param [matrix] The matrix on the left-hand side.
         * @param [translation] The translation on the right-hand side.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix4.html#.multiplyByTranslation">Online Documentation</a>
         */
        fun multiplyByTranslation(
            matrix: Matrix4,
            translation: Cartesian3,
            result: Matrix4,
        ): Matrix4

        /**
         * Multiplies an affine transformation matrix (with a bottom row of `[0.0, 0.0, 0.0, 1.0]`)
         * by an implicit non-uniform scale matrix. This is an optimization
         * for `Matrix4.multiply(m, Matrix4.fromUniformScale(scale), m);`, where
         * `m` must be an affine matrix.
         * This function performs fewer allocations and arithmetic operations.
         * ```
         * // Instead of Matrix4.multiply(m, Matrix4.fromScale(scale), m);
         * Matrix4.multiplyByScale(m, scale, m);
         * ```
         * @param [matrix] The affine matrix on the left-hand side.
         * @param [scale] The non-uniform scale on the right-hand side.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix4.html#.multiplyByScale">Online Documentation</a>
         */
        fun multiplyByScale(
            matrix: Matrix4,
            scale: Cartesian3,
            result: Matrix4,
        ): Matrix4

        /**
         * Computes the product of a matrix times a uniform scale, as if the scale were a scale matrix.
         * ```
         * // Instead of Matrix4.multiply(m, Matrix4.fromUniformScale(scale), m);
         * Matrix4.multiplyByUniformScale(m, scale, m);
         * ```
         * @param [matrix] The matrix on the left-hand side.
         * @param [scale] The uniform scale on the right-hand side.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix4.html#.multiplyByUniformScale">Online Documentation</a>
         */
        fun multiplyByUniformScale(
            matrix: Matrix4,
            scale: Double,
            result: Matrix4,
        ): Matrix4

        /**
         * Computes the product of a matrix and a column vector.
         * @param [matrix] The matrix.
         * @param [cartesian] The vector.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix4.html#.multiplyByVector">Online Documentation</a>
         */
        fun multiplyByVector(
            matrix: Matrix4,
            cartesian: Cartesian4,
            result: Cartesian4,
        ): Cartesian4

        /**
         * Computes the product of a matrix and a [Cartesian3].  This is equivalent to calling [Matrix4.multiplyByVector]
         * with a [Cartesian4] with a `w` component of zero.
         * ```
         * const p = new Cartesian3(1.0, 2.0, 3.0);
         * const result = Matrix4.multiplyByPointAsVector(matrix, p, new Cartesian3());
         * // A shortcut for
         * //   Cartesian3 p = ...
         * //   Matrix4.multiplyByVector(matrix, new Cartesian4(p.x, p.y, p.z, 0.0), result);
         * ```
         * @param [matrix] The matrix.
         * @param [cartesian] The point.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix4.html#.multiplyByPointAsVector">Online Documentation</a>
         */
        fun multiplyByPointAsVector(
            matrix: Matrix4,
            cartesian: Cartesian3,
            result: Cartesian3,
        ): Cartesian3

        /**
         * Computes the product of a matrix and a [Cartesian3]. This is equivalent to calling [Matrix4.multiplyByVector]
         * with a [Cartesian4] with a `w` component of 1, but returns a [Cartesian3] instead of a [Cartesian4].
         * ```
         * const p = new Cartesian3(1.0, 2.0, 3.0);
         * const result = Matrix4.multiplyByPoint(matrix, p, new Cartesian3());
         * ```
         * @param [matrix] The matrix.
         * @param [cartesian] The point.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix4.html#.multiplyByPoint">Online Documentation</a>
         */
        fun multiplyByPoint(
            matrix: Matrix4,
            cartesian: Cartesian3,
            result: Cartesian3,
        ): Cartesian3

        /**
         * Computes the product of a matrix and a scalar.
         * ```
         * //create a Matrix4 instance which is a scaled version of the supplied Matrix4
         * // m = [10.0, 11.0, 12.0, 13.0]
         * //     [14.0, 15.0, 16.0, 17.0]
         * //     [18.0, 19.0, 20.0, 21.0]
         * //     [22.0, 23.0, 24.0, 25.0]
         *
         * const a = Matrix4.multiplyByScalar(m, -2, new Matrix4());
         *
         * // m remains the same
         * // a = [-20.0, -22.0, -24.0, -26.0]
         * //     [-28.0, -30.0, -32.0, -34.0]
         * //     [-36.0, -38.0, -40.0, -42.0]
         * //     [-44.0, -46.0, -48.0, -50.0]
         * ```
         * @param [matrix] The matrix.
         * @param [scalar] The number to multiply by.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix4.html#.multiplyByScalar">Online Documentation</a>
         */
        fun multiplyByScalar(
            matrix: Matrix4,
            scalar: Double,
            result: Matrix4,
        ): Matrix4

        /**
         * Computes a negated copy of the provided matrix.
         * ```
         * //create a new Matrix4 instance which is a negation of a Matrix4
         * // m = [10.0, 11.0, 12.0, 13.0]
         * //     [14.0, 15.0, 16.0, 17.0]
         * //     [18.0, 19.0, 20.0, 21.0]
         * //     [22.0, 23.0, 24.0, 25.0]
         *
         * const a = Matrix4.negate(m, new Matrix4());
         *
         * // m remains the same
         * // a = [-10.0, -11.0, -12.0, -13.0]
         * //     [-14.0, -15.0, -16.0, -17.0]
         * //     [-18.0, -19.0, -20.0, -21.0]
         * //     [-22.0, -23.0, -24.0, -25.0]
         * ```
         * @param [matrix] The matrix to negate.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix4.html#.negate">Online Documentation</a>
         */
        fun negate(
            matrix: Matrix4,
            result: Matrix4,
        ): Matrix4

        /**
         * Computes the transpose of the provided matrix.
         * ```
         * //returns transpose of a Matrix4
         * // m = [10.0, 11.0, 12.0, 13.0]
         * //     [14.0, 15.0, 16.0, 17.0]
         * //     [18.0, 19.0, 20.0, 21.0]
         * //     [22.0, 23.0, 24.0, 25.0]
         *
         * const a = Matrix4.transpose(m, new Matrix4());
         *
         * // m remains the same
         * // a = [10.0, 14.0, 18.0, 22.0]
         * //     [11.0, 15.0, 19.0, 23.0]
         * //     [12.0, 16.0, 20.0, 24.0]
         * //     [13.0, 17.0, 21.0, 25.0]
         * ```
         * @param [matrix] The matrix to transpose.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix4.html#.transpose">Online Documentation</a>
         */
        fun transpose(
            matrix: Matrix4,
            result: Matrix4,
        ): Matrix4

        /**
         * Computes a matrix, which contains the absolute (unsigned) values of the provided matrix's elements.
         * @param [matrix] The matrix with signed elements.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix4.html#.abs">Online Documentation</a>
         */
        fun abs(
            matrix: Matrix4,
            result: Matrix4,
        ): Matrix4

        /**
         * Compares the provided matrices componentwise and returns
         * `true` if they are equal, `false` otherwise.
         * ```
         * //compares two Matrix4 instances
         *
         * // a = [10.0, 14.0, 18.0, 22.0]
         * //     [11.0, 15.0, 19.0, 23.0]
         * //     [12.0, 16.0, 20.0, 24.0]
         * //     [13.0, 17.0, 21.0, 25.0]
         *
         * // b = [10.0, 14.0, 18.0, 22.0]
         * //     [11.0, 15.0, 19.0, 23.0]
         * //     [12.0, 16.0, 20.0, 24.0]
         * //     [13.0, 17.0, 21.0, 25.0]
         *
         * if(Matrix4.equals(a,b)) {
         *      console.log("Both matrices are equal");
         * } else {
         *      console.log("They are not equal");
         * }
         *
         * //Prints "Both matrices are equal" on the console
         * ```
         * @param [left] The first matrix.
         * @param [right] The second matrix.
         * @return `true` if left and right are equal, `false` otherwise.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix4.html#.equals">Online Documentation</a>
         */
        fun equals(
            left: Matrix4? = definedExternally,
            right: Matrix4? = definedExternally,
        ): Boolean

        /**
         * Compares the provided matrices componentwise and returns
         * `true` if they are within the provided epsilon,
         * `false` otherwise.
         * ```
         * //compares two Matrix4 instances
         *
         * // a = [10.5, 14.5, 18.5, 22.5]
         * //     [11.5, 15.5, 19.5, 23.5]
         * //     [12.5, 16.5, 20.5, 24.5]
         * //     [13.5, 17.5, 21.5, 25.5]
         *
         * // b = [10.0, 14.0, 18.0, 22.0]
         * //     [11.0, 15.0, 19.0, 23.0]
         * //     [12.0, 16.0, 20.0, 24.0]
         * //     [13.0, 17.0, 21.0, 25.0]
         *
         * if(Matrix4.equalsEpsilon(a,b,0.1)){
         *      console.log("Difference between both the matrices is less than 0.1");
         * } else {
         *      console.log("Difference between both the matrices is not less than 0.1");
         * }
         *
         * //Prints "Difference between both the matrices is not less than 0.1" on the console
         * ```
         * @param [left] The first matrix.
         * @param [right] The second matrix.
         * @param [epsilon] The epsilon to use for equality testing.
         *   Default value - `0`
         * @return `true` if left and right are within the provided epsilon, `false` otherwise.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix4.html#.equalsEpsilon">Online Documentation</a>
         */
        fun equalsEpsilon(
            left: Matrix4? = definedExternally,
            right: Matrix4? = definedExternally,
            epsilon: Double? = definedExternally,
        ): Boolean

        /**
         * Gets the translation portion of the provided matrix, assuming the matrix is an affine transformation matrix.
         * @param [matrix] The matrix to use.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix4.html#.getTranslation">Online Documentation</a>
         */
        fun getTranslation(
            matrix: Matrix4,
            result: Cartesian3,
        ): Cartesian3

        /**
         * Gets the upper left 3x3 matrix of the provided matrix.
         * ```
         * // returns a Matrix3 instance from a Matrix4 instance
         *
         * // m = [10.0, 14.0, 18.0, 22.0]
         * //     [11.0, 15.0, 19.0, 23.0]
         * //     [12.0, 16.0, 20.0, 24.0]
         * //     [13.0, 17.0, 21.0, 25.0]
         *
         * const b = new Matrix3();
         * Matrix4.getMatrix3(m,b);
         *
         * // b = [10.0, 14.0, 18.0]
         * //     [11.0, 15.0, 19.0]
         * //     [12.0, 16.0, 20.0]
         * ```
         * @param [matrix] The matrix to use.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix4.html#.getMatrix3">Online Documentation</a>
         */
        fun getMatrix3(
            matrix: Matrix4,
            result: Matrix3,
        ): Matrix3

        /**
         * Computes the inverse of the provided matrix using Cramers Rule.
         * If the determinant is zero, the matrix can not be inverted, and an exception is thrown.
         * If the matrix is a proper rigid transformation, it is more efficient
         * to invert it with [Matrix4.inverseTransformation].
         * @param [matrix] The matrix to invert.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix4.html#.inverse">Online Documentation</a>
         */
        fun inverse(
            matrix: Matrix4,
            result: Matrix4,
        ): Matrix4

        /**
         * Computes the inverse of the provided matrix assuming it is a proper rigid matrix,
         * where the upper left 3x3 elements are a rotation matrix,
         * and the upper three elements in the fourth column are the translation.
         * The bottom row is assumed to be [0, 0, 0, 1].
         * The matrix is not verified to be in the proper form.
         * This method is faster than computing the inverse for a general 4x4
         * matrix using [Matrix4.inverse].
         * @param [matrix] The matrix to invert.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix4.html#.inverseTransformation">Online Documentation</a>
         */
        fun inverseTransformation(
            matrix: Matrix4,
            result: Matrix4,
        ): Matrix4

        /**
         * Computes the inverse transpose of a matrix.
         * @param [matrix] The matrix to transpose and invert.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix4.html#.inverseTranspose">Online Documentation</a>
         */
        fun inverseTranspose(
            matrix: Matrix4,
            result: Matrix4,
        ): Matrix4

        /**
         * An immutable Matrix4 instance initialized to the identity matrix.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix4.html#.IDENTITY">Online Documentation</a>
         */
        val IDENTITY: Matrix4

        /**
         * An immutable Matrix4 instance initialized to the zero matrix.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix4.html#.ZERO">Online Documentation</a>
         */
        val ZERO: Matrix4

        /**
         * The index into Matrix4 for column 0, row 0.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix4.html#.COLUMN0ROW0">Online Documentation</a>
         */
        val COLUMN0ROW0: Double

        /**
         * The index into Matrix4 for column 0, row 1.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix4.html#.COLUMN0ROW1">Online Documentation</a>
         */
        val COLUMN0ROW1: Double

        /**
         * The index into Matrix4 for column 0, row 2.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix4.html#.COLUMN0ROW2">Online Documentation</a>
         */
        val COLUMN0ROW2: Double

        /**
         * The index into Matrix4 for column 0, row 3.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix4.html#.COLUMN0ROW3">Online Documentation</a>
         */
        val COLUMN0ROW3: Double

        /**
         * The index into Matrix4 for column 1, row 0.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix4.html#.COLUMN1ROW0">Online Documentation</a>
         */
        val COLUMN1ROW0: Double

        /**
         * The index into Matrix4 for column 1, row 1.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix4.html#.COLUMN1ROW1">Online Documentation</a>
         */
        val COLUMN1ROW1: Double

        /**
         * The index into Matrix4 for column 1, row 2.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix4.html#.COLUMN1ROW2">Online Documentation</a>
         */
        val COLUMN1ROW2: Double

        /**
         * The index into Matrix4 for column 1, row 3.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix4.html#.COLUMN1ROW3">Online Documentation</a>
         */
        val COLUMN1ROW3: Double

        /**
         * The index into Matrix4 for column 2, row 0.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix4.html#.COLUMN2ROW0">Online Documentation</a>
         */
        val COLUMN2ROW0: Double

        /**
         * The index into Matrix4 for column 2, row 1.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix4.html#.COLUMN2ROW1">Online Documentation</a>
         */
        val COLUMN2ROW1: Double

        /**
         * The index into Matrix4 for column 2, row 2.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix4.html#.COLUMN2ROW2">Online Documentation</a>
         */
        val COLUMN2ROW2: Double

        /**
         * The index into Matrix4 for column 2, row 3.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix4.html#.COLUMN2ROW3">Online Documentation</a>
         */
        val COLUMN2ROW3: Double

        /**
         * The index into Matrix4 for column 3, row 0.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix4.html#.COLUMN3ROW0">Online Documentation</a>
         */
        val COLUMN3ROW0: Double

        /**
         * The index into Matrix4 for column 3, row 1.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix4.html#.COLUMN3ROW1">Online Documentation</a>
         */
        val COLUMN3ROW1: Double

        /**
         * The index into Matrix4 for column 3, row 2.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix4.html#.COLUMN3ROW2">Online Documentation</a>
         */
        val COLUMN3ROW2: Double

        /**
         * The index into Matrix4 for column 3, row 3.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix4.html#.COLUMN3ROW3">Online Documentation</a>
         */
        val COLUMN3ROW3: Double
    }
}

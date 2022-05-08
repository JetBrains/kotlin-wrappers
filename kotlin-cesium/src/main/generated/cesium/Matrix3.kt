// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

package cesium

/**
 * A 3x3 matrix, indexable as a column-major order array.
 * Constructor parameters are in row-major order for code readability.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix3.html">Online Documentation</a>
 *
 * @constructor
 * @param [column0Row0] The value for column 0, row 0.
 *   Default value - `0.0`
 * @param [column1Row0] The value for column 1, row 0.
 *   Default value - `0.0`
 * @param [column2Row0] The value for column 2, row 0.
 *   Default value - `0.0`
 * @param [column0Row1] The value for column 0, row 1.
 *   Default value - `0.0`
 * @param [column1Row1] The value for column 1, row 1.
 *   Default value - `0.0`
 * @param [column2Row1] The value for column 2, row 1.
 *   Default value - `0.0`
 * @param [column0Row2] The value for column 0, row 2.
 *   Default value - `0.0`
 * @param [column1Row2] The value for column 1, row 2.
 *   Default value - `0.0`
 * @param [column2Row2] The value for column 2, row 2.
 *   Default value - `0.0`
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix3.html">Online Documentation</a>
 */
external class Matrix3(
    column0Row0: Double? = definedExternally,
    column1Row0: Double? = definedExternally,
    column2Row0: Double? = definedExternally,
    column0Row1: Double? = definedExternally,
    column1Row1: Double? = definedExternally,
    column2Row1: Double? = definedExternally,
    column0Row2: Double? = definedExternally,
    column1Row2: Double? = definedExternally,
    column2Row2: Double? = definedExternally,
) {
    /**
     * Gets the number of items in the collection.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix3.html#length">Online Documentation</a>
     */
    var length: Int

    /**
     * Duplicates the provided Matrix3 instance.
     * @param [result] The object onto which to store the result.
     * @return The modified result parameter or a new Matrix3 instance if one was not provided.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix3.html#clone">Online Documentation</a>
     */
    fun clone(result: Matrix3? = definedExternally): Matrix3

    /**
     * Compares this matrix to the provided matrix componentwise and returns
     * `true` if they are within the provided epsilon,
     * `false` otherwise.
     * @param [right] The right hand side matrix.
     * @param [epsilon] The epsilon to use for equality testing.
     *   Default value - `0`
     * @return `true` if they are within the provided epsilon, `false` otherwise.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix3.html#equalsEpsilon">Online Documentation</a>
     */
    fun equalsEpsilon(
        right: Matrix3? = definedExternally,
        epsilon: Double? = definedExternally,
    ): Boolean

    companion object : Packable<Matrix3> {
        /**
         * The number of elements used to pack the object into an array.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix3.html#.packedLength">Online Documentation</a>
         */
        override val packedLength: Int

        /**
         * Stores the provided instance into the provided array.
         * @param [value] The value to pack.
         * @param [array] The array to pack into.
         * @param [startingIndex] The index into the array at which to start packing the elements.
         *   Default value - `0`
         * @return The array that was packed into
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix3.html#.pack">Online Documentation</a>
         */
        override fun pack(
            value: Matrix3,
            array: Array<out Double>,
            startingIndex: Int?,
        ): Array<out Double>

        /**
         * Retrieves an instance from a packed array.
         * @param [array] The packed array.
         * @param [startingIndex] The starting index of the element to be unpacked.
         *   Default value - `0`
         * @param [result] The object into which to store the result.
         * @return The modified result parameter or a new Matrix3 instance if one was not provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix3.html#.unpack">Online Documentation</a>
         */
        override fun unpack(
            array: Array<out Double>,
            startingIndex: Int?,
            result: Matrix3?,
        ): Matrix3

        /**
         * Flattens an array of Matrix3s into an array of components. The components
         * are stored in column-major order.
         * @param [array] The array of matrices to pack.
         * @param [result] The array onto which to store the result. If this is a typed array, it must have array.length * 9 components, else a [DeveloperError] will be thrown. If it is a regular array, it will be resized to have (array.length * 9) elements.
         * @return The packed array.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix3.html#.packArray">Online Documentation</a>
         */
        fun packArray(
            array: Array<out Matrix3>,
            result: Array<out Double>? = definedExternally,
        ): Array<out Double>

        /**
         * Unpacks an array of column-major matrix components into an array of Matrix3s.
         * @param [array] The array of components to unpack.
         * @param [result] The array onto which to store the result.
         * @return The unpacked array.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix3.html#.unpackArray">Online Documentation</a>
         */
        fun unpackArray(
            array: Array<out Double>,
            result: Array<out Matrix3>? = definedExternally,
        ): Array<out Matrix3>

        /**
         * Duplicates a Matrix3 instance.
         * @param [matrix] The matrix to duplicate.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter or a new Matrix3 instance if one was not provided. (Returns undefined if matrix is undefined)
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix3.html#.clone">Online Documentation</a>
         */
        fun clone(
            matrix: Matrix3,
            result: Matrix3? = definedExternally,
        ): Matrix3

        /**
         * Creates a Matrix3 from 9 consecutive elements in an array.
         * ```
         * // Create the Matrix3:
         * // [1.0, 2.0, 3.0]
         * // [1.0, 2.0, 3.0]
         * // [1.0, 2.0, 3.0]
         *
         * const v = [1.0, 1.0, 1.0, 2.0, 2.0, 2.0, 3.0, 3.0, 3.0];
         * const m = Matrix3.fromArray(v);
         *
         * // Create same Matrix3 with using an offset into an array
         * const v2 = [0.0, 0.0, 1.0, 1.0, 1.0, 2.0, 2.0, 2.0, 3.0, 3.0, 3.0];
         * const m2 = Matrix3.fromArray(v2, 2);
         * ```
         * @param [array] The array whose 9 consecutive elements correspond to the positions of the matrix.  Assumes column-major order.
         * @param [startingIndex] The offset into the array of the first element, which corresponds to first column first row position in the matrix.
         *   Default value - `0`
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter or a new Matrix3 instance if one was not provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix3.html#.fromArray">Online Documentation</a>
         */
        fun fromArray(
            array: Array<out Double>,
            startingIndex: Int? = definedExternally,
            result: Matrix3? = definedExternally,
        ): Matrix3

        /**
         * Creates a Matrix3 instance from a column-major order array.
         * @param [values] The column-major order array.
         * @param [result] The object in which the result will be stored, if undefined a new instance will be created.
         * @return The modified result parameter, or a new Matrix3 instance if one was not provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix3.html#.fromColumnMajorArray">Online Documentation</a>
         */
        fun fromColumnMajorArray(
            values: Array<out Double>,
            result: Matrix3? = definedExternally,
        ): Matrix3

        /**
         * Creates a Matrix3 instance from a row-major order array.
         * The resulting matrix will be in column-major order.
         * @param [values] The row-major order array.
         * @param [result] The object in which the result will be stored, if undefined a new instance will be created.
         * @return The modified result parameter, or a new Matrix3 instance if one was not provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix3.html#.fromRowMajorArray">Online Documentation</a>
         */
        fun fromRowMajorArray(
            values: Array<out Double>,
            result: Matrix3? = definedExternally,
        ): Matrix3

        /**
         * Computes a 3x3 rotation matrix from the provided quaternion.
         * @param [quaternion] the quaternion to use.
         * @param [result] The object in which the result will be stored, if undefined a new instance will be created.
         * @return The 3x3 rotation matrix from this quaternion.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix3.html#.fromQuaternion">Online Documentation</a>
         */
        fun fromQuaternion(
            quaternion: Quaternion,
            result: Matrix3? = definedExternally,
        ): Matrix3

        /**
         * Computes a 3x3 rotation matrix from the provided headingPitchRoll. (see http://en.wikipedia.org/wiki/Conversion_between_quaternions_and_Euler_angles )
         * @param [headingPitchRoll] the headingPitchRoll to use.
         * @param [result] The object in which the result will be stored, if undefined a new instance will be created.
         * @return The 3x3 rotation matrix from this headingPitchRoll.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix3.html#.fromHeadingPitchRoll">Online Documentation</a>
         */
        fun fromHeadingPitchRoll(
            headingPitchRoll: HeadingPitchRoll,
            result: Matrix3? = definedExternally,
        ): Matrix3

        /**
         * Computes a Matrix3 instance representing a non-uniform scale.
         * ```
         * // Creates
         * //   [7.0, 0.0, 0.0]
         * //   [0.0, 8.0, 0.0]
         * //   [0.0, 0.0, 9.0]
         * const m = Matrix3.fromScale(new Cartesian3(7.0, 8.0, 9.0));
         * ```
         * @param [scale] The x, y, and z scale factors.
         * @param [result] The object in which the result will be stored, if undefined a new instance will be created.
         * @return The modified result parameter, or a new Matrix3 instance if one was not provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix3.html#.fromScale">Online Documentation</a>
         */
        fun fromScale(
            scale: Cartesian3,
            result: Matrix3? = definedExternally,
        ): Matrix3

        /**
         * Computes a Matrix3 instance representing a uniform scale.
         * ```
         * // Creates
         * //   [2.0, 0.0, 0.0]
         * //   [0.0, 2.0, 0.0]
         * //   [0.0, 0.0, 2.0]
         * const m = Matrix3.fromUniformScale(2.0);
         * ```
         * @param [scale] The uniform scale factor.
         * @param [result] The object in which the result will be stored, if undefined a new instance will be created.
         * @return The modified result parameter, or a new Matrix3 instance if one was not provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix3.html#.fromUniformScale">Online Documentation</a>
         */
        fun fromUniformScale(
            scale: Double,
            result: Matrix3? = definedExternally,
        ): Matrix3

        /**
         * Computes a Matrix3 instance representing the cross product equivalent matrix of a Cartesian3 vector.
         * ```
         * // Creates
         * //   [0.0, -9.0,  8.0]
         * //   [9.0,  0.0, -7.0]
         * //   [-8.0, 7.0,  0.0]
         * const m = Matrix3.fromCrossProduct(new Cartesian3(7.0, 8.0, 9.0));
         * ```
         * @param [vector] the vector on the left hand side of the cross product operation.
         * @param [result] The object in which the result will be stored, if undefined a new instance will be created.
         * @return The modified result parameter, or a new Matrix3 instance if one was not provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix3.html#.fromCrossProduct">Online Documentation</a>
         */
        fun fromCrossProduct(
            vector: Cartesian3,
            result: Matrix3? = definedExternally,
        ): Matrix3

        /**
         * Creates a rotation matrix around the x-axis.
         * ```
         * // Rotate a point 45 degrees counterclockwise around the x-axis.
         * const p = new Cartesian3(5, 6, 7);
         * const m = Matrix3.fromRotationX(Math.toRadians(45.0));
         * const rotated = Matrix3.multiplyByVector(m, p, new Cartesian3());
         * ```
         * @param [angle] The angle, in radians, of the rotation.  Positive angles are counterclockwise.
         * @param [result] The object in which the result will be stored, if undefined a new instance will be created.
         * @return The modified result parameter, or a new Matrix3 instance if one was not provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix3.html#.fromRotationX">Online Documentation</a>
         */
        fun fromRotationX(
            angle: Double,
            result: Matrix3? = definedExternally,
        ): Matrix3

        /**
         * Creates a rotation matrix around the y-axis.
         * ```
         * // Rotate a point 45 degrees counterclockwise around the y-axis.
         * const p = new Cartesian3(5, 6, 7);
         * const m = Matrix3.fromRotationY(Math.toRadians(45.0));
         * const rotated = Matrix3.multiplyByVector(m, p, new Cartesian3());
         * ```
         * @param [angle] The angle, in radians, of the rotation.  Positive angles are counterclockwise.
         * @param [result] The object in which the result will be stored, if undefined a new instance will be created.
         * @return The modified result parameter, or a new Matrix3 instance if one was not provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix3.html#.fromRotationY">Online Documentation</a>
         */
        fun fromRotationY(
            angle: Double,
            result: Matrix3? = definedExternally,
        ): Matrix3

        /**
         * Creates a rotation matrix around the z-axis.
         * ```
         * // Rotate a point 45 degrees counterclockwise around the z-axis.
         * const p = new Cartesian3(5, 6, 7);
         * const m = Matrix3.fromRotationZ(Math.toRadians(45.0));
         * const rotated = Matrix3.multiplyByVector(m, p, new Cartesian3());
         * ```
         * @param [angle] The angle, in radians, of the rotation.  Positive angles are counterclockwise.
         * @param [result] The object in which the result will be stored, if undefined a new instance will be created.
         * @return The modified result parameter, or a new Matrix3 instance if one was not provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix3.html#.fromRotationZ">Online Documentation</a>
         */
        fun fromRotationZ(
            angle: Double,
            result: Matrix3? = definedExternally,
        ): Matrix3

        /**
         * Creates an Array from the provided Matrix3 instance.
         * The array will be in column-major order.
         * @param [matrix] The matrix to use..
         * @param [result] The Array onto which to store the result.
         * @return The modified Array parameter or a new Array instance if one was not provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix3.html#.toArray">Online Documentation</a>
         */
        fun toArray(
            matrix: Matrix3,
            result: Array<out Double>? = definedExternally,
        ): Array<out Double>

        /**
         * Computes the array index of the element at the provided row and column.
         * ```
         * const myMatrix = new Matrix3();
         * const column1Row0Index = Matrix3.getElementIndex(1, 0);
         * const column1Row0 = myMatrix[column1Row0Index]
         * myMatrix[column1Row0Index] = 10.0;
         * ```
         * @param [column] The zero-based index of the column.
         * @param [row] The zero-based index of the row.
         * @return The index of the element at the provided row and column.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix3.html#.getElementIndex">Online Documentation</a>
         */
        fun getElementIndex(
            column: Int,
            row: Int,
        ): Int

        /**
         * Retrieves a copy of the matrix column at the provided index as a Cartesian3 instance.
         * @param [matrix] The matrix to use.
         * @param [index] The zero-based index of the column to retrieve.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix3.html#.getColumn">Online Documentation</a>
         */
        fun getColumn(
            matrix: Matrix3,
            index: Int,
            result: Cartesian3,
        ): Cartesian3

        /**
         * Computes a new matrix that replaces the specified column in the provided matrix with the provided Cartesian3 instance.
         * @param [matrix] The matrix to use.
         * @param [index] The zero-based index of the column to set.
         * @param [cartesian] The Cartesian whose values will be assigned to the specified column.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix3.html#.setColumn">Online Documentation</a>
         */
        fun setColumn(
            matrix: Matrix3,
            index: Int,
            cartesian: Cartesian3,
            result: Matrix3,
        ): Matrix3

        /**
         * Retrieves a copy of the matrix row at the provided index as a Cartesian3 instance.
         * @param [matrix] The matrix to use.
         * @param [index] The zero-based index of the row to retrieve.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix3.html#.getRow">Online Documentation</a>
         */
        fun getRow(
            matrix: Matrix3,
            index: Int,
            result: Cartesian3,
        ): Cartesian3

        /**
         * Computes a new matrix that replaces the specified row in the provided matrix with the provided Cartesian3 instance.
         * @param [matrix] The matrix to use.
         * @param [index] The zero-based index of the row to set.
         * @param [cartesian] The Cartesian whose values will be assigned to the specified row.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix3.html#.setRow">Online Documentation</a>
         */
        fun setRow(
            matrix: Matrix3,
            index: Int,
            cartesian: Cartesian3,
            result: Matrix3,
        ): Matrix3

        /**
         * Computes a new matrix that replaces the scale with the provided scale.
         * This assumes the matrix is an affine transformation.
         * @param [matrix] The matrix to use.
         * @param [scale] The scale that replaces the scale of the provided matrix.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix3.html#.setScale">Online Documentation</a>
         */
        fun setScale(
            matrix: Matrix3,
            scale: Cartesian3,
            result: Matrix3,
        ): Matrix3

        /**
         * Computes a new matrix that replaces the scale with the provided uniform scale.
         * This assumes the matrix is an affine transformation.
         * @param [matrix] The matrix to use.
         * @param [scale] The uniform scale that replaces the scale of the provided matrix.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix3.html#.setUniformScale">Online Documentation</a>
         */
        fun setUniformScale(
            matrix: Matrix3,
            scale: Double,
            result: Matrix3,
        ): Matrix3

        /**
         * Extracts the non-uniform scale assuming the matrix is an affine transformation.
         * @param [matrix] The matrix.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix3.html#.getScale">Online Documentation</a>
         */
        fun getScale(
            matrix: Matrix3,
            result: Cartesian3,
        ): Cartesian3

        /**
         * Computes the maximum scale assuming the matrix is an affine transformation.
         * The maximum scale is the maximum length of the column vectors.
         * @param [matrix] The matrix.
         * @return The maximum scale.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix3.html#.getMaximumScale">Online Documentation</a>
         */
        fun getMaximumScale(matrix: Matrix3): Double

        /**
         * Sets the rotation assuming the matrix is an affine transformation.
         * @param [matrix] The matrix.
         * @param [rotation] The rotation matrix.
         * @return The modified result parameter.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix3.html#.setRotation">Online Documentation</a>
         */
        fun setRotation(
            matrix: Matrix3,
            rotation: Matrix3,
        ): Matrix3

        /**
         * Extracts the rotation matrix assuming the matrix is an affine transformation.
         * @param [matrix] The matrix.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix3.html#.getRotation">Online Documentation</a>
         */
        fun getRotation(
            matrix: Matrix3,
            result: Matrix3,
        ): Matrix3

        /**
         * Computes the product of two matrices.
         * @param [left] The first matrix.
         * @param [right] The second matrix.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix3.html#.multiply">Online Documentation</a>
         */
        fun multiply(
            left: Matrix3,
            right: Matrix3,
            result: Matrix3,
        ): Matrix3

        /**
         * Computes the sum of two matrices.
         * @param [left] The first matrix.
         * @param [right] The second matrix.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix3.html#.add">Online Documentation</a>
         */
        fun add(
            left: Matrix3,
            right: Matrix3,
            result: Matrix3,
        ): Matrix3

        /**
         * Computes the difference of two matrices.
         * @param [left] The first matrix.
         * @param [right] The second matrix.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix3.html#.subtract">Online Documentation</a>
         */
        fun subtract(
            left: Matrix3,
            right: Matrix3,
            result: Matrix3,
        ): Matrix3

        /**
         * Computes the product of a matrix and a column vector.
         * @param [matrix] The matrix.
         * @param [cartesian] The column.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix3.html#.multiplyByVector">Online Documentation</a>
         */
        fun multiplyByVector(
            matrix: Matrix3,
            cartesian: Cartesian3,
            result: Cartesian3,
        ): Cartesian3

        /**
         * Computes the product of a matrix and a scalar.
         * @param [matrix] The matrix.
         * @param [scalar] The number to multiply by.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix3.html#.multiplyByScalar">Online Documentation</a>
         */
        fun multiplyByScalar(
            matrix: Matrix3,
            scalar: Double,
            result: Matrix3,
        ): Matrix3

        /**
         * Computes the product of a matrix times a (non-uniform) scale, as if the scale were a scale matrix.
         * ```
         * // Instead of Matrix3.multiply(m, Matrix3.fromScale(scale), m);
         * Matrix3.multiplyByScale(m, scale, m);
         * ```
         * @param [matrix] The matrix on the left-hand side.
         * @param [scale] The non-uniform scale on the right-hand side.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix3.html#.multiplyByScale">Online Documentation</a>
         */
        fun multiplyByScale(
            matrix: Matrix3,
            scale: Double,
            result: Matrix3,
        ): Matrix3

        /**
         * Computes the product of a matrix times a uniform scale, as if the scale were a scale matrix.
         * ```
         * // Instead of Matrix3.multiply(m, Matrix3.fromUniformScale(scale), m);
         * Matrix3.multiplyByUniformScale(m, scale, m);
         * ```
         * @param [matrix] The matrix on the left-hand side.
         * @param [scale] The uniform scale on the right-hand side.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix3.html#.multiplyByUniformScale">Online Documentation</a>
         */
        fun multiplyByUniformScale(
            matrix: Matrix3,
            scale: Double,
            result: Matrix3,
        ): Matrix3

        /**
         * Creates a negated copy of the provided matrix.
         * @param [matrix] The matrix to negate.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix3.html#.negate">Online Documentation</a>
         */
        fun negate(
            matrix: Matrix3,
            result: Matrix3,
        ): Matrix3

        /**
         * Computes the transpose of the provided matrix.
         * @param [matrix] The matrix to transpose.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix3.html#.transpose">Online Documentation</a>
         */
        fun transpose(
            matrix: Matrix3,
            result: Matrix3,
        ): Matrix3

        /**
         * Computes the eigenvectors and eigenvalues of a symmetric matrix.
         *
         * Returns a diagonal matrix and unitary matrix such that:
         * `matrix = unitary matrix * diagonal matrix * transpose(unitary matrix)`
         *
         * The values along the diagonal of the diagonal matrix are the eigenvalues. The columns
         * of the unitary matrix are the corresponding eigenvectors.
         * ```
         * const a = //... symetric matrix
         * const result = {
         *     unitary : new Matrix3(),
         *     diagonal : new Matrix3()
         * };
         * Matrix3.computeEigenDecomposition(a, result);
         *
         * const unitaryTranspose = Matrix3.transpose(result.unitary, new Matrix3());
         * const b = Matrix3.multiply(result.unitary, result.diagonal, new Matrix3());
         * Matrix3.multiply(b, unitaryTranspose, b); // b is now equal to a
         *
         * const lambda = Matrix3.getColumn(result.diagonal, 0, new Cartesian3()).x;  // first eigenvalue
         * const v = Matrix3.getColumn(result.unitary, 0, new Cartesian3());          // first eigenvector
         * const c = Cartesian3.multiplyByScalar(v, lambda, new Cartesian3());        // equal to Matrix3.multiplyByVector(a, v)
         * ```
         * @param [matrix] The matrix to decompose into diagonal and unitary matrix. Expected to be symmetric.
         * @param [result] An object with unitary and diagonal properties which are matrices onto which to store the result.
         * @return An object with unitary and diagonal properties which are the unitary and diagonal matrices, respectively.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix3.html#.computeEigenDecomposition">Online Documentation</a>
         */
        fun computeEigenDecomposition(
            matrix: Matrix3,
            result: Any? = definedExternally,
        ): Any

        /**
         * Computes a matrix, which contains the absolute (unsigned) values of the provided matrix's elements.
         * @param [matrix] The matrix with signed elements.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix3.html#.abs">Online Documentation</a>
         */
        fun abs(
            matrix: Matrix3,
            result: Matrix3,
        ): Matrix3

        /**
         * Computes the determinant of the provided matrix.
         * @param [matrix] The matrix to use.
         * @return The value of the determinant of the matrix.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix3.html#.determinant">Online Documentation</a>
         */
        fun determinant(matrix: Matrix3): Double

        /**
         * Computes the inverse of the provided matrix.
         * @param [matrix] The matrix to invert.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix3.html#.inverse">Online Documentation</a>
         */
        fun inverse(
            matrix: Matrix3,
            result: Matrix3,
        ): Matrix3

        /**
         * Computes the inverse transpose of a matrix.
         * @param [matrix] The matrix to transpose and invert.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix3.html#.inverseTranspose">Online Documentation</a>
         */
        fun inverseTranspose(
            matrix: Matrix3,
            result: Matrix3,
        ): Matrix3

        /**
         * Compares the provided matrices componentwise and returns
         * `true` if they are equal, `false` otherwise.
         * @param [left] The first matrix.
         * @param [right] The second matrix.
         * @return `true` if left and right are equal, `false` otherwise.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix3.html#.equals">Online Documentation</a>
         */
        fun equals(
            left: Matrix3? = definedExternally,
            right: Matrix3? = definedExternally,
        ): Boolean

        /**
         * Compares the provided matrices componentwise and returns
         * `true` if they are within the provided epsilon,
         * `false` otherwise.
         * @param [left] The first matrix.
         * @param [right] The second matrix.
         * @param [epsilon] The epsilon to use for equality testing.
         *   Default value - `0`
         * @return `true` if left and right are within the provided epsilon, `false` otherwise.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix3.html#.equalsEpsilon">Online Documentation</a>
         */
        fun equalsEpsilon(
            left: Matrix3? = definedExternally,
            right: Matrix3? = definedExternally,
            epsilon: Double? = definedExternally,
        ): Boolean

        /**
         * An immutable Matrix3 instance initialized to the identity matrix.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix3.html#.IDENTITY">Online Documentation</a>
         */
        val IDENTITY: Matrix3

        /**
         * An immutable Matrix3 instance initialized to the zero matrix.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix3.html#.ZERO">Online Documentation</a>
         */
        val ZERO: Matrix3

        /**
         * The index into Matrix3 for column 0, row 0.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix3.html#.COLUMN0ROW0">Online Documentation</a>
         */
        val COLUMN0ROW0: Double

        /**
         * The index into Matrix3 for column 0, row 1.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix3.html#.COLUMN0ROW1">Online Documentation</a>
         */
        val COLUMN0ROW1: Double

        /**
         * The index into Matrix3 for column 0, row 2.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix3.html#.COLUMN0ROW2">Online Documentation</a>
         */
        val COLUMN0ROW2: Double

        /**
         * The index into Matrix3 for column 1, row 0.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix3.html#.COLUMN1ROW0">Online Documentation</a>
         */
        val COLUMN1ROW0: Double

        /**
         * The index into Matrix3 for column 1, row 1.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix3.html#.COLUMN1ROW1">Online Documentation</a>
         */
        val COLUMN1ROW1: Double

        /**
         * The index into Matrix3 for column 1, row 2.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix3.html#.COLUMN1ROW2">Online Documentation</a>
         */
        val COLUMN1ROW2: Double

        /**
         * The index into Matrix3 for column 2, row 0.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix3.html#.COLUMN2ROW0">Online Documentation</a>
         */
        val COLUMN2ROW0: Double

        /**
         * The index into Matrix3 for column 2, row 1.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix3.html#.COLUMN2ROW1">Online Documentation</a>
         */
        val COLUMN2ROW1: Double

        /**
         * The index into Matrix3 for column 2, row 2.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix3.html#.COLUMN2ROW2">Online Documentation</a>
         */
        val COLUMN2ROW2: Double
    }
}

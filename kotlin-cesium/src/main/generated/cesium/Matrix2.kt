// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

package cesium

import js.core.ReadonlyArray

/**
 * A 2x2 matrix, indexable as a column-major order array.
 * Constructor parameters are in row-major order for code readability.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix2.html">Online Documentation</a>
 *
 * @constructor
 * @param [column0Row0] The value for column 0, row 0.
 *   Default value - `0.0`
 * @param [column1Row0] The value for column 1, row 0.
 *   Default value - `0.0`
 * @param [column0Row1] The value for column 0, row 1.
 *   Default value - `0.0`
 * @param [column1Row1] The value for column 1, row 1.
 *   Default value - `0.0`
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix2.html">Online Documentation</a>
 */
external class Matrix2(
    column0Row0: Double? = definedExternally,
    column1Row0: Double? = definedExternally,
    column0Row1: Double? = definedExternally,
    column1Row1: Double? = definedExternally,
) {
    /**
     * Gets the number of items in the collection.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix2.html#length">Online Documentation</a>
     */
    var length: Int

    /**
     * Duplicates the provided Matrix2 instance.
     * @param [result] The object onto which to store the result.
     * @return The modified result parameter or a new Matrix2 instance if one was not provided.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix2.html#clone">Online Documentation</a>
     */
    fun clone(result: Matrix2? = definedExternally): Matrix2

    /**
     * Compares this matrix to the provided matrix componentwise and returns
     * `true` if they are within the provided epsilon,
     * `false` otherwise.
     * @param [right] The right hand side matrix.
     * @param [epsilon] The epsilon to use for equality testing.
     *   Default value - `0`
     * @return `true` if they are within the provided epsilon, `false` otherwise.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix2.html#equalsEpsilon">Online Documentation</a>
     */
    fun equalsEpsilon(
        right: Matrix2? = definedExternally,
        epsilon: Double? = definedExternally,
    ): Boolean

    companion object : Packable<Matrix2> {
        /**
         * The number of elements used to pack the object into an array.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix2.html#.packedLength">Online Documentation</a>
         */
        override val packedLength: Int

        /**
         * Stores the provided instance into the provided array.
         * @param [value] The value to pack.
         * @param [array] The array to pack into.
         * @param [startingIndex] The index into the array at which to start packing the elements.
         *   Default value - `0`
         * @return The array that was packed into
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix2.html#.pack">Online Documentation</a>
         */
        override fun pack(
            value: Matrix2,
            array: ReadonlyArray<Double>,
            startingIndex: Int?,
        ): ReadonlyArray<Double>

        /**
         * Retrieves an instance from a packed array.
         * @param [array] The packed array.
         * @param [startingIndex] The starting index of the element to be unpacked.
         *   Default value - `0`
         * @param [result] The object into which to store the result.
         * @return The modified result parameter or a new Matrix2 instance if one was not provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix2.html#.unpack">Online Documentation</a>
         */
        override fun unpack(
            array: ReadonlyArray<Double>,
            startingIndex: Int?,
            result: Matrix2?,
        ): Matrix2

        /**
         * Flattens an array of Matrix2s into an array of components. The components
         * are stored in column-major order.
         * @param [array] The array of matrices to pack.
         * @param [result] The array onto which to store the result. If this is a typed array, it must have array.length * 4 components, else a [DeveloperError] will be thrown. If it is a regular array, it will be resized to have (array.length * 4) elements.
         * @return The packed array.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix2.html#.packArray">Online Documentation</a>
         */
        fun packArray(
            array: ReadonlyArray<Matrix2>,
            result: ReadonlyArray<Double>? = definedExternally,
        ): ReadonlyArray<Double>

        /**
         * Unpacks an array of column-major matrix components into an array of Matrix2s.
         * @param [array] The array of components to unpack.
         * @param [result] The array onto which to store the result.
         * @return The unpacked array.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix2.html#.unpackArray">Online Documentation</a>
         */
        fun unpackArray(
            array: ReadonlyArray<Double>,
            result: ReadonlyArray<Matrix2>? = definedExternally,
        ): ReadonlyArray<Matrix2>

        /**
         * Duplicates a Matrix2 instance.
         * @param [matrix] The matrix to duplicate.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter or a new Matrix2 instance if one was not provided. (Returns undefined if matrix is undefined)
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix2.html#.clone">Online Documentation</a>
         */
        fun clone(
            matrix: Matrix2,
            result: Matrix2? = definedExternally,
        ): Matrix2

        /**
         * Creates a Matrix2 from 4 consecutive elements in an array.
         * ```
         * // Create the Matrix2:
         * // [1.0, 2.0]
         * // [1.0, 2.0]
         *
         * const v = [1.0, 1.0, 2.0, 2.0];
         * const m = Matrix2.fromArray(v);
         *
         * // Create same Matrix2 with using an offset into an array
         * const v2 = [0.0, 0.0, 1.0, 1.0, 2.0, 2.0];
         * const m2 = Matrix2.fromArray(v2, 2);
         * ```
         * @param [array] The array whose 4 consecutive elements correspond to the positions of the matrix.  Assumes column-major order.
         * @param [startingIndex] The offset into the array of the first element, which corresponds to first column first row position in the matrix.
         *   Default value - `0`
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter or a new Matrix2 instance if one was not provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix2.html#.fromArray">Online Documentation</a>
         */
        fun fromArray(
            array: ReadonlyArray<Double>,
            startingIndex: Int? = definedExternally,
            result: Matrix2? = definedExternally,
        ): Matrix2

        /**
         * Creates a Matrix2 instance from a column-major order array.
         * @param [values] The column-major order array.
         * @param [result] The object in which the result will be stored, if undefined a new instance will be created.
         * @return The modified result parameter, or a new Matrix2 instance if one was not provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix2.html#.fromColumnMajorArray">Online Documentation</a>
         */
        fun fromColumnMajorArray(
            values: ReadonlyArray<Double>,
            result: Matrix2? = definedExternally,
        ): Matrix2

        /**
         * Creates a Matrix2 instance from a row-major order array.
         * The resulting matrix will be in column-major order.
         * @param [values] The row-major order array.
         * @param [result] The object in which the result will be stored, if undefined a new instance will be created.
         * @return The modified result parameter, or a new Matrix2 instance if one was not provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix2.html#.fromRowMajorArray">Online Documentation</a>
         */
        fun fromRowMajorArray(
            values: ReadonlyArray<Double>,
            result: Matrix2? = definedExternally,
        ): Matrix2

        /**
         * Computes a Matrix2 instance representing a non-uniform scale.
         * ```
         * // Creates
         * //   [7.0, 0.0]
         * //   [0.0, 8.0]
         * const m = Matrix2.fromScale(new Cartesian2(7.0, 8.0));
         * ```
         * @param [scale] The x and y scale factors.
         * @param [result] The object in which the result will be stored, if undefined a new instance will be created.
         * @return The modified result parameter, or a new Matrix2 instance if one was not provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix2.html#.fromScale">Online Documentation</a>
         */
        fun fromScale(
            scale: Cartesian2,
            result: Matrix2? = definedExternally,
        ): Matrix2

        /**
         * Computes a Matrix2 instance representing a uniform scale.
         * ```
         * // Creates
         * //   [2.0, 0.0]
         * //   [0.0, 2.0]
         * const m = Matrix2.fromUniformScale(2.0);
         * ```
         * @param [scale] The uniform scale factor.
         * @param [result] The object in which the result will be stored, if undefined a new instance will be created.
         * @return The modified result parameter, or a new Matrix2 instance if one was not provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix2.html#.fromUniformScale">Online Documentation</a>
         */
        fun fromUniformScale(
            scale: Double,
            result: Matrix2? = definedExternally,
        ): Matrix2

        /**
         * Creates a rotation matrix.
         * ```
         * // Rotate a point 45 degrees counterclockwise.
         * const p = new Cartesian2(5, 6);
         * const m = Matrix2.fromRotation(Math.toRadians(45.0));
         * const rotated = Matrix2.multiplyByVector(m, p, new Cartesian2());
         * ```
         * @param [angle] The angle, in radians, of the rotation.  Positive angles are counterclockwise.
         * @param [result] The object in which the result will be stored, if undefined a new instance will be created.
         * @return The modified result parameter, or a new Matrix2 instance if one was not provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix2.html#.fromRotation">Online Documentation</a>
         */
        fun fromRotation(
            angle: Double,
            result: Matrix2? = definedExternally,
        ): Matrix2

        /**
         * Creates an Array from the provided Matrix2 instance.
         * The array will be in column-major order.
         * @param [matrix] The matrix to use..
         * @param [result] The Array onto which to store the result.
         * @return The modified Array parameter or a new Array instance if one was not provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix2.html#.toArray">Online Documentation</a>
         */
        fun toArray(
            matrix: Matrix2,
            result: ReadonlyArray<Double>? = definedExternally,
        ): ReadonlyArray<Double>

        /**
         * Computes the array index of the element at the provided row and column.
         * ```
         * const myMatrix = new Matrix2();
         * const column1Row0Index = Matrix2.getElementIndex(1, 0);
         * const column1Row0 = myMatrix[column1Row0Index]
         * myMatrix[column1Row0Index] = 10.0;
         * ```
         * @param [row] The zero-based index of the row.
         * @param [column] The zero-based index of the column.
         * @return The index of the element at the provided row and column.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix2.html#.getElementIndex">Online Documentation</a>
         */
        fun getElementIndex(
            row: Int,
            column: Int,
        ): Int

        /**
         * Retrieves a copy of the matrix column at the provided index as a Cartesian2 instance.
         * @param [matrix] The matrix to use.
         * @param [index] The zero-based index of the column to retrieve.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix2.html#.getColumn">Online Documentation</a>
         */
        fun getColumn(
            matrix: Matrix2,
            index: Int,
            result: Cartesian2,
        ): Cartesian2

        /**
         * Computes a new matrix that replaces the specified column in the provided matrix with the provided Cartesian2 instance.
         * @param [matrix] The matrix to use.
         * @param [index] The zero-based index of the column to set.
         * @param [cartesian] The Cartesian whose values will be assigned to the specified column.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix2.html#.setColumn">Online Documentation</a>
         */
        fun setColumn(
            matrix: Matrix2,
            index: Int,
            cartesian: Cartesian2,
            result: Cartesian2,
        ): Matrix2

        /**
         * Retrieves a copy of the matrix row at the provided index as a Cartesian2 instance.
         * @param [matrix] The matrix to use.
         * @param [index] The zero-based index of the row to retrieve.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix2.html#.getRow">Online Documentation</a>
         */
        fun getRow(
            matrix: Matrix2,
            index: Int,
            result: Cartesian2,
        ): Cartesian2

        /**
         * Computes a new matrix that replaces the specified row in the provided matrix with the provided Cartesian2 instance.
         * @param [matrix] The matrix to use.
         * @param [index] The zero-based index of the row to set.
         * @param [cartesian] The Cartesian whose values will be assigned to the specified row.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix2.html#.setRow">Online Documentation</a>
         */
        fun setRow(
            matrix: Matrix2,
            index: Int,
            cartesian: Cartesian2,
            result: Matrix2,
        ): Matrix2

        /**
         * Computes a new matrix that replaces the scale with the provided scale.
         * This assumes the matrix is an affine transformation.
         * @param [matrix] The matrix to use.
         * @param [scale] The scale that replaces the scale of the provided matrix.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix2.html#.setScale">Online Documentation</a>
         */
        fun setScale(
            matrix: Matrix2,
            scale: Cartesian2,
            result: Matrix2,
        ): Matrix2

        /**
         * Computes a new matrix that replaces the scale with the provided uniform scale.
         * This assumes the matrix is an affine transformation.
         * @param [matrix] The matrix to use.
         * @param [scale] The uniform scale that replaces the scale of the provided matrix.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix2.html#.setUniformScale">Online Documentation</a>
         */
        fun setUniformScale(
            matrix: Matrix2,
            scale: Double,
            result: Matrix2,
        ): Matrix2

        /**
         * Extracts the non-uniform scale assuming the matrix is an affine transformation.
         * @param [matrix] The matrix.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix2.html#.getScale">Online Documentation</a>
         */
        fun getScale(
            matrix: Matrix2,
            result: Cartesian2,
        ): Cartesian2

        /**
         * Computes the maximum scale assuming the matrix is an affine transformation.
         * The maximum scale is the maximum length of the column vectors.
         * @param [matrix] The matrix.
         * @return The maximum scale.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix2.html#.getMaximumScale">Online Documentation</a>
         */
        fun getMaximumScale(matrix: Matrix2): Double

        /**
         * Sets the rotation assuming the matrix is an affine transformation.
         * @param [matrix] The matrix.
         * @param [rotation] The rotation matrix.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix2.html#.setRotation">Online Documentation</a>
         */
        fun setRotation(
            matrix: Matrix2,
            rotation: Matrix2,
            result: Matrix2,
        ): Matrix2

        /**
         * Extracts the rotation matrix assuming the matrix is an affine transformation.
         * @param [matrix] The matrix.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix2.html#.getRotation">Online Documentation</a>
         */
        fun getRotation(
            matrix: Matrix2,
            result: Matrix2,
        ): Matrix2

        /**
         * Computes the product of two matrices.
         * @param [left] The first matrix.
         * @param [right] The second matrix.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix2.html#.multiply">Online Documentation</a>
         */
        fun multiply(
            left: Matrix2,
            right: Matrix2,
            result: Matrix2,
        ): Matrix2

        /**
         * Computes the sum of two matrices.
         * @param [left] The first matrix.
         * @param [right] The second matrix.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix2.html#.add">Online Documentation</a>
         */
        fun add(
            left: Matrix2,
            right: Matrix2,
            result: Matrix2,
        ): Matrix2

        /**
         * Computes the difference of two matrices.
         * @param [left] The first matrix.
         * @param [right] The second matrix.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix2.html#.subtract">Online Documentation</a>
         */
        fun subtract(
            left: Matrix2,
            right: Matrix2,
            result: Matrix2,
        ): Matrix2

        /**
         * Computes the product of a matrix and a column vector.
         * @param [matrix] The matrix.
         * @param [cartesian] The column.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix2.html#.multiplyByVector">Online Documentation</a>
         */
        fun multiplyByVector(
            matrix: Matrix2,
            cartesian: Cartesian2,
            result: Cartesian2,
        ): Cartesian2

        /**
         * Computes the product of a matrix and a scalar.
         * @param [matrix] The matrix.
         * @param [scalar] The number to multiply by.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix2.html#.multiplyByScalar">Online Documentation</a>
         */
        fun multiplyByScalar(
            matrix: Matrix2,
            scalar: Double,
            result: Matrix2,
        ): Matrix2

        /**
         * Computes the product of a matrix times a (non-uniform) scale, as if the scale were a scale matrix.
         * ```
         * // Instead of Matrix2.multiply(m, Matrix2.fromScale(scale), m);
         * Matrix2.multiplyByScale(m, scale, m);
         * ```
         * @param [matrix] The matrix on the left-hand side.
         * @param [scale] The non-uniform scale on the right-hand side.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix2.html#.multiplyByScale">Online Documentation</a>
         */
        fun multiplyByScale(
            matrix: Matrix2,
            scale: Cartesian2,
            result: Matrix2,
        ): Matrix2

        /**
         * Computes the product of a matrix times a uniform scale, as if the scale were a scale matrix.
         * ```
         * // Instead of Matrix2.multiply(m, Matrix2.fromUniformScale(scale), m);
         * Matrix2.multiplyByUniformScale(m, scale, m);
         * ```
         * @param [matrix] The matrix on the left-hand side.
         * @param [scale] The uniform scale on the right-hand side.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix2.html#.multiplyByUniformScale">Online Documentation</a>
         */
        fun multiplyByUniformScale(
            matrix: Matrix2,
            scale: Double,
            result: Matrix2,
        ): Matrix2

        /**
         * Creates a negated copy of the provided matrix.
         * @param [matrix] The matrix to negate.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix2.html#.negate">Online Documentation</a>
         */
        fun negate(
            matrix: Matrix2,
            result: Matrix2,
        ): Matrix2

        /**
         * Computes the transpose of the provided matrix.
         * @param [matrix] The matrix to transpose.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix2.html#.transpose">Online Documentation</a>
         */
        fun transpose(
            matrix: Matrix2,
            result: Matrix2,
        ): Matrix2

        /**
         * Computes a matrix, which contains the absolute (unsigned) values of the provided matrix's elements.
         * @param [matrix] The matrix with signed elements.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix2.html#.abs">Online Documentation</a>
         */
        fun abs(
            matrix: Matrix2,
            result: Matrix2,
        ): Matrix2

        /**
         * Compares the provided matrices componentwise and returns
         * `true` if they are equal, `false` otherwise.
         * @param [left] The first matrix.
         * @param [right] The second matrix.
         * @return `true` if left and right are equal, `false` otherwise.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix2.html#.equals">Online Documentation</a>
         */
        fun equals(
            left: Matrix2? = definedExternally,
            right: Matrix2? = definedExternally,
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
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix2.html#.equalsEpsilon">Online Documentation</a>
         */
        fun equalsEpsilon(
            left: Matrix2? = definedExternally,
            right: Matrix2? = definedExternally,
            epsilon: Double? = definedExternally,
        ): Boolean

        /**
         * An immutable Matrix2 instance initialized to the identity matrix.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix2.html#.IDENTITY">Online Documentation</a>
         */
        val IDENTITY: Matrix2

        /**
         * An immutable Matrix2 instance initialized to the zero matrix.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix2.html#.ZERO">Online Documentation</a>
         */
        val ZERO: Matrix2

        /**
         * The index into Matrix2 for column 0, row 0.
         * ```
         * const matrix = new Matrix2();
         * matrix[Cesium.Matrix2.COLUMN0ROW0] = 5.0; // set column 0, row 0 to 5.0
         * ```
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix2.html#.COLUMN0ROW0">Online Documentation</a>
         */
        val COLUMN0ROW0: Double

        /**
         * The index into Matrix2 for column 0, row 1.
         * ```
         * const matrix = new Matrix2();
         * matrix[Cesium.Matrix2.COLUMN0ROW1] = 5.0; // set column 0, row 1 to 5.0
         * ```
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix2.html#.COLUMN0ROW1">Online Documentation</a>
         */
        val COLUMN0ROW1: Double

        /**
         * The index into Matrix2 for column 1, row 0.
         * ```
         * const matrix = new Matrix2();
         * matrix[Cesium.Matrix2.COLUMN1ROW0] = 5.0; // set column 1, row 0 to 5.0
         * ```
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix2.html#.COLUMN1ROW0">Online Documentation</a>
         */
        val COLUMN1ROW0: Double

        /**
         * The index into Matrix2 for column 1, row 1.
         * ```
         * const matrix = new Matrix2();
         * matrix[Cesium.Matrix2.COLUMN1ROW1] = 5.0; // set column 1, row 1 to 5.0
         * ```
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Matrix2.html#.COLUMN1ROW1">Online Documentation</a>
         */
        val COLUMN1ROW1: Double
    }
}

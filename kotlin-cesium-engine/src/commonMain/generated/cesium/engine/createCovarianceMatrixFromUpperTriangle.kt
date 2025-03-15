// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

import js.array.ReadonlyArray

/**
 * Creates a Matrix3 that describes a covariance matrix (which is
 * symmetric) from the array containing the upper triangle, in
 * column-major order.
 * @param [array] The input array
 * @return The Matrix3
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#createCovarianceMatrixFromUpperTriangle">Online Documentation</a>
 */
external fun createCovarianceMatrixFromUpperTriangle(array: ReadonlyArray<Double>): Matrix3

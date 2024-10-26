// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

import js.array.ReadonlyArray
import kotlinx.js.JsPlainObject

/**
 * The GPM metadata for a Ground-Space Indirect implementation stored
 * locally (i.e. a tile and/or leaf node).
 *
 * This reflects the root extension object of the [NGA_gpm_local](https://nsgreg.nga.mil/csmwg.jsp)
 * glTF extension. When a model that contains this extension was loaded,
 * then an object of this type can be obtained by calling
 * ```
 * const gltfGpmLocal = model.getExtension("NGA_gpm_local");
 * ```
 *
 * The storage type determines the presence of the optional properties:
 * - When the storage type is `StorageType.Indirect`, then the
 *   `anchorPointsIndirect` and `intraTileCorrelationGroups`
 *   are present.
 * - When the storage type is `StorageType.Direct`, then the
 *   `anchorPointsDirect` and `covarianceDirect` are present.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GltfGpmLocal.html">Online Documentation</a>
 *
 * @constructor
 * @param [options] An object describing initialization options
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GltfGpmLocal.html">Online Documentation</a>
 */
external class GltfGpmLocal(
    options: ConstructorOptions,
) {
    /**
     * Specifies if covariance storage is indirect or direct.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GltfGpmLocal.html#storageType">Online Documentation</a>
     */
    val storageType: StorageType

    /**
     * Array of stored indirect anchor points
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GltfGpmLocal.html#anchorPointsIndirect">Online Documentation</a>
     */
    val anchorPointsIndirect: ReadonlyArray<AnchorPointIndirect>?

    /**
     * Array of stored direct anchor points
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GltfGpmLocal.html#anchorPointsDirect">Online Documentation</a>
     */
    val anchorPointsDirect: ReadonlyArray<AnchorPointDirect>?

    /**
     * Metadata identifying parameters using same correlation modeling and
     * associated correlation parameters
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GltfGpmLocal.html#intraTileCorrelationGroups">Online Documentation</a>
     */
    val intraTileCorrelationGroups: ReadonlyArray<CorrelationGroup>?

    /**
     * The full covariance of anchor point parameters
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GltfGpmLocal.html#covarianceDirect">Online Documentation</a>
     */
    val covarianceDirect: Matrix3?

    /**
     * Initialization options for the GltfGpmLocal constructor
     * @property [storageType] The storage type.
     *   This must be one of the `StorageType` constants, i.e. `Direct` or `Indirect`.
     * @property [anchorPointsIndirect] The indirect anchor points.
     *   This must be present if and only if the storage type is `Indirect`.
     * @property [intraTileCorrelationGroups] The intra-tile correlation groups.
     *   This must be present if and only if the storage type is `Indirect`.
     * @property [anchorPointsDirect] The direct anchor points.
     *   This must be present if and only if the storage type is `Direct`.
     * @property [covarianceDirect] The covariance of anchor point parameters.
     *   This must be present if and only if the storage type is `Direct`.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GltfGpmLocal.html#.ConstructorOptions">Online Documentation</a>
     */
    @JsPlainObject
    interface ConstructorOptions {
        var storageType: String
        var anchorPointsIndirect: ReadonlyArray<AnchorPointIndirect>??
        var intraTileCorrelationGroups: ReadonlyArray<CorrelationGroup>??
        var anchorPointsDirect: ReadonlyArray<AnchorPointDirect>??
        var covarianceDirect: Matrix3??
    }
}

// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

/**
 * An enum of storage types for covariance information.
 *
 * This reflects the `gltfGpmLocal.storageType` definition of the
 * [NGA_gpm_local](https://nsgreg.nga.mil/csmwg.jsp) glTF extension.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#StorageType">Online Documentation</a>
 */
sealed external interface StorageType {
    companion object {

        /**
         * Store the full error covariance of the anchor points, to include the cross-covariance terms
         */
        val Direct: StorageType

        /**
         * A full covariance matrix is stored for each of the anchor points. However, in this case the
         * cross-covariance terms are not directly stored, but can be computed by a set of spatial
         * correlation function parameters which are stored in the metadata.
         */
        val Indirect: StorageType
    }
}

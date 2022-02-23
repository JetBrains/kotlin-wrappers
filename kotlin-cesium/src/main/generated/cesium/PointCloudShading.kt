// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package cesium

/**
 * Options for performing point attenuation based on geometric error when rendering
 * point clouds using 3D Tiles.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PointCloudShading.html">Online Documentation</a>
 */
external class PointCloudShading {
    /**
     * Perform point attenuation based on geometric error.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PointCloudShading.html#attenuation">Online Documentation</a>
     */
    var attenuation: Boolean

    /**
     * Scale to be applied to the geometric error before computing attenuation.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PointCloudShading.html#geometricErrorScale">Online Documentation</a>
     */
    var geometricErrorScale: Double

    /**
     * Maximum point attenuation in pixels. If undefined, the Cesium3DTileset's maximumScreenSpaceError will be used.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PointCloudShading.html#maximumAttenuation">Online Documentation</a>
     */
    var maximumAttenuation: Int

    /**
     * Average base resolution for the dataset in meters.
     * Used in place of geometric error when geometric error is 0.
     * If undefined, an approximation will be computed for each tile that has geometric error of 0.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PointCloudShading.html#baseResolution">Online Documentation</a>
     */
    var baseResolution: Int

    /**
     * Use eye dome lighting when drawing with point attenuation
     * Requires support for EXT_frag_depth, OES_texture_float, and WEBGL_draw_buffers extensions in WebGL 1.0,
     * otherwise eye dome lighting is ignored.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PointCloudShading.html#eyeDomeLighting">Online Documentation</a>
     */
    var eyeDomeLighting: Boolean

    /**
     * Eye dome lighting strength (apparent contrast)
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PointCloudShading.html#eyeDomeLightingStrength">Online Documentation</a>
     */
    var eyeDomeLightingStrength: Double

    /**
     * Thickness of contours from eye dome lighting
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PointCloudShading.html#eyeDomeLightingRadius">Online Documentation</a>
     */
    var eyeDomeLightingRadius: Double

    /**
     * Determines whether back-facing points are hidden.
     * This option works only if data has normals included.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PointCloudShading.html#backFaceCulling">Online Documentation</a>
     */
    var backFaceCulling: Boolean

    /**
     * Determines whether a point cloud that contains normals is shaded by the scene's light source.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PointCloudShading.html#normalShading">Online Documentation</a>
     */
    var normalShading: Boolean

    companion object {
        /**
         * Determines if point cloud shading is supported.
         * @param [scene] The scene.
         * @return `true` if point cloud shading is supported; otherwise, returns `false`
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PointCloudShading.html#.isSupported">Online Documentation</a>
         */
        fun isSupported(scene: Scene): Boolean
    }
}

inline fun PointCloudShading(
    block: PointCloudShading.() -> Unit,
): PointCloudShading =
    PointCloudShading().apply(block)

// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

/**
 * Blends the atmosphere to geometry far from the camera for horizon views. Allows for additional
 * performance improvements by rendering less geometry and dispatching less terrain requests.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Fog.html">Online Documentation</a>
 */
external class Fog {
    /**
     * `true` if fog is enabled, `false` otherwise.
     * ```
     * // Disable fog in the scene
     * viewer.scene.fog.enabled = false;
     * ```
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Fog.html#enabled">Online Documentation</a>
     */
    var enabled: Boolean

    /**
     * `true` if fog is renderable in shaders, `false` otherwise.
     * This allows to benefits from optimized tile loading strategy based on fog density without the actual visual rendering.
     * ```
     * // Use fog culling but don't render it
     * viewer.scene.fog.enabled = true;
     * viewer.scene.fog.renderable = false;
     * ```
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Fog.html#renderable">Online Documentation</a>
     */
    var renderable: Boolean

    /**
     * A scalar that determines the density of the fog. Terrain that is in full fog are culled.
     * The density of the fog increases as this number approaches 1.0 and becomes less dense as it approaches zero.
     * The more dense the fog is, the more aggressively the terrain is culled. For example, if the camera is a height of
     * 1000.0m above the ellipsoid, increasing the value to 3.0e-3 will cause many tiles close to the viewer be culled.
     * Decreasing the value will push the fog further from the viewer, but decrease performance as more of the terrain is rendered.
     * ```
     * // Double the default fog density
     * viewer.scene.fog.density = 0.0012;
     * ```
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Fog.html#density">Online Documentation</a>
     */
    var density: Double

    /**
     * A scalar used in the function to adjust density based on the height of the camera above the terrain.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Fog.html#heightScalar">Online Documentation</a>
     */
    var heightScalar: Double

    /**
     * The maximum height fog is applied. If the camera is above this height fog will be disabled.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Fog.html#maxHeight">Online Documentation</a>
     */
    var maxHeight: Double

    /**
     * A scalar that impacts the visual density of fog. This value does not impact the culling of terrain.
     * Use in combination with the [Fog.density] to make fog appear more or less dense.
     * ```
     * // Increase fog appearance effect
     * viewer.scene.fog.visualDensityScalar = 0.6;
     * ```
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Fog.html#visualDensityScalar">Online Documentation</a>
     */
    var visualDensityScalar: Double

    /**
     * A factor used to increase the screen space error of terrain tiles when they are partially in fog. The effect is to reduce
     * the number of terrain tiles requested for rendering. If set to zero, the feature will be disabled. If the value is increased
     * for mountainous regions, less tiles will need to be requested, but the terrain meshes near the horizon may be a noticeably
     * lower resolution. If the value is increased in a relatively flat area, there will be little noticeable change on the horizon.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Fog.html#screenSpaceErrorFactor">Online Documentation</a>
     */
    var screenSpaceErrorFactor: Double

    /**
     * The minimum brightness of the fog color from lighting. A value of 0.0 can cause the fog to be completely black. A value of 1.0 will not affect
     * the brightness at all.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Fog.html#minimumBrightness">Online Documentation</a>
     */
    var minimumBrightness: Double

    /**
     * Exponent factor used in the function to adjust how density changes based on the height of the camera above the ellipsoid. Smaller values produce a more gradual transition as camera height increases.
     * Value must be greater than 0.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Fog.html#heightFalloff">Online Documentation</a>
     */
    var heightFalloff: Double
}

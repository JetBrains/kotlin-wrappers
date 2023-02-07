// Automatically generated - do not modify!

@file:JsModule("cesium")

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package cesium

/**
 * A ParticleEmitter that emits particles from a circle.
 * Particles will be positioned within a circle and have initial velocities going along the z vector.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CircleEmitter.html">Online Documentation</a>
 *
 * @constructor
 * @property [radius] The radius of the circle in meters.
 *   Default value - `1.0`
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CircleEmitter.html">Online Documentation</a>
 */
external class CircleEmitter(var radius: Double = definedExternally) {
    /**
     * The angle of the cone in radians.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CircleEmitter.html#angle">Online Documentation</a>
     */
    var angle: Double
}

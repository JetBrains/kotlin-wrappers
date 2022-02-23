// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package cesium

/**
 * A ParticleSystem manages the updating and display of a collection of particles.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ParticleSystem.html">Online Documentation</a>
 */
external class ParticleSystem(options: ConstructorOptions? = definedExternally) {
    /**
     * @property [show] Whether to display the particle system.
     *   Default value - `true`
     * @property [updateCallback] The callback function to be called each frame to update a particle.
     * @property [emitter] The particle emitter for this system.
     *   Default value - [CircleEmitter(0.5)][CircleEmitter]
     * @property [modelMatrix] The 4x4 transformation matrix that transforms the particle system from model to world coordinates.
     *   Default value - [Matrix4.IDENTITY]
     * @property [emitterModelMatrix] The 4x4 transformation matrix that transforms the particle system emitter within the particle systems local coordinate system.
     *   Default value - [Matrix4.IDENTITY]
     * @property [emissionRate] The number of particles to emit per second.
     *   Default value - `5`
     * @property [bursts] An array of [ParticleBurst], emitting bursts of particles at periodic times.
     * @property [loop] Whether the particle system should loop its bursts when it is complete.
     *   Default value - `true`
     * @property [scale] Sets the scale to apply to the image of the particle for the duration of its particleLife.
     *   Default value - `1.0`
     * @property [startScale] The initial scale to apply to the image of the particle at the beginning of its life.
     * @property [endScale] The final scale to apply to the image of the particle at the end of its life.
     * @property [color] Sets the color of a particle for the duration of its particleLife.
     *   Default value - [Color.WHITE]
     * @property [startColor] The color of the particle at the beginning of its life.
     * @property [endColor] The color of the particle at the end of its life.
     * @property [image] The URI, HTMLImageElement, or HTMLCanvasElement to use for the billboard.
     * @property [imageSize] If set, overrides the minimumImageSize and maximumImageSize inputs that scale the particle image's dimensions in pixels.
     *   Default value - [Cartesian2(1.0, 1.0)][Cartesian2]
     * @property [minimumImageSize] Sets the minimum bound, width by height, above which to randomly scale the particle image's dimensions in pixels.
     * @property [maximumImageSize] Sets the maximum bound, width by height, below which to randomly scale the particle image's dimensions in pixels.
     * @property [sizeInMeters] Sets if the size of particles is in meters or pixels. `true` to size the particles in meters; otherwise, the size is in pixels.
     * @property [speed] If set, overrides the minimumSpeed and maximumSpeed inputs with this value.
     *   Default value - `1.0`
     * @property [minimumSpeed] Sets the minimum bound in meters per second above which a particle's actual speed will be randomly chosen.
     * @property [maximumSpeed] Sets the maximum bound in meters per second below which a particle's actual speed will be randomly chosen.
     * @property [lifetime] How long the particle system will emit particles, in seconds.
     *   Default value - [Number.MAX_VALUE]
     * @property [particleLife] If set, overrides the minimumParticleLife and maximumParticleLife inputs with this value.
     *   Default value - `5.0`
     * @property [minimumParticleLife] Sets the minimum bound in seconds for the possible duration of a particle's life above which a particle's actual life will be randomly chosen.
     * @property [maximumParticleLife] Sets the maximum bound in seconds for the possible duration of a particle's life below which a particle's actual life will be randomly chosen.
     * @property [mass] Sets the minimum and maximum mass of particles in kilograms.
     *   Default value - `1.0`
     * @property [minimumMass] Sets the minimum bound for the mass of a particle in kilograms. A particle's actual mass will be chosen as a random amount above this value.
     * @property [maximumMass] Sets the maximum mass of particles in kilograms. A particle's actual mass will be chosen as a random amount below this value.
     */
    interface ConstructorOptions {
        var show: Boolean?
        var updateCallback: UpdateCallback?
        var emitter: ParticleEmitter?
        var modelMatrix: Matrix4?
        var emitterModelMatrix: Matrix4?
        var emissionRate: Int?
        var bursts: Array<out ParticleBurst>?
        var loop: Boolean?
        var scale: Double?
        var startScale: Double?
        var endScale: Double?
        var color: Color?
        var startColor: Color?
        var endColor: Color?
        var image: Any?
        var imageSize: Cartesian2?
        var minimumImageSize: Cartesian2?
        var maximumImageSize: Cartesian2?
        var sizeInMeters: Boolean?
        var speed: Double?
        var minimumSpeed: Double?
        var maximumSpeed: Double?
        var lifetime: Double?
        var particleLife: Double?
        var minimumParticleLife: Double?
        var maximumParticleLife: Double?
        var mass: Double?
        var minimumMass: Double?
        var maximumMass: Double?
    }

    /**
     * Whether to display the particle system.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ParticleSystem.html#show">Online Documentation</a>
     */
    var show: Boolean

    /**
     * An array of force callbacks. The callback is passed a [Particle] and the difference from the last time
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ParticleSystem.html#updateCallback">Online Documentation</a>
     */
    var updateCallback: UpdateCallback

    /**
     * Whether the particle system should loop it's bursts when it is complete.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ParticleSystem.html#loop">Online Documentation</a>
     */
    var loop: Boolean

    /**
     * The URI, HTMLImageElement, or HTMLCanvasElement to use for the billboard.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ParticleSystem.html#image">Online Documentation</a>
     */
    var image: Any

    /**
     * The particle emitter for this
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ParticleSystem.html#emitter">Online Documentation</a>
     */
    var emitter: ParticleEmitter

    /**
     * An array of [ParticleBurst], emitting bursts of particles at periodic times.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ParticleSystem.html#bursts">Online Documentation</a>
     */
    var bursts: Array<out ParticleBurst>

    /**
     * The 4x4 transformation matrix that transforms the particle system from model to world coordinates.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ParticleSystem.html#modelMatrix">Online Documentation</a>
     */
    var modelMatrix: Matrix4

    /**
     * The 4x4 transformation matrix that transforms the particle system emitter within the particle systems local coordinate system.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ParticleSystem.html#emitterModelMatrix">Online Documentation</a>
     */
    var emitterModelMatrix: Matrix4

    /**
     * The color of the particle at the beginning of its life.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ParticleSystem.html#startColor">Online Documentation</a>
     */
    var startColor: Color

    /**
     * The color of the particle at the end of its life.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ParticleSystem.html#endColor">Online Documentation</a>
     */
    var endColor: Color

    /**
     * The initial scale to apply to the image of the particle at the beginning of its life.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ParticleSystem.html#startScale">Online Documentation</a>
     */
    var startScale: Double

    /**
     * The final scale to apply to the image of the particle at the end of its life.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ParticleSystem.html#endScale">Online Documentation</a>
     */
    var endScale: Double

    /**
     * The number of particles to emit per second.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ParticleSystem.html#emissionRate">Online Documentation</a>
     */
    var emissionRate: Int

    /**
     * Sets the minimum bound in meters per second above which a particle's actual speed will be randomly chosen.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ParticleSystem.html#minimumSpeed">Online Documentation</a>
     */
    var minimumSpeed: Double

    /**
     * Sets the maximum bound in meters per second below which a particle's actual speed will be randomly chosen.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ParticleSystem.html#maximumSpeed">Online Documentation</a>
     */
    var maximumSpeed: Double

    /**
     * Sets the minimum bound in seconds for the possible duration of a particle's life above which a particle's actual life will be randomly chosen.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ParticleSystem.html#minimumParticleLife">Online Documentation</a>
     */
    var minimumParticleLife: Double

    /**
     * Sets the maximum bound in seconds for the possible duration of a particle's life below which a particle's actual life will be randomly chosen.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ParticleSystem.html#maximumParticleLife">Online Documentation</a>
     */
    var maximumParticleLife: Double

    /**
     * Sets the minimum mass of particles in kilograms.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ParticleSystem.html#minimumMass">Online Documentation</a>
     */
    var minimumMass: Double

    /**
     * Sets the maximum mass of particles in kilograms.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ParticleSystem.html#maximumMass">Online Documentation</a>
     */
    var maximumMass: Double

    /**
     * Sets the minimum bound, width by height, above which to randomly scale the particle image's dimensions in pixels.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ParticleSystem.html#minimumImageSize">Online Documentation</a>
     */
    var minimumImageSize: Cartesian2

    /**
     * Sets the maximum bound, width by height, below which to randomly scale the particle image's dimensions in pixels.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ParticleSystem.html#maximumImageSize">Online Documentation</a>
     */
    var maximumImageSize: Cartesian2

    /**
     * Gets or sets if the particle size is in meters or pixels. `true` to size particles in meters; otherwise, the size is in pixels.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ParticleSystem.html#sizeInMeters">Online Documentation</a>
     */
    var sizeInMeters: Boolean

    /**
     * How long the particle system will emit particles, in seconds.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ParticleSystem.html#lifetime">Online Documentation</a>
     */
    var lifetime: Double

    /**
     * Fires an event when the particle system has reached the end of its lifetime.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ParticleSystem.html#complete">Online Documentation</a>
     */
    var complete: Event

    /**
     * When `true`, the particle system has reached the end of its lifetime; `false` otherwise.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ParticleSystem.html#isComplete">Online Documentation</a>
     */
    var isComplete: Boolean

    /**
     * Returns true if this object was destroyed; otherwise, false.
     *
     * If this object was destroyed, it should not be used; calling any function other than
     * `isDestroyed` will result in a [DeveloperError] exception.
     * @return `true` if this object was destroyed; otherwise, `false`.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ParticleSystem.html#isDestroyed">Online Documentation</a>
     */
    fun isDestroyed(): Boolean

    /**
     * Destroys the WebGL resources held by this object.  Destroying an object allows for deterministic
     * release of WebGL resources, instead of relying on the garbage collector to destroy this object.
     *
     * Once an object is destroyed, it should not be used; calling any function other than
     * `isDestroyed` will result in a [DeveloperError] exception.  Therefore,
     * assign the return value (`undefined`) to the object as done in the example.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ParticleSystem.html#destroy">Online Documentation</a>
     */
    fun destroy()
}

/**
 * A function used to modify attributes of the particle at each time step. This can include force modifications,
 * color, sizing, etc.
 * ```
 * function applyGravity(particle, dt) {
 *    const position = particle.position;
 *    const gravityVector = Cartesian3.normalize(position, new Cartesian3());
 *    Cartesian3.multiplyByScalar(gravityVector, GRAVITATIONAL_CONSTANT * dt, gravityVector);
 *    particle.velocity = Cartesian3.add(particle.velocity, gravityVector, particle.velocity);
 * }
 * ```
 * @param [particle] The particle being updated.
 * @param [dt] The time in seconds since the last update.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ParticleSystem.html#.updateCallback">Online Documentation</a>
 */
typealias UpdateCallback = (particle: Particle, dt: Double) -> Unit

inline fun ParticleSystem(
    block: ParticleSystem.ConstructorOptions.() -> Unit,
): ParticleSystem {
    val options: ParticleSystem.ConstructorOptions = js("({})")
    block(options)
    return ParticleSystem(options)
}

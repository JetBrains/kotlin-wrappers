// Automatically generated - do not modify!

package cesium.engine

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

// Automatically generated - do not modify!

@file:JsModule("cesium")

package cesium

/**
 * The blending state combines [BlendEquation] and [BlendFunction] and the
 * `enabled` flag to define the full blending state for combining source and
 * destination fragments when rendering.
 *
 * This is a helper when using custom render states with [Appearance.renderState].
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BlendingState.html">Online Documentation</a>
 */
external object BlendingState {
    /**
     * Blending is disabled.
     */
    val DISABLED: Any

    /**
     * Blending is enabled using alpha blending, `source(source.alpha) + destination(1 - source.alpha)`.
     */
    val ALPHA_BLEND: Any

    /**
     * Blending is enabled using alpha blending with premultiplied alpha, `source + destination(1 - source.alpha)`.
     */
    val PRE_MULTIPLIED_ALPHA_BLEND: Any

    /**
     * Blending is enabled using additive blending, `source(source.alpha) + destination`.
     */
    val ADDITIVE_BLEND: Any
}

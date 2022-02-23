// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

package cesium

/**
 * A browser-independent function to request a new animation frame.  This is used to create
 * an application's draw loop as shown in the example below.
 * ```
 * // Create a draw loop using requestAnimationFrame. The
 * // tick callback function is called for every animation frame.
 * function tick() {
 *   scene.render();
 *   requestAnimationFrame(tick);
 * }
 * tick();
 * ```
 * @param [callback] The function to call when the next frame should be drawn.
 * @return An ID that can be passed to [cancelAnimationFrame] to cancel the request.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/requestAnimationFrame.html">Online Documentation</a>
 */
external fun requestAnimationFrame(callback: requestAnimationFrameCallback): Double

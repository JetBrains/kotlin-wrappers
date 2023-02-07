// Automatically generated - do not modify!

@file:JsModule("cesium")

package cesium

/**
 * A mixin which adds the [PerformanceWatchdog] widget to the [Viewer] widget.
 * Rather than being called directly, this function is normally passed as
 * a parameter to [Viewer.extend], as shown in the example below.
 * ```
 * const viewer = new Viewer('cesiumContainer');
 * viewer.extend(viewerPerformanceWatchdogMixin, {
 *     lowFrameRateMessage : 'Why is this going so <em>slowly</em>?'
 * });
 * ```
 * @param [viewer] The viewer instance.
 * @param [options] An object with properties.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/viewerPerformanceWatchdogMixin.html">Online Documentation</a>
 */
external fun viewerPerformanceWatchdogMixin(
    viewer: Viewer,
    options: ViewerPerformanceWatchdogMixinOptions? = definedExternally,
)

/**
 * @property [lowFrameRateMessage] The
 *   message to display when a low frame rate is detected.  The message is interpeted as HTML, so make sure
 *   it comes from a trusted source so that your application is not vulnerable to cross-site scripting attacks.
 *   Default value - `'This application appears to be performing poorly on your system.  Please try using a different web browser or updating your video drivers.'`
 */
external interface ViewerPerformanceWatchdogMixinOptions {
    var lowFrameRateMessage: String?
}

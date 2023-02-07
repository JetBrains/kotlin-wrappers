// Automatically generated - do not modify!

@file:JsModule("cesium")

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package cesium

import web.dom.Element

/**
 * The Animation widget provides buttons for play, pause, and reverse, along with the
 * current time and date, surrounded by a "shuttle ring" for controlling the speed of animation.
 *
 * The "shuttle ring" concept is borrowed from video editing, where typically a
 * "jog wheel" can be rotated to move past individual animation frames very slowly, and
 * a surrounding shuttle ring can be twisted to control direction and speed of fast playback.
 * Cesium typically treats time as continuous (not broken into pre-defined animation frames),
 * so this widget offers no jog wheel.  Instead, the shuttle ring is capable of both fast and
 * very slow playback.  Click and drag the shuttle ring pointer itself (shown above in green),
 * or click in the rest of the ring area to nudge the pointer to the next preset speed in that direction.
 *
 * The Animation widget also provides a "realtime" button (in the upper-left) that keeps
 * animation time in sync with the end user's system clock, typically displaying
 * "today" or "right now."  This mode is not available in [ClockRange.CLAMPED] or
 * [ClockRange.LOOP_STOP] mode if the current time is outside of [Clock]'s startTime and endTime.
 * ```
 * // In HTML head, include a link to Animation.css stylesheet,
 * // and in the body, include: <div id="animationContainer"></div>
 *
 * const clock = new Clock();
 * const clockViewModel = new ClockViewModel(clock);
 * const viewModel = new AnimationViewModel(clockViewModel);
 * const widget = new Animation('animationContainer', viewModel);
 *
 * function tick() {
 *     clock.tick();
 *     requestAnimationFrame(tick);
 * }
 * requestAnimationFrame(tick);
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Animation.html">Online Documentation</a>
 *
 * @constructor
 * @property [container] The DOM element that will contain the widget.
 * @property [viewModel] The view model used by this widget.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Animation.html">Online Documentation</a>
 */
external class Animation(
    val container: Element,
    val viewModel: AnimationViewModel,
) {
    /**
     * @return true if the object has been destroyed, false otherwise.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Animation.html#isDestroyed">Online Documentation</a>
     */
    fun isDestroyed(): Boolean

    /**
     * Destroys the animation widget.  Should be called if permanently
     * removing the widget from layout.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Animation.html#destroy">Online Documentation</a>
     */
    fun destroy()

    /**
     * Resizes the widget to match the container size.
     * This function should be called whenever the container size is changed.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Animation.html#resize">Online Documentation</a>
     */
    fun resize()

    /**
     * Updates the widget to reflect any modified CSS rules for theming.
     * ```
     * //Switch to the cesium-lighter theme.
     * document.body.className = 'cesium-lighter';
     * animation.applyThemeChanges();
     * ```
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Animation.html#applyThemeChanges">Online Documentation</a>
     */
    fun applyThemeChanges()
}

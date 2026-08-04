// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

import js.array.ReadonlyArray
import kotlinx.js.JsPlainObject
import web.html.HTMLElement

/**
 * Creates a new instance of `ScreenSpaceTiltOrbitCameraController`.
 * ```
 * viewer.scene.screenSpaceCameraController.enableInputs = false;
 * viewer.scene.screenSpaceCameraController.enableCollisionDetection = false;
 *
 * const tiltOrbitController = new ScreenSpaceTiltOrbitCameraController();
 * viewer.addController(tiltOrbitController);
 * ```
 * ```
 * // Tilt around the position under the cursor or tap when dragging starts instead of the position at the center of the screen.
 * viewer.scene.screenSpaceCameraController.enableInputs = false;
 * viewer.scene.screenSpaceCameraController.enableCollisionDetection = false;
 *
 * const tiltOrbitController = new ScreenSpaceTiltOrbitCameraController();
 * tiltOrbitController.useDragPosition = true;
 * viewer.addController(tiltOrbitController);
 * ```
 * ```
 * // Configure the controller to use the left mouse button for tilting and orbiting instead of the default right mouse button.
 * const tiltOrbitController = new ScreenSpaceTiltOrbitCameraController({
 *  dragInputs: [{ button: MouseButton.LEFT }]
 * });
 * viewer.addController(tiltOrbitController);
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ScreenSpaceTiltOrbitCameraController.html">Online Documentation</a>
 *
 * @constructor
 * @param [options] The options for configuring the controller.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ScreenSpaceTiltOrbitCameraController.html">Online Documentation</a>
 */
open external class ScreenSpaceTiltOrbitCameraController(
    options: ControllerOptions? = definedExternally,
) : Controller {
    /**
     * Enabled dragging to tilt the camera.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ScreenSpaceTiltOrbitCameraController.html#tiltEnabled">Online Documentation</a>
     */
    var tiltEnabled: Boolean

    /**
     * Enabled dragging to orbit the camera.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ScreenSpaceTiltOrbitCameraController.html#orbitEnabled">Online Documentation</a>
     */
    var orbitEnabled: Boolean

    /**
     * If false, the camera will orbit and tilt around the position at the center of the screen. If true, the camera will orbit and tilt around the position under the cursor or tap when dragging starts.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ScreenSpaceTiltOrbitCameraController.html#useDragPosition">Online Documentation</a>
     */
    var useDragPosition: Boolean

    /**
     * The drag input bindings that control tilting. Each binding is a combination of the mouse button
     * and an optional keyboard modifier.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ScreenSpaceTiltOrbitCameraController.html#dragInputs">Online Documentation</a>
     */
    var dragInputs: ReadonlyArray<ScreenSpaceInputBindings.InputBinding>

    /**
     * A callback function used to pick the world position around which to tilt or orbit. The function is called with [Scene], the [Cartesian2] screen space position, and a [Cartesian3] instance to store the result. The function should return the [Cartesian3] world position from which to tilt or orbit, or `undefined` if no position could be picked.
     * ```
     * const tiltOrbitCameraController = new ScreenSpaceTiltOrbitCameraController();
     * tiltOrbitCameraController.pickWorldPosition = function (scene, windowPosition, result) {
     *   // Pick the world position from the depth buffer
     *   return scene.pickPosition(windowPosition, result);
     * };
     * viewer.addController(tiltOrbitCameraController);
     * ```
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ScreenSpaceTiltOrbitCameraController.html#pickWorldPosition">Online Documentation</a>
     */
    var pickWorldPosition: Function<*>

    /**
     * The amount at which the camera tilts per dragged pixel. A value of 1.0 means that dragging the mouse across the entire canvas will tilt the camera by 90 degrees.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ScreenSpaceTiltOrbitCameraController.html#tiltMagnitude">Online Documentation</a>
     */
    var tiltMagnitude: Double

    /**
     * Enables or disables damping for tilt and orbit animations. Damping smooths out the camera movement and makes it feel more natural or weighty, but it can also introduce a slight delay in the camera response. If damping is disabled, the camera will respond immediately to user input.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ScreenSpaceTiltOrbitCameraController.html#dampingEnabled">Online Documentation</a>
     */
    var dampingEnabled: Boolean

    /**
     * Specifies the length of time in seconds in which a single tilt animation is targeted to complete.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ScreenSpaceTiltOrbitCameraController.html#tiltAnimationDuration">Online Documentation</a>
     */
    var tiltAnimationDuration: Double

    /**
     * The maximum tilt velocity in radians per second. A value of Number.POSITIVE_INFINITY means that the maximum tilt velocity is unbounded.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ScreenSpaceTiltOrbitCameraController.html#maximumTiltVelocity">Online Documentation</a>
     */
    var maximumTiltVelocity: Double

    /**
     * The amount at which the camera orbits per dragged pixel. A value of 1.0 means that dragging the mouse across the entire canvas will orbit the camera by 180 degrees.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ScreenSpaceTiltOrbitCameraController.html#orbitMagnitude">Online Documentation</a>
     */
    var orbitMagnitude: Double

    /**
     * Specifies the length of time in seconds in which a single orbit animation completes.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ScreenSpaceTiltOrbitCameraController.html#orbitAnimationDuration">Online Documentation</a>
     */
    var orbitAnimationDuration: Double

    /**
     * The maximum orbit velocity in radians per second. A value of Number.POSITIVE_INFINITY means that the maximum orbit velocity is unbounded.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ScreenSpaceTiltOrbitCameraController.html#maximumOrbitVelocity">Online Documentation</a>
     */
    var maximumOrbitVelocity: Double

    /**
     * A parameter in the range `[0, 1)` used to limit the range
     * of inputs to a percentage of the window width/height per animation frame.
     * This helps keep the camera under control in low-frame-rate situations.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ScreenSpaceTiltOrbitCameraController.html#maximumMovementRatio">Online Documentation</a>
     */
    var maximumMovementRatio: Double

    /**
     * Attempts to orbit the camera around the specified origin by the specified amount in radians. Positive values orbit the camera clockwise, negative values orbit the camera counterclockwise. If the drag origin is not on the ellipsoid, no orbit is applied.
     * @param [camera] The camera to orbit.
     * @param [target] The origin position to orbit around in world coordinates.
     * @param [axis] The axis to orbit around, typically the negative of the surface normal at the target position.
     * @param [amount] The amount to orbit the camera in radians. Positive values orbit the camera clockwise, negative values orbit the camera counterclockwise.
     * @param [dt] The time delta in seconds since the last update.
     * @param [ellipsoid] The ellipsoid to pick for the orbit origin. If undefined, the default ellipsoid is used.
     *   Default value - [Ellipsoid.default]
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ScreenSpaceTiltOrbitCameraController.html#orbit">Online Documentation</a>
     */
    fun orbit(
        camera: Camera,
        target: Cartesian3,
        axis: Cartesian3,
        amount: Double,
        dt: Double,
        ellipsoid: Ellipsoid? = definedExternally,
    )

    /**
     * Attempts to tilt the camera by the specified amount in radians. Positive values tilt the camera down, negative values tilt the camera up. If the drag origin is not on the ellipsoid, no tilt is applied.
     * @param [camera] The camera to tilt.
     * @param [target] The origin position to tilt around in world coordinates.
     * @param [axis] The axis to tilt around, typically the negative of the surface normal at the target position.
     * @param [amount] The amount to tilt the camera in radians. Positive values tilt the camera down, negative values tilt the camera up.
     * @param [dt] The time delta in seconds since the last update. Value must be greater than 0.
     * @param [ellipsoid] The ellipsoid to pick for the tilt origin. If undefined, the default ellipsoid is used.
     *   Default value - [Ellipsoid.default]
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ScreenSpaceTiltOrbitCameraController.html#tilt">Online Documentation</a>
     */
    fun tilt(
        camera: Camera,
        target: Cartesian3,
        axis: Cartesian3,
        amount: Double,
        dt: Double,
        ellipsoid: Ellipsoid? = definedExternally,
    )

    /**
     * Determines if the controller is enabled and should be updated by the host scene.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ScreenSpaceTiltOrbitCameraController.html#enabled">Online Documentation</a>
     */
    override var enabled: Boolean

    /**
     * Invoked when the controller is added to the DOM. Implement `connectedCallback` to set up any DOM event listeners.
     * @param [element] The DOM element containing the Cesium scene.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ScreenSpaceTiltOrbitCameraController.html#connectedCallback">Online Documentation</a>
     */
    override fun connectedCallback(element: HTMLElement)

    /**
     * Invoked when the controller is removed from the DOM. Implement `disconnectedCallback` to tear down any DOM event listeners.
     * @param [element] The DOM element containing the Cesium scene.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ScreenSpaceTiltOrbitCameraController.html#disconnectedCallback">Online Documentation</a>
     */
    override fun disconnectedCallback(element: HTMLElement)

    /**
     * Invoked once per frame. Implement `update` to modify the camera or other parts of the scene.
     * @param [time] The current simulation time.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ScreenSpaceTiltOrbitCameraController.html#update">Online Documentation</a>
     */
    override fun update(
        scene: Scene,
        time: JulianDate,
    )

    /**
     * Invoked when the controller is being updated the first time, immediately before `update` is called. Implement `firstUpdate` to perform one-time work after the relevant scene has begun its render loop. Some examples might include initializing simulation time values or adding a primitive to the scene.
     * @param [time] The current simulation time.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ScreenSpaceTiltOrbitCameraController.html#firstUpdate">Online Documentation</a>
     */
    override fun firstUpdate(
        scene: Scene,
        time: JulianDate,
    )

    companion object {
        /**
         * @property [dragInputs] The drag input bindings that control tilting and orbiting.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ScreenSpaceTiltOrbitCameraController.html#.ControllerOptions">Online Documentation</a>
         */
        @JsPlainObject
        interface ControllerOptions {
            val dragInputs: ReadonlyArray<ScreenSpaceInputBindings.InputBinding>?
        }
    }
}

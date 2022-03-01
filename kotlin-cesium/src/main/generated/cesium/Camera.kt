// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package cesium

/**
 * The camera is defined by a position, orientation, and view frustum.
 *
 * The orientation forms an orthonormal basis with a view, up and right = view x up unit vectors.
 *
 * The viewing frustum is defined by 6 planes.
 * Each plane is represented by a [Cartesian4] object, where the x, y, and z components
 * define the unit vector normal to the plane, and the w component is the distance of the
 * plane from the origin/camera position.
 * ```
 * // Create a camera looking down the negative z-axis, positioned at the origin,
 * // with a field of view of 60 degrees, and 1:1 aspect ratio.
 * const camera = new Camera(scene);
 * camera.position = new Cartesian3();
 * camera.direction = Cartesian3.negate(Cartesian3.UNIT_Z, new Cartesian3());
 * camera.up = Cartesian3.clone(Cartesian3.UNIT_Y);
 * camera.frustum.fov = Math.PI_OVER_THREE;
 * camera.frustum.near = 1.0;
 * camera.frustum.far = 2.0;
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Camera.html">Online Documentation</a>
 *
 * @constructor
 * @param [scene] The scene.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Camera.html">Online Documentation</a>
 */
external class Camera(scene: Scene) {
    /**
     * The position of the camera.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Camera.html#position">Online Documentation</a>
     */
    var position: Cartesian3

    /**
     * The view direction of the camera.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Camera.html#direction">Online Documentation</a>
     */
    var direction: Cartesian3

    /**
     * The up direction of the camera.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Camera.html#up">Online Documentation</a>
     */
    var up: Cartesian3

    /**
     * The right direction of the camera.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Camera.html#right">Online Documentation</a>
     */
    var right: Cartesian3

    /**
     * The region of space in view.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Camera.html#frustum">Online Documentation</a>
     */
    var frustum: dynamic

    /**
     * The default amount to move the camera when an argument is not
     * provided to the move methods.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Camera.html#defaultMoveAmount">Online Documentation</a>
     */
    var defaultMoveAmount: Double

    /**
     * The default amount to rotate the camera when an argument is not
     * provided to the look methods.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Camera.html#defaultLookAmount">Online Documentation</a>
     */
    var defaultLookAmount: Double

    /**
     * The default amount to rotate the camera when an argument is not
     * provided to the rotate methods.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Camera.html#defaultRotateAmount">Online Documentation</a>
     */
    var defaultRotateAmount: Double

    /**
     * The default amount to move the camera when an argument is not
     * provided to the zoom methods.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Camera.html#defaultZoomAmount">Online Documentation</a>
     */
    var defaultZoomAmount: Double

    /**
     * If set, the camera will not be able to rotate past this axis in either direction.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Camera.html#constrainedAxis">Online Documentation</a>
     */
    var constrainedAxis: Cartesian3

    /**
     * The factor multiplied by the the map size used to determine where to clamp the camera position
     * when zooming out from the surface. The default is 1.5. Only valid for 2D and the map is rotatable.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Camera.html#maximumZoomFactor">Online Documentation</a>
     */
    var maximumZoomFactor: Double

    /**
     * The amount the camera has to change before the `changed` event is raised. The value is a percentage in the [0, 1] range.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Camera.html#percentageChanged">Online Documentation</a>
     */
    var percentageChanged: Double

    /**
     * Gets the camera's reference frame. The inverse of this transformation is appended to the view matrix.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Camera.html#transform">Online Documentation</a>
     */
    val transform: Matrix4

    /**
     * Gets the inverse camera transform.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Camera.html#inverseTransform">Online Documentation</a>
     */
    val inverseTransform: Matrix4

    /**
     * Gets the view matrix.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Camera.html#viewMatrix">Online Documentation</a>
     */
    val viewMatrix: Matrix4

    /**
     * Gets the inverse view matrix.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Camera.html#inverseViewMatrix">Online Documentation</a>
     */
    val inverseViewMatrix: Matrix4

    /**
     * Gets the [Cartographic] position of the camera, with longitude and latitude
     * expressed in radians and height in meters.  In 2D and Columbus View, it is possible
     * for the returned longitude and latitude to be outside the range of valid longitudes
     * and latitudes when the camera is outside the map.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Camera.html#positionCartographic">Online Documentation</a>
     */
    val positionCartographic: Cartographic

    /**
     * Gets the position of the camera in world coordinates.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Camera.html#positionWC">Online Documentation</a>
     */
    val positionWC: Cartesian3

    /**
     * Gets the view direction of the camera in world coordinates.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Camera.html#directionWC">Online Documentation</a>
     */
    val directionWC: Cartesian3

    /**
     * Gets the up direction of the camera in world coordinates.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Camera.html#upWC">Online Documentation</a>
     */
    val upWC: Cartesian3

    /**
     * Gets the right direction of the camera in world coordinates.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Camera.html#rightWC">Online Documentation</a>
     */
    val rightWC: Cartesian3

    /**
     * Gets the camera heading in radians.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Camera.html#heading">Online Documentation</a>
     */
    val heading: Double

    /**
     * Gets the camera pitch in radians.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Camera.html#pitch">Online Documentation</a>
     */
    val pitch: Double

    /**
     * Gets the camera roll in radians.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Camera.html#roll">Online Documentation</a>
     */
    val roll: Double

    /**
     * Gets the event that will be raised at when the camera starts to move.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Camera.html#moveStart">Online Documentation</a>
     */
    val moveStart: Event

    /**
     * Gets the event that will be raised when the camera has stopped moving.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Camera.html#moveEnd">Online Documentation</a>
     */
    val moveEnd: Event

    /**
     * Gets the event that will be raised when the camera has changed by `percentageChanged`.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Camera.html#changed">Online Documentation</a>
     */
    val changed: Event

    /**
     * Sets the camera position, orientation and transform.
     * ```
     * // 1. Set position with a top-down view
     * viewer.camera.setView({
     *     destination : Cartesian3.fromDegrees(-117.16, 32.71, 15000.0)
     * });
     *
     * // 2 Set view with heading, pitch and roll
     * viewer.camera.setView({
     *     destination : cartesianPosition,
     *     orientation: {
     *         heading : Math.toRadians(90.0), // east, default value is 0.0 (north)
     *         pitch : Math.toRadians(-90),    // default value (looking down)
     *         roll : 0.0                             // default value
     *     }
     * });
     *
     * // 3. Change heading, pitch and roll with the camera position remaining the same.
     * viewer.camera.setView({
     *     orientation: {
     *         heading : Math.toRadians(90.0), // east, default value is 0.0 (north)
     *         pitch : Math.toRadians(-90),    // default value (looking down)
     *         roll : 0.0                             // default value
     *     }
     * });
     *
     * // 4. View rectangle with a top-down view
     * viewer.camera.setView({
     *     destination : Rectangle.fromDegrees(west, south, east, north)
     * });
     *
     * // 5. Set position with an orientation using unit vectors.
     * viewer.camera.setView({
     *     destination : Cartesian3.fromDegrees(-122.19, 46.25, 5000.0),
     *     orientation : {
     *         direction : new Cartesian3(-0.04231243104240401, -0.20123236049443421, -0.97862924300734),
     *         up : new Cartesian3(-0.47934589305293746, -0.8553216253114552, 0.1966022179118339)
     *     }
     * });
     * ```
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Camera.html#setView">Online Documentation</a>
     */
    fun setView(options: SetViewOptions)

    /**
     * @property [destination] The final position of the camera in WGS84 (world) coordinates or a rectangle that would be visible from a top-down view.
     * @property [orientation] An object that contains either direction and up properties or heading, pitch and roll properties. By default, the direction will point
     *   towards the center of the frame in 3D and in the negative z direction in Columbus view. The up direction will point towards local north in 3D and in the positive
     *   y direction in Columbus view. Orientation is not used in 2D when in infinite scrolling mode.
     * @property [endTransform] Transform matrix representing the reference frame of the camera.
     * @property [convert] Whether to convert the destination from world coordinates to scene coordinates (only relevant when not using 3D). Defaults to `true`.
     */
    interface SetViewOptions {
        var destination: dynamic
        var orientation: CameraOrientation?
        var endTransform: Matrix4?
        var convert: Boolean?
    }

    /**
     * Fly the camera to the home view.  Use {@link Camera#.DEFAULT_VIEW_RECTANGLE} to set
     * the default view for the 3D scene.  The home view for 2D and columbus view shows the
     * entire map.
     * @param [duration] The duration of the flight in seconds. If omitted, Cesium attempts to calculate an ideal duration based on the distance to be traveled by the flight. See [Camera.flyTo]
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Camera.html#flyHome">Online Documentation</a>
     */
    fun flyHome(duration: Double? = definedExternally)

    /**
     * Transform a vector or point from world coordinates to the camera's reference frame.
     * @param [cartesian] The vector or point to transform.
     * @param [result] The object onto which to store the result.
     * @return The transformed vector or point.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Camera.html#worldToCameraCoordinates">Online Documentation</a>
     */
    fun worldToCameraCoordinates(
        cartesian: Cartesian4,
        result: Cartesian4? = definedExternally,
    ): Cartesian4

    /**
     * Transform a point from world coordinates to the camera's reference frame.
     * @param [cartesian] The point to transform.
     * @param [result] The object onto which to store the result.
     * @return The transformed point.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Camera.html#worldToCameraCoordinatesPoint">Online Documentation</a>
     */
    fun worldToCameraCoordinatesPoint(
        cartesian: Cartesian3,
        result: Cartesian3? = definedExternally,
    ): Cartesian3

    /**
     * Transform a vector from world coordinates to the camera's reference frame.
     * @param [cartesian] The vector to transform.
     * @param [result] The object onto which to store the result.
     * @return The transformed vector.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Camera.html#worldToCameraCoordinatesVector">Online Documentation</a>
     */
    fun worldToCameraCoordinatesVector(
        cartesian: Cartesian3,
        result: Cartesian3? = definedExternally,
    ): Cartesian3

    /**
     * Transform a vector or point from the camera's reference frame to world coordinates.
     * @param [cartesian] The vector or point to transform.
     * @param [result] The object onto which to store the result.
     * @return The transformed vector or point.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Camera.html#cameraToWorldCoordinates">Online Documentation</a>
     */
    fun cameraToWorldCoordinates(
        cartesian: Cartesian4,
        result: Cartesian4? = definedExternally,
    ): Cartesian4

    /**
     * Transform a point from the camera's reference frame to world coordinates.
     * @param [cartesian] The point to transform.
     * @param [result] The object onto which to store the result.
     * @return The transformed point.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Camera.html#cameraToWorldCoordinatesPoint">Online Documentation</a>
     */
    fun cameraToWorldCoordinatesPoint(
        cartesian: Cartesian3,
        result: Cartesian3? = definedExternally,
    ): Cartesian3

    /**
     * Transform a vector from the camera's reference frame to world coordinates.
     * @param [cartesian] The vector to transform.
     * @param [result] The object onto which to store the result.
     * @return The transformed vector.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Camera.html#cameraToWorldCoordinatesVector">Online Documentation</a>
     */
    fun cameraToWorldCoordinatesVector(
        cartesian: Cartesian3,
        result: Cartesian3? = definedExternally,
    ): Cartesian3

    /**
     * Translates the camera's position by `amount` along `direction`.
     * @param [direction] The direction to move.
     * @param [amount] The amount, in meters, to move. Defaults to `defaultMoveAmount`.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Camera.html#move">Online Documentation</a>
     */
    fun move(
        direction: Cartesian3,
        amount: Double? = definedExternally,
    )

    /**
     * Translates the camera's position by `amount` along the camera's view vector.
     * When in 2D mode, this will zoom in the camera instead of translating the camera's position.
     * @param [amount] The amount, in meters, to move. Defaults to `defaultMoveAmount`.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Camera.html#moveForward">Online Documentation</a>
     */
    fun moveForward(amount: Double? = definedExternally)

    /**
     * Translates the camera's position by `amount` along the opposite direction
     * of the camera's view vector.
     * When in 2D mode, this will zoom out the camera instead of translating the camera's position.
     * @param [amount] The amount, in meters, to move. Defaults to `defaultMoveAmount`.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Camera.html#moveBackward">Online Documentation</a>
     */
    fun moveBackward(amount: Double? = definedExternally)

    /**
     * Translates the camera's position by `amount` along the camera's up vector.
     * @param [amount] The amount, in meters, to move. Defaults to `defaultMoveAmount`.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Camera.html#moveUp">Online Documentation</a>
     */
    fun moveUp(amount: Double? = definedExternally)

    /**
     * Translates the camera's position by `amount` along the opposite direction
     * of the camera's up vector.
     * @param [amount] The amount, in meters, to move. Defaults to `defaultMoveAmount`.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Camera.html#moveDown">Online Documentation</a>
     */
    fun moveDown(amount: Double? = definedExternally)

    /**
     * Translates the camera's position by `amount` along the camera's right vector.
     * @param [amount] The amount, in meters, to move. Defaults to `defaultMoveAmount`.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Camera.html#moveRight">Online Documentation</a>
     */
    fun moveRight(amount: Double? = definedExternally)

    /**
     * Translates the camera's position by `amount` along the opposite direction
     * of the camera's right vector.
     * @param [amount] The amount, in meters, to move. Defaults to `defaultMoveAmount`.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Camera.html#moveLeft">Online Documentation</a>
     */
    fun moveLeft(amount: Double? = definedExternally)

    /**
     * Rotates the camera around its up vector by amount, in radians, in the opposite direction
     * of its right vector if not in 2D mode.
     * @param [amount] The amount, in radians, to rotate by. Defaults to `defaultLookAmount`.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Camera.html#lookLeft">Online Documentation</a>
     */
    fun lookLeft(amount: Double? = definedExternally)

    /**
     * Rotates the camera around its up vector by amount, in radians, in the direction
     * of its right vector if not in 2D mode.
     * @param [amount] The amount, in radians, to rotate by. Defaults to `defaultLookAmount`.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Camera.html#lookRight">Online Documentation</a>
     */
    fun lookRight(amount: Double? = definedExternally)

    /**
     * Rotates the camera around its right vector by amount, in radians, in the direction
     * of its up vector if not in 2D mode.
     * @param [amount] The amount, in radians, to rotate by. Defaults to `defaultLookAmount`.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Camera.html#lookUp">Online Documentation</a>
     */
    fun lookUp(amount: Double? = definedExternally)

    /**
     * Rotates the camera around its right vector by amount, in radians, in the opposite direction
     * of its up vector if not in 2D mode.
     * @param [amount] The amount, in radians, to rotate by. Defaults to `defaultLookAmount`.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Camera.html#lookDown">Online Documentation</a>
     */
    fun lookDown(amount: Double? = definedExternally)

    /**
     * Rotate each of the camera's orientation vectors around `axis` by `angle`
     * @param [axis] The axis to rotate around.
     * @param [angle] The angle, in radians, to rotate by. Defaults to `defaultLookAmount`.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Camera.html#look">Online Documentation</a>
     */
    fun look(
        axis: Cartesian3,
        angle: Double? = definedExternally,
    )

    /**
     * Rotate the camera counter-clockwise around its direction vector by amount, in radians.
     * @param [amount] The amount, in radians, to rotate by. Defaults to `defaultLookAmount`.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Camera.html#twistLeft">Online Documentation</a>
     */
    fun twistLeft(amount: Double? = definedExternally)

    /**
     * Rotate the camera clockwise around its direction vector by amount, in radians.
     * @param [amount] The amount, in radians, to rotate by. Defaults to `defaultLookAmount`.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Camera.html#twistRight">Online Documentation</a>
     */
    fun twistRight(amount: Double? = definedExternally)

    /**
     * Rotates the camera around `axis` by `angle`. The distance
     * of the camera's position to the center of the camera's reference frame remains the same.
     * @param [axis] The axis to rotate around given in world coordinates.
     * @param [angle] The angle, in radians, to rotate by. Defaults to `defaultRotateAmount`.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Camera.html#rotate">Online Documentation</a>
     */
    fun rotate(
        axis: Cartesian3,
        angle: Double? = definedExternally,
    )

    /**
     * Rotates the camera around the center of the camera's reference frame by angle downwards.
     * @param [angle] The angle, in radians, to rotate by. Defaults to `defaultRotateAmount`.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Camera.html#rotateDown">Online Documentation</a>
     */
    fun rotateDown(angle: Double? = definedExternally)

    /**
     * Rotates the camera around the center of the camera's reference frame by angle upwards.
     * @param [angle] The angle, in radians, to rotate by. Defaults to `defaultRotateAmount`.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Camera.html#rotateUp">Online Documentation</a>
     */
    fun rotateUp(angle: Double? = definedExternally)

    /**
     * Rotates the camera around the center of the camera's reference frame by angle to the right.
     * @param [angle] The angle, in radians, to rotate by. Defaults to `defaultRotateAmount`.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Camera.html#rotateRight">Online Documentation</a>
     */
    fun rotateRight(angle: Double? = definedExternally)

    /**
     * Rotates the camera around the center of the camera's reference frame by angle to the left.
     * @param [angle] The angle, in radians, to rotate by. Defaults to `defaultRotateAmount`.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Camera.html#rotateLeft">Online Documentation</a>
     */
    fun rotateLeft(angle: Double? = definedExternally)

    /**
     * Zooms `amount` along the camera's view vector.
     * @param [amount] The amount to move. Defaults to `defaultZoomAmount`.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Camera.html#zoomIn">Online Documentation</a>
     */
    fun zoomIn(amount: Double? = definedExternally)

    /**
     * Zooms `amount` along the opposite direction of
     * the camera's view vector.
     * @param [amount] The amount to move. Defaults to `defaultZoomAmount`.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Camera.html#zoomOut">Online Documentation</a>
     */
    fun zoomOut(amount: Double? = definedExternally)

    /**
     * Gets the magnitude of the camera position. In 3D, this is the vector magnitude. In 2D and
     * Columbus view, this is the distance to the map.
     * @return The magnitude of the position.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Camera.html#getMagnitude">Online Documentation</a>
     */
    fun getMagnitude(): Double

    /**
     * Sets the camera position and orientation using a target and offset. The target must be given in
     * world coordinates. The offset can be either a cartesian or heading/pitch/range in the local east-north-up reference frame centered at the target.
     * If the offset is a cartesian, then it is an offset from the center of the reference frame defined by the transformation matrix. If the offset
     * is heading/pitch/range, then the heading and the pitch angles are defined in the reference frame defined by the transformation matrix.
     * The heading is the angle from y axis and increasing towards the x axis. Pitch is the rotation from the xy-plane. Positive pitch
     * angles are below the plane. Negative pitch angles are above the plane. The range is the distance from the center.
     *
     * In 2D, there must be a top down view. The camera will be placed above the target looking down. The height above the
     * target will be the magnitude of the offset. The heading will be determined from the offset. If the heading cannot be
     * determined from the offset, the heading will be north.
     * ```
     * // 1. Using a cartesian offset
     * const center = Cartesian3.fromDegrees(-98.0, 40.0);
     * viewer.camera.lookAt(center, new Cartesian3(0.0, -4790000.0, 3930000.0));
     *
     * // 2. Using a HeadingPitchRange offset
     * const center = Cartesian3.fromDegrees(-72.0, 40.0);
     * const heading = Math.toRadians(50.0);
     * const pitch = Math.toRadians(-20.0);
     * const range = 5000.0;
     * viewer.camera.lookAt(center, new HeadingPitchRange(heading, pitch, range));
     * ```
     * @param [target] The target position in world coordinates.
     * @param [offset] The offset from the target in the local east-north-up reference frame centered at the target.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Camera.html#lookAt">Online Documentation</a>
     */
    fun lookAt(
        target: Cartesian3,
        offset: Cartesian3,
    )

    fun lookAt(
        target: Cartesian3,
        offset: HeadingPitchRange,
    )

    /**
     * Sets the camera position and orientation using a target and transformation matrix. The offset can be either a cartesian or heading/pitch/range.
     * If the offset is a cartesian, then it is an offset from the center of the reference frame defined by the transformation matrix. If the offset
     * is heading/pitch/range, then the heading and the pitch angles are defined in the reference frame defined by the transformation matrix.
     * The heading is the angle from y axis and increasing towards the x axis. Pitch is the rotation from the xy-plane. Positive pitch
     * angles are below the plane. Negative pitch angles are above the plane. The range is the distance from the center.
     *
     * In 2D, there must be a top down view. The camera will be placed above the center of the reference frame. The height above the
     * target will be the magnitude of the offset. The heading will be determined from the offset. If the heading cannot be
     * determined from the offset, the heading will be north.
     * ```
     * // 1. Using a cartesian offset
     * const transform = Transforms.eastNorthUpToFixedFrame(Cartesian3.fromDegrees(-98.0, 40.0));
     * viewer.camera.lookAtTransform(transform, new Cartesian3(0.0, -4790000.0, 3930000.0));
     *
     * // 2. Using a HeadingPitchRange offset
     * const transform = Transforms.eastNorthUpToFixedFrame(Cartesian3.fromDegrees(-72.0, 40.0));
     * const heading = Math.toRadians(50.0);
     * const pitch = Math.toRadians(-20.0);
     * const range = 5000.0;
     * viewer.camera.lookAtTransform(transform, new HeadingPitchRange(heading, pitch, range));
     * ```
     * @param [transform] The transformation matrix defining the reference frame.
     * @param [offset] The offset from the target in a reference frame centered at the target.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Camera.html#lookAtTransform">Online Documentation</a>
     */
    fun lookAtTransform(transform: Matrix4)

    fun lookAtTransform(
        transform: Matrix4,
        offset: Cartesian3,
    )

    fun lookAtTransform(
        transform: Matrix4,
        offset: HeadingPitchRange,
    )

    /**
     * Get the camera position needed to view a rectangle on an ellipsoid or map
     * @param [rectangle] The rectangle to view.
     * @param [result] The camera position needed to view the rectangle
     * @return The camera position needed to view the rectangle
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Camera.html#getRectangleCameraCoordinates">Online Documentation</a>
     */
    fun getRectangleCameraCoordinates(
        rectangle: Rectangle,
        result: Cartesian3? = definedExternally,
    ): Cartesian3

    /**
     * Pick an ellipsoid or map.
     * ```
     * const canvas = viewer.scene.canvas;
     * const center = new Cartesian2(canvas.clientWidth / 2.0, canvas.clientHeight / 2.0);
     * const ellipsoid = viewer.scene.globe.ellipsoid;
     * const result = viewer.camera.pickEllipsoid(center, ellipsoid);
     * ```
     * @param [windowPosition] The x and y coordinates of a pixel.
     * @param [ellipsoid] The ellipsoid to pick.
     *   Default value - [Ellipsoid.WGS84]
     * @param [result] The object onto which to store the result.
     * @return If the ellipsoid or map was picked,
     *   returns the point on the surface of the ellipsoid or map in world
     *   coordinates. If the ellipsoid or map was not picked, returns undefined.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Camera.html#pickEllipsoid">Online Documentation</a>
     */
    fun pickEllipsoid(
        windowPosition: Cartesian2,
        ellipsoid: Ellipsoid? = definedExternally,
        result: Cartesian3? = definedExternally,
    ): Cartesian3?

    /**
     * Create a ray from the camera position through the pixel at `windowPosition`
     * in world coordinates.
     * @param [windowPosition] The x and y coordinates of a pixel.
     * @param [result] The object onto which to store the result.
     * @return Returns the [Cartesian3] position and direction of the ray, or undefined if the pick ray cannot be determined.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Camera.html#getPickRay">Online Documentation</a>
     */
    fun getPickRay(
        windowPosition: Cartesian2,
        result: Ray? = definedExternally,
    ): Ray?

    /**
     * Return the distance from the camera to the front of the bounding sphere.
     * @param [boundingSphere] The bounding sphere in world coordinates.
     * @return The distance to the bounding sphere.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Camera.html#distanceToBoundingSphere">Online Documentation</a>
     */
    fun distanceToBoundingSphere(boundingSphere: BoundingSphere): Double

    /**
     * Return the pixel size in meters.
     * @param [boundingSphere] The bounding sphere in world coordinates.
     * @param [drawingBufferWidth] The drawing buffer width.
     * @param [drawingBufferHeight] The drawing buffer height.
     * @return The pixel size in meters.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Camera.html#getPixelSize">Online Documentation</a>
     */
    fun getPixelSize(
        boundingSphere: BoundingSphere,
        drawingBufferWidth: Double,
        drawingBufferHeight: Double,
    ): Double

    /**
     * Cancels the current camera flight and leaves the camera at its current location.
     * If no flight is in progress, this this function does nothing.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Camera.html#cancelFlight">Online Documentation</a>
     */
    fun cancelFlight()

    /**
     * Completes the current camera flight and moves the camera immediately to its final destination.
     * If no flight is in progress, this this function does nothing.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Camera.html#completeFlight">Online Documentation</a>
     */
    fun completeFlight()

    /**
     * Flies the camera from its current position to a new position.
     * ```
     * // 1. Fly to a position with a top-down view
     * viewer.camera.flyTo({
     *     destination : Cartesian3.fromDegrees(-117.16, 32.71, 15000.0)
     * });
     *
     * // 2. Fly to a Rectangle with a top-down view
     * viewer.camera.flyTo({
     *     destination : Rectangle.fromDegrees(west, south, east, north)
     * });
     *
     * // 3. Fly to a position with an orientation using unit vectors.
     * viewer.camera.flyTo({
     *     destination : Cartesian3.fromDegrees(-122.19, 46.25, 5000.0),
     *     orientation : {
     *         direction : new Cartesian3(-0.04231243104240401, -0.20123236049443421, -0.97862924300734),
     *         up : new Cartesian3(-0.47934589305293746, -0.8553216253114552, 0.1966022179118339)
     *     }
     * });
     *
     * // 4. Fly to a position with an orientation using heading, pitch and roll.
     * viewer.camera.flyTo({
     *     destination : Cartesian3.fromDegrees(-122.19, 46.25, 5000.0),
     *     orientation : {
     *         heading : Math.toRadians(175.0),
     *         pitch : Math.toRadians(-35.0),
     *         roll : 0.0
     *     }
     * });
     * ```
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Camera.html#flyTo">Online Documentation</a>
     */
    fun flyTo(options: FlyToOptions)

    /**
     * @property [destination] The final position of the camera in WGS84 (world) coordinates or a rectangle that would be visible from a top-down view.
     * @property [orientation] An object that contains either direction and up properties or heading, pitch and roll properties. By default, the direction will point
     *   towards the center of the frame in 3D and in the negative z direction in Columbus view. The up direction will point towards local north in 3D and in the positive
     *   y direction in Columbus view.  Orientation is not used in 2D when in infinite scrolling mode.
     * @property [duration] The duration of the flight in seconds. If omitted, Cesium attempts to calculate an ideal duration based on the distance to be traveled by the flight.
     * @property [complete] The function to execute when the flight is complete.
     * @property [cancel] The function to execute if the flight is cancelled.
     * @property [endTransform] Transform matrix representing the reference frame the camera will be in when the flight is completed.
     * @property [maximumHeight] The maximum height at the peak of the flight.
     * @property [pitchAdjustHeight] If camera flyes higher than that value, adjust pitch duiring the flight to look down, and keep Earth in viewport.
     * @property [flyOverLongitude] There are always two ways between 2 points on globe. This option force camera to choose fight direction to fly over that longitude.
     * @property [flyOverLongitudeWeight] Fly over the lon specifyed via flyOverLongitude only if that way is not longer than short way times flyOverLongitudeWeight.
     * @property [convert] Whether to convert the destination from world coordinates to scene coordinates (only relevant when not using 3D). Defaults to `true`.
     * @property [easingFunction] Controls how the time is interpolated over the duration of the flight.
     */
    interface FlyToOptions {
        var destination: dynamic
        var orientation: CameraOrientation?
        var duration: Double?
        var complete: FlightCompleteCallback?
        var cancel: FlightCancelledCallback?
        var endTransform: Matrix4?
        var maximumHeight: Double?
        var pitchAdjustHeight: Double?
        var flyOverLongitude: Double?
        var flyOverLongitudeWeight: Double?
        var convert: Boolean?
        var easingFunction: EasingCallback?
    }

    /**
     * Sets the camera so that the current view contains the provided bounding sphere.
     *
     * The offset is heading/pitch/range in the local east-north-up reference frame centered at the center of the bounding sphere.
     * The heading and the pitch angles are defined in the local east-north-up reference frame.
     * The heading is the angle from y axis and increasing towards the x axis. Pitch is the rotation from the xy-plane. Positive pitch
     * angles are below the plane. Negative pitch angles are above the plane. The range is the distance from the center. If the range is
     * zero, a range will be computed such that the whole bounding sphere is visible.
     *
     * In 2D, there must be a top down view. The camera will be placed above the target looking down. The height above the
     * target will be the range. The heading will be determined from the offset. If the heading cannot be
     * determined from the offset, the heading will be north.
     * @param [boundingSphere] The bounding sphere to view, in world coordinates.
     * @param [offset] The offset from the target in the local east-north-up reference frame centered at the target.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Camera.html#viewBoundingSphere">Online Documentation</a>
     */
    fun viewBoundingSphere(
        boundingSphere: BoundingSphere,
        offset: HeadingPitchRange? = definedExternally,
    )

    /**
     * Flies the camera to a location where the current view contains the provided bounding sphere.
     *
     * The offset is heading/pitch/range in the local east-north-up reference frame centered at the center of the bounding sphere.
     * The heading and the pitch angles are defined in the local east-north-up reference frame.
     * The heading is the angle from y axis and increasing towards the x axis. Pitch is the rotation from the xy-plane. Positive pitch
     * angles are below the plane. Negative pitch angles are above the plane. The range is the distance from the center. If the range is
     * zero, a range will be computed such that the whole bounding sphere is visible.
     *
     * In 2D and Columbus View, there must be a top down view. The camera will be placed above the target looking down. The height above the
     * target will be the range. The heading will be aligned to local north.
     * @param [boundingSphere] The bounding sphere to view, in world coordinates.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Camera.html#flyToBoundingSphere">Online Documentation</a>
     */
    fun flyToBoundingSphere(
        boundingSphere: BoundingSphere,
        options: FlyToBoundingSphereOptions? = definedExternally,
    )

    /**
     * @property [duration] The duration of the flight in seconds. If omitted, Cesium attempts to calculate an ideal duration based on the distance to be traveled by the flight.
     * @property [offset] The offset from the target in the local east-north-up reference frame centered at the target.
     * @property [complete] The function to execute when the flight is complete.
     * @property [cancel] The function to execute if the flight is cancelled.
     * @property [endTransform] Transform matrix representing the reference frame the camera will be in when the flight is completed.
     * @property [maximumHeight] The maximum height at the peak of the flight.
     * @property [pitchAdjustHeight] If camera flyes higher than that value, adjust pitch duiring the flight to look down, and keep Earth in viewport.
     * @property [flyOverLongitude] There are always two ways between 2 points on globe. This option force camera to choose fight direction to fly over that longitude.
     * @property [flyOverLongitudeWeight] Fly over the lon specifyed via flyOverLongitude only if that way is not longer than short way times flyOverLongitudeWeight.
     * @property [easingFunction] Controls how the time is interpolated over the duration of the flight.
     */
    interface FlyToBoundingSphereOptions {
        var duration: Double?
        var offset: HeadingPitchRange?
        var complete: FlightCompleteCallback?
        var cancel: FlightCancelledCallback?
        var endTransform: Matrix4?
        var maximumHeight: Double?
        var pitchAdjustHeight: Double?
        var flyOverLongitude: Double?
        var flyOverLongitudeWeight: Double?
        var easingFunction: EasingCallback?
    }

    /**
     * Computes the approximate visible rectangle on the ellipsoid.
     * @param [ellipsoid] The ellipsoid that you want to know the visible region.
     *   Default value - [Ellipsoid.WGS84]
     * @param [result] The rectangle in which to store the result
     * @return The visible rectangle or undefined if the ellipsoid isn't visible at all.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Camera.html#computeViewRectangle">Online Documentation</a>
     */
    fun computeViewRectangle(
        ellipsoid: Ellipsoid? = definedExternally,
        result: Rectangle? = definedExternally,
    ): Rectangle?

    /**
     * Switches the frustum/projection to perspective.
     *
     * This function is a no-op in 2D which must always be orthographic.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Camera.html#switchToPerspectiveFrustum">Online Documentation</a>
     */
    fun switchToPerspectiveFrustum()

    /**
     * Switches the frustum/projection to orthographic.
     *
     * This function is a no-op in 2D which will always be orthographic.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Camera.html#switchToOrthographicFrustum">Online Documentation</a>
     */
    fun switchToOrthographicFrustum()

    companion object {
        /**
         * The default rectangle the camera will view on creation.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Camera.html#.DEFAULT_VIEW_RECTANGLE">Online Documentation</a>
         */
        var DEFAULT_VIEW_RECTANGLE: Rectangle

        /**
         * A scalar to multiply to the camera position and add it back after setting the camera to view the rectangle.
         * A value of zero means the camera will view the entire [Camera.DEFAULT_VIEW_RECTANGLE], a value greater than zero
         * will move it further away from the extent, and a value less than zero will move it close to the extent.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Camera.html#.DEFAULT_VIEW_FACTOR">Online Documentation</a>
         */
        var DEFAULT_VIEW_FACTOR: Double

        /**
         * The default heading/pitch/range that is used when the camera flies to a location that contains a bounding sphere.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Camera.html#.DEFAULT_OFFSET">Online Documentation</a>
         */
        var DEFAULT_OFFSET: HeadingPitchRange
    }
}

/**
 * A function that will execute when a flight completes.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Camera.html#.FlightCompleteCallback">Online Documentation</a>
 */
typealias FlightCompleteCallback = () -> Unit

/**
 * A function that will execute when a flight is cancelled.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Camera.html#.FlightCancelledCallback">Online Documentation</a>
 */
typealias FlightCancelledCallback = () -> Unit

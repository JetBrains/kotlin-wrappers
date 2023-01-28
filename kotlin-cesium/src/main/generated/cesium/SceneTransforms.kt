// Automatically generated - do not modify!

@file:JsModule("cesium")

package cesium

/**
 * Functions that do scene-dependent transforms between rendering-related coordinate systems.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/SceneTransforms.html">Online Documentation</a>
 */
external object SceneTransforms {
    /**
     * Transforms a position in WGS84 coordinates to window coordinates.  This is commonly used to place an
     * HTML element at the same screen position as an object in the scene.
     * ```
     * // Output the window position of longitude/latitude (0, 0) every time the mouse moves.
     * const scene = widget.scene;
     * const ellipsoid = scene.globe.ellipsoid;
     * const position = Cartesian3.fromDegrees(0.0, 0.0);
     * const handler = new ScreenSpaceEventHandler(scene.canvas);
     * handler.setInputAction(function(movement) {
     *     console.log(SceneTransforms.wgs84ToWindowCoordinates(scene, position));
     * }, ScreenSpaceEventType.MOUSE_MOVE);
     * ```
     * @param [scene] The scene.
     * @param [position] The position in WGS84 (world) coordinates.
     * @param [result] An optional object to return the input position transformed to window coordinates.
     * @return The modified result parameter or a new Cartesian2 instance if one was not provided.  This may be `undefined` if the input position is near the center of the ellipsoid.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/SceneTransforms.html#.wgs84ToWindowCoordinates">Online Documentation</a>
     */
    fun wgs84ToWindowCoordinates(
        scene: Scene,
        position: Cartesian3,
        result: Cartesian2? = definedExternally,
    ): Cartesian2?

    /**
     * Transforms a position in WGS84 coordinates to drawing buffer coordinates.  This may produce different
     * results from SceneTransforms.wgs84ToWindowCoordinates when the browser zoom is not 100%, or on high-DPI displays.
     * ```
     * // Output the window position of longitude/latitude (0, 0) every time the mouse moves.
     * const scene = widget.scene;
     * const ellipsoid = scene.globe.ellipsoid;
     * const position = Cartesian3.fromDegrees(0.0, 0.0);
     * const handler = new ScreenSpaceEventHandler(scene.canvas);
     * handler.setInputAction(function(movement) {
     *     console.log(SceneTransforms.wgs84ToWindowCoordinates(scene, position));
     * }, ScreenSpaceEventType.MOUSE_MOVE);
     * ```
     * @param [scene] The scene.
     * @param [position] The position in WGS84 (world) coordinates.
     * @param [result] An optional object to return the input position transformed to window coordinates.
     * @return The modified result parameter or a new Cartesian2 instance if one was not provided.  This may be `undefined` if the input position is near the center of the ellipsoid.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/SceneTransforms.html#.wgs84ToDrawingBufferCoordinates">Online Documentation</a>
     */
    fun wgs84ToDrawingBufferCoordinates(
        scene: Scene,
        position: Cartesian3,
        result: Cartesian2? = definedExternally,
    ): Cartesian2?
}

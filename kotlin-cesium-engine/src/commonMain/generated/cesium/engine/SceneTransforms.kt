// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

/**
 * Functions that do scene-dependent transforms between rendering-related coordinate systems.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/SceneTransforms.html">Online Documentation</a>
 */
external object SceneTransforms {
    /**
     * Transforms a position in world (WGS84 or alternative ellipsoid) coordinates to window coordinates.  This is commonly used to place an
     * HTML element at the same screen position as an object in the scene.
     * ```
     * // Output the window position of longitude/latitude (0, 0) every time the mouse moves.
     * const position = Cartesian3.fromDegrees(0.0, 0.0);
     * const handler = new ScreenSpaceEventHandler(scene.canvas);
     * handler.setInputAction(function(movement) {
     *     console.log(SceneTransforms.worldToWindowCoordinates(scene, position));
     * }, ScreenSpaceEventType.MOUSE_MOVE);
     * ```
     * @param [scene] The scene.
     * @param [position] The position in world (WGS84 or alternative ellipsoid) coordinates.
     * @param [result] An optional object to return the input position transformed to window coordinates.
     * @return The modified result parameter or a new Cartesian2 instance if one was not provided.  This may be `undefined` if the input position is near the center of the ellipsoid.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/SceneTransforms.html#.worldToWindowCoordinates">Online Documentation</a>
     */
    fun worldToWindowCoordinates(
        scene: Scene,
        position: Cartesian3,
        result: Cartesian2? = definedExternally,
    ): Cartesian2?

    /**
     * Transforms a position in world coordinates to drawing buffer coordinates.  This may produce different
     * results from SceneTransforms.worldToWindowCoordinates when the browser zoom is not 100%, or on high-DPI displays.
     * ```
     * // Output the window position of longitude/latitude (0, 0) every time the mouse moves.
     * const position = Cartesian3.fromDegrees(0.0, 0.0);
     * const handler = new ScreenSpaceEventHandler(scene.canvas);
     * handler.setInputAction(function(movement) {
     *     console.log(SceneTransforms.worldToDrawingBufferCoordinates(scene, position));
     * }, ScreenSpaceEventType.MOUSE_MOVE);
     * ```
     * @param [scene] The scene.
     * @param [position] The position in world (WGS84 or alternative ellipsoid) coordinates.
     * @param [result] An optional object to return the input position transformed to window coordinates.
     * @return The modified result parameter or a new Cartesian2 instance if one was not provided.  This may be `undefined` if the input position is near the center of the ellipsoid.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/SceneTransforms.html#.worldToDrawingBufferCoordinates">Online Documentation</a>
     */
    fun worldToDrawingBufferCoordinates(
        scene: Scene,
        position: Cartesian3,
        result: Cartesian2? = definedExternally,
    ): Cartesian2?
}

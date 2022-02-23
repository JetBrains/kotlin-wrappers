// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package cesium

/**
 * The view model for [CesiumInspector].
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CesiumInspectorViewModel.html">Online Documentation</a>
 *
 * @constructor
 * @property [scene] The scene instance to use.
 * @property [performanceContainer] The instance to use for performance container.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CesiumInspectorViewModel.html">Online Documentation</a>
 */
external class CesiumInspectorViewModel(
    var scene: Scene,
    var performanceContainer: org.w3c.dom.Element,
) {
    /**
     * Gets or sets the show frustums state.  This property is observable.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CesiumInspectorViewModel.html#frustums">Online Documentation</a>
     */
    var frustums: Boolean

    /**
     * Gets or sets the show frustum planes state.  This property is observable.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CesiumInspectorViewModel.html#frustumPlanes">Online Documentation</a>
     */
    var frustumPlanes: Boolean

    /**
     * Gets or sets the show performance display state.  This property is observable.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CesiumInspectorViewModel.html#performance">Online Documentation</a>
     */
    var performance: Boolean

    /**
     * Gets or sets the shader cache text.  This property is observable.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CesiumInspectorViewModel.html#shaderCacheText">Online Documentation</a>
     */
    var shaderCacheText: String

    /**
     * Gets or sets the show primitive bounding sphere state.  This property is observable.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CesiumInspectorViewModel.html#primitiveBoundingSphere">Online Documentation</a>
     */
    var primitiveBoundingSphere: Boolean

    /**
     * Gets or sets the show primitive reference frame state.  This property is observable.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CesiumInspectorViewModel.html#primitiveReferenceFrame">Online Documentation</a>
     */
    var primitiveReferenceFrame: Boolean

    /**
     * Gets or sets the filter primitive state.  This property is observable.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CesiumInspectorViewModel.html#filterPrimitive">Online Documentation</a>
     */
    var filterPrimitive: Boolean

    /**
     * Gets or sets the show tile bounding sphere state.  This property is observable.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CesiumInspectorViewModel.html#tileBoundingSphere">Online Documentation</a>
     */
    var tileBoundingSphere: Boolean

    /**
     * Gets or sets the filter tile state.  This property is observable.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CesiumInspectorViewModel.html#filterTile">Online Documentation</a>
     */
    var filterTile: Boolean

    /**
     * Gets or sets the show wireframe state.  This property is observable.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CesiumInspectorViewModel.html#wireframe">Online Documentation</a>
     */
    var wireframe: Boolean

    /**
     * Gets or sets the index of the depth frustum to display.  This property is observable.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CesiumInspectorViewModel.html#depthFrustum">Online Documentation</a>
     */
    var depthFrustum: Int

    /**
     * Gets or sets the suspend updates state.  This property is observable.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CesiumInspectorViewModel.html#suspendUpdates">Online Documentation</a>
     */
    var suspendUpdates: Boolean

    /**
     * Gets or sets the show tile coordinates state.  This property is observable.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CesiumInspectorViewModel.html#tileCoordinates">Online Documentation</a>
     */
    var tileCoordinates: Boolean

    /**
     * Gets or sets the frustum statistic text.  This property is observable.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CesiumInspectorViewModel.html#frustumStatisticText">Online Documentation</a>
     */
    var frustumStatisticText: String

    /**
     * Gets or sets the selected tile information text.  This property is observable.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CesiumInspectorViewModel.html#tileText">Online Documentation</a>
     */
    var tileText: String

    /**
     * Gets if a primitive has been selected.  This property is observable.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CesiumInspectorViewModel.html#hasPickedPrimitive">Online Documentation</a>
     */
    var hasPickedPrimitive: Boolean

    /**
     * Gets if a tile has been selected.  This property is observable
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CesiumInspectorViewModel.html#hasPickedTile">Online Documentation</a>
     */
    var hasPickedTile: Boolean

    /**
     * Gets if the picking primitive command is active.  This property is observable.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CesiumInspectorViewModel.html#pickPrimitiveActive">Online Documentation</a>
     */
    var pickPrimitiveActive: Boolean

    /**
     * Gets if the picking tile command is active.  This property is observable.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CesiumInspectorViewModel.html#pickTileActive">Online Documentation</a>
     */
    var pickTileActive: Boolean

    /**
     * Gets or sets if the cesium inspector drop down is visible.  This property is observable.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CesiumInspectorViewModel.html#dropDownVisible">Online Documentation</a>
     */
    var dropDownVisible: Boolean

    /**
     * Gets or sets if the general section is visible.  This property is observable.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CesiumInspectorViewModel.html#generalVisible">Online Documentation</a>
     */
    var generalVisible: Boolean

    /**
     * Gets or sets if the primitive section is visible.  This property is observable.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CesiumInspectorViewModel.html#primitivesVisible">Online Documentation</a>
     */
    var primitivesVisible: Boolean

    /**
     * Gets or sets if the terrain section is visible.  This property is observable.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CesiumInspectorViewModel.html#terrainVisible">Online Documentation</a>
     */
    var terrainVisible: Boolean

    /**
     * Gets or sets the index of the depth frustum text.  This property is observable.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CesiumInspectorViewModel.html#depthFrustumText">Online Documentation</a>
     */
    var depthFrustumText: String

    /**
     * Gets the command to toggle the visibility of the drop down.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CesiumInspectorViewModel.html#toggleDropDown">Online Documentation</a>
     */
    var toggleDropDown: Command

    /**
     * Gets the command to toggle the visibility of a BoundingSphere for a primitive
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CesiumInspectorViewModel.html#showPrimitiveBoundingSphere">Online Documentation</a>
     */
    var showPrimitiveBoundingSphere: Command

    /**
     * Gets the command to toggle the visibility of a [DebugModelMatrixPrimitive] for the model matrix of a primitive
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CesiumInspectorViewModel.html#showPrimitiveReferenceFrame">Online Documentation</a>
     */
    var showPrimitiveReferenceFrame: Command

    /**
     * Gets the command to toggle a filter that renders only a selected primitive
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CesiumInspectorViewModel.html#doFilterPrimitive">Online Documentation</a>
     */
    var doFilterPrimitive: Command

    /**
     * Gets the command to increment the depth frustum index to be shown
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CesiumInspectorViewModel.html#incrementDepthFrustum">Online Documentation</a>
     */
    var incrementDepthFrustum: Command

    /**
     * Gets the command to decrement the depth frustum index to be shown
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CesiumInspectorViewModel.html#decrementDepthFrustum">Online Documentation</a>
     */
    var decrementDepthFrustum: Command

    /**
     * Gets the command to toggle the visibility of tile coordinates
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CesiumInspectorViewModel.html#showTileCoordinates">Online Documentation</a>
     */
    var showTileCoordinates: Command

    /**
     * Gets the command to toggle the visibility of a BoundingSphere for a selected tile
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CesiumInspectorViewModel.html#showTileBoundingSphere">Online Documentation</a>
     */
    var showTileBoundingSphere: Command

    /**
     * Gets the command to toggle a filter that renders only a selected tile
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CesiumInspectorViewModel.html#doFilterTile">Online Documentation</a>
     */
    var doFilterTile: Command

    /**
     * Gets the command to expand and collapse the general section
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CesiumInspectorViewModel.html#toggleGeneral">Online Documentation</a>
     */
    var toggleGeneral: Command

    /**
     * Gets the command to expand and collapse the primitives section
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CesiumInspectorViewModel.html#togglePrimitives">Online Documentation</a>
     */
    var togglePrimitives: Command

    /**
     * Gets the command to expand and collapse the terrain section
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CesiumInspectorViewModel.html#toggleTerrain">Online Documentation</a>
     */
    var toggleTerrain: Command

    /**
     * Gets the command to pick a primitive
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CesiumInspectorViewModel.html#pickPrimitive">Online Documentation</a>
     */
    var pickPrimitive: Command

    /**
     * Gets the command to pick a tile
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CesiumInspectorViewModel.html#pickTile">Online Documentation</a>
     */
    var pickTile: Command

    /**
     * Gets the command to pick a tile
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CesiumInspectorViewModel.html#selectParent">Online Documentation</a>
     */
    var selectParent: Command

    /**
     * Gets the command to pick a tile
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CesiumInspectorViewModel.html#selectNW">Online Documentation</a>
     */
    var selectNW: Command

    /**
     * Gets the command to pick a tile
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CesiumInspectorViewModel.html#selectNE">Online Documentation</a>
     */
    var selectNE: Command

    /**
     * Gets the command to pick a tile
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CesiumInspectorViewModel.html#selectSW">Online Documentation</a>
     */
    var selectSW: Command

    /**
     * Gets the command to pick a tile
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CesiumInspectorViewModel.html#selectSE">Online Documentation</a>
     */
    var selectSE: Command

    /**
     * Gets or sets the current selected primitive
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CesiumInspectorViewModel.html#primitive">Online Documentation</a>
     */
    var primitive: Command

    /**
     * Gets or sets the current selected tile
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CesiumInspectorViewModel.html#tile">Online Documentation</a>
     */
    var tile: Command

    /**
     * @return true if the object has been destroyed, false otherwise.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CesiumInspectorViewModel.html#isDestroyed">Online Documentation</a>
     */
    fun isDestroyed(): Boolean

    /**
     * Destroys the widget.  Should be called if permanently
     * removing the widget from layout.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CesiumInspectorViewModel.html#destroy">Online Documentation</a>
     */
    fun destroy()
}

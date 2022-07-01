// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package cesium

/**
 * The view model for [Cesium3DTilesInspector].
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilesInspectorViewModel.html">Online Documentation</a>
 *
 * @constructor
 * @property [scene] The scene instance to use.
 * @property [performanceContainer] The container for the performance display
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilesInspectorViewModel.html">Online Documentation</a>
 */
external class Cesium3DTilesInspectorViewModel(
    val scene: Scene,
    val performanceContainer: org.w3c.dom.HTMLElement,
) {
    /**
     * Gets or sets the flag to enable performance display.  This property is observable.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilesInspectorViewModel.html#performance">Online Documentation</a>
     */
    var performance: Boolean

    /**
     * Gets or sets the flag to show statistics.  This property is observable.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilesInspectorViewModel.html#showStatistics">Online Documentation</a>
     */
    var showStatistics: Boolean

    /**
     * Gets or sets the flag to show pick statistics.  This property is observable.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilesInspectorViewModel.html#showPickStatistics">Online Documentation</a>
     */
    var showPickStatistics: Boolean

    /**
     * Gets or sets the flag to show resource cache statistics. This property is
     * observable.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilesInspectorViewModel.html#showResourceCacheStatistics">Online Documentation</a>
     */
    var showResourceCacheStatistics: Boolean

    /**
     * Gets or sets the flag to show the inspector.  This property is observable.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilesInspectorViewModel.html#inspectorVisible">Online Documentation</a>
     */
    var inspectorVisible: Boolean

    /**
     * Gets or sets the flag to show the tileset section.  This property is observable.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilesInspectorViewModel.html#tilesetVisible">Online Documentation</a>
     */
    var tilesetVisible: Boolean

    /**
     * Gets or sets the flag to show the display section.  This property is observable.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilesInspectorViewModel.html#displayVisible">Online Documentation</a>
     */
    var displayVisible: Boolean

    /**
     * Gets or sets the flag to show the update section.  This property is observable.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilesInspectorViewModel.html#updateVisible">Online Documentation</a>
     */
    var updateVisible: Boolean

    /**
     * Gets or sets the flag to show the logging section.  This property is observable.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilesInspectorViewModel.html#loggingVisible">Online Documentation</a>
     */
    var loggingVisible: Boolean

    /**
     * Gets or sets the flag to show the style section.  This property is observable.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilesInspectorViewModel.html#styleVisible">Online Documentation</a>
     */
    var styleVisible: Boolean

    /**
     * Gets or sets the flag to show the tile info section.  This property is observable.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilesInspectorViewModel.html#tileDebugLabelsVisible">Online Documentation</a>
     */
    var tileDebugLabelsVisible: Boolean

    /**
     * Gets or sets the flag to show the optimization info section. This property is observable.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilesInspectorViewModel.html#optimizationVisible">Online Documentation</a>
     */
    var optimizationVisible: Boolean

    /**
     * Gets or sets the JSON for the tileset style.  This property is observable.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilesInspectorViewModel.html#styleString">Online Documentation</a>
     */
    var styleString: String

    /**
     * Gets the names of the properties in the tileset.  This property is observable.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilesInspectorViewModel.html#properties">Online Documentation</a>
     */
    val properties: Array<out String>

    /**
     * Gets or sets the flag to enable dynamic screen space error.  This property is observable.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilesInspectorViewModel.html#dynamicScreenSpaceError">Online Documentation</a>
     */
    var dynamicScreenSpaceError: Boolean

    /**
     * Gets or sets the color blend mode.  This property is observable.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilesInspectorViewModel.html#colorBlendMode">Online Documentation</a>
     */
    var colorBlendMode: Cesium3DTileColorBlendMode

    /**
     * Gets or sets the flag to enable picking.  This property is observable.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilesInspectorViewModel.html#picking">Online Documentation</a>
     */
    var picking: Boolean

    /**
     * Gets or sets the flag to colorize tiles.  This property is observable.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilesInspectorViewModel.html#colorize">Online Documentation</a>
     */
    var colorize: Boolean

    /**
     * Gets or sets the flag to draw with wireframe.  This property is observable.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilesInspectorViewModel.html#wireframe">Online Documentation</a>
     */
    var wireframe: Boolean

    /**
     * Gets or sets the flag to show bounding volumes.  This property is observable.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilesInspectorViewModel.html#showBoundingVolumes">Online Documentation</a>
     */
    var showBoundingVolumes: Boolean

    /**
     * Gets or sets the flag to show content volumes.  This property is observable.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilesInspectorViewModel.html#showContentBoundingVolumes">Online Documentation</a>
     */
    var showContentBoundingVolumes: Boolean

    /**
     * Gets or sets the flag to show request volumes.  This property is observable.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilesInspectorViewModel.html#showRequestVolumes">Online Documentation</a>
     */
    var showRequestVolumes: Boolean

    /**
     * Gets or sets the flag to suspend updates.  This property is observable.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilesInspectorViewModel.html#freezeFrame">Online Documentation</a>
     */
    var freezeFrame: Boolean

    /**
     * Gets or sets the flag to show debug labels only for the currently picked tile.  This property is observable.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilesInspectorViewModel.html#showOnlyPickedTileDebugLabel">Online Documentation</a>
     */
    var showOnlyPickedTileDebugLabel: Boolean

    /**
     * Gets or sets the flag to show tile geometric error.  This property is observable.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilesInspectorViewModel.html#showGeometricError">Online Documentation</a>
     */
    var showGeometricError: Boolean

    /**
     * Displays the number of commands, points, triangles and features used per tile.  This property is observable.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilesInspectorViewModel.html#showRenderingStatistics">Online Documentation</a>
     */
    var showRenderingStatistics: Boolean

    /**
     * Displays the memory used per tile.  This property is observable.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilesInspectorViewModel.html#showMemoryUsage">Online Documentation</a>
     */
    var showMemoryUsage: Boolean

    /**
     * Gets or sets the flag to show the tile url.  This property is observable.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilesInspectorViewModel.html#showUrl">Online Documentation</a>
     */
    var showUrl: Boolean

    /**
     * Gets or sets the maximum screen space error.  This property is observable.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilesInspectorViewModel.html#maximumScreenSpaceError">Online Documentation</a>
     */
    var maximumScreenSpaceError: Int

    /**
     * Gets or sets the dynamic screen space error density.  This property is observable.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilesInspectorViewModel.html#dynamicScreenSpaceErrorDensity">Online Documentation</a>
     */
    var dynamicScreenSpaceErrorDensity: Double

    /**
     * Gets or sets the dynamic screen space error density slider value.
     * This allows the slider to be exponential because values tend to be closer to 0 than 1.
     * This property is observable.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilesInspectorViewModel.html#dynamicScreenSpaceErrorDensitySliderValue">Online Documentation</a>
     */
    var dynamicScreenSpaceErrorDensitySliderValue: Double

    /**
     * Gets or sets the dynamic screen space error factor.  This property is observable.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilesInspectorViewModel.html#dynamicScreenSpaceErrorFactor">Online Documentation</a>
     */
    var dynamicScreenSpaceErrorFactor: Double

    /**
     * Gets or sets the flag to enable point cloud shading. This property is observable.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilesInspectorViewModel.html#pointCloudShading">Online Documentation</a>
     */
    var pointCloudShading: Boolean

    /**
     * Gets or sets the geometric error scale.  This property is observable.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilesInspectorViewModel.html#geometricErrorScale">Online Documentation</a>
     */
    var geometricErrorScale: Double

    /**
     * Gets or sets the maximum attenuation.  This property is observable.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilesInspectorViewModel.html#maximumAttenuation">Online Documentation</a>
     */
    var maximumAttenuation: Int

    /**
     * Gets or sets the base resolution.  This property is observable.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilesInspectorViewModel.html#baseResolution">Online Documentation</a>
     */
    var baseResolution: Int

    /**
     * Gets or sets the flag to enable eye dome lighting. This property is observable.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilesInspectorViewModel.html#eyeDomeLighting">Online Documentation</a>
     */
    var eyeDomeLighting: Boolean

    /**
     * Gets or sets the eye dome lighting strength.  This property is observable.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilesInspectorViewModel.html#eyeDomeLightingStrength">Online Documentation</a>
     */
    var eyeDomeLightingStrength: Double

    /**
     * Gets or sets the eye dome lighting radius.  This property is observable.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilesInspectorViewModel.html#eyeDomeLightingRadius">Online Documentation</a>
     */
    var eyeDomeLightingRadius: Double

    /**
     * Gets or sets the pick state
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilesInspectorViewModel.html#pickActive">Online Documentation</a>
     */
    var pickActive: Boolean

    /**
     * Gets or sets the flag to determine if level of detail skipping should be applied during the traversal.
     * This property is observable.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilesInspectorViewModel.html#skipLevelOfDetail">Online Documentation</a>
     */
    var skipLevelOfDetail: Boolean

    /**
     * Gets or sets the multiplier defining the minimum screen space error to skip. This property is observable.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilesInspectorViewModel.html#skipScreenSpaceErrorFactor">Online Documentation</a>
     */
    var skipScreenSpaceErrorFactor: Int

    /**
     * Gets or sets the screen space error that must be reached before skipping levels of detail. This property is observable.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilesInspectorViewModel.html#baseScreenSpaceError">Online Documentation</a>
     */
    var baseScreenSpaceError: Int

    /**
     * Gets or sets the constant defining the minimum number of levels to skip when loading tiles. This property is observable.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilesInspectorViewModel.html#skipLevels">Online Documentation</a>
     */
    var skipLevels: Int

    /**
     * Gets or sets the flag which, when true, only tiles that meet the maximum screen space error will ever be downloaded.
     * This property is observable.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilesInspectorViewModel.html#immediatelyLoadDesiredLevelOfDetail">Online Documentation</a>
     */
    var immediatelyLoadDesiredLevelOfDetail: Boolean

    /**
     * Gets or sets the flag which determines whether siblings of visible tiles are always downloaded during traversal.
     * This property is observable
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilesInspectorViewModel.html#loadSiblings">Online Documentation</a>
     */
    var loadSiblings: Boolean

    /**
     * Gets the statistics text.  This property is observable.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilesInspectorViewModel.html#statisticsText">Online Documentation</a>
     */
    val statisticsText: String

    /**
     * Gets the pick statistics text.  This property is observable.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilesInspectorViewModel.html#pickStatisticsText">Online Documentation</a>
     */
    val pickStatisticsText: String

    /**
     * Gets the resource cache statistics text. This property is observable.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilesInspectorViewModel.html#resourceCacheStatisticsText">Online Documentation</a>
     */
    val resourceCacheStatisticsText: String

    /**
     * Gets the available blend modes
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilesInspectorViewModel.html#colorBlendModes">Online Documentation</a>
     */
    val colorBlendModes: Array<out Any>

    /**
     * Gets the editor error message
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilesInspectorViewModel.html#editorError">Online Documentation</a>
     */
    val editorError: String

    /**
     * Gets or sets the tileset of the view model.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilesInspectorViewModel.html#tileset">Online Documentation</a>
     */
    var tileset: Cesium3DTileset

    /**
     * Gets the current feature of the view model.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilesInspectorViewModel.html#feature">Online Documentation</a>
     */
    var feature: Cesium3DTileFeature

    /**
     * Gets the current tile of the view model
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilesInspectorViewModel.html#tile">Online Documentation</a>
     */
    var tile: Cesium3DTile

    /**
     * Toggles the pick tileset mode
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilesInspectorViewModel.html#togglePickTileset">Online Documentation</a>
     */
    fun togglePickTileset()

    /**
     * Toggles the inspector visibility
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilesInspectorViewModel.html#toggleInspector">Online Documentation</a>
     */
    fun toggleInspector()

    /**
     * Toggles the visibility of the tileset section
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilesInspectorViewModel.html#toggleTileset">Online Documentation</a>
     */
    fun toggleTileset()

    /**
     * Toggles the visibility of the display section
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilesInspectorViewModel.html#toggleDisplay">Online Documentation</a>
     */
    fun toggleDisplay()

    /**
     * Toggles the visibility of the update section
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilesInspectorViewModel.html#toggleUpdate">Online Documentation</a>
     */
    fun toggleUpdate()

    /**
     * Toggles the visibility of the logging section
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilesInspectorViewModel.html#toggleLogging">Online Documentation</a>
     */
    fun toggleLogging()

    /**
     * Toggles the visibility of the style section
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilesInspectorViewModel.html#toggleStyle">Online Documentation</a>
     */
    fun toggleStyle()

    /**
     * Toggles the visibility of the tile Debug Info section
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilesInspectorViewModel.html#toggleTileDebugLabels">Online Documentation</a>
     */
    fun toggleTileDebugLabels()

    /**
     * Toggles the visibility of the optimization section
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilesInspectorViewModel.html#toggleOptimization">Online Documentation</a>
     */
    fun toggleOptimization()

    /**
     * Trims tile cache
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilesInspectorViewModel.html#trimTilesCache">Online Documentation</a>
     */
    fun trimTilesCache()

    /**
     * Compiles the style in the style editor.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilesInspectorViewModel.html#compileStyle">Online Documentation</a>
     */
    fun compileStyle()

    /**
     * Handles key press events on the style editor.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilesInspectorViewModel.html#styleEditorKeyPress">Online Documentation</a>
     */
    fun styleEditorKeyPress()

    /**
     * @return true if the object has been destroyed, false otherwise.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilesInspectorViewModel.html#isDestroyed">Online Documentation</a>
     */
    fun isDestroyed(): Boolean

    /**
     * Destroys the widget.  Should be called if permanently
     * removing the widget from layout.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilesInspectorViewModel.html#destroy">Online Documentation</a>
     */
    fun destroy()

    companion object {
        /**
         * Generates an HTML string of the statistics
         * @param [tileset] The tileset
         * @param [isPick] Whether this is getting the statistics for the pick pass
         * @return The formatted statistics
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilesInspectorViewModel.html#.getStatistics">Online Documentation</a>
         */
        fun getStatistics(
            tileset: Cesium3DTileset,
            isPick: Boolean,
        ): String
    }
}

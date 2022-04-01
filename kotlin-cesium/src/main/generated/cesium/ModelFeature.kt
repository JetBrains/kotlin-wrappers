// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package cesium

/**
 * A feature of a [ModelExperimental].
 *
 * Provides access to a feature's properties stored in the model's feature table.
 *
 * Modifications to a `ModelFeature` object have the lifetime of the model.
 *
 * Do not construct this directly. Access it through picking using [Scene.pick].
 * ```
 * // On mouse over, display all the properties for a feature in the console log.
 * handler.setInputAction(function(movement) {
 *     const feature = scene.pick(movement.endPosition);
 *     if (feature instanceof ModelFeature) {
 *         console.log(feature);
 *     }
 * }, ScreenSpaceEventType.MOUSE_MOVE);
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ModelFeature.html">Online Documentation</a>
 */
external class ModelFeature(options: ConstructorOptions) {
    /**
     * @property [model] The model the feature belongs to.
     * @property [featureId] The unique integral identifier for this feature.
     */
    interface ConstructorOptions {
        var model: ModelExperimental
        var featureId: Int
    }

    /**
     * Gets or sets if the feature will be shown. This is set for all features
     * when a style's show is evaluated.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ModelFeature.html#show">Online Documentation</a>
     */
    var show: Boolean

    /**
     * Gets or sets the highlight color multiplied with the feature's color.  When
     * this is white, the feature's color is not changed. This is set for all features
     * when a style's color is evaluated.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ModelFeature.html#color">Online Documentation</a>
     */
    var color: Color

    /**
     * Get the feature ID associated with this feature. For 3D Tiles 1.0, the
     * batch ID is returned. For EXT_mesh_features, this is the feature ID from
     * the selected feature ID set.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ModelFeature.html#featureId">Online Documentation</a>
     */
    val featureId: Int

    /**
     * Returns whether the feature contains this property.
     * @param [name] The case-sensitive name of the property.
     * @return Whether the feature contains this property.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ModelFeature.html#hasProperty">Online Documentation</a>
     */
    fun hasProperty(name: String): Boolean

    /**
     * Returns a copy of the value of the feature's property with the given name.
     * ```
     * // Display all the properties for a feature in the console log.
     * const propertyNames = feature.getPropertyNames();
     * const length = propertyNames.length;
     * for (let i = 0; i < length; ++i) {
     *     const propertyName = propertyNames[i];
     *     console.log(propertyName + ': ' + feature.getProperty(propertyName));
     * }
     * ```
     * @param [name] The case-sensitive name of the property.
     * @return The value of the property or `undefined` if the feature does not have this property.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ModelFeature.html#getProperty">Online Documentation</a>
     */
    fun getProperty(name: String): Any

    /**
     * Returns a copy of the feature's property with the given name, examining all
     * the metadata from the EXT_structural_metadata and legacy EXT_feature_metadata glTF
     * extensions. Metadata is checked against name from most specific to most
     * general and the first match is returned. Metadata is checked in this order:
     * <ol>
     *   <li>structural metadata property by semantic</li>
     *   <li>structural metadata property by property ID</li>
     * </ol>
     *
     * See the [EXT_structural_metadata Extension](https://github.com/CesiumGS/glTF/tree/3d-tiles-next/extensions/2.0/Vendor/EXT_structural_metadata) as well as the
     * previous [EXT_feature_metadata Extension](https://github.com/CesiumGS/glTF/tree/3d-tiles-next/extensions/2.0/Vendor/EXT_feature_metadata) for glTF.
     * @param [name] The semantic or property ID of the feature. Semantics are checked before property IDs in each granularity of metadata.
     * @return The value of the property or `undefined` if the feature does not have this property.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ModelFeature.html#getPropertyInherited">Online Documentation</a>
     */
    fun getPropertyInherited(name: String): Any

    /**
     * Returns an array of property names for the feature.
     * @param [results] An array into which to store the results.
     * @return The names of the feature's properties.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ModelFeature.html#getPropertyNames">Online Documentation</a>
     */
    fun getPropertyNames(results: Array<out String>? = definedExternally): Array<out String>

    /**
     * Sets the value of the feature's property with the given name.
     * ```
     * const height = feature.getProperty('Height'); // e.g., the height of a building
     * ```
     * ```
     * const name = 'clicked';
     * if (feature.getProperty(name)) {
     *     console.log('already clicked');
     * } else {
     *     feature.setProperty(name, true);
     *     console.log('first click');
     * }
     * ```
     * @param [name] The case-sensitive name of the property.
     * @param [value] The value of the property that will be copied.
     * @return `true` if the property was set, `false` otherwise.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ModelFeature.html#setProperty">Online Documentation</a>
     */
    fun setProperty(
        name: String,
        value: Any,
    ): Boolean
}

inline fun ModelFeature(
    block: ModelFeature.ConstructorOptions.() -> Unit,
): ModelFeature {
    val options: ModelFeature.ConstructorOptions = js("({})")
    block(options)
    return ModelFeature(options)
}

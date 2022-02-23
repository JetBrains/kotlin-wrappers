// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

package cesium

/**
 * A Label draws viewport-aligned text positioned in the 3D scene.  This constructor
 * should not be used directly, instead create labels by calling [LabelCollection.add].
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Label.html">Online Documentation</a>
 */
external class Label {
    /**
     * Determines if this label will be shown.  Use this to hide or show a label, instead
     * of removing it and re-adding it to the collection.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Label.html#show">Online Documentation</a>
     */
    var show: Boolean

    /**
     * Gets or sets the Cartesian position of this label.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Label.html#position">Online Documentation</a>
     */
    var position: Cartesian3

    /**
     * Gets or sets the height reference of this billboard.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Label.html#heightReference">Online Documentation</a>
     */
    var heightReference: HeightReference

    /**
     * Gets or sets the text of this label.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Label.html#text">Online Documentation</a>
     */
    var text: String

    /**
     * Gets or sets the font used to draw this label. Fonts are specified using the same syntax as the CSS 'font' property.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Label.html#font">Online Documentation</a>
     */
    var font: String

    /**
     * Gets or sets the fill color of this label.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Label.html#fillColor">Online Documentation</a>
     */
    var fillColor: Color

    /**
     * Gets or sets the outline color of this label.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Label.html#outlineColor">Online Documentation</a>
     */
    var outlineColor: Color

    /**
     * Gets or sets the outline width of this label.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Label.html#outlineWidth">Online Documentation</a>
     */
    var outlineWidth: Double

    /**
     * Determines if a background behind this label will be shown.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Label.html#showBackground">Online Documentation</a>
     */
    var showBackground: Boolean

    /**
     * Gets or sets the background color of this label.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Label.html#backgroundColor">Online Documentation</a>
     */
    var backgroundColor: Color

    /**
     * Gets or sets the background padding, in pixels, of this label.  The `x` value
     * controls horizontal padding, and the `y` value controls vertical padding.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Label.html#backgroundPadding">Online Documentation</a>
     */
    var backgroundPadding: Cartesian2

    /**
     * Gets or sets the style of this label.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Label.html#style">Online Documentation</a>
     */
    var style: LabelStyle

    /**
     * Gets or sets the pixel offset in screen space from the origin of this label.  This is commonly used
     * to align multiple labels and billboards at the same position, e.g., an image and text.  The
     * screen space origin is the top, left corner of the canvas; `x` increases from
     * left to right, and `y` increases from top to bottom.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Label.html#pixelOffset">Online Documentation</a>
     */
    var pixelOffset: Cartesian2

    /**
     * Gets or sets near and far translucency properties of a Label based on the Label's distance from the camera.
     * A label's translucency will interpolate between the [NearFarScalar.nearValue] and
     * [NearFarScalar.farValue] while the camera distance falls within the lower and upper bounds
     * of the specified [NearFarScalar.near] and [NearFarScalar.far].
     * Outside of these ranges the label's translucency remains clamped to the nearest bound.  If undefined,
     * translucencyByDistance will be disabled.
     * ```
     * // Example 1.
     * // Set a label's translucencyByDistance to 1.0 when the
     * // camera is 1500 meters from the label and disappear as
     * // the camera distance approaches 8.0e6 meters.
     * text.translucencyByDistance = new NearFarScalar(1.5e2, 1.0, 8.0e6, 0.0);
     * ```
     * ```
     * // Example 2.
     * // disable translucency by distance
     * text.translucencyByDistance = undefined;
     * ```
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Label.html#translucencyByDistance">Online Documentation</a>
     */
    var translucencyByDistance: NearFarScalar

    /**
     * Gets or sets near and far pixel offset scaling properties of a Label based on the Label's distance from the camera.
     * A label's pixel offset will be scaled between the [NearFarScalar.nearValue] and
     * [NearFarScalar.farValue] while the camera distance falls within the lower and upper bounds
     * of the specified [NearFarScalar.near] and [NearFarScalar.far].
     * Outside of these ranges the label's pixel offset scaling remains clamped to the nearest bound.  If undefined,
     * pixelOffsetScaleByDistance will be disabled.
     * ```
     * // Example 1.
     * // Set a label's pixel offset scale to 0.0 when the
     * // camera is 1500 meters from the label and scale pixel offset to 10.0 pixels
     * // in the y direction the camera distance approaches 8.0e6 meters.
     * text.pixelOffset = new Cartesian2(0.0, 1.0);
     * text.pixelOffsetScaleByDistance = new NearFarScalar(1.5e2, 0.0, 8.0e6, 10.0);
     * ```
     * ```
     * // Example 2.
     * // disable pixel offset by distance
     * text.pixelOffsetScaleByDistance = undefined;
     * ```
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Label.html#pixelOffsetScaleByDistance">Online Documentation</a>
     */
    var pixelOffsetScaleByDistance: NearFarScalar

    /**
     * Gets or sets near and far scaling properties of a Label based on the label's distance from the camera.
     * A label's scale will interpolate between the [NearFarScalar.nearValue] and
     * [NearFarScalar.farValue] while the camera distance falls within the lower and upper bounds
     * of the specified [NearFarScalar.near] and [NearFarScalar.far].
     * Outside of these ranges the label's scale remains clamped to the nearest bound.  If undefined,
     * scaleByDistance will be disabled.
     * ```
     * // Example 1.
     * // Set a label's scaleByDistance to scale by 1.5 when the
     * // camera is 1500 meters from the label and disappear as
     * // the camera distance approaches 8.0e6 meters.
     * label.scaleByDistance = new NearFarScalar(1.5e2, 1.5, 8.0e6, 0.0);
     * ```
     * ```
     * // Example 2.
     * // disable scaling by distance
     * label.scaleByDistance = undefined;
     * ```
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Label.html#scaleByDistance">Online Documentation</a>
     */
    var scaleByDistance: NearFarScalar

    /**
     * Gets and sets the 3D Cartesian offset applied to this label in eye coordinates.  Eye coordinates is a left-handed
     * coordinate system, where `x` points towards the viewer's right, `y` points up, and
     * `z` points into the screen.  Eye coordinates use the same scale as world and model coordinates,
     * which is typically meters.
     *
     * An eye offset is commonly used to arrange multiple label or objects at the same position, e.g., to
     * arrange a label above its corresponding 3D model.
     *
     * Below, the label is positioned at the center of the Earth but an eye offset makes it always
     * appear on top of the Earth regardless of the viewer's or Earth's orientation.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Label.html#eyeOffset">Online Documentation</a>
     */
    var eyeOffset: Cartesian3

    /**
     * Gets or sets the horizontal origin of this label, which determines if the label is drawn
     * to the left, center, or right of its anchor position.
     * ```
     * // Use a top, right origin
     * l.horizontalOrigin = HorizontalOrigin.RIGHT;
     * l.verticalOrigin = VerticalOrigin.TOP;
     * ```
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Label.html#horizontalOrigin">Online Documentation</a>
     */
    var horizontalOrigin: HorizontalOrigin

    /**
     * Gets or sets the vertical origin of this label, which determines if the label is
     * to the above, below, or at the center of its anchor position.
     * ```
     * // Use a top, right origin
     * l.horizontalOrigin = HorizontalOrigin.RIGHT;
     * l.verticalOrigin = VerticalOrigin.TOP;
     * ```
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Label.html#verticalOrigin">Online Documentation</a>
     */
    var verticalOrigin: VerticalOrigin

    /**
     * Gets or sets the uniform scale that is multiplied with the label's size in pixels.
     * A scale of `1.0` does not change the size of the label; a scale greater than
     * `1.0` enlarges the label; a positive scale less than `1.0` shrinks
     * the label.
     *
     * Applying a large scale value may pixelate the label.  To make text larger without pixelation,
     * use a larger font size when calling [Label.font] instead.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Label.html#scale">Online Documentation</a>
     */
    var scale: Double

    /**
     * Gets the total scale of the label, which is the label's scale multiplied by the computed relative size
     * of the desired font compared to the generated glyph size.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Label.html#totalScale">Online Documentation</a>
     */
    var totalScale: Double

    /**
     * Gets or sets the condition specifying at what distance from the camera that this label will be displayed.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Label.html#distanceDisplayCondition">Online Documentation</a>
     */
    var distanceDisplayCondition: DistanceDisplayCondition

    /**
     * Gets or sets the distance from the camera at which to disable the depth test to, for example, prevent clipping against terrain.
     * When set to zero, the depth test is always applied. When set to Number.POSITIVE_INFINITY, the depth test is never applied.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Label.html#disableDepthTestDistance">Online Documentation</a>
     */
    var disableDepthTestDistance: Double

    /**
     * Gets or sets the user-defined value returned when the label is picked.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Label.html#id">Online Documentation</a>
     */
    var id: Any

    /**
     * Computes the screen-space position of the label's origin, taking into account eye and pixel offsets.
     * The screen space origin is the top, left corner of the canvas; `x` increases from
     * left to right, and `y` increases from top to bottom.
     * ```
     * console.log(l.computeScreenSpacePosition(scene).toString());
     * ```
     * @param [scene] The scene the label is in.
     * @param [result] The object onto which to store the result.
     * @return The screen-space position of the label.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Label.html#computeScreenSpacePosition">Online Documentation</a>
     */
    fun computeScreenSpacePosition(
        scene: Scene,
        result: Cartesian2? = definedExternally,
    ): Cartesian2

    /**
     * Returns true if this object was destroyed; otherwise, false.
     *
     * If this object was destroyed, it should not be used; calling any function other than
     * `isDestroyed` will result in a [DeveloperError] exception.
     * @return True if this object was destroyed; otherwise, false.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Label.html#isDestroyed">Online Documentation</a>
     */
    fun isDestroyed(): Boolean

    companion object {
        /**
         * Determines whether or not run the algorithm, that match the text of the label to right-to-left languages
         * ```
         * // Example 1.
         * // Set a label's rightToLeft before init
         * Label.enableRightToLeftDetection = true;
         * const myLabelEntity = viewer.entities.add({
         *   label: {
         *     id: 'my label',
         *     text: 'זה טקסט בעברית \n ועכשיו יורדים שורה',
         *   }
         * });
         * ```
         * ```
         * // Example 2.
         * const myLabelEntity = viewer.entities.add({
         *   label: {
         *     id: 'my label',
         *     text: 'English text'
         *   }
         * });
         * // Set a label's rightToLeft after init
         * Label.enableRightToLeftDetection = true;
         * myLabelEntity.text = 'טקסט חדש';
         * ```
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Label.html#.enableRightToLeftDetection">Online Documentation</a>
         */
        var enableRightToLeftDetection: Boolean
    }
}

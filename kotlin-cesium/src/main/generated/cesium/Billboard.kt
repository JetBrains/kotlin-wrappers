// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package cesium

/**
 * A viewport-aligned image positioned in the 3D scene, that is created
 * and rendered using a [BillboardCollection].  A billboard is created and its initial
 * properties are set by calling [BillboardCollection.add].
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Billboard.html">Online Documentation</a>
 */
external class Billboard {
    /**
     * Determines if this billboard will be shown.  Use this to hide or show a billboard, instead
     * of removing it and re-adding it to the collection.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Billboard.html#show">Online Documentation</a>
     */
    var show: Boolean

    /**
     * Gets or sets the Cartesian position of this billboard.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Billboard.html#position">Online Documentation</a>
     */
    var position: Cartesian3

    /**
     * Gets or sets the height reference of this billboard.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Billboard.html#heightReference">Online Documentation</a>
     */
    var heightReference: HeightReference

    /**
     * Gets or sets the pixel offset in screen space from the origin of this billboard.  This is commonly used
     * to align multiple billboards and labels at the same position, e.g., an image and text.  The
     * screen space origin is the top, left corner of the canvas; `x` increases from
     * left to right, and `y` increases from top to bottom.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Billboard.html#pixelOffset">Online Documentation</a>
     */
    var pixelOffset: Cartesian2

    /**
     * Gets or sets near and far scaling properties of a Billboard based on the billboard's distance from the camera.
     * A billboard's scale will interpolate between the [NearFarScalar.nearValue] and
     * [NearFarScalar.farValue] while the camera distance falls within the lower and upper bounds
     * of the specified [NearFarScalar.near] and [NearFarScalar.far].
     * Outside of these ranges the billboard's scale remains clamped to the nearest bound.  If undefined,
     * scaleByDistance will be disabled.
     * ```
     * // Example 1.
     * // Set a billboard's scaleByDistance to scale by 1.5 when the
     * // camera is 1500 meters from the billboard and disappear as
     * // the camera distance approaches 8.0e6 meters.
     * b.scaleByDistance = new NearFarScalar(1.5e2, 1.5, 8.0e6, 0.0);
     * ```
     * ```
     * // Example 2.
     * // disable scaling by distance
     * b.scaleByDistance = undefined;
     * ```
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Billboard.html#scaleByDistance">Online Documentation</a>
     */
    var scaleByDistance: NearFarScalar

    /**
     * Gets or sets near and far translucency properties of a Billboard based on the billboard's distance from the camera.
     * A billboard's translucency will interpolate between the [NearFarScalar.nearValue] and
     * [NearFarScalar.farValue] while the camera distance falls within the lower and upper bounds
     * of the specified [NearFarScalar.near] and [NearFarScalar.far].
     * Outside of these ranges the billboard's translucency remains clamped to the nearest bound.  If undefined,
     * translucencyByDistance will be disabled.
     * ```
     * // Example 1.
     * // Set a billboard's translucency to 1.0 when the
     * // camera is 1500 meters from the billboard and disappear as
     * // the camera distance approaches 8.0e6 meters.
     * b.translucencyByDistance = new NearFarScalar(1.5e2, 1.0, 8.0e6, 0.0);
     * ```
     * ```
     * // Example 2.
     * // disable translucency by distance
     * b.translucencyByDistance = undefined;
     * ```
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Billboard.html#translucencyByDistance">Online Documentation</a>
     */
    var translucencyByDistance: NearFarScalar

    /**
     * Gets or sets near and far pixel offset scaling properties of a Billboard based on the billboard's distance from the camera.
     * A billboard's pixel offset will be scaled between the [NearFarScalar.nearValue] and
     * [NearFarScalar.farValue] while the camera distance falls within the lower and upper bounds
     * of the specified [NearFarScalar.near] and [NearFarScalar.far].
     * Outside of these ranges the billboard's pixel offset scale remains clamped to the nearest bound.  If undefined,
     * pixelOffsetScaleByDistance will be disabled.
     * ```
     * // Example 1.
     * // Set a billboard's pixel offset scale to 0.0 when the
     * // camera is 1500 meters from the billboard and scale pixel offset to 10.0 pixels
     * // in the y direction the camera distance approaches 8.0e6 meters.
     * b.pixelOffset = new Cartesian2(0.0, 1.0);
     * b.pixelOffsetScaleByDistance = new NearFarScalar(1.5e2, 0.0, 8.0e6, 10.0);
     * ```
     * ```
     * // Example 2.
     * // disable pixel offset by distance
     * b.pixelOffsetScaleByDistance = undefined;
     * ```
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Billboard.html#pixelOffsetScaleByDistance">Online Documentation</a>
     */
    var pixelOffsetScaleByDistance: NearFarScalar

    /**
     * Gets or sets the 3D Cartesian offset applied to this billboard in eye coordinates.  Eye coordinates is a left-handed
     * coordinate system, where `x` points towards the viewer's right, `y` points up, and
     * `z` points into the screen.  Eye coordinates use the same scale as world and model coordinates,
     * which is typically meters.
     *
     * An eye offset is commonly used to arrange multiple billboards or objects at the same position, e.g., to
     * arrange a billboard above its corresponding 3D model.
     *
     * Below, the billboard is positioned at the center of the Earth but an eye offset makes it always
     * appear on top of the Earth regardless of the viewer's or Earth's orientation.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Billboard.html#eyeOffset">Online Documentation</a>
     */
    var eyeOffset: Cartesian3

    /**
     * Gets or sets the horizontal origin of this billboard, which determines if the billboard is
     * to the left, center, or right of its anchor position.
     * ```
     * // Use a bottom, left origin
     * b.horizontalOrigin = HorizontalOrigin.LEFT;
     * b.verticalOrigin = VerticalOrigin.BOTTOM;
     * ```
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Billboard.html#horizontalOrigin">Online Documentation</a>
     */
    var horizontalOrigin: HorizontalOrigin

    /**
     * Gets or sets the vertical origin of this billboard, which determines if the billboard is
     * to the above, below, or at the center of its anchor position.
     * ```
     * // Use a bottom, left origin
     * b.horizontalOrigin = HorizontalOrigin.LEFT;
     * b.verticalOrigin = VerticalOrigin.BOTTOM;
     * ```
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Billboard.html#verticalOrigin">Online Documentation</a>
     */
    var verticalOrigin: VerticalOrigin

    /**
     * Gets or sets the uniform scale that is multiplied with the billboard's image size in pixels.
     * A scale of `1.0` does not change the size of the billboard; a scale greater than
     * `1.0` enlarges the billboard; a positive scale less than `1.0` shrinks
     * the billboard.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Billboard.html#scale">Online Documentation</a>
     */
    var scale: Double

    /**
     * Gets or sets the color that is multiplied with the billboard's texture.  This has two common use cases.  First,
     * the same white texture may be used by many different billboards, each with a different color, to create
     * colored billboards.  Second, the color's alpha component can be used to make the billboard translucent as shown below.
     * An alpha of `0.0` makes the billboard transparent, and `1.0` makes the billboard opaque.
     *
     * The red, green, blue, and alpha values are indicated by `value`'s `red`, `green`,
     * `blue`, and `alpha` properties as shown in Example 1.  These components range from `0.0`
     * (no intensity) to `1.0` (full intensity).
     * ```
     * // Example 1. Assign yellow.
     * b.color = Color.YELLOW;
     * ```
     * ```
     * // Example 2. Make a billboard 50% translucent.
     * b.color = new Color(1.0, 1.0, 1.0, 0.5);
     * ```
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Billboard.html#color">Online Documentation</a>
     */
    var color: Color

    /**
     * Gets or sets the rotation angle in radians.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Billboard.html#rotation">Online Documentation</a>
     */
    var rotation: Double

    /**
     * Gets or sets the aligned axis in world space. The aligned axis is the unit vector that the billboard up vector points towards.
     * The default is the zero vector, which means the billboard is aligned to the screen up vector.
     * ```
     * // Example 1.
     * // Have the billboard up vector point north
     * billboard.alignedAxis = Cartesian3.UNIT_Z;
     * ```
     * ```
     * // Example 2.
     * // Have the billboard point east.
     * billboard.alignedAxis = Cartesian3.UNIT_Z;
     * billboard.rotation = -Cesium.Math.PI_OVER_TWO;
     * ```
     * ```
     * // Example 3.
     * // Reset the aligned axis
     * billboard.alignedAxis = Cartesian3.ZERO;
     * ```
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Billboard.html#alignedAxis">Online Documentation</a>
     */
    var alignedAxis: Cartesian3

    /**
     * Gets or sets a width for the billboard. If undefined, the image width will be used.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Billboard.html#width">Online Documentation</a>
     */
    var width: Double

    /**
     * Gets or sets a height for the billboard. If undefined, the image height will be used.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Billboard.html#height">Online Documentation</a>
     */
    var height: Double

    /**
     * Gets or sets if the billboard size is in meters or pixels. `true` to size the billboard in meters;
     * otherwise, the size is in pixels.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Billboard.html#sizeInMeters">Online Documentation</a>
     */
    var sizeInMeters: Boolean

    /**
     * Gets or sets the condition specifying at what distance from the camera that this billboard will be displayed.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Billboard.html#distanceDisplayCondition">Online Documentation</a>
     */
    var distanceDisplayCondition: DistanceDisplayCondition

    /**
     * Gets or sets the distance from the camera at which to disable the depth test to, for example, prevent clipping against terrain.
     * When set to zero, the depth test is always applied. When set to Number.POSITIVE_INFINITY, the depth test is never applied.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Billboard.html#disableDepthTestDistance">Online Documentation</a>
     */
    var disableDepthTestDistance: Double

    /**
     * Gets or sets the user-defined object returned when the billboard is picked.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Billboard.html#id">Online Documentation</a>
     */
    var id: Any

    /**
     * Gets or sets the image to be used for this billboard.  If a texture has already been created for the
     * given image, the existing texture is used.
     *
     * This property can be set to a loaded Image, a URL which will be loaded as an Image automatically,
     * a canvas, or another billboard's image property (from the same billboard collection).
     * ```
     * // load an image from a URL
     * b.image = 'some/image/url.png';
     *
     * // assuming b1 and b2 are billboards in the same billboard collection,
     * // use the same image for both billboards.
     * b2.image = b1.image;
     * ```
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Billboard.html#image">Online Documentation</a>
     */
    var image: String

    /**
     * When `true`, this billboard is ready to render, i.e., the image
     * has been downloaded and the WebGL resources are created.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Billboard.html#ready">Online Documentation</a>
     */
    val ready: Boolean

    /**
     * Sets the image to be used for this billboard.  If a texture has already been created for the
     * given id, the existing texture is used.
     *
     * This function is useful for dynamically creating textures that are shared across many billboards.
     * Only the first billboard will actually call the function and create the texture, while subsequent
     * billboards created with the same id will simply re-use the existing texture.
     *
     * To load an image from a URL, setting the [Billboard.image] property is more convenient.
     * ```
     * // create a billboard image dynamically
     * function drawImage(id) {
     *   // create and draw an image using a canvas
     *   const canvas = document.createElement('canvas');
     *   const context2D = canvas.getContext('2d');
     *   // ... draw image
     *   return canvas;
     * }
     * // drawImage will be called to create the texture
     * b.setImage('myImage', drawImage);
     *
     * // subsequent billboards created in the same collection using the same id will use the existing
     * // texture, without the need to create the canvas or draw the image
     * b2.setImage('myImage', drawImage);
     * ```
     * @param [id] The id of the image.  This can be any string that uniquely identifies the image.
     * @param [image] The image to load.  This parameter
     *   can either be a loaded Image or Canvas, a URL which will be loaded as an Image automatically,
     *   or a function which will be called to create the image if it hasn't been loaded already.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Billboard.html#setImage">Online Documentation</a>
     */
    fun setImage(
        id: String,
        image: dom.html.HTMLImageElement,
    )

    fun setImage(
        id: String,
        image: dom.html.HTMLCanvasElement,
    )

    fun setImage(
        id: String,
        image: String,
    )

    fun setImage(
        id: String,
        image: Resource,
    )

    fun setImage(
        id: String,
        image: CreateImageCallback,
    )

    /**
     * Uses a sub-region of the image with the given id as the image for this billboard,
     * measured in pixels from the bottom-left.
     * @param [id] The id of the image to use.
     * @param [subRegion] The sub-region of the image.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Billboard.html#setImageSubRegion">Online Documentation</a>
     */
    fun setImageSubRegion(
        id: String,
        subRegion: BoundingRectangle,
    )

    /**
     * Computes the screen-space position of the billboard's origin, taking into account eye and pixel offsets.
     * The screen space origin is the top, left corner of the canvas; `x` increases from
     * left to right, and `y` increases from top to bottom.
     * ```
     * console.log(b.computeScreenSpacePosition(scene).toString());
     * ```
     * @param [scene] The scene.
     * @param [result] The object onto which to store the result.
     * @return The screen-space position of the billboard.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Billboard.html#computeScreenSpacePosition">Online Documentation</a>
     */
    fun computeScreenSpacePosition(
        scene: Scene,
        result: Cartesian2? = definedExternally,
    ): Cartesian2
}

/**
 * A function that creates an image.
 * @param [id] The identifier of the image to load.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Billboard.html#.CreateImageCallback">Online Documentation</a>
 */
typealias CreateImageCallback = (id: String) -> dynamic

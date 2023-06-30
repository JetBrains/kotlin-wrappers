package electron.core


external interface Display {
// Docs: https://electronjs.org/docs/api/structures/display
    /**
     * Can be `available`, `unavailable`, `unknown`.
     */
    var accelerometerSupport: (DisplayAccelerometerSupport)

    /**
     * the bounds of the display in DIP points.
     */
    var bounds: Rectangle

    /**
     * The number of bits per pixel.
     */
    var colorDepth: Double

    /**
     *  represent a color space (three-dimensional object which contains all realizable
     * color combinations) for the purpose of color conversions
     */
    var colorSpace: String

    /**
     * The number of bits per color component.
     */
    var depthPerComponent: Double

    /**
     * The display refresh rate.
     */
    var displayFrequency: Double

    /**
     * Unique identifier associated with the display.
     */
    var id: Double

    /**
     * `true` for an internal display and `false` for an external display
     */
    var internal: Boolean

    /**
     * User-friendly label, determined by the platform.
     */
    var label: String

    /**
     * Whether or not the display is a monochrome display.
     */
    var monochrome: Boolean

    /**
     * Can be 0, 90, 180, 270, represents screen rotation in clock-wise degrees.
     */
    var rotation: Double

    /**
     * Output device's pixel scale factor.
     */
    var scaleFactor: Double
    var size: Size

    /**
     * Can be `available`, `unavailable`, `unknown`.
     */
    var touchSupport: (DisplayTouchSupport)

    /**
     * the work area of the display in DIP points.
     */
    var workArea: Rectangle
    var workAreaSize: Size
}

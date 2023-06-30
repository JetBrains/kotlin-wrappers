package electron.core


external interface Parameters {
    /**
     * Specify the screen type to emulate (default: `desktop`):
     */
    var screenPosition: (ParametersScreenPosition)

    /**
     * Set the emulated screen size (screenPosition == mobile).
     */
    var screenSize: Size

    /**
     * Position the view on the screen (screenPosition == mobile) (default: `{ x: 0, y:
     * 0 }`).
     */
    var viewPosition: Point

    /**
     * Set the device scale factor (if zero defaults to original device scale factor)
     * (default: `0`).
     */
    var deviceScaleFactor: Double

    /**
     * Set the emulated view size (empty means no override)
     */
    var viewSize: Size

    /**
     * Scale of emulated view inside available space (not in fit to view mode)
     * (default: `1`).
     */
    var scale: Double
}

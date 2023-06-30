package electron.core


external interface TitleBarOverlayOptions {
    /**
     * The CSS color of the Window Controls Overlay when enabled.
     *
     * @platform win32
     */
    var color: String?

    /**
     * The CSS color of the symbols on the Window Controls Overlay when enabled.
     *
     * @platform win32
     */
    var symbolColor: String?

    /**
     * The height of the title bar and Window Controls Overlay in pixels.
     *
     * @platform win32
     */
    var height: Double?
}

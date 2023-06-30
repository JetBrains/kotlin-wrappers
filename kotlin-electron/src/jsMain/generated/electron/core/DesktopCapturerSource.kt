package electron.core


external interface DesktopCapturerSource {
// Docs: https://electronjs.org/docs/api/structures/desktop-capturer-source
    /**
     * An icon image of the application that owns the window or null if the source has
     * a type screen. The size of the icon is not known in advance and depends on what
     * the application provides.
     */
    var appIcon: NativeImage

    /**
     * A unique identifier that will correspond to the `id` of the matching Display
     * returned by the Screen API. On some platforms, this is equivalent to the `XX`
     * portion of the `id` field above and on others it will differ. It will be an
     * empty string if not available.
     */
    var display_id: String

    /**
     * The identifier of a window or screen that can be used as a `chromeMediaSourceId`
     * constraint when calling `navigator.getUserMedia`. The format of the identifier
     * will be `window:XX:YY` or `screen:ZZ:0`. XX is the windowID/handle. YY is 1 for
     * the current process, and 0 for all others. ZZ is a sequential number that
     * represents the screen, and it does not equal to the index in the source's name.
     */
    var id: String

    /**
     * A screen source will be named either `Entire Screen` or `Screen <index>`, while
     * the name of a window source will match the window title.
     */
    var name: String

    /**
     * A thumbnail image. **Note:** There is no guarantee that the size of the
     * thumbnail is the same as the `thumbnailSize` specified in the `options` passed
     * to `desktopCapturer.getSources`. The actual size depends on the scale of the
     * screen or window.
     */
    var thumbnail: NativeImage
}

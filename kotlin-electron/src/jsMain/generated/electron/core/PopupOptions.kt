package electron.core


external interface PopupOptions {
    /**
     * Default is the focused window.
     */
    var window: BrowserWindow?

    /**
     * Default is the current mouse cursor position. Must be declared if `y` is
     * declared.
     */
    var x: Double?

    /**
     * Default is the current mouse cursor position. Must be declared if `x` is
     * declared.
     */
    var y: Double?

    /**
     * The index of the menu item to be positioned under the mouse cursor at the
     * specified coordinates. Default is -1.
     *
     * @platform darwin
     */
    var positioningItem: Double?

    /**
     * Called when menu is closed.
     */
    var callback: () -> Unit?
}

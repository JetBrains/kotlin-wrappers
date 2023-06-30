@file:JsModule("INTERNAL_ENTITY")

package electron.core

import node.events.EventEmitter as NodeEventEmitter


open external class Tray : NodeEventEmitter {
// Docs: https://electronjs.org/docs/api/tray
    /**
     * Emitted when the tray balloon is clicked.
     *
     * @platform win32
     */
    fun on(event: TrayEvent.BALLOON_CLICK, listener: Function<*>): Unit /* this */

    /**
     * Emitted when the tray balloon is closed because of timeout or user manually
     * closes it.
     *
     * @platform win32
     */
    fun on(event: TrayEvent.BALLOON_CLOSED, listener: Function<*>): Unit /* this */

    /**
     * Emitted when the tray balloon shows.
     *
     * @platform win32
     */
    fun on(event: TrayEvent.BALLOON_SHOW, listener: Function<*>): Unit /* this */

    /**
     * Emitted when the tray icon is clicked.
     *
     * Note that on Linux this event is emitted when the tray icon receives an
     * activation, which might not necessarily be left mouse click.
     */
    fun on(
        event: TrayEvent.CLICK, listener: (
            event: KeyboardEvent,
            /**
             * The bounds of tray icon.
             */
            bounds: Rectangle,
            /**
             * The position of the event.
             */
            position: Point
        ) -> Unit
    ): Unit /* this */

    /**
     * Emitted when the tray icon is double clicked.
     *
     * @platform darwin,win32
     */
    fun on(
        event: TrayEvent.DOUBLE_CLICK, listener: (
            event: KeyboardEvent,
            /**
             * The bounds of tray icon.
             */
            bounds: Rectangle
        ) -> Unit
    ): Unit /* this */

    /**
     * Emitted when a drag operation ends on the tray or ends at another location.
     *
     * @platform darwin
     */
    fun on(event: TrayEvent.DRAG_END, listener: Function<*>): Unit /* this */

    /**
     * Emitted when a drag operation enters the tray icon.
     *
     * @platform darwin
     */
    fun on(event: TrayEvent.DRAG_ENTER, listener: Function<*>): Unit /* this */

    /**
     * Emitted when a drag operation exits the tray icon.
     *
     * @platform darwin
     */
    fun on(event: TrayEvent.DRAG_LEAVE, listener: Function<*>): Unit /* this */

    /**
     * Emitted when any dragged items are dropped on the tray icon.
     *
     * @platform darwin
     */
    fun on(event: TrayEvent.DROP, listener: Function<*>): Unit /* this */

    /**
     * Emitted when dragged files are dropped in the tray icon.
     *
     * @platform darwin
     */
    fun on(
        event: TrayEvent.DROP_FILES, listener: (
            event: Event,
            /**
             * The paths of the dropped files.
             */
            files: js.core.ReadonlyArray<String>
        ) -> Unit
    ): Unit /* this */

    /**
     * Emitted when dragged text is dropped in the tray icon.
     *
     * @platform darwin
     */
    fun on(
        event: TrayEvent.DROP_TEXT, listener: (
            event: Event,
            /**
             * the dropped text string.
             */
            text: String
        ) -> Unit
    ): Unit /* this */

    /**
     * Emitted when the mouse clicks the tray icon.
     *
     * @platform darwin
     */
    fun on(
        event: TrayEvent.MOUSE_DOWN, listener: (
            event: KeyboardEvent,
            /**
             * The position of the event.
             */
            position: Point
        ) -> Unit
    ): Unit /* this */

    /**
     * Emitted when the mouse enters the tray icon.
     *
     * @platform darwin
     */
    fun on(
        event: TrayEvent.MOUSE_ENTER, listener: (
            event: KeyboardEvent,
            /**
             * The position of the event.
             */
            position: Point
        ) -> Unit
    ): Unit /* this */

    /**
     * Emitted when the mouse exits the tray icon.
     *
     * @platform darwin
     */
    fun on(
        event: TrayEvent.MOUSE_LEAVE, listener: (
            event: KeyboardEvent,
            /**
             * The position of the event.
             */
            position: Point
        ) -> Unit
    ): Unit /* this */

    /**
     * Emitted when the mouse moves in the tray icon.
     *
     * @platform darwin,win32
     */
    fun on(
        event: TrayEvent.MOUSE_MOVE, listener: (
            event: KeyboardEvent,
            /**
             * The position of the event.
             */
            position: Point
        ) -> Unit
    ): Unit /* this */

    /**
     * Emitted when the mouse is released from clicking the tray icon.
     *
     * Note: This will not be emitted if you have set a context menu for your Tray
     * using `tray.setContextMenu`, as a result of macOS-level constraints.
     *
     * @platform darwin
     */
    fun on(
        event: TrayEvent.MOUSE_UP, listener: (
            event: KeyboardEvent,
            /**
             * The position of the event.
             */
            position: Point
        ) -> Unit
    ): Unit /* this */

    /**
     * Emitted when the tray icon is right clicked.
     *
     * @platform darwin,win32
     */
    fun on(
        event: TrayEvent.RIGHT_CLICK, listener: (
            event: KeyboardEvent,
            /**
             * The bounds of tray icon.
             */
            bounds: Rectangle
        ) -> Unit
    ): Unit /* this */

    fun once(event: TrayEvent.BALLOON_CLICK, listener: Function<*>): Unit /* this */
    fun once(event: TrayEvent.BALLOON_CLOSED, listener: Function<*>): Unit /* this */
    fun once(event: TrayEvent.BALLOON_SHOW, listener: Function<*>): Unit /* this */
    fun once(
        event: TrayEvent.CLICK, listener: (
            event: KeyboardEvent,
            /**
             * The bounds of tray icon.
             */
            bounds: Rectangle,
            /**
             * The position of the event.
             */
            position: Point
        ) -> Unit
    ): Unit /* this */

    fun once(
        event: TrayEvent.DOUBLE_CLICK, listener: (
            event: KeyboardEvent,
            /**
             * The bounds of tray icon.
             */
            bounds: Rectangle
        ) -> Unit
    ): Unit /* this */

    fun once(event: TrayEvent.DRAG_END, listener: Function<*>): Unit /* this */
    fun once(event: TrayEvent.DRAG_ENTER, listener: Function<*>): Unit /* this */
    fun once(event: TrayEvent.DRAG_LEAVE, listener: Function<*>): Unit /* this */
    fun once(event: TrayEvent.DROP, listener: Function<*>): Unit /* this */
    fun once(
        event: TrayEvent.DROP_FILES, listener: (
            event: Event,
            /**
             * The paths of the dropped files.
             */
            files: js.core.ReadonlyArray<String>
        ) -> Unit
    ): Unit /* this */

    fun once(
        event: TrayEvent.DROP_TEXT, listener: (
            event: Event,
            /**
             * the dropped text string.
             */
            text: String
        ) -> Unit
    ): Unit /* this */

    fun once(
        event: TrayEvent.MOUSE_DOWN, listener: (
            event: KeyboardEvent,
            /**
             * The position of the event.
             */
            position: Point
        ) -> Unit
    ): Unit /* this */

    fun once(
        event: TrayEvent.MOUSE_ENTER, listener: (
            event: KeyboardEvent,
            /**
             * The position of the event.
             */
            position: Point
        ) -> Unit
    ): Unit /* this */

    fun once(
        event: TrayEvent.MOUSE_LEAVE, listener: (
            event: KeyboardEvent,
            /**
             * The position of the event.
             */
            position: Point
        ) -> Unit
    ): Unit /* this */

    fun once(
        event: TrayEvent.MOUSE_MOVE, listener: (
            event: KeyboardEvent,
            /**
             * The position of the event.
             */
            position: Point
        ) -> Unit
    ): Unit /* this */

    fun once(
        event: TrayEvent.MOUSE_UP, listener: (
            event: KeyboardEvent,
            /**
             * The position of the event.
             */
            position: Point
        ) -> Unit
    ): Unit /* this */

    fun once(
        event: TrayEvent.RIGHT_CLICK, listener: (
            event: KeyboardEvent,
            /**
             * The bounds of tray icon.
             */
            bounds: Rectangle
        ) -> Unit
    ): Unit /* this */

    fun addListener(event: TrayEvent.BALLOON_CLICK, listener: Function<*>): Unit /* this */
    fun addListener(event: TrayEvent.BALLOON_CLOSED, listener: Function<*>): Unit /* this */
    fun addListener(event: TrayEvent.BALLOON_SHOW, listener: Function<*>): Unit /* this */
    fun addListener(
        event: TrayEvent.CLICK, listener: (
            event: KeyboardEvent,
            /**
             * The bounds of tray icon.
             */
            bounds: Rectangle,
            /**
             * The position of the event.
             */
            position: Point
        ) -> Unit
    ): Unit /* this */

    fun addListener(
        event: TrayEvent.DOUBLE_CLICK, listener: (
            event: KeyboardEvent,
            /**
             * The bounds of tray icon.
             */
            bounds: Rectangle
        ) -> Unit
    ): Unit /* this */

    fun addListener(event: TrayEvent.DRAG_END, listener: Function<*>): Unit /* this */
    fun addListener(event: TrayEvent.DRAG_ENTER, listener: Function<*>): Unit /* this */
    fun addListener(event: TrayEvent.DRAG_LEAVE, listener: Function<*>): Unit /* this */
    fun addListener(event: TrayEvent.DROP, listener: Function<*>): Unit /* this */
    fun addListener(
        event: TrayEvent.DROP_FILES, listener: (
            event: Event,
            /**
             * The paths of the dropped files.
             */
            files: js.core.ReadonlyArray<String>
        ) -> Unit
    ): Unit /* this */

    fun addListener(
        event: TrayEvent.DROP_TEXT, listener: (
            event: Event,
            /**
             * the dropped text string.
             */
            text: String
        ) -> Unit
    ): Unit /* this */

    fun addListener(
        event: TrayEvent.MOUSE_DOWN, listener: (
            event: KeyboardEvent,
            /**
             * The position of the event.
             */
            position: Point
        ) -> Unit
    ): Unit /* this */

    fun addListener(
        event: TrayEvent.MOUSE_ENTER, listener: (
            event: KeyboardEvent,
            /**
             * The position of the event.
             */
            position: Point
        ) -> Unit
    ): Unit /* this */

    fun addListener(
        event: TrayEvent.MOUSE_LEAVE, listener: (
            event: KeyboardEvent,
            /**
             * The position of the event.
             */
            position: Point
        ) -> Unit
    ): Unit /* this */

    fun addListener(
        event: TrayEvent.MOUSE_MOVE, listener: (
            event: KeyboardEvent,
            /**
             * The position of the event.
             */
            position: Point
        ) -> Unit
    ): Unit /* this */

    fun addListener(
        event: TrayEvent.MOUSE_UP, listener: (
            event: KeyboardEvent,
            /**
             * The position of the event.
             */
            position: Point
        ) -> Unit
    ): Unit /* this */

    fun addListener(
        event: TrayEvent.RIGHT_CLICK, listener: (
            event: KeyboardEvent,
            /**
             * The bounds of tray icon.
             */
            bounds: Rectangle
        ) -> Unit
    ): Unit /* this */

    fun removeListener(event: TrayEvent.BALLOON_CLICK, listener: Function<*>): Unit /* this */
    fun removeListener(event: TrayEvent.BALLOON_CLOSED, listener: Function<*>): Unit /* this */
    fun removeListener(event: TrayEvent.BALLOON_SHOW, listener: Function<*>): Unit /* this */
    fun removeListener(
        event: TrayEvent.CLICK, listener: (
            event: KeyboardEvent,
            /**
             * The bounds of tray icon.
             */
            bounds: Rectangle,
            /**
             * The position of the event.
             */
            position: Point
        ) -> Unit
    ): Unit /* this */

    fun removeListener(
        event: TrayEvent.DOUBLE_CLICK, listener: (
            event: KeyboardEvent,
            /**
             * The bounds of tray icon.
             */
            bounds: Rectangle
        ) -> Unit
    ): Unit /* this */

    fun removeListener(event: TrayEvent.DRAG_END, listener: Function<*>): Unit /* this */
    fun removeListener(event: TrayEvent.DRAG_ENTER, listener: Function<*>): Unit /* this */
    fun removeListener(event: TrayEvent.DRAG_LEAVE, listener: Function<*>): Unit /* this */
    fun removeListener(event: TrayEvent.DROP, listener: Function<*>): Unit /* this */
    fun removeListener(
        event: TrayEvent.DROP_FILES, listener: (
            event: Event,
            /**
             * The paths of the dropped files.
             */
            files: js.core.ReadonlyArray<String>
        ) -> Unit
    ): Unit /* this */

    fun removeListener(
        event: TrayEvent.DROP_TEXT, listener: (
            event: Event,
            /**
             * the dropped text string.
             */
            text: String
        ) -> Unit
    ): Unit /* this */

    fun removeListener(
        event: TrayEvent.MOUSE_DOWN, listener: (
            event: KeyboardEvent,
            /**
             * The position of the event.
             */
            position: Point
        ) -> Unit
    ): Unit /* this */

    fun removeListener(
        event: TrayEvent.MOUSE_ENTER, listener: (
            event: KeyboardEvent,
            /**
             * The position of the event.
             */
            position: Point
        ) -> Unit
    ): Unit /* this */

    fun removeListener(
        event: TrayEvent.MOUSE_LEAVE, listener: (
            event: KeyboardEvent,
            /**
             * The position of the event.
             */
            position: Point
        ) -> Unit
    ): Unit /* this */

    fun removeListener(
        event: TrayEvent.MOUSE_MOVE, listener: (
            event: KeyboardEvent,
            /**
             * The position of the event.
             */
            position: Point
        ) -> Unit
    ): Unit /* this */

    fun removeListener(
        event: TrayEvent.MOUSE_UP, listener: (
            event: KeyboardEvent,
            /**
             * The position of the event.
             */
            position: Point
        ) -> Unit
    ): Unit /* this */

    fun removeListener(
        event: TrayEvent.RIGHT_CLICK, listener: (
            event: KeyboardEvent,
            /**
             * The bounds of tray icon.
             */
            bounds: Rectangle
        ) -> Unit
    ): Unit /* this */

    /**
     * Tray
     */
    constructor (image: (NativeImage), guid: String = definedExternally)

    constructor (image: (String), guid: String = definedExternally)

    /**
     * Closes an open context menu, as set by `tray.setContextMenu()`.
     *
     * @platform darwin,win32
     */
    fun closeContextMenu(): Unit

    /**
     * Destroys the tray icon immediately.
     */
    fun destroy(): Unit

    /**
     * Displays a tray balloon.
     *
     * @platform win32
     */
    fun displayBalloon(options: DisplayBalloonOptions): Unit

    /**
     * Returns focus to the taskbar notification area. Notification area icons should
     * use this message when they have completed their UI operation. For example, if
     * the icon displays a shortcut menu, but the user presses ESC to cancel it, use
     * `tray.focus()` to return focus to the notification area.
     *
     * @platform win32
     */
    fun focus(): Unit

    /**
     * The `bounds` of this tray icon as `Object`.
     *
     * @platform darwin,win32
     */
    fun getBounds(): Rectangle

    /**
     * Whether double click events will be ignored.
     *
     * @platform darwin
     */
    fun getIgnoreDoubleClickEvents(): Boolean

    /**
     * the title displayed next to the tray icon in the status bar
     *
     * @platform darwin
     */
    fun getTitle(): String

    /**
     * Whether the tray icon is destroyed.
     */
    fun isDestroyed(): Boolean

    /**
     * Pops up the context menu of the tray icon. When `menu` is passed, the `menu`
     * will be shown instead of the tray icon's context menu.
     *
     * The `position` is only available on Windows, and it is (0, 0) by default.
     *
     * @platform darwin,win32
     */
    fun popUpContextMenu(menu: Menu = definedExternally, position: Point = definedExternally): Unit

    /**
     * Removes a tray balloon.
     *
     * @platform win32
     */
    fun removeBalloon(): Unit

    /**
     * Sets the context menu for this icon.
     */
    fun setContextMenu(menu: (Menu)): Unit

    fun setContextMenu(menu: (Nothing?)): Unit

    /**
     * Sets the option to ignore double click events. Ignoring these events allows you
     * to detect every individual click of the tray icon.
     *
     * This value is set to false by default.
     *
     * @platform darwin
     */
    fun setIgnoreDoubleClickEvents(ignore: Boolean): Unit

    /**
     * Sets the `image` associated with this tray icon.
     */
    fun setImage(image: (NativeImage)): Unit

    fun setImage(image: (String)): Unit

    /**
     * Sets the `image` associated with this tray icon when pressed on macOS.
     *
     * @platform darwin
     */
    fun setPressedImage(image: (NativeImage)): Unit

    fun setPressedImage(image: (String)): Unit

    /**
     * Sets the title displayed next to the tray icon in the status bar (Support ANSI
     * colors).
     *
     * @platform darwin
     */
    fun setTitle(title: String, options: TitleOptions = definedExternally): Unit

    /**
     * Sets the hover text for this tray icon.
     */
    fun setToolTip(toolTip: String): Unit
}

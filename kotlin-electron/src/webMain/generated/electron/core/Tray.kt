// Automatically generated - do not modify!

@file:JsModule("INTERNAL_ENTITY")

package electron.core

import electron.NativeImage
import node.events.EventEmitter as NodeEventEmitter

open external class Tray : NodeEventEmitter {
    /**
     * Tray
     */
    constructor (image: NativeImage, guid: String = definedExternally)

    /**
     * Tray
     */
    constructor (image: String, guid: String = definedExternally)

    /**
     * Closes an open context menu, as set by `tray.setContextMenu()`.
     *
     * @platform darwin,win32
     */
    fun closeContextMenu()

    /**
     * Destroys the tray icon immediately.
     */
    fun destroy()

    /**
     * Displays a tray balloon.
     *
     * @platform win32
     */
    fun displayBalloon(options: DisplayBalloonOptions)

    /**
     * Returns focus to the taskbar notification area. Notification area icons should
     * use this message when they have completed their UI operation. For example, if
     * the icon displays a shortcut menu, but the user presses ESC to cancel it, use
     * `tray.focus()` to return focus to the notification area.
     *
     * @platform win32
     */
    fun focus()

    /**
     * The `bounds` of this tray icon as `Object`.
     *
     * @platform darwin,win32
     */
    fun getBounds(): Rectangle

    /**
     * The GUID used to uniquely identify the tray icon and allow it to retain its
     * position between relaunches, or null if none is set.
     *
     * @platform darwin,win32
     */
    fun getGUID(): String?

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
    fun popUpContextMenu(
        menu: Menu = definedExternally,
        position: Point = definedExternally,
    )

    /**
     * Removes a tray balloon.
     *
     * @platform win32
     */
    fun removeBalloon()

    /**
     * Sets the context menu for this icon.
     */
    fun setContextMenu(menu: Menu?)

    /**
     * Sets the option to ignore double click events. Ignoring these events allows you
     * to detect every individual click of the tray icon.
     *
     * This value is set to false by default.
     *
     * @platform darwin
     */
    fun setIgnoreDoubleClickEvents(ignore: Boolean)

    /**
     * Sets the `image` associated with this tray icon.
     */
    fun setImage(image: NativeImage)

    /**
     * Sets the `image` associated with this tray icon.
     */
    fun setImage(image: String)

    /**
     * Sets the `image` associated with this tray icon when pressed on macOS.
     *
     * @platform darwin
     */
    fun setPressedImage(image: NativeImage)

    /**
     * Sets the `image` associated with this tray icon when pressed on macOS.
     *
     * @platform darwin
     */
    fun setPressedImage(image: String)

    /**
     * Sets the title displayed next to the tray icon in the status bar (Support ANSI
     * colors).
     *
     * @platform darwin
     */
    fun setTitle(
        title: String,
        options: TitleOptions = definedExternally,
    )

    /**
     * Sets the hover text for this tray icon. Setting the text to an empty string will
     * remove the tooltip.
     */
    fun setToolTip(toolTip: String)

    @web.events.JsEvent("balloon-click")
    val balloonClickEvent: node.events.EventInstance<js.array.Tuple>

    @web.events.JsEvent("balloon-closed")
    val balloonClosedEvent: node.events.EventInstance<js.array.Tuple>

    @web.events.JsEvent("balloon-show")
    val balloonShowEvent: node.events.EventInstance<js.array.Tuple>

    @web.events.JsEvent("click")
    val clickEvent: node.events.EventInstance<js.array.Tuple3<KeyboardEvent, Rectangle, Point>>

    @web.events.JsEvent("double-click")
    val doubleClickEvent: node.events.EventInstance<js.array.Tuple2<KeyboardEvent, Rectangle>>

    @web.events.JsEvent("drag-end")
    val dragEndEvent: node.events.EventInstance<js.array.Tuple>

    @web.events.JsEvent("drag-enter")
    val dragEnterEvent: node.events.EventInstance<js.array.Tuple>

    @web.events.JsEvent("drag-leave")
    val dragLeaveEvent: node.events.EventInstance<js.array.Tuple>

    @web.events.JsEvent("drop")
    val dropEvent: node.events.EventInstance<js.array.Tuple>

    @web.events.JsEvent("drop-files")
    val dropFilesEvent: node.events.EventInstance<js.array.Tuple2<Event<*>, js.array.ReadonlyArray<String>>>

    @web.events.JsEvent("drop-text")
    val dropTextEvent: node.events.EventInstance<js.array.Tuple2<Event<*>, String>>

    @web.events.JsEvent("middle-click")
    val middleClickEvent: node.events.EventInstance<js.array.Tuple2<KeyboardEvent, Rectangle>>

    @web.events.JsEvent("mouse-down")
    val mouseDownEvent: node.events.EventInstance<js.array.Tuple2<KeyboardEvent, Point>>

    @web.events.JsEvent("mouse-enter")
    val mouseEnterEvent: node.events.EventInstance<js.array.Tuple2<KeyboardEvent, Point>>

    @web.events.JsEvent("mouse-leave")
    val mouseLeaveEvent: node.events.EventInstance<js.array.Tuple2<KeyboardEvent, Point>>

    @web.events.JsEvent("mouse-move")
    val mouseMoveEvent: node.events.EventInstance<js.array.Tuple2<KeyboardEvent, Point>>

    @web.events.JsEvent("mouse-up")
    val mouseUpEvent: node.events.EventInstance<js.array.Tuple2<KeyboardEvent, Point>>

    @web.events.JsEvent("right-click")
    val rightClickEvent: node.events.EventInstance<js.array.Tuple2<KeyboardEvent, Rectangle>>
}

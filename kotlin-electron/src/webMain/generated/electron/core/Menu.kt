// Automatically generated - do not modify!

@file:JsModule("INTERNAL_ENTITY")

package electron.core

import node.events.EventEmitter as NodeEventEmitter

open external class Menu : NodeEventEmitter {
    /**
     * Menu
     */
    constructor ()

    /**
     * Appends the `menuItem` to the menu.
     */
    fun append(menuItem: MenuItem)

    /**
     * Closes the context menu in the `window`.
     */
    fun closePopup(window: BaseWindow = definedExternally)

    /**
     * the item with the specified `id`
     */
    fun getMenuItemById(id: String): MenuItem?

    /**
     * Inserts the `menuItem` to the `pos` position of the menu.
     */
    fun insert(
        pos: Double,
        menuItem: MenuItem,
    )

    /**
     * Pops up this menu as a context menu in the `BaseWindow`.
     *
     * > [!TIP] For more details, see the Context Menu guide.
     */
    fun popup(options: PopupOptions = definedExternally)

    /**
     * A `MenuItem[]` array containing the menu's items.
     *
     * Each `Menu` consists of multiple `MenuItem` instances and each `MenuItem` can
     * nest a `Menu` into its `submenu` property.
     */
    var items: js.array.ReadonlyArray<MenuItem>

    @web.events.JsEvent("menu-will-close")
    val menuWillCloseEvent: node.events.EventInstance<js.array.Tuple1<Event<*>>>

    @web.events.JsEvent("menu-will-show")
    val menuWillShowEvent: node.events.EventInstance<js.array.Tuple1<Event<*>>>

    companion object {
        /**
         * Generally, the `template` is an array of `options` for constructing a MenuItem.
         * The usage can be referenced above.
         *
         * You can also attach other fields to the element of the `template` and they will
         * become properties of the constructed menu items.
         */
        fun buildFromTemplate(
            template: js.array.ReadonlyArray<Any /* (MenuItemConstructorOptions) | (MenuItem) */>,
        ): Menu

        /**
         * The application menu, if set, or `null`, if not set.
         *
         * > [!NOTE] The returned `Menu` instance doesn't support dynamic addition or
         * removal of menu items. Instance properties can still be dynamically modified.
         */
        fun getApplicationMenu(): Menu?

        /**
         * Sends the `action` to the first responder of application. This is used for
         * emulating default macOS menu behaviors. Usually you would use the `role`
         * property of a `MenuItem`.
         *
         * See the macOS Cocoa Event Handling Guide for more information on macOS' native
         * actions.
         *
         * @platform darwin
         */
        fun sendActionToFirstResponder(action: String)

        /**
         * Sets `menu` as the application menu on macOS. On Windows and Linux, the `menu`
         * will be set as each window's top menu.
         *
         * On Linux, the menu bar uses GTK theme colors when GTK is available. If GTK
         * cannot initialize, it uses Chromium's built-in light or dark menu colors,
         * following `nativeTheme.shouldUseDarkColors`.
         *
         * Also on Windows and Linux, you can use a `&` in the top-level item name to
         * indicate which letter should get a generated accelerator. For example, using
         * `&File` for the file menu would result in a generated `Alt-F` accelerator that
         * opens the associated menu. The indicated character in the button label then gets
         * an underline, and the `&` character is not displayed on the button label.
         *
         * In order to escape the `&` character in an item name, add a preceding `&`. For
         * example, `&&File` would result in `&File` displayed on the button label.
         *
         * Passing `null` will suppress the default menu. On Windows and Linux, this has
         * the additional effect of removing the menu bar from the window.
         *
         * > [!NOTE] The default menu will be created automatically if the app does not set
         * one. It contains standard items such as `File`, `Edit`, `View`, and `Window`.
         */
        fun setApplicationMenu(menu: Menu?)

        /**
         * Sets the colors used to highlight the hovered or keyboard-focused item in every
         * menu the app shows, including context menus and the menu bar's dropdowns. Light
         * and dark colors are set separately, and any color left unset keeps the default
         * for that mode. Each call replaces the colors set by any previous call. Passing
         * `null` restores the defaults.
         *
         * Menus opened after the call use the new colors. The colors are not applied while
         * Windows high contrast mode or forced colors are active, so the user's system
         * colors take priority.
         *
         * This method has no effect on macOS and Linux.
         *
         * @platform win32
         */
        fun setHighlightColors(options: HighlightColorsOptions?)
    }
}

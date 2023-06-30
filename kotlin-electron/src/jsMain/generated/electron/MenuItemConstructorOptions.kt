package electron


external interface MenuItemConstructorOptions {
    /**
     * Will be called with `click(menuItem, browserWindow, event)` when the menu item
     * is clicked.
     */
    var click: (menuItem: MenuItem, browserWindow: Any /* (BrowserWindow) | (undefined) */, event: KeyboardEvent) -> Unit?

    /**
     * Can be `undo`, `redo`, `cut`, `copy`, `paste`, `pasteAndMatchStyle`, `delete`,
     * `selectAll`, `reload`, `forceReload`, `toggleDevTools`, `resetZoom`, `zoomIn`,
     * `zoomOut`, `toggleSpellChecker`, `togglefullscreen`, `window`, `minimize`,
     * `close`, `help`, `about`, `services`, `hide`, `hideOthers`, `unhide`, `quit`,
     * `showSubstitutions`, `toggleSmartQuotes`, `toggleSmartDashes`,
     * `toggleTextReplacement`, `startSpeaking`, `stopSpeaking`, `zoom`, `front`,
     * `appMenu`, `fileMenu`, `editMenu`, `viewMenu`, `shareMenu`, `recentDocuments`,
     * `toggleTabBar`, `selectNextTab`, `selectPreviousTab`, `mergeAllWindows`,
     * `clearRecentDocuments`, `moveTabToNewWindow` or `windowMenu` - Define the action
     * of the menu item, when specified the `click` property will be ignored. See
     * roles.
     */
    var role: (MenuItemConstructorOptionsRole)?

    /**
     * Can be `normal`, `separator`, `submenu`, `checkbox` or `radio`.
     */
    var type: (MenuItemConstructorOptionsType)?
    var label: String?
    var sublabel: String?

    /**
     * Hover text for this menu item.
     *
     * @platform darwin
     */
    var toolTip: String?
    var accelerator: Accelerator?
    var icon: Any /* (NativeImage) | (string) */?

    /**
     * If false, the menu item will be greyed out and unclickable.
     */
    var enabled: Boolean?

    /**
     * default is `true`, and when `false` will prevent the accelerator from triggering
     * the item if the item is not visible.
     *
     * @platform darwin
     */
    var acceleratorWorksWhenHidden: Boolean?

    /**
     * If false, the menu item will be entirely hidden.
     */
    var visible: Boolean?

    /**
     * Should only be specified for `checkbox` or `radio` type menu items.
     */
    var checked: Boolean?

    /**
     * If false, the accelerator won't be registered with the system, but it will still
     * be displayed. Defaults to true.
     *
     * @platform linux,win32
     */
    var registerAccelerator: Boolean?

    /**
     * The item to share when the `role` is `shareMenu`.
     *
     * @platform darwin
     */
    var sharingItem: SharingItem?

    /**
     * Should be specified for `submenu` type menu items. If `submenu` is specified,
     * the `type: 'submenu'` can be omitted. If the value is not a `Menu` then it will
     * be automatically converted to one using `Menu.buildFromTemplate`.
     */
    var submenu: Any /* (MenuItemConstructorOptions[]) | (Menu) */?

    /**
     * Unique within a single menu. If defined then it can be used as a reference to
     * this item by the position attribute.
     */
    var id: String?

    /**
     * Inserts this item before the item with the specified label. If the referenced
     * item doesn't exist the item will be inserted at the end of  the menu. Also
     * implies that the menu item in question should be placed in the same “group” as
     * the item.
     */
    var before: js.core.ReadonlyArray<String>?

    /**
     * Inserts this item after the item with the specified label. If the referenced
     * item doesn't exist the item will be inserted at the end of the menu.
     */
    var after: js.core.ReadonlyArray<String>?

    /**
     * Provides a means for a single context menu to declare the placement of their
     * containing group before the containing group of the item with the specified
     * label.
     */
    var beforeGroupContaining: js.core.ReadonlyArray<String>?

    /**
     * Provides a means for a single context menu to declare the placement of their
     * containing group after the containing group of the item with the specified
     * label.
     */
    var afterGroupContaining: js.core.ReadonlyArray<String>?
}

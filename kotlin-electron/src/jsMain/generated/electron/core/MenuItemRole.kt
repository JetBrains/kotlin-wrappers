package electron.core


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName(
    """(/*union*/{undo: 'undo', redo: 'redo', cut: 'cut', copy: 'copy', paste: 'paste', pasteAndMatchStyle: 'pasteAndMatchStyle', delete: 'delete', selectAll: 'selectAll', reload: 'reload', forceReload: 'forceReload', toggleDevTools: 'toggleDevTools', resetZoom: 'resetZoom', zoomIn: 'zoomIn', zoomOut: 'zoomOut', toggleSpellChecker: 'toggleSpellChecker', togglefullscreen: 'togglefullscreen', window: 'window', minimize: 'minimize', close: 'close', help: 'help', about: 'about', services: 'services', hide: 'hide', hideOthers: 'hideOthers', unhide: 'unhide', quit: 'quit', startSpeaking: 'startSpeaking', stopSpeaking: 'stopSpeaking', zoom: 'zoom', front: 'front', appMenu: 'appMenu', fileMenu: 'fileMenu', editMenu: 'editMenu', viewMenu: 'viewMenu', shareMenu: 'shareMenu', recentDocuments: 'recentDocuments', toggleTabBar: 'toggleTabBar', selectNextTab: 'selectNextTab', selectPreviousTab: 'selectPreviousTab', mergeAllWindows: 'mergeAllWindows', clearRecentDocuments: 'clearRecentDocuments', moveTabToNewWindow: 'moveTabToNewWindow', windowMenu: 'windowMenu'}/*union*/)"""
)
sealed external interface MenuItemRole {
    companion object {
        val undo: MenuItemRole
        val redo: MenuItemRole
        val cut: MenuItemRole
        val copy: MenuItemRole
        val paste: MenuItemRole
        val pasteAndMatchStyle: MenuItemRole
        val delete: MenuItemRole
        val selectAll: MenuItemRole
        val reload: MenuItemRole
        val forceReload: MenuItemRole
        val toggleDevTools: MenuItemRole
        val resetZoom: MenuItemRole
        val zoomIn: MenuItemRole
        val zoomOut: MenuItemRole
        val toggleSpellChecker: MenuItemRole
        val togglefullscreen: MenuItemRole
        val window: MenuItemRole
        val minimize: MenuItemRole
        val close: MenuItemRole
        val help: MenuItemRole
        val about: MenuItemRole
        val services: MenuItemRole
        val hide: MenuItemRole
        val hideOthers: MenuItemRole
        val unhide: MenuItemRole
        val quit: MenuItemRole
        val startSpeaking: MenuItemRole
        val stopSpeaking: MenuItemRole
        val zoom: MenuItemRole
        val front: MenuItemRole
        val appMenu: MenuItemRole
        val fileMenu: MenuItemRole
        val editMenu: MenuItemRole
        val viewMenu: MenuItemRole
        val shareMenu: MenuItemRole
        val recentDocuments: MenuItemRole
        val toggleTabBar: MenuItemRole
        val selectNextTab: MenuItemRole
        val selectPreviousTab: MenuItemRole
        val mergeAllWindows: MenuItemRole
        val clearRecentDocuments: MenuItemRole
        val moveTabToNewWindow: MenuItemRole
        val windowMenu: MenuItemRole
    }
}

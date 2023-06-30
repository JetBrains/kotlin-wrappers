@file:JsModule("electron/electron")

package electron

import node.events.EventEmitter as NodeEventEmitter


open external class ShareMenu : NodeEventEmitter {
// Docs: https://electronjs.org/docs/api/share-menu
    /**
     * ShareMenu
     */
    constructor (sharingItem: SharingItem)

    /**
     * Closes the context menu in the `browserWindow`.
     */
    fun closePopup(browserWindow: BrowserWindow = definedExternally): Unit

    /**
     * Pops up this menu as a context menu in the `BrowserWindow`.
     */
    fun popup(options: PopupOptions = definedExternally): Unit
}

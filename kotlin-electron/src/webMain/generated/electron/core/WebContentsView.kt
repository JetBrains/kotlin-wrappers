// Automatically generated - do not modify!

@file:JsModule("INTERNAL_ENTITY")

package electron.core

open external class WebContentsView : View {
    /**
     * WebContentsView
     */
    constructor (options: WebContentsViewConstructorOptions = definedExternally)
// Docs: https://electronjs.org/docs/api/web-contents-view
    /**
     * Emitted when the view's bounds have changed in response to being laid out. The
     * new bounds can be retrieved with `view.getBounds()`.
     */

    /**
     * A `WebContents` property containing a reference to the displayed `WebContents`.
     * Use this to interact with the `WebContents`, for instance to load a URL.
     *
     */
    val webContents: WebContents

    @web.events.JsEvent("bounds-changed")
    override val boundsChangedEvent: node.events.EventInstance<js.array.Tuple>
}

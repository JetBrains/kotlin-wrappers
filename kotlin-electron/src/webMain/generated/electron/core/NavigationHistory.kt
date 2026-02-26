// Automatically generated - do not modify!

@file:JsModule("INTERNAL_ENTITY")

package electron.core

external class NavigationHistory {
// Docs: https://electronjs.org/docs/api/navigation-history
    /**
     * Whether the browser can go back to previous web page.
     */
    fun canGoBack(): Boolean

    /**
     * Whether the browser can go forward to next web page.
     */
    fun canGoForward(): Boolean

    /**
     * Whether the web page can go to the specified relative `offset` from the current
     * entry.
     */
    fun canGoToOffset(offset: Double): Boolean

    /**
     * Clears the navigation history.
     */
    fun clear()

    /**
     * The index of the current page, from which we would go back/forward or reload.
     */
    fun getActiveIndex(): Double

    /**
     * WebContents complete history.
     */
    fun getAllEntries(): js.array.ReadonlyArray<NavigationEntry>

    /**
     * Navigation entry at the given index.
     *
     * If index is out of bounds (greater than history length or less than 0), null
     * will be returned.
     */
    fun getEntryAtIndex(index: Double): NavigationEntry

    /**
     * Makes the browser go back a web page.
     */
    fun goBack()

    /**
     * Makes the browser go forward a web page.
     */
    fun goForward()

    /**
     * Navigates browser to the specified absolute web page index.
     */
    fun goToIndex(index: Double)

    /**
     * Navigates to the specified relative offset from the current entry.
     */
    fun goToOffset(offset: Double)

    /**
     * History length.
     */
    fun length(): Double

    /**
     * Removes the navigation entry at the given index. Can't remove entry at the
     * "current active index".
     *
     * Whether the navigation entry was removed from the webContents history.
     */
    fun removeEntryAtIndex(index: Double): Boolean

    /**
     * the promise will resolve when the page has finished loading the selected
     * navigation entry (see `did-finish-load`), and rejects if the page fails to load
     * (see `did-fail-load`). A noop rejection handler is already attached, which
     * avoids unhandled rejection errors.
     */
    fun restore(options: RestoreOptions): js.promise.Promise<js.core.Void>
}

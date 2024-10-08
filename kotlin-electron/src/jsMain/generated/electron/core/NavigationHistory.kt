// Generated by Karakum - do not modify it manually!

@file:JsModule("INTERNAL_ENTITY")

package electron.core

external class NavigationHistory {
// Docs: https://electronjs.org/docs/api/navigation-history
    /**
     * The index of the current page, from which we would go back/forward or reload.
     */
    fun getActiveIndex(): Double

    /**
     * * `url` string - The URL of the navigation entry at the given index.
     * * `title` string - The page title of the navigation entry at the given index.
     *
     * If index is out of bounds (greater than history length or less than 0), null
     * will be returned.
     */
    fun getEntryAtIndex(index: Double): EntryAtIndex

    /**
     * History length.
     */
    fun length(): Double
}

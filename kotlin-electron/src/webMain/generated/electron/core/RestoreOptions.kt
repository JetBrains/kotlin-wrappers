// Automatically generated - do not modify!

package electron.core

external interface RestoreOptions {
    /**
     * Result of a prior `getAllEntries()` call
     */
    var entries: js.array.ReadonlyArray<NavigationEntry>

    /**
     * Index of the stack that should be loaded. If you set it to `0`, the webContents
     * will load the first (oldest) entry. If you leave it undefined, Electron will
     * automatically load the last (newest) entry.
     */
    var index: Double?
}

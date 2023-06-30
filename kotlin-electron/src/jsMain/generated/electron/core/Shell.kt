package electron.core

import kotlin.js.Promise


external interface Shell {
// Docs: https://electronjs.org/docs/api/shell
    /**
     * Play the beep sound.
     */
    fun beep(): Unit

    /**
     * Open the given external protocol URL in the desktop's default manner. (For
     * example, mailto: URLs in the user's default mail agent).
     */
    fun openExternal(url: String, options: OpenExternalOptions = definedExternally): Promise<Unit>

    /**
     * Resolves with a string containing the error message corresponding to the failure
     * if a failure occurred, otherwise "".
     *
     * Open the given file in the desktop's default manner.
     */
    fun openPath(path: String): Promise<String>

    /**
     * Resolves the shortcut link at `shortcutPath`.
     *
     * An exception will be thrown when any error happens.
     *
     * @platform win32
     */
    fun readShortcutLink(shortcutPath: String): ShortcutDetails

    /**
     * Show the given file in a file manager. If possible, select the file.
     */
    fun showItemInFolder(fullPath: String): Unit

    /**
     * Resolves when the operation has been completed. Rejects if there was an error
     * while deleting the requested item.
     *
     * This moves a path to the OS-specific trash location (Trash on macOS, Recycle Bin
     * on Windows, and a desktop-environment-specific location on Linux).
     */
    fun trashItem(path: String): Promise<Unit>

    /**
     * Whether the shortcut was created successfully.
     *
     * Creates or updates a shortcut link at `shortcutPath`.
     *
     * @platform win32
     */
    fun writeShortcutLink(shortcutPath: String, operation: ShellWriteShortcutLinkOperation, options: ShortcutDetails): Boolean

    /**
     * Whether the shortcut was created successfully.
     *
     * Creates or updates a shortcut link at `shortcutPath`.
     *
     * @platform win32
     */
    fun writeShortcutLink(shortcutPath: String, options: ShortcutDetails): Boolean
}

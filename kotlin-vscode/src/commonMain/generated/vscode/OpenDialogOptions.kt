// Automatically generated - do not modify!

package vscode

import js.array.ReadonlyArray
import js.core.JsString
import js.objects.Record

/**
 * Options to configure the behaviour of a file open dialog.
 *
 * * Note 1: On Windows and Linux, a file dialog cannot be both a file selector and a folder selector, so if you
 * set both `canSelectFiles` and `canSelectFolders` to `true` on these platforms, a folder selector will be shown.
 * * Note 2: Explicitly setting `canSelectFiles` and `canSelectFolders` to `false` is futile
 * and the editor then silently adjusts the options to select files.
 */
external interface OpenDialogOptions {
    /**
     * The resource the dialog shows when opened.
     */
    var defaultUri: Uri?

    /**
     * A human-readable string for the open button.
     */
    var openLabel: String?

    /**
     * Allow to select files, defaults to `true`.
     */
    var canSelectFiles: Boolean?

    /**
     * Allow to select folders, defaults to `false`.
     */
    var canSelectFolders: Boolean?

    /**
     * Allow to select many files or folders.
     */
    var canSelectMany: Boolean?

    /**
     * A set of file filters that are used by the dialog. Each entry is a human-readable label,
     * like "TypeScript", and an array of extensions, for example:
     * ```ts
     * {
     * 	'Images': ['png', 'jpg'],
     * 	'TypeScript': ['ts', 'tsx']
     * }
     * ```
     */
    var filters: Record<JsString, ReadonlyArray<JsString>>?

    /**
     * Dialog title.
     *
     * This parameter might be ignored, as not all operating systems display a title on open dialogs
     * (for example, macOS).
     */
    var title: String?
}

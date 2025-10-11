// Automatically generated - do not modify!

package vscode

import js.array.ReadonlyArray
import js.objects.JsPlainObject
import js.objects.ReadonlyRecord
import kotlin.js.JsString

/**
 * Options to configure the behaviour of a file open dialog.
 *
 * * Note 1: On Windows and Linux, a file dialog cannot be both a file selector and a folder selector, so if you
 * set both `canSelectFiles` and `canSelectFolders` to `true` on these platforms, a folder selector will be shown.
 * * Note 2: Explicitly setting `canSelectFiles` and `canSelectFolders` to `false` is futile
 * and the editor then silently adjusts the options to select files.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#OpenDialogOptions)
 */
@JsPlainObject
external interface OpenDialogOptions {
    /**
     * The resource the dialog shows when opened.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#OpenDialogOptions.defaultUri)
     */
    var defaultUri: Uri?

    /**
     * A human-readable string for the open button.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#OpenDialogOptions.openLabel)
     */
    var openLabel: String?

    /**
     * Allow to select files, defaults to `true`.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#OpenDialogOptions.canSelectFiles)
     */
    var canSelectFiles: Boolean?

    /**
     * Allow to select folders, defaults to `false`.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#OpenDialogOptions.canSelectFolders)
     */
    var canSelectFolders: Boolean?

    /**
     * Allow to select many files or folders.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#OpenDialogOptions.canSelectMany)
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
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#OpenDialogOptions.filters)
     */
    var filters: ReadonlyRecord<JsString, ReadonlyArray<JsString>>?

    /**
     * Dialog title.
     *
     * This parameter might be ignored, as not all operating systems display a title on open dialogs
     * (for example, macOS).
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#OpenDialogOptions.title)
     */
    var title: String?
}

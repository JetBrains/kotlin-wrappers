// Automatically generated - do not modify!

package vscode

import js.array.ReadonlyArray
import js.objects.JsPlainObject
import js.objects.ReadonlyRecord
import kotlin.js.JsString

/**
 * Options to configure the behaviour of a file save dialog.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#SaveDialogOptions)
 */
@JsPlainObject
external interface SaveDialogOptions {
    /**
     * The resource the dialog shows when opened.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#SaveDialogOptions.defaultUri)
     */
    var defaultUri: Uri?

    /**
     * A human-readable string for the save button.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#SaveDialogOptions.saveLabel)
     */
    var saveLabel: String?

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
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#SaveDialogOptions.filters)
     */
    var filters: ReadonlyRecord<JsString, ReadonlyArray<JsString>>?

    /**
     * Dialog title.
     *
     * This parameter might be ignored, as not all operating systems display a title on save dialogs
     * (for example, macOS).
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#SaveDialogOptions.title)
     */
    var title: String?
}

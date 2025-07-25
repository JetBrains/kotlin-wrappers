// Automatically generated - do not modify!

package vscode

import js.core.JsAny
import js.promise.PromiseLike
import kotlin.js.JsName

/**
 * Represents an extension.
 *
 * To get an instance of an `Extension` use [getExtension][extensions.getExtension].
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#Extension)
 */
external interface Extension<T : JsAny?> {
    /**
     * The canonical extension identifier in the form of: `publisher.name`.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#Extension.id)
     */
    val id: String

    /**
     * The uri of the directory containing the extension.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#Extension.extensionUri)
     */
    val extensionUri: Uri

    /**
     * The absolute file path of the directory containing this extension. Shorthand
     * notation for [Extension.extensionUri.fsPath][Extension.extensionUri] (independent of the uri scheme).
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#Extension.extensionPath)
     */
    val extensionPath: String

    /**
     * `true` if the extension has been activated.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#Extension.isActive)
     */
    val isActive: Boolean

    /**
     * The parsed contents of the extension's package.json.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#Extension.packageJSON)
     */
    val packageJSON: JsAny?

    /**
     * The extension kind describes if an extension runs where the UI runs
     * or if an extension runs where the remote extension host runs. The extension kind
     * is defined in the `package.json`-file of extensions but can also be refined
     * via the `remote.extensionKind`-setting. When no remote extension host exists,
     * the value is {@linkcode ExtensionKind.UI}.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#Extension.extensionKind)
     */
    var extensionKind: ExtensionKind

    /**
     * The public API exported by this extension (return value of `activate`).
     * It is an invalid action to access this field before this extension has been activated.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#Extension.exports)
     */
    val exports: T

    /**
     * Activates this extension and returns its public API.
     *
     * @returns A promise that will resolve when this extension has been activated.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#Extension.activate)
     */
    @JsName("activate")
    fun activateAsync(): PromiseLike<T>
}

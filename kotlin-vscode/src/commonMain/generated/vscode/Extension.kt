// Automatically generated - do not modify!

package vscode

/**
 * Represents an extension.
 *
 * To get an instance of an `Extension` use {@link extensions.getExtension getExtension}.
 */
external interface Extension<T> {
    /**
     * The canonical extension identifier in the form of: `publisher.name`.
     */
    val id: String

    /**
     * The uri of the directory containing the extension.
     */
    val extensionUri: Uri

    /**
     * The absolute file path of the directory containing this extension. Shorthand
     * notation for {@link Extension.extensionUri Extension.extensionUri.fsPath} (independent of the uri scheme).
     */
    val extensionPath: String

    /**
     * `true` if the extension has been activated.
     */
    val isActive: Boolean

    /**
     * The parsed contents of the extension's package.json.
     */
    val packageJSON: Any?

    /**
     * The extension kind describes if an extension runs where the UI runs
     * or if an extension runs where the remote extension host runs. The extension kind
     * is defined in the `package.json`-file of extensions but can also be refined
     * via the `remote.extensionKind`-setting. When no remote extension host exists,
     * the value is {@linkcode ExtensionKind.UI}.
     */
//  extensionKind: ExtensionKind;

    /**
     * The public API exported by this extension (return value of `activate`).
     * It is an invalid action to access this field before this extension has been activated.
     */
    val exports: T

    /**
     * Activates this extension and returns its public API.
     *
     * @returns A promise that will resolve when this extension has been activated.
     */
//  activate(): Thenable<T>;
}

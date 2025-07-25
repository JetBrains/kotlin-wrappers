// Automatically generated - do not modify!

package vscode

import js.core.Void

/**
 * A uri handler is responsible for handling system-wide [uris][Uri].
 *
 * @see [window.registerUriHandler].
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#UriHandler)
 */
external interface UriHandler {
    /**
     * Handle the provided system-wide [Uri].
     *
     * @see [window.registerUriHandler].
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#UriHandler.handleUri)
     */
    fun handleUri(uri: Uri): ProviderResult<Void>
}

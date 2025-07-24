// Automatically generated - do not modify!

package vscode

import js.core.Void

/**
 * A uri handler is responsible for handling system-wide [uris][Uri].
 *
 * @see [window.registerUriHandler].
 */
external interface UriHandler {
    /**
     * Handle the provided system-wide [Uri].
     *
     * @see [window.registerUriHandler].
     */
    fun handleUri(uri: Uri): ProviderResult<Void>
}

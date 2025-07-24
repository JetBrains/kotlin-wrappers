// Automatically generated - do not modify!

package vscode

import js.core.Void

/**
 * A uri handler is responsible for handling system-wide {@link Uri uris}.
 *
 * @see {@link window.registerUriHandler}.
 */
external interface UriHandler {
    /**
     * Handle the provided system-wide [Uri].
     *
     * @see {@link window.registerUriHandler}.
     */
    fun handleUri(uri: Uri): ProviderResult<Void>
}

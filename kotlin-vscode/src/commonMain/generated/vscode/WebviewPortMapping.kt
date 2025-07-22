// Automatically generated - do not modify!

package vscode

/**
 * Defines a port mapping used for localhost inside the webview.
 */
external interface WebviewPortMapping {
    /**
     * Localhost port to remap inside the webview.
     */
    val webviewPort: Int

    /**
     * Destination port. The `webviewPort` is resolved to this port.
     */
    val extensionHostPort: Int
}

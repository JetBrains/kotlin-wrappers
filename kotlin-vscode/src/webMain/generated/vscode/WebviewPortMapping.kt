// Automatically generated - do not modify!

package vscode

import kotlinx.js.JsPlainObject

/**
 * Defines a port mapping used for localhost inside the webview.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#WebviewPortMapping)
 */
@JsPlainObject
external interface WebviewPortMapping {
    /**
     * Localhost port to remap inside the webview.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#WebviewPortMapping.webviewPort)
     */
    val webviewPort: Int

    /**
     * Destination port. The `webviewPort` is resolved to this port.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#WebviewPortMapping.extensionHostPort)
     */
    val extensionHostPort: Int
}

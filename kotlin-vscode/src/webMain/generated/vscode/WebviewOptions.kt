// Automatically generated - do not modify!

package vscode

import js.array.ReadonlyArray
import js.objects.JsPlainObject
import kotlin.js.JsAny

/**
 * Content settings for a webview.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#WebviewOptions)
 */
@JsPlainObject
external interface WebviewOptions {
    /**
     * Controls whether scripts are enabled in the webview content or not.
     *
     * Defaults to false (scripts-disabled).
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#WebviewOptions.enableScripts)
     */
    val enableScripts: Boolean?

    /**
     * Controls whether forms are enabled in the webview content or not.
     *
     * Defaults to true if [scripts are enabled][WebviewOptions.enableScripts]. Otherwise defaults to false.
     * Explicitly setting this property to either true or false overrides the default.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#WebviewOptions.enableForms)
     */
    val enableForms: Boolean?

    /**
     * Controls whether command uris are enabled in webview content or not.
     *
     * Defaults to `false` (command uris are disabled).
     *
     * If you pass in an array, only the commands in the array are allowed.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#WebviewOptions.enableCommandUris)
     */
    val enableCommandUris: JsAny /* boolean | readonly string[] */?

    /**
     * Root paths from which the webview can load local (filesystem) resources using uris from `asWebviewUri`
     *
     * Default to the root folders of the current workspace plus the extension's install directory.
     *
     * Pass in an empty array to disallow access to any local resources.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#WebviewOptions.localResourceRoots)
     */
    val localResourceRoots: ReadonlyArray<Uri>?

    /**
     * Mappings of localhost ports used inside the webview.
     *
     * Port mapping allow webviews to transparently define how localhost ports are resolved. This can be used
     * to allow using a static localhost port inside the webview that is resolved to random port that a service is
     * running on.
     *
     * If a webview accesses localhost content, we recommend that you specify port mappings even if
     * the `webviewPort` and `extensionHostPort` ports are the same.
     *
     * *Note* that port mappings only work for `http` or `https` urls. Websocket urls (e.g. `ws://localhost:3000`)
     * cannot be mapped to another port.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#WebviewOptions.portMapping)
     */
    val portMapping: ReadonlyArray<WebviewPortMapping>?
}

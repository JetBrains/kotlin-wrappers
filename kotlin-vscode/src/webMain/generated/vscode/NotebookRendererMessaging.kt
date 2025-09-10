// Automatically generated - do not modify!

package vscode

import js.core.JsBoolean
import js.promise.PromiseLike
import kotlin.js.JsAny
import kotlin.js.definedExternally

/**
 * Renderer messaging is used to communicate with a single renderer. It's returned from [notebooks.createRendererMessaging].
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookRendererMessaging)
 */
external interface NotebookRendererMessaging {
    /**
     * An event that fires when a message is received from a renderer.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookRendererMessaging.onDidReceiveMessage)
     */
    /*
    readonly onDidReceiveMessage: Event<{
        /**
         * The {@link NotebookEditor editor} that sent the message.
         */
        readonly editor: NotebookEditor;
        /**
         * The actual message.
         */
        readonly message: any;
    }>
    */

    /**
     * Send a message to one or all renderer.
     *
     * @param message Message to send
     * @param editor Editor to target with the message. If not provided, the
     * message is sent to all renderers.
     * @returns a boolean indicating whether the message was successfully
     * delivered to any renderer.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookRendererMessaging.postMessage)
     */
    fun postMessage(
        message: JsAny?,
        editor: NotebookEditor = definedExternally,
    ): PromiseLike<JsBoolean>
}

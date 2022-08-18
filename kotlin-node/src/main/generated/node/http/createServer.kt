// Automatically generated - do not modify!

@file:JsModule("node:http")
@file:JsNonModule

package node.http

/**
 * Returns a new instance of {@link Server}.
 *
 * The `requestListener` is a function which is automatically
 * added to the `'request'` event.
 * @since v0.1.13
 */
external fun createServer(
    requestListener: RequestListener = definedExternally,
): Server

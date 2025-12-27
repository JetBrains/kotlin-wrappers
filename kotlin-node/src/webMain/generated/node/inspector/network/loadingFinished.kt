// Automatically generated - do not modify!

@file:JsModule("node:inspector")
@file:JsQualifier("Network")

package node.inspector.network

/**
 * This feature is only available with the `--experimental-network-inspection` flag enabled.
 *
 * Broadcasts the `Network.loadingFinished` event to connected frontends. This event indicates that
 * HTTP request has finished loading.
 * @since v22.6.0
 */
external fun loadingFinished(params: LoadingFinishedEventDataType)

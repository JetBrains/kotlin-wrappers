// Automatically generated - do not modify!

package node.crypto

sealed external interface ECKeyPairKeyObjectOptions {
    /**
     * Name of the curve to use
     */
    var namedCurve: String

    /**
     * Must be `'named'` or `'explicit'`. Default: `'named'`.
     */
    var paramEncoding: ECKeyPairKeyObjectOptionsParamEncoding?
}

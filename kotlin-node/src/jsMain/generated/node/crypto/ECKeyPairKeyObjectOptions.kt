package node.crypto


sealed external interface ECKeyPairKeyObjectOptions {
    /**
     * Name of the curve to use
     */
    var namedCurve: String
}

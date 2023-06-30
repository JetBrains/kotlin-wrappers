package electron.core


external interface BluetoothPairingHandlerHandlerDetails {
    var deviceId: String

    /**
     * The type of pairing prompt being requested. One of the following values:
     */
    var pairingKind: (BluetoothPairingHandlerHandlerDetailsPairingKind)
    var frame: WebFrameMain

    /**
     * The pin value to verify if `pairingKind` is `confirmPin`.
     */
    var pin: String?
}

package electron


external interface Response {
    /**
     * `false` should be passed in if the dialog is canceled. If the `pairingKind` is
     * `confirm` or `confirmPin`, this value should indicate if the pairing is
     * confirmed.  If the `pairingKind` is `providePin` the value should be `true` when
     * a value is provided.
     */
    var confirmed: Boolean

    /**
     * When the `pairingKind` is `providePin` this value should be the required pin for
     * the Bluetooth device.
     */
    var pin: Any /* (string) | (null) */
}

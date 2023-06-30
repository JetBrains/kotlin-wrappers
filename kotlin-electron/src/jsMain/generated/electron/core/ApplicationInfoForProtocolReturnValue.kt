package electron.core


external interface ApplicationInfoForProtocolReturnValue {
    /**
     * the display icon of the app handling the protocol.
     */
    var icon: NativeImage

    /**
     * installation path of the app handling the protocol.
     */
    var path: String

    /**
     * display name of the app handling the protocol.
     */
    var name: String
}

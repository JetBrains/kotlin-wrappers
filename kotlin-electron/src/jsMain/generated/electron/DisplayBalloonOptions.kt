package electron


external interface DisplayBalloonOptions {
    /**
     * Icon to use when `iconType` is `custom`.
     */
    var icon: Any /* (NativeImage) | (string) */?

    /**
     * Can be `none`, `info`, `warning`, `error` or `custom`. Default is `custom`.
     */
    var iconType: (DisplayBalloonOptionsIconType)?
    var title: String
    var content: String

    /**
     * The large version of the icon should be used. Default is `true`. Maps to
     * `NIIF_LARGE_ICON`.
     */
    var largeIcon: Boolean?

    /**
     * Do not play the associated sound. Default is `false`. Maps to `NIIF_NOSOUND`.
     */
    var noSound: Boolean?

    /**
     * Do not display the balloon notification if the current user is in "quiet time".
     * Default is `false`. Maps to `NIIF_RESPECT_QUIET_TIME`.
     */
    var respectQuietTime: Boolean?
}

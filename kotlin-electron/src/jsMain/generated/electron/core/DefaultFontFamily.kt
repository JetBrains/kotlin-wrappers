package electron.core


external interface DefaultFontFamily {
    /**
     * Defaults to `Times New Roman`.
     */
    var standard: String?

    /**
     * Defaults to `Times New Roman`.
     */
    var serif: String?

    /**
     * Defaults to `Arial`.
     */
    var sansSerif: String?

    /**
     * Defaults to `Courier New`.
     */
    var monospace: String?

    /**
     * Defaults to `Script`.
     */
    var cursive: String?

    /**
     * Defaults to `Impact`.
     */
    var fantasy: String?
}

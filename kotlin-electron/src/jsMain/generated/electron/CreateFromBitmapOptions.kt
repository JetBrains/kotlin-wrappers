package electron


external interface CreateFromBitmapOptions {
    var width: Double
    var height: Double

    /**
     * Defaults to 1.0.
     */
    var scaleFactor: Double?
}

package electron


external interface Data {
    var text: String?
    var html: String?
    var image: NativeImage?
    var rtf: String?

    /**
     * The title of the URL at `text`.
     */
    var bookmark: String?
}

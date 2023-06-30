package electron.core


external interface Video {
    /**
     * The id of the stream being granted. This will usually come from a
     * DesktopCapturerSource object.
     */
    var id: String

    /**
     * The name of the stream being granted. This will usually come from a
     * DesktopCapturerSource object.
     */
    var name: String
}

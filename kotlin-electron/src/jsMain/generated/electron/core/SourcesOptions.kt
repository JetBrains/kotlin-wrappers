package electron.core


external interface SourcesOptions {
    /**
     * An array of strings that lists the types of desktop sources to be captured,
     * available types are `screen` and `window`.
     */
    var types: js.core.ReadonlyArray<String>

    /**
     * The size that the media source thumbnail should be scaled to. Default is `150` x
     * `150`. Set width or height to 0 when you do not need the thumbnails. This will
     * save the processing time required for capturing the content of each window and
     * screen.
     */
    var thumbnailSize: Size?

    /**
     * Set to true to enable fetching window icons. The default value is false. When
     * false the appIcon property of the sources return null. Same if a source has the
     * type screen.
     */
    var fetchWindowIcons: Boolean?
}

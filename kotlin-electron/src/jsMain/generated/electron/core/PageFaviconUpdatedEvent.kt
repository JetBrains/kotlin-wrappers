package electron.core


external interface PageFaviconUpdatedEvent : Event {
    /**
     * Array of URLs.
     */
    var favicons: js.core.ReadonlyArray<String>
}

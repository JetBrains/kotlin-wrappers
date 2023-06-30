package electron


external interface DidFrameNavigateEvent : Event {
    var url: String

    /**
     * -1 for non HTTP navigations
     */
    var httpResponseCode: Double

    /**
     * empty for non HTTP navigations,
     */
    var httpStatusText: String
    var isMainFrame: Boolean
    var frameProcessId: Double
    var frameRoutingId: Double
}

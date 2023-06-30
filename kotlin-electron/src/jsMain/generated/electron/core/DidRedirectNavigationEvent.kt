package electron.core


external interface DidRedirectNavigationEvent : Event {
    var url: String
    var isInPlace: Boolean
    var isMainFrame: Boolean
    var frameProcessId: Double
    var frameRoutingId: Double
}

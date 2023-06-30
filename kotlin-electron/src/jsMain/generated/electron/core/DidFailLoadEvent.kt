package electron.core


external interface DidFailLoadEvent : Event {
    var errorCode: Double
    var errorDescription: String
    var validatedURL: String
    var isMainFrame: Boolean
}

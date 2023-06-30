package electron.core


external interface DidNavigateInPageEvent : Event {
    var isMainFrame: Boolean
    var url: String
}

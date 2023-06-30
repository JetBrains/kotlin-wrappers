package electron


external interface DidNavigateInPageEvent : Event {
    var isMainFrame: Boolean
    var url: String
}

package electron


external interface LoadCommitEvent : Event {
    var url: String
    var isMainFrame: Boolean
}

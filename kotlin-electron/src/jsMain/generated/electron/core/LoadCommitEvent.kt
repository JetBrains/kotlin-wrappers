package electron.core


external interface LoadCommitEvent : Event {
    var url: String
    var isMainFrame: Boolean
}

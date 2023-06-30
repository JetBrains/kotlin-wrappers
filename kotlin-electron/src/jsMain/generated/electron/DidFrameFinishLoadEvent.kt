package electron


external interface DidFrameFinishLoadEvent : Event {
    var isMainFrame: Boolean
}

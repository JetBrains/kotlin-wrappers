package electron.core


external interface DidFrameFinishLoadEvent : Event {
    var isMainFrame: Boolean
}

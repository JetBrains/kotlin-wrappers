package electron.core


external interface PageTitleUpdatedEvent : Event {
    var title: String
    var explicitSet: Boolean
}

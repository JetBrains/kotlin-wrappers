package electron


external interface PageTitleUpdatedEvent : Event {
    var title: String
    var explicitSet: Boolean
}

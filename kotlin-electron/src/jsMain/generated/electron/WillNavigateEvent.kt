package electron


external interface WillNavigateEvent : Event {
    var url: String
}

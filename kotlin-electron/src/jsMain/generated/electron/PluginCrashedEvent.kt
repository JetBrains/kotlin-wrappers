package electron


external interface PluginCrashedEvent : Event {
    var name: String
    var version: String
}

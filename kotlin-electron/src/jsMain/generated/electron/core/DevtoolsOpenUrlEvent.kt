package electron.core


external interface DevtoolsOpenUrlEvent : Event {
    /**
     * URL of the link that was clicked or selected.
     */
    var url: String
}

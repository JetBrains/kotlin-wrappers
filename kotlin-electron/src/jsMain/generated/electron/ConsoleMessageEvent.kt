package electron


external interface ConsoleMessageEvent : Event {
    /**
     * The log level, from 0 to 3. In order it matches `verbose`, `info`, `warning` and
     * `error`.
     */
    var level: Double

    /**
     * The actual console message
     */
    var message: String

    /**
     * The line number of the source that triggered this console message
     */
    var line: Double
    var sourceId: String
}

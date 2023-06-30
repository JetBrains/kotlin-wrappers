package electron.core


external interface MessageDetails {
    /**
     * The actual console message
     */
    var message: String

    /**
     * The version ID of the service worker that sent the log message
     */
    var versionId: Double

    /**
     * The type of source for this message.  Can be `javascript`, `xml`, `network`,
     * `console-api`, `storage`, `rendering`, `security`, `deprecation`, `worker`,
     * `violation`, `intervention`, `recommendation` or `other`.
     */
    var source: (MessageDetailsSource)

    /**
     * The log level, from 0 to 3. In order it matches `verbose`, `info`, `warning` and
     * `error`.
     */
    var level: Double

    /**
     * The URL the message came from
     */
    var sourceUrl: String

    /**
     * The line number of the source that triggered this console message
     */
    var lineNumber: Double
}

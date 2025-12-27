// Automatically generated - do not modify!

package electron.core

external interface WebContentsConsoleMessageEventParams {
    /**
     * Message text
     */
    var message: String

    /**
     * Message severity Possible values include `info`, `warning`, `error`, and
     * `debug`.
     */
    var level: (WebContentsConsoleMessageEventParamsLevel)

    /**
     * Line number in the log source
     */
    var lineNumber: Double

    /**
     * URL of the log source
     */
    var sourceId: String

    /**
     * Frame that logged the message
     */
    var frame: WebFrameMain
}

package node.readline


sealed external interface ReadLineOptions {
    var input: node.ReadableStream
    var output: node.WritableStream?
    var completer: Any? /* Completer | AsyncCompleter | undefined */
    var terminal: Boolean?

    /**
     *  Initial list of history lines. This option makes sense
     * only if `terminal` is set to `true` by the user or by an internal `output`
     * check, otherwise the history caching mechanism is not initialized at all.
     * @default []
     */
    var history: js.core.ReadonlyArray<String>?
    var historySize: Double?
    var prompt: String?
    var crlfDelay: Double?

    /**
     * If `true`, when a new input line added
     * to the history list duplicates an older one, this removes the older line
     * from the list.
     * @default false
     */
    var removeHistoryDuplicates: Boolean?
    var escapeCodeTimeout: Double?
    var tabSize: Double?
}

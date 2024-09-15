package vercel.ncc

external interface NccWatchResult {
    /**
     * handler re-run on each build completion
     * watch errors are reported on "err"
     */
    fun handler(handler: (NccBuildResult) -> Unit)

    /**
     * handler re-run on each rebuild start
     */
    fun rebuild(handler: () -> Unit)

    /**
     * close the watcher
     */
    fun close()
}

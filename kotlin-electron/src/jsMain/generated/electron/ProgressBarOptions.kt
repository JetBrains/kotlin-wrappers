package electron


external interface ProgressBarOptions {
    /**
     * Mode for the progress bar. Can be `none`, `normal`, `indeterminate`, `error` or
     * `paused`.
     *
     * @platform win32
     */
    var mode: (ProgressBarOptionsMode)
}

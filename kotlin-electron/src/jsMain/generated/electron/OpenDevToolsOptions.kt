package electron


external interface OpenDevToolsOptions {
    /**
     * Opens the devtools with specified dock state, can be `left`, `right`, `bottom`,
     * `undocked`, `detach`. Defaults to last used dock state. In `undocked` mode it's
     * possible to dock back. In `detach` mode it's not.
     */
    var mode: (OpenDevToolsOptionsMode)

    /**
     * Whether to bring the opened devtools window to the foreground. The default is
     * `true`.
     */
    var activate: Boolean?
}

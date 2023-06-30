package electron.core


external interface CloseOpts {
    /**
     * if true, fire the `beforeunload` event before closing the page. If the page
     * prevents the unload, the WebContents will not be closed. The
     * `will-prevent-unload` will be fired if the page requests prevention of unload.
     */
    var waitForBeforeUnload: Boolean
}

package electron.core


external interface Privileges {
    /**
     * Default false.
     */
    var standard: Boolean?

    /**
     * Default false.
     */
    var secure: Boolean?

    /**
     * Default false.
     */
    var bypassCSP: Boolean?

    /**
     * Default false.
     */
    var allowServiceWorkers: Boolean?

    /**
     * Default false.
     */
    var supportFetchAPI: Boolean?

    /**
     * Default false.
     */
    var corsEnabled: Boolean?

    /**
     * Default false.
     */
    var stream: Boolean?
}

package electron.core


external interface ClearCodeCachesOptions {
    /**
     * An array of url corresponding to the resource whose generated code cache needs
     * to be removed. If the list is empty then all entries in the cache directory will
     * be removed.
     */
    var urls: js.core.ReadonlyArray<String>?
}

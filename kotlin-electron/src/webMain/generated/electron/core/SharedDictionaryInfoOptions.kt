// Automatically generated - do not modify!

package electron.core

external interface SharedDictionaryInfoOptions {
    /**
     * The origin of the frame where the request originates. It’s specific to the
     * individual frame making the request and is defined by its scheme, host, and
     * port. In practice, will look like a URL.
     */
    var frameOrigin: String

    /**
     * The site of the top-level browsing context (the main frame or tab that contains
     * the request). It’s less granular than `frameOrigin` and focuses on the broader
     * "site" scope. In practice, will look like a URL.
     */
    var topFrameSite: String
}

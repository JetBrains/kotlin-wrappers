// Automatically generated - do not modify!

package electron.core

external interface FeedURLOptions {
    /**
     * The update server URL. For _Windows_ MSIX, this can be either a direct link to
     * an MSIX file (e.g., `https://example.com/update.msix`) or a JSON endpoint that
     * returns update information (see the Squirrel.Mac README for more information).
     */
    var url: String

    /**
     * HTTP request headers.
     *
     * @platform darwin
     */
    var headers: js.objects.ReadonlyRecord<String, String>?

    /**
     * Can be `json` or `default`, see the Squirrel.Mac README for more information.
     *
     * @platform darwin
     */
    var serverType: (FeedURLOptionsServerType)?

    /**
     * If `true`, allows downgrades to older versions for MSIX packages. Defaults to
     * `false`.
     *
     * @platform win32
     */
    var allowAnyVersion: Boolean?
}

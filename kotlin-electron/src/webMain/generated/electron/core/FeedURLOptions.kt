// Automatically generated - do not modify!

package electron.core

external interface FeedURLOptions {
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
}

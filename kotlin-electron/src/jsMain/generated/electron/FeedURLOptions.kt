package electron


external interface FeedURLOptions {
    var url: String

    /**
     * HTTP request headers.
     *
     * @platform darwin
     */
    var headers: js.core.ReadonlyRecord<String, String>?

    /**
     * Can be `json` or `default`, see the Squirrel.Mac README for more information.
     *
     * @platform darwin
     */
    var serverType: (FeedURLOptionsServerType)?
}

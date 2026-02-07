package tanstack.router.core

import kotlinx.js.JsPlainObject

@JsPlainObject
external interface LocationRewrite {
    /**
     * A function that will be called to rewrite the URL before it is interpreted by the router from the history instance.
     *
     * `default` - `undefined`
     */
    val input: LocationRewriteFunction?

    /**
     * A function that will be called to rewrite the URL before it is committed to the actual history instance from the router.
     *
     * `default` - `undefined`
     */
    val output: LocationRewriteFunction?
}

// Automatically generated - do not modify!

package electron.core

@kotlinx.js.JsPlainObject
external interface ProtocolRoute {
// Docs: https://electronjs.org/docs/api/structures/protocol-route
    /**
     * Which URLs on the scheme this route serves. A route without `match` serves every
     * URL.
     */
    var match: Match?

    /**
     * What the matched URLs are served from.
     */
    var source: Source
}

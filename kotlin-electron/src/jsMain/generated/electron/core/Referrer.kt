package electron.core


external interface Referrer {
// Docs: https://electronjs.org/docs/api/structures/referrer
    /**
     * Can be `default`, `unsafe-url`, `no-referrer-when-downgrade`, `no-referrer`,
     * `origin`, `strict-origin-when-cross-origin`, `same-origin` or `strict-origin`.
     * See the Referrer-Policy spec for more details on the meaning of these values.
     */
    var policy: (ReferrerPolicy)

    /**
     * HTTP Referrer URL.
     */
    var url: String
}

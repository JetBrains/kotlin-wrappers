// Automatically generated - do not modify!

package node.process

@kotlinx.js.JsPlainObject
external interface ProcessFeatures {
    /**
     * A boolean value that is `true` if the current Node.js build is caching builtin modules.
     * @since v12.0.0
     */
    val cached_builtins: Boolean

    /**
     * A boolean value that is `true` if the current Node.js build is a debug build.
     * @since v0.5.5
     */
    val debug: Boolean

    /**
     * A boolean value that is `true` if the current Node.js build includes the inspector.
     * @since v11.10.0
     */
    val inspector: Boolean

    /**
     * A boolean value that is `true` if the current Node.js build supports
     * [loading ECMAScript modules using `require()`](https://nodejs.org/docs/latest-v24.x/api/modules.md#loading-ecmascript-modules-using-require).
     * @since v22.10.0
     */
    val require_module: Boolean

    /**
     * A boolean value that is `true` if the current Node.js build includes support for TLS.
     * @since v0.5.3
     */
    val tls: Boolean

    /**
     * A value that is `"strip"` by default,
     * `"transform"` if Node.js is run with `--experimental-transform-types`, and `false` if
     * Node.js is run with `--no-strip-types`.
     * @since v22.10.0
     */
    val typescript: ProcessFeaturesTypescript
}

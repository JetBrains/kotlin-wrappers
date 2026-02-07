package vercel.ncc

import js.array.ReadonlyArray
import kotlinx.js.JsPlainObject

@JsPlainObject
external interface NccOptions {
    /**
     * provide a custom cache path as `String` or disable caching by setting to `false`
     */
    val cache: Any? /* string | boolean */

    /**
     * externals to leave as requires of the build
     */
    val externals: ReadonlyArray<String>?

    /**
     * directory outside of which never to emit assets
     */
    val filterAssetBase: String?

    /**
     * default: false
     */
    val minify: Boolean?

    /**
     * default: false
     */
    val sourceMap: Boolean?

    /**
     * default: false
     */
    val assetBuilds: Boolean?

    /**
     * default: "../" treats sources as output-relative
     * when outputting a sourcemap, automatically include
     * source-map-support in the output file (increases output by 32kB).
     */
    val sourceMapBasePrefix: String?

    /**
     * default: true
     */
    val sourceMapRegister: Boolean?

    /**
     * default: "" does not generate a license file
     */
    val license: String?

    /**
     * default: false
     */
    val v8cache: Boolean?

    /**
     * default: false
     */
    val quiet: Boolean?

    /**
     * default: false
     */
    val debugLog: Boolean?

    /**
     * default: false
     */
    val transpileOnly: Boolean?

    /**
     * default: "es2015"
     */
    val target: Target?
}

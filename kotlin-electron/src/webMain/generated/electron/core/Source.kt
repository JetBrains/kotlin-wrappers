// Automatically generated - do not modify!

package electron.core

@kotlinx.js.JsPlainObject
external interface Source {
    /**
     * Must be `directory`.
     */
    var type: String

    /**
     * Absolute path of the directory. The part of the URL's path after `match.path` is
     * resolved inside it; paths that would leave it are not served. May point into an
     * `asar` archive.
     */
    var root: String

    /**
     * File served for a URL whose path ends in `/`. Defaults to `index.html`; an empty
     * string disables it.
     */
    var index: String?

    /**
     * Response headers added to every file served by this route. Headers computed by
     * the file loader, including `Content-Type`, `Content-Length`, and
     * `Content-Range`, will override these supplied values.
     */
    var headers: js.objects.ReadonlyRecord<String, String>?
}

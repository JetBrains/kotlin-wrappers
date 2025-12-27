// Automatically generated - do not modify!

package electron.core

external interface FilePathWithHeaders {
// Docs: https://electronjs.org/docs/api/structures/file-path-with-headers
    /**
     * Additional headers to be sent.
     */
    var headers: js.objects.ReadonlyRecord<String, String>?

    /**
     * The path to the file to send.
     */
    var path: String
}

package jszip

import js.core.JsAny
import js.date.Date
import js.promise.Promise
import kotlin.js.definedExternally

external interface JSZipObject {
    val name: String

    /**
     * Present for files loadded with `loadAsync`. May contain ".." path components that could
     * result in a zip-slip attack. See https://snyk.io/research/zip-slip-vulnerability
     */
    val unsafeOriginalName: String?
    val dir: Boolean
    val date: Date
    val comment: String

    /** The UNIX permissions of the file, if any. */
    val unixPermissions: Int?

    /** The UNIX permissions of the file, if any. */
    val dosPermissions: Int?
    val options: JSZipObjectOptions

    /**
     * Prepare the content in the asked type.
     * @param type the type of the result.
     * @param onUpdate a function to call on each internal update.
     * @return Promise the promise of the result.
     */
    fun <R : JsAny> async(
        type: OutputType<R>,
        onUpdate: OnUpdateCallback? = definedExternally,
    ): Promise<R>

    // nodeStream(type?: 'nodebuffer', onUpdate?: OnUpdateCallback): NodeJS.ReadableStream;
}

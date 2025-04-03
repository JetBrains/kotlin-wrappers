package jszip

import js.core.JsAny
import js.import.JsModule
import js.promise.Promise
import seskar.js.JsAsync
import web.file.File
import kotlin.js.definedExternally

@JsModule("jszip")
external class JSZip {
    fun file(
        name: String,
        file: File,
        options: JSZipFileOptions = definedExternally,
    )

    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun <T : JsAny> generate(
        options: JSZipGeneratorOptions<T>,
    ): T

    fun <T : JsAny> generateAsync(
        options: JSZipGeneratorOptions<T>,
    ): Promise<T>
}

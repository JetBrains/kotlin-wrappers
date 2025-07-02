package jszip

import js.core.JsAny
import js.import.JsModule
import js.promise.Promise
import js.promise.await
import web.file.File
import kotlin.js.definedExternally

@JsModule("jszip")
external class JSZip {
    fun file(
        name: String,
        file: File,
        options: JSZipFileOptions = definedExternally,
    )

    fun <T : JsAny> generateAsync(
        options: JSZipGeneratorOptions<T>,
    ): Promise<T>

    companion object {
        val support: JSZipSupport
        val version: String
    }
}

suspend inline fun <T : JsAny> JSZip.generate(
    options: JSZipGeneratorOptions<T>,
): T =
    generateAsync(options).await()

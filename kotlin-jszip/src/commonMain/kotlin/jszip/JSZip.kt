package jszip

import js.core.JsAny
import js.import.JsModule
import js.promise.Promise
import js.promise.await
import seskar.js.JsAsync
import web.file.File
import kotlin.js.JsName
import kotlin.js.definedExternally

@JsModule("jszip")
external class JSZip {
    fun file(
        name: String,
        file: File,
        options: JSZipFileOptions = definedExternally,
    )

    @JsName("generate")
    fun <T : JsAny> generateAsync(
        options: JSZipGeneratorOptions<T>,
    ): Promise<T>
}

@JsAsync
suspend inline fun <T : JsAny> JSZip.generate(
    options: JSZipGeneratorOptions<T>,
): T =
    generateAsync(options).await()

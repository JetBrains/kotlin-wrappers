package karakum.actions

import karakum.common.ConversionResult
import java.io.File

internal class LibraryConversionResult(
    val library: Library,
    val results: List<ConversionResult>,
    private val pathMap: Map<String, String>,
) {
    fun getPath(name: String): String? =
        when (val path = pathMap[name]) {
            "lib/auth",
            "lib/proxy",
                -> path

            else -> null
        }
}

private val LIBRARY_FOLDERS = listOf(
    "lib",
    "lib/internal",

    // artifact
    "lib/internal/delete",
    "lib/internal/download",
    "lib/internal/find",
    "lib/internal/shared",
    "lib/internal/upload",
)

internal fun convertLibrary(
    definitionsDir: File,
): LibraryConversionResult {
    val library = Library(definitionsDir.name)
    val files = LIBRARY_FOLDERS.asSequence()
        .map { definitionsDir.resolve(it) }
        .filter { it.exists() }
        .mapNotNull { it.listFiles { file -> file.name.endsWith(".d.ts") } }
        .flatMap { it.asSequence() }
        .filter { it.name != "io-util.d.ts" }
        .toList()

    val pathMap = mutableMapOf<String, String>()

    var results = files.asSequence()
        .flatMap { file ->
            val filePath = file.toRelativeString(definitionsDir)
                .removeSuffix(".d.ts")

            // WA for `RequestHandler`
            var content = file.readText()
                .replace(
                    "handleAuthentication(httpClient: HttpClient, requestInfo: RequestInfo, data: string | NodeJS.ReadableStream | null): Promise<HttpClientResponse>;",
                    "handleAuthentication(httpClient: HttpClient, requestInfo: RequestInfo, data: string | node.ReadableStream | null): Promise<HttpClientResponse>;",
                )

            val STREAM_EXTRACT_EXTERNAL_BODY = """
            {
                timeout?: number;
                skipDecompress?: boolean;
            }
            """.trimIndent()
            if (STREAM_EXTRACT_EXTERNAL_BODY in content) {
                content = "declare interface StreamExtractExternalOptions " +
                        STREAM_EXTRACT_EXTERNAL_BODY + "\n" +
                        content.replace(STREAM_EXTRACT_EXTERNAL_BODY, "StreamExtractExternalOptions")
            }

            convert(content)
                .onEach { pathMap[it.name] = filePath }
        }
        .toList()
        .mergeDuplicated()
        .removeDuplicatedInterfaces()

    if (library.name == "cache")
        results += TransferProgressEvent()

    return LibraryConversionResult(
        library = library,
        results = results,
        pathMap = pathMap,
    )
}

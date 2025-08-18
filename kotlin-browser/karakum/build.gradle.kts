plugins {
    id("karakum.browser-declarations")
}

dependencies {
    commonMainImplementation(npm(jspkg.types.web))
    commonMainImplementation(npm(jspkg.types.webworker))
    commonMainImplementation(npm(jspkg.types.serviceworker))
    commonMainImplementation(npm(jspkg.types.audioworklet))
    commonMainImplementation(npm(jspkg.typescript))
    commonMainImplementation(npm(jspkg.webref.events))
    commonMainImplementation(npm(jspkg.webref.idl))
}

object Includes {
    val JS_INCLUDE = setOf(
        "js",
    )

    val WEB_INCLUDE = setOf(
        "web/abort",
        "web/assembly",
        "web/blob",
        "web/broadcast",
        "web/buffer",
        "web/compression",
        "web/console",
        "web/crypto",
        "web/encoding",
        "web/errors/DOMException.kt",
        "web/events",
        "web/events/internal",
        "web/file/File.kt",
        "web/file/FilePropertyBag.kt",
        "web/file/FileReader.kt",
        "web/form/FormData.kt",
        "web/form/FormDataEntryValue.kt",
        "web/function",
        "web/gpu",
        "web/http",
        "web/images",
        "web/messaging",
        "web/performance",
        "web/promise",
        "web/scheduling/queueMicrotask.kt",
        "web/serialization",
        "web/sockets",
        "web/time",
        "web/timers",
        "web/streams",
        "web/url",

        // markers
        "web/canvas/CanvasImageSource.kt",
        "web/gl/TexImageSource.kt",
    )

    val BROWSER_INCLUDE = setOf(
        "web",
        "web/file",
        "web/gpu/GPUCanvasConfiguration.kt",
        "web/gpu/GPUCanvasContext.kt",
        "web/images/ImageBitmapRenderingContext.kt",
        "web/images/ImageBitmapRenderingContextSettings.kt",
        "web/performance/LargestContentfulPaint.kt",
        "web/url/FragmentDirective.kt",
    )
}

enum class WrapperProject(
    val included: Set<String>,
) {
    JS(Includes.JS_INCLUDE),
    WEB(Includes.WEB_INCLUDE),
    BROWSER(Includes.BROWSER_INCLUDE),

    ;
}

fun getWrapperProject(path: String): WrapperProject? =
    when (path) {
        in Includes.JS_INCLUDE -> WrapperProject.JS
        in Includes.WEB_INCLUDE -> WrapperProject.WEB
        in Includes.BROWSER_INCLUDE -> WrapperProject.BROWSER
        else -> if ("/" in path) getWrapperProject(path.substringBeforeLast("/")) else null
    }

fun isDirFromWrapperProject(
    path: String,
    wp: WrapperProject,
): Boolean {
    val included = wp.included

    if (path in included)
        return true

    if (included.any { it.startsWith("$path/") })
        return true

    val basePath = path.substringBefore("/", "")
    return basePath in included
}

fun isFromWrapperProject(wp: WrapperProject): Spec<FileTreeElement> {
    return Spec<FileTreeElement> { element ->
        val path = element.path
        if (element.isDirectory) {
            isDirFromWrapperProject(path, wp)
        } else {
            getWrapperProject(path) == wp
        }
    }
}

val syncKotlinJs by tasks.registering(SyncWrappers::class) {
    from(webGeneratedDir) {
        include(isFromWrapperProject(WrapperProject.JS))

        preserve {
            include("js/atomic/WaitAsyncResult.kt")
            include("js/atomic/WaitResult.kt")
            include("js/atomic/WaitStatus.kt")
            include("js/atomic/WaitSyncResult.kt")
        }
    }

    into(webMainDir("kotlin-js"))
}

val syncKotlinWeb by tasks.registering(SyncWrappers::class) {
    from(webGeneratedDir) {
        include(isFromWrapperProject(WrapperProject.WEB))
    }

    into(webMainDir("kotlin-web"))
}

val syncKotlinBrowser by tasks.registering(SyncWrappers::class) {
    from(webGeneratedDir) {
        include(isFromWrapperProject(WrapperProject.BROWSER))
    }

    into(webMainDir("kotlin-browser"))
}

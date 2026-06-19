plugins {
    id("karakum.browser-declarations")
}

dependencies {
    webMainImplementation(npm(jspkg.types.web))
    webMainImplementation(npm(jspkg.types.webworker))
    webMainImplementation(npm(jspkg.types.serviceworker))
    webMainImplementation(npm(jspkg.types.audioworklet))
    webMainImplementation(npm(jspkg.types.webxr))
    webMainImplementation(npm(jspkg.typescript))
    webMainImplementation(npm(jspkg.webref.events))
    webMainImplementation(npm(jspkg.webref.idl))
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
        "web/errors",
        "web/events",
        "web/file/File.kt",
        "web/file/FilePropertyBag.kt",
        "web/file/FileReader.kt",
        "web/form/FormData.kt",
        "web/form/FormDataEntryValue.kt",
        "web/function",
        "web/gpu",
        "web/http",
        "web/images",
        "web/locks",
        "web/messaging",
        "web/navigator/NavigatorConcurrentHardware.kt",
        "web/navigator/NavigatorID.kt",
        "web/navigator/NavigatorLanguage.kt",
        "web/navigator/NavigatorLocks.kt",
        "web/origin",
        "web/performance",
        "web/promise",
        "web/scheduling/queueMicrotask.kt",
        "web/serialization",
        "web/sockets",
        "web/sse",
        "web/storage/localStorage.val.kt",
        "web/storage/sessionStorage.val.kt",
        "web/storage/Storage.kt",
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
        "web/performance/PaintTimingMixin.kt",
        "web/performance/PerformanceEventTiming.kt",
        "web/performance/PerformanceNavigationTiming.kt",
        "web/performance/PerformancePaintTiming.kt",
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

tasks.register<SyncWrappers>("syncKotlinJs") {
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

tasks.register<SyncWrappers>("syncKotlinWeb") {
    from(webGeneratedDir) {
        include(isFromWrapperProject(WrapperProject.WEB))
    }

    into(webMainDir("kotlin-web"))
}

tasks.register<SyncWrappers>("syncKotlinBrowser") {
    from(webGeneratedDir) {
        include(isFromWrapperProject(WrapperProject.BROWSER))
    }

    into(webMainDir("kotlin-browser"))
}

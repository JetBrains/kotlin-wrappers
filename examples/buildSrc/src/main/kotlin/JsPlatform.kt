import org.gradle.api.Project

internal enum class JsPlatform(
    val browser: Boolean = false,
    val node: Boolean = false,
) {
    WEB(browser = true, node = true),
    BROWSER(browser = true),
    NODE(node = true),

    ;
}

internal val Project.jsPlatform: JsPlatform
    get() {
        val platform = findProperty("js.platform") as String?

        return if (platform != null) {
            JsPlatform.valueOf(platform.uppercase())
        } else JsPlatform.BROWSER
    }

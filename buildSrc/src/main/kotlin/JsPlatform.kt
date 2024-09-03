import org.gradle.api.Project

internal enum class JsPlatform {
    WEB,
    BROWSER,
    NODE,

    MISSED,

    ;
}

internal val Project.jsPlatform: JsPlatform
    get() {
        val platform = findProperty("js.platform") as String?

        return if (platform != null) {
            JsPlatform.valueOf(platform.uppercase())
        } else JsPlatform.BROWSER
    }

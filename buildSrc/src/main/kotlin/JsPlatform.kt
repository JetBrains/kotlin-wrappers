import org.gradle.api.Project

internal enum class JsPlatform {
    WEB,
    BROWSER,
    NODE,

    MISSED,

    ;
}

private val TEST_DIRECTORIES = listOf(
    "src/commonTest",
    "src/jsTest",
)

private fun Project.hasTests(): Boolean =
    TEST_DIRECTORIES.any {
        projectDir.resolve(it).exists()
    }

internal val Project.jsPlatform: JsPlatform
    get() {
        if (!hasTests()) {
            JsPlatform.MISSED
        }

        val platform = findProperty("js.platform") as String?

        return if (platform != null) {
            JsPlatform.valueOf(platform.uppercase())
        } else JsPlatform.BROWSER
    }

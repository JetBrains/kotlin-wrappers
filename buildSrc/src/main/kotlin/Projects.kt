import org.gradle.api.Project

private val TARGET_ALIASES = mapOf(
    "react-core" to "react",
    "react-dom" to "react",
    "react-dom-legacy" to "react",
    "react-dom-test-utils" to "react",
    "react-legacy" to "react",

    "styled-components" to "styled",

    "emotion" to "emotion-react",

    "@mui/icons-material" to "mui-icons",
    "@mui/x-date-pickers" to "muix-date-pickers",
    "@mui/x-tree-view" to "muix-tree-view",

    "@popperjs/core" to "popper",

    "@jetbrains/ring-ui" to "ring-ui",

    "@types/node" to "node",
)

fun Project.version(target: String): String {
    val finalTarget = TARGET_ALIASES[target]
        ?: target.removePrefix("@")
            .replace("/", "-")

    return prop("$finalTarget.version")
}

internal fun Project.publishVersion(): String {
    val build = prop("version.build")
        .let { if (it.isNotEmpty()) "-$it" else "" }

    return version(name.removePrefix("kotlin-")) + build
}

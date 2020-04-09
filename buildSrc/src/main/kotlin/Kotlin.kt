import org.gradle.api.Project

internal val Project.isKotlinJsProject: Boolean
    get() = plugins.hasPlugin("org.jetbrains.kotlin.js")

internal val Project.isKotlinMultiplatformProject: Boolean
    get() = plugins.hasPlugin("org.jetbrains.kotlin.multiplatform")

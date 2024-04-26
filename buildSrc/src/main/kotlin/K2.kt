import org.gradle.api.Project

val Project.k2mode: Boolean
    get() = version("kotlin").startsWith("2.")

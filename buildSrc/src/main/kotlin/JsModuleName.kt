import org.gradle.api.Project

internal val Project.jsModuleName: String?
    get() {
        return findProperty("js.module.name") as String?
    }

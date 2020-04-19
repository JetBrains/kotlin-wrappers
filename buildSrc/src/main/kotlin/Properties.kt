import org.gradle.api.Project
import org.gradle.api.Task

internal fun Project.prop(propertyName: String): String =
    property(propertyName) as String

internal fun Task.prop(propertyName: String): String =
    project.prop(propertyName)

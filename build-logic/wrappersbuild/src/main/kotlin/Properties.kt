import org.gradle.api.Project

internal fun Project.prop(propertyName: String): String =
    property(propertyName) as String

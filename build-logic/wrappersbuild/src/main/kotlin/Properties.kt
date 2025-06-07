import org.gradle.api.Project

internal fun Project.prop(propertyName: String): String =
    property(propertyName) as String

internal fun Project.propOrNull(propertyName: String): String? =
    findProperty(propertyName) as String?

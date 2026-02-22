import org.gradle.api.Project

val Project.valueClassInExternalAllowed: Boolean
    get() = isAllowed("permission.value.class.in.external")

private fun Project.isAllowed(
    propName: String,
): Boolean {
    val value = findProperty(propName)
        ?: return false

    if (value == "allowed")
        return true

    error("Invalid permission property value '$value' for property '$propName'!")
}

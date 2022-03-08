package emotion.styled

import emotion.hash.hash
import react.ElementType

private val identifiers = mutableMapOf<String, Int?>()

internal fun generateId(component: ElementType<*>): String {
    val displayName: String? = component.asDynamic().displayName
    val name = displayName?.let { escape(it) } ?: "Anonymous"

    identifiers[name] = (identifiers[name] ?: 0) + 1

    return "$name-ke${hash(name + identifiers[name])}"
}

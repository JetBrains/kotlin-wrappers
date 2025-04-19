package karakum.events

import kotlinx.serialization.Serializable

@Serializable
data class ExtendedIn(
    val spec: String,
    val href: String?,
)

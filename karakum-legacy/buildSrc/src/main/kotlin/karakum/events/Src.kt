package karakum.events

import kotlinx.serialization.Serializable

@Serializable
data class Src(
    val format: String?,
    val href: String?,
)

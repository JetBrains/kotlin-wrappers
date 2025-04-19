package karakum.events

import kotlinx.serialization.Serializable

@Serializable
data class Target(
    val target: String,
    val bubbles: Boolean = false,
    val bubblingPath: List<String> = emptyList(),
)

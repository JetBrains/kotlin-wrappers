package karakum.browser

internal val KNOWN_MISSED_TYPES = setOf(
    "AnimationFrameProvider",
    "AudioProcessingEventInit",
    "EventListener",
    "EventListenerObject",
    "EventTarget",
    "HTMLAllCollection",
    "ImportMeta",
    "OnBeforeUnloadEventHandlerNonNull",
    "OnErrorEventHandlerNonNull",
    "WindowLocalStorage",
    "WindowOrWorkerGlobalScope",
    "WindowSessionStorage",
) + DOM_GEOMETRY_ALIASES.map { it.first }

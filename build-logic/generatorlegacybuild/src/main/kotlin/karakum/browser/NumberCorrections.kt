package karakum.browser

internal val SCREEN_CLIENT_CORRECTIONS: Map<Pair<String, String>, String> = mapOf(
    ("MouseEvent" to "clientX") to "Double",
    ("MouseEvent" to "clientY") to "Double",
    ("MouseEvent" to "screenX") to "Double",
    ("MouseEvent" to "screenY") to "Double",

    ("MouseEventInit" to "clientX") to "Double",
    ("MouseEventInit" to "clientY") to "Double",
    ("MouseEventInit" to "screenX") to "Double",
    ("MouseEventInit" to "screenY") to "Double",
)

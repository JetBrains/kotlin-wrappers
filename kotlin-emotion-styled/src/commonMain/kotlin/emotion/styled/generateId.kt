package emotion.styled

private var index = 0

internal fun generateId(): String =
    "ke-${index++}"

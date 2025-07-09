package karakum.common

internal val ASYNC_FUNCTION_REGEX = Regex(
    """^((operator)?\s*)(fun.*[ >])([a-zA-Z\d]+)(\(.*\)): Promise<(.+)>(\?)?( = definedExternally)?$""",
    RegexOption.DOT_MATCHES_ALL
)

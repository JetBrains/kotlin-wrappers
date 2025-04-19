package karakum.browser

import karakum.csstype.MEDIA_QUERY

internal fun String.applyMediaListPatch(): String =
    replace("<String>", "<$MEDIA_QUERY>")
        .replace(": String", ": $MEDIA_QUERY")
        .replace("mediaText: $MEDIA_QUERY", "mediaText: String")

internal fun String.applyMediaQueryPatch(): String =
    replace("val media: String", "val media: $MEDIA_QUERY")
        .replace("var media: String", "var media: $MEDIA_QUERY")

internal fun String.applyMediaQueryFunctionPatch(): String =
    replace("query: String", "query: $MEDIA_QUERY")

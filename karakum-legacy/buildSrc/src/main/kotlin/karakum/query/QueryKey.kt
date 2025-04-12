package karakum.query

import karakum.common.GENERATOR_COMMENT

internal const val QUERY_KEY = "QueryKey"

// language=Kotlin
internal val QUERY_KEY_BODY = """
// $GENERATOR_COMMENT

${Package.CORE.pkg}

import js.array.ReadonlyArray
import js.reflect.unsafeCast

inline fun <T : QueryKey> QueryKey(
    vararg keys: Comparable<*>,
): T =
    unsafeCast(keys)

fun <T : QueryKey> QueryKey(
    parentKey: QueryKey,
    vararg keys: Comparable<*>,
): T =
    unsafeCast(unsafeCast<ReadonlyArray<*>>(parentKey) + keys)
"""

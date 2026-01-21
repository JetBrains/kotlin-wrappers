package web.coroutines.internal

import js.array.ReadonlyArray
import kotlinx.coroutines.channels.ProducerScope
import kotlin.js.JsAny
import kotlin.js.get

internal fun <E : JsAny, O : JsAny> ProducerScope<E>.observerCallback(): (ReadonlyArray<E>, O) -> Unit =
    { entries, _ ->
        trySend(requireNotNull(entries[0]))
    }

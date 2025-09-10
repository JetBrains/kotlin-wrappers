package js.promise

import kotlinx.coroutines.Deferred
import kotlin.js.JsAny

internal expect var <T : JsAny?> Promise<T>.deferred: Deferred<T>?

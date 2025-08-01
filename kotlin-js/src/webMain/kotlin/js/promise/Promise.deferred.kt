package js.promise

import js.core.JsAny
import kotlinx.coroutines.Deferred

internal expect var <T : JsAny?> Promise<T>.deferred: Deferred<T>?

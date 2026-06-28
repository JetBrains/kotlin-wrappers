package example.react

import kotlinx.coroutines.delay
import kotlinx.coroutines.isActive
import web.abort.Abortable
import web.abort.coroutineScope
import kotlin.time.Duration.Companion.milliseconds

@JsExport
class Counter {

    suspend fun run(
        callback: (value: Int) -> Unit,
        options: Abortable? = null,
    ): Unit =
        options.coroutineScope {
            var i = 0
            while (isActive) {
                callback(i++)
                delay(300.milliseconds)
            }
        }
}

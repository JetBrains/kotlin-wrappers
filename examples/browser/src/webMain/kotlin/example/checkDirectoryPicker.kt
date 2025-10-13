@file:OptIn(ExperimentalWebApi::class)

package example

import js.iterable.asFlow
import js.objects.unsafeJso
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.flow.toList
import kotlinx.coroutines.launch
import web.console.console
import web.dom.document
import web.dom.keyUpEvent
import web.events.addHandler
import web.experimental.ExperimentalWebApi
import web.fs.FileSystemPermissionMode
import web.fs.read
import web.fs.showDirectoryPicker
import kotlin.coroutines.EmptyCoroutineContext

fun checkDirectoryPicker() {
    val scope = CoroutineScope(EmptyCoroutineContext)

    document.body.keyUpEvent.addHandler {
        scope.launch {
            val handle = showDirectoryPicker(unsafeJso { mode = FileSystemPermissionMode.read })
            val fileNames = handle.values().asFlow().toList().map { it.name }
            console.log("Files names: [", fileNames.joinToString(", "), "]")
        }
    }
}

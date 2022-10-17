package web.messaging

import kotlinx.js.ReadonlyArray

external interface StructuredSerializeOptions {
    var transfer: ReadonlyArray<Transferable>
}

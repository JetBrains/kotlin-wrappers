@file:JsModule("@preact/signals-react")

package preact.signals.react

import react.Cleanup

external fun useSignalEffect(
    cb: () -> Cleanup?,
)

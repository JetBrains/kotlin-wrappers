package react.dom.test

import react.act
import react.dom.client.Root

suspend fun unmount(
    root: Root,
) {
    act {
        root.unmount()
    }
}

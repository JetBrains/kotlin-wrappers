package react.dom.test

import react.VFC
import react.create
import react.dom.client.Root
import react.dom.client.createRoot
import web.html.HTMLElement

suspend fun createRoot(
    container: HTMLElement,
    component: VFC,
): Root =
    act {
        val root = createRoot(container)
        root.render(component.create())
        root
    }

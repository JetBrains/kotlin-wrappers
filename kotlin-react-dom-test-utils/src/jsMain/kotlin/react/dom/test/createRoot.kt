package react.dom.test

import react.FC
import react.Props
import react.create
import react.dom.client.Root
import react.dom.client.createRoot
import web.html.HTMLElement

suspend fun createRoot(
    container: HTMLElement,
    component: FC<Props>,
): Root =
    act {
        val root = createRoot(container)
        root.render(component.create())
        root
    }

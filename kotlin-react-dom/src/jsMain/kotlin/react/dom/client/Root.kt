package react.dom.client

import react.ReactNode

external interface Root {
    fun render(children: ReactNode?)
    fun unmount()
}

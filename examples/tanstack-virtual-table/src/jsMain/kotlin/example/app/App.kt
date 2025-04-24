package example.app

import example.components.Header
import react.FC
import react.Props

internal val App = FC<Props> {
    AppModule {
        Header()
        Content()
    }
}

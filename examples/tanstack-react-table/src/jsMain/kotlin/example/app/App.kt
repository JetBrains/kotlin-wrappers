package example.app

import example.components.Header
import react.FC
import react.Props
import react.invoke

internal val App = FC<Props> {
    AppModule {
        Header()
        Content()
    }
}

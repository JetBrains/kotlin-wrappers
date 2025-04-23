package wrappers.example.app

import react.FC
import react.Props
import wrappers.example.components.Header

internal val App = FC<Props> {
    AppModule {
        Header()
        Content()
    }
}

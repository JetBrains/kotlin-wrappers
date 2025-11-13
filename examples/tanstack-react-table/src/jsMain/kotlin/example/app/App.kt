package example.app

import example.components.Header
import react.FC

internal val App = FC {
    AppModule {
        Header()
        Content()
    }
}

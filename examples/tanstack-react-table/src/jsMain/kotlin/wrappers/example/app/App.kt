package wrappers.example.app

import react.FC
import react.Props
import wrappers.example.components.Header
import wrappers.example.components.LoadingIndicator
import wrappers.example.components.UserInfo

internal val App = FC<Props> {
    AppModule {
        Header()
        LoadingIndicator()
        UserInfo()
    }
}

package example.di

import react.FC
import react.PropsWithChildren
import react.createContext

val DiContext = createContext<Di>()

external interface DiContextProviderProps : PropsWithChildren {
    var di : Di
}

val DiContextProvider = FC<DiContextProviderProps> { props ->
    DiContext.Provider {
        value = props.di
        +props.children
    }
}

package wrappers.example.selection

import react.*
import wrappers.example.entities.User

private val SelectedUserContext: Context<User?> =
    createContext()

private val SetSelectedUserContext: RequiredContext<StateSetter<User?>> =
    createRequiredContext()

fun useSelectedUser(): User? =
    use(SelectedUserContext)

fun useSetSelectedUser(): StateSetter<User?> =
    useRequired(SetSelectedUserContext)

val SelectionModule = FC<PropsWithChildren> { props ->
    val (user, setUser) = useState<User>()

    SelectedUserContext(user) {
        SetSelectedUserContext(setUser) {
            +props.children
        }
    }
}

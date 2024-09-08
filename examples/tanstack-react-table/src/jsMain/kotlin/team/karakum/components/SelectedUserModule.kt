package team.karakum.components

import react.*
import team.karakum.entities.User

private val SelectedUserContext: Context<User?> =
    createContext()

private val SetSelectedUserContext: RequiredContext<StateSetter<User?>> =
    createRequiredContext()

fun useSelectedUser(): User? =
    useContext(SelectedUserContext)

fun useSetSelectedUser(): StateSetter<User?> =
    useRequiredContext(SetSelectedUserContext)

val SelectedUserModule = FC<PropsWithChildren> { props ->
    val (user, setUser) = useState<User>()

    SelectedUserContext(user) {
        SetSelectedUserContext(setUser) {
            +props.children
        }
    }
}

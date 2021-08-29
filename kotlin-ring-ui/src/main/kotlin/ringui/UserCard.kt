@file:JsModule("@jetbrains/ring-ui/components/user-card/user-card")
@file:JsNonModule

package ringui

import react.ComponentClass
import react.PropsWithChildren
import react.PropsWithClassName

external val UserCard: ComponentClass<UserCardProps>

// https://github.com/JetBrains/ring-ui/blob/master/components/user-card/card.js
external interface UserCardProps : PropsWithChildren, PropsWithClassName {
    var user: UserCardModel
    var wording: UserCardWording
}

external interface UserCardModel {
    val name: String
    val login: String
    val avatarUrl: String
    val email: String?
    val href: String?
}

external interface UserCardWording {
    val banned: String
    val online: String
    val offline: String
}

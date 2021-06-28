@file:JsModule("@jetbrains/ring-ui/components/user-card/user-card")
@file:JsNonModule

package ringui

import react.RClass
import react.RProps

external val UserCard: RClass<UserCardProps>

// https://github.com/JetBrains/ring-ui/blob/master/components/user-card/card.js
external interface UserCardProps : RProps {
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

package example.hooks

import example.USERS_QUERY_KEY
import example.entities.UserList
import example.query.createQueryFunction
import js.errors.JsError
import tanstack.query.core.QueryKey
import tanstack.react.query.UseQueryOptions
import tanstack.react.query.useQuery

fun useUsersOrNull(): UserList? {
    val result = useQuery<UserList, JsError, UserList, QueryKey>(
        options = UseQueryOptions(
            queryKey = USERS_QUERY_KEY,
            queryFn = createQueryFunction(::fetchUsersData),
        ),
    )

    return result.data
}

fun useUsers(): UserList =
    requireNotNull(useUsersOrNull())

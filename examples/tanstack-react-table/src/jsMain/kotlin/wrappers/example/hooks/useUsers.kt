package wrappers.example.hooks

import tanstack.query.core.QueryKey
import tanstack.react.query.UseQueryOptions
import tanstack.react.query.useQuery
import wrappers.example.USERS_QUERY_KEY
import wrappers.example.entities.UserList
import wrappers.example.query.createQueryFunction

fun useUsersOrNull(): UserList? {
    val result = useQuery<UserList, Error, UserList, QueryKey>(
        options = UseQueryOptions(
            queryKey = USERS_QUERY_KEY,
            queryFn = createQueryFunction(::fetchUsersData),
        ),
    )

    return result.data
}

fun useUsers(): UserList =
    requireNotNull(useUsersOrNull())

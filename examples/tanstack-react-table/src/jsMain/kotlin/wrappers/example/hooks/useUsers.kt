package wrappers.example.hooks

import tanstack.query.core.QueryKey
import tanstack.react.query.UseQueryOptions
import tanstack.react.query.useQuery
import wrappers.example.USERS_QUERY_KEY
import wrappers.example.entities.Users
import wrappers.example.query.createQueryFunction

fun useUsersOrNull(): Users? {
    val result = useQuery<Users, Error, Users, QueryKey>(
        options = UseQueryOptions(
            queryKey = USERS_QUERY_KEY,
            queryFn = createQueryFunction(::fetchUsersData),
        ),
    )

    return result.data
}

fun useUsers(): Users =
    requireNotNull(useUsersOrNull())

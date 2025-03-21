package wrappers.example.hooks

import tanstack.query.core.QueryKey
import tanstack.react.query.UseQueryOptions
import tanstack.react.query.useQuery
import wrappers.example.PHOTOS_QUERY_KEY
import wrappers.example.entities.Photos
import wrappers.example.query.createQueryFunction

fun usePhotosOrNull(): Photos? {
    val result = useQuery<Photos, Error, Photos, QueryKey>(
        options = UseQueryOptions(
            queryKey = PHOTOS_QUERY_KEY,
            queryFn = createQueryFunction(::fetchPhotos),
        ),
    )

    return result.data
}

fun usePhotos(): Photos =
    requireNotNull(usePhotosOrNull())

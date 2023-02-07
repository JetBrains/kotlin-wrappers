package web.http

class FetchException(
    cause: Throwable
) : IllegalStateException(cause)

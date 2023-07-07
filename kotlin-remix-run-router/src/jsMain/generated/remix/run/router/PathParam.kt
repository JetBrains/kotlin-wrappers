package remix.run.router


/**
 * Examples:
 * "/a/b&#47;*" -> "*"
 * ":a" -> "a"
 * "/a/:b" -> "b"
 * "/a/blahblahblah:b" -> "b"
 * "/:a/:b" -> "a" | "b"
 * "/:a/b/:c&#47;*" -> "a" | "c" | "*"
 */

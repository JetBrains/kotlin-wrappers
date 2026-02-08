// Automatically generated - do not modify!

package semver

sealed external interface ReleaseType {
    companion object
}

inline val ReleaseType.Companion.major: ReleaseType
    get() = js.reflect.unsafeCast("major")

inline val ReleaseType.Companion.premajor: ReleaseType
    get() = js.reflect.unsafeCast("premajor")

inline val ReleaseType.Companion.minor: ReleaseType
    get() = js.reflect.unsafeCast("minor")

inline val ReleaseType.Companion.preminor: ReleaseType
    get() = js.reflect.unsafeCast("preminor")

inline val ReleaseType.Companion.patch: ReleaseType
    get() = js.reflect.unsafeCast("patch")

inline val ReleaseType.Companion.prepatch: ReleaseType
    get() = js.reflect.unsafeCast("prepatch")

inline val ReleaseType.Companion.prerelease: ReleaseType
    get() = js.reflect.unsafeCast("prerelease")

inline val ReleaseType.Companion.release: ReleaseType
    get() = js.reflect.unsafeCast("release")

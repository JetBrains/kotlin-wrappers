plugins {
    id("karakum.actions-declarations")
}

dependencies {
    commonMainImplementation(npm(jspkg.actions.artifact))
    commonMainImplementation(npm(jspkg.actions.cache))
    commonMainImplementation(npm(jspkg.actions.core))
    commonMainImplementation(npm(jspkg.actions.exec))
    commonMainImplementation(npm(jspkg.actions.glob))
    commonMainImplementation(npm(jspkg.actions.github))
    commonMainImplementation(npm(jspkg.actions.httpClient))
    commonMainImplementation(npm(jspkg.actions.io))
    commonMainImplementation(npm(jspkg.actions.toolCache))
}

val syncActionsArtifact by tasks.registering(SyncWrappers::class) {
    from(jsGeneratedDir) {
        include("actions/artifact/")
    }
    into(webMainDir("kotlin-actions-artifact"))
}

val syncActionsCache by tasks.registering(SyncWrappers::class) {
    from(jsGeneratedDir) {
        include("actions/cache/")
    }
    into(webMainDir("kotlin-actions-cache"))
}

val syncActionsCore by tasks.registering(SyncWrappers::class) {
    from(jsGeneratedDir) {
        include("actions/core/")
    }
    into(webMainDir("kotlin-actions-core"))
}

val syncActionsExec by tasks.registering(SyncWrappers::class) {
    from(jsGeneratedDir) {
        include("actions/exec/")
    }
    into(webMainDir("kotlin-actions-exec"))
}

val syncActionsGlob by tasks.registering(SyncWrappers::class) {
    from(jsGeneratedDir) {
        include("actions/glob/")
    }
    into(webMainDir("kotlin-actions-glob"))
}

val syncActionsGitHub by tasks.registering(SyncWrappers::class) {
    from(jsGeneratedDir) {
        include("actions/github/")
    }
    into(webMainDir("kotlin-actions-github"))
}

val syncActionsHttpClient by tasks.registering(SyncWrappers::class) {
    from(jsGeneratedDir) {
        include("actions/http/client/")
    }
    into(webMainDir("kotlin-actions-http-client"))
}

val syncActionsIO by tasks.registering(SyncWrappers::class) {
    from(jsGeneratedDir) {
        include("actions/io/")
    }
    into(webMainDir("kotlin-actions-io"))
}

val syncActionsToolCache by tasks.registering(SyncWrappers::class) {
    from(jsGeneratedDir) {
        include("actions/tool/cache/")
    }
    into(webMainDir("kotlin-actions-tool-cache"))
}

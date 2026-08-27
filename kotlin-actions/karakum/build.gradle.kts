plugins {
    id("karakum.actions-declarations")
}

kotlin {
    sourceSets.webMain.dependencies {
        implementation(npm(jspkg.actions.artifact))
        implementation(npm(jspkg.actions.cache))
        implementation(npm(jspkg.actions.core))
        implementation(npm(jspkg.actions.exec))
        implementation(npm(jspkg.actions.glob))
        implementation(npm(jspkg.actions.github))
        implementation(npm(jspkg.actions.httpClient))
        implementation(npm(jspkg.actions.io))
        implementation(npm(jspkg.actions.toolCache))
    }
}

tasks.register<SyncWrappers>("syncActionsArtifact") {
    from(jsGeneratedDir) {
        include("actions/artifact/")
    }
    into(webMainDir("kotlin-actions-artifact"))
}

tasks.register<SyncWrappers>("syncActionsCache") {
    from(jsGeneratedDir) {
        include("actions/cache/")
    }
    into(webMainDir("kotlin-actions-cache"))
}

tasks.register<SyncWrappers>("syncActionsCore") {
    from(jsGeneratedDir) {
        include("actions/core/")
    }
    into(webMainDir("kotlin-actions-core"))
}

tasks.register<SyncWrappers>("syncActionsExec") {
    from(jsGeneratedDir) {
        include("actions/exec/")
    }
    into(webMainDir("kotlin-actions-exec"))
}

tasks.register<SyncWrappers>("syncActionsGlob") {
    from(jsGeneratedDir) {
        include("actions/glob/")
    }
    into(webMainDir("kotlin-actions-glob"))
}

tasks.register<SyncWrappers>("syncActionsGitHub") {
    from(jsGeneratedDir) {
        include("actions/github/")
    }
    into(webMainDir("kotlin-actions-github"))
}

tasks.register<SyncWrappers>("syncActionsHttpClient") {
    from(jsGeneratedDir) {
        include("actions/http/client/")
    }
    into(webMainDir("kotlin-actions-http-client"))
}

tasks.register<SyncWrappers>("syncActionsIO") {
    from(jsGeneratedDir) {
        include("actions/io/")
    }
    into(webMainDir("kotlin-actions-io"))
}

tasks.register<SyncWrappers>("syncActionsToolCache") {
    from(jsGeneratedDir) {
        include("actions/tool/cache/")
    }
    into(webMainDir("kotlin-actions-tool-cache"))
}

plugins {
    id("karakum.react-dom-declarations")
}

dependencies {
    webMainImplementation(npm(jspkg.types.react))
    webMainImplementation(npm(jspkg.webref.events))
}

val syncReact by tasks.registering(SyncWrappers::class) {
    from(jsGeneratedDir) {
        include("react/*.kt")
    }

    into(jsMainDir("kotlin-react"))
}

val syncReactDom by tasks.registering(SyncWrappers::class) {
    from(jsGeneratedDir) {
        include("react/dom/**/*.kt")
    }

    into(jsMainDir("kotlin-react-dom"))
}

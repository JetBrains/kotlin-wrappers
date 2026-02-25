plugins {
    id("karakum.react-dom-declarations")
}

dependencies {
    commonMainImplementation(npm(jspkg.types.react))
    commonMainImplementation(npm(jspkg.webref.events))
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

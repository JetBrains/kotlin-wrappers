plugins {
    id("karakum.react-dom-declarations")
}

kotlin {
    sourceSets.webMain.dependencies {
        implementation(npm(jspkg.types.react))
        implementation(npm(jspkg.webref.events))
    }
}

tasks.register<SyncWrappers>("syncReact") {
    from(jsGeneratedDir) {
        include("react/*.kt")
    }

    into(jsMainDir("kotlin-react"))
}

tasks.register<SyncWrappers>("syncReactDom") {
    from(jsGeneratedDir) {
        include("react/dom/**/*.kt")
    }

    into(jsMainDir("kotlin-react-dom"))
}

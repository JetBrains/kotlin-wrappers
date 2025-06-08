plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

dependencies {
    jsMainApi(projects.kotlinReactCore)
    jsMainApi(projects.kotlinTanstackQueryCore)

    commonMainApi(npm(jspkg.tanstack.reactQuery))
}

plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

dependencies {
    jsMainApi(projects.kotlinPopperjsCore)
    jsMainApi(projects.kotlinReactCore)

    commonMainApi(npm(jspkg.reactPopper))
}

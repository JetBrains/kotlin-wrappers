plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

kotlin {
    sourceSets.webMain.dependencies {
        api(projects.kotlinMuiSystem)
        api(projects.kotlinPopperjsCore)

        api(npm(jspkg.mui.base))
    }
}
